package org.hl7.fhir.tools.implementations.csharp;
/*
Copyright (c) 2011-2012, HL7, Inc
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this 
   list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, 
   this list of conditions and the following disclaimer in the documentation 
   and/or other materials provided with the distribution.
 * Neither the name of HL7 nor the names of its contributors may be used to 
   endorse or promote products derived from this software without specific 
   prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.

*/
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.definitions.ecore.fhir.BindingDefn;
import org.hl7.fhir.definitions.ecore.fhir.CompositeTypeDefn;
import org.hl7.fhir.definitions.ecore.fhir.ConstrainedTypeDefn;
import org.hl7.fhir.definitions.ecore.fhir.NameScope;
import org.hl7.fhir.definitions.ecore.fhir.TypeRef;
import org.hl7.fhir.definitions.model.Definitions;
import org.hl7.fhir.tools.implementations.BaseGenerator;
import org.hl7.fhir.tools.implementations.GeneratorUtils;
import org.hl7.fhir.tools.publisher.PlatformGenerator;
import org.hl7.fhir.utilities.CSFile;
import org.hl7.fhir.utilities.Logger;
import org.hl7.fhir.utilities.ZipGenerator;

public class CSharpGenerator extends BaseGenerator implements PlatformGenerator {

	public void generate(Definitions definitions, String destDir,
			String implDir, String version, Date genDate, Logger logger)
			throws Exception {

		throw new UnsupportedOperationException("The C# generator uses eCore, not ElementDefn-style definition.");
	}

	public String getName() {
		return "csharp";
	}

	public String getDescription() {
		return "Resource definitions (+ more todo)";
	}

	public String getTitle() {
		return "C#";
	}

	public boolean isECoreGenerator() {
		return true;
	}

	public void generate(org.hl7.fhir.definitions.ecore.fhir.Definitions definitions, String destDir,
			String implDir, Logger logger) throws Exception {
	
		char sl = File.separatorChar;
		String modelDir = "Model" + sl;
		String parsersDir = "Parsers" + sl;
		String serializersDir = "Serializers" + sl;
		
		File f = new CSFile(implDir + modelDir);	if( !f.exists() ) f.mkdir();
		File p = new CSFile(implDir + parsersDir);	if( !p.exists() ) p.mkdir();
		File s = new CSFile(implDir + serializersDir);	if( !s.exists() ) s.mkdir();
	
		
		List<String> generatedFilenames = new ArrayList<String>();

		{
			String enumsFilename = modelDir + "Bindings.cs";
		
			new CSharpModelGenerator(definitions)
				.generateGlobalEnums(definitions.getBindings()).toFile(implDir+enumsFilename);						 
			generatedFilenames.add(enumsFilename);
		}

		{
			String filename = modelDir + "ModelInfo.cs";
			 new CSharpModelInformationGenerator(definitions).generateInformation().toFile(implDir+filename);						 
			generatedFilenames.add(filename);
		}
			
		List<CompositeTypeDefn> allComplexTypes = new ArrayList<CompositeTypeDefn>();
		allComplexTypes.addAll(definitions.getLocalCompositeTypes());
		allComplexTypes.addAll(definitions.getResources());
		
		for( CompositeTypeDefn composite : allComplexTypes )
		{							
			String compositeFilename = modelDir + GeneratorUtils.generateCSharpTypeName(composite.getName()) + ".cs";	
			new CSharpModelGenerator(definitions)
				.generateComposite(composite).toFile(implDir + compositeFilename);		
			generatedFilenames.add(compositeFilename);
		}

		for( CompositeTypeDefn composite : allComplexTypes )
		{		
			// Don't generate parsers/serializers for abstract stuff (for now)
			if( composite.isAbstract() ) continue;
			
			String xmlParserFilename = parsersDir + GeneratorUtils.generateCSharpTypeName(composite.getName()) + "Parser.cs";			
			new CSharpParserGenerator(definitions)
					.generateCompositeParser(composite, definitions).toFile(implDir+xmlParserFilename);			
			generatedFilenames.add(xmlParserFilename);
	
			String serializerFilename = serializersDir + GeneratorUtils.generateCSharpTypeName(composite.getName()) + "Serializer.cs";			
			new CSharpSerializerGenerator(definitions)
				.generateCompositeSerializer(composite).toFile(implDir+serializerFilename);			
			generatedFilenames.add(serializerFilename);

		}
		
		for( ConstrainedTypeDefn constrained : definitions.getLocalConstrainedTypes() )
		{
			// Build C# class for constrained type
			String constrainedFilename = modelDir + constrained.getName() + ".cs";
			new CSharpModelGenerator(definitions)
				.generateConstrained(constrained).toFile(implDir+constrainedFilename);						 
			generatedFilenames.add(constrainedFilename);
			
			// Build Xml parser for constrained type
			String parserFilename = parsersDir + constrained.getName() + "Parser.cs";
			new CSharpParserGenerator(definitions)
				.generateConstrainedParser(constrained).toFile(implDir+parserFilename);						 
			generatedFilenames.add(parserFilename);
		}

		// Collect all bindings to generate the EnumHelper class
		List<BindingDefn> allBindings = new ArrayList<BindingDefn>();
		allBindings.addAll(definitions.getBindings());
		for( NameScope ns : definitions.getLocalCompositeTypes() )
			allBindings.addAll(ns.getBindings());
		for( NameScope ns : definitions.getResources() )
			allBindings.addAll(ns.getBindings());
		{
			String enumHelperFilename = modelDir + "EnumHelper.cs";
			
			new CSharpEnumHelperGenerator(definitions)
				.generateEnumHelper(definitions, allBindings).toFile(implDir+enumHelperFilename);						 
			generatedFilenames.add(enumHelperFilename);			
		}
		
		// Generate resource parser entrypoint
		{
			String filename = parsersDir + "FhirParser.cs";
			
			new CSharpFhirParserGenerator(definitions)
				.generateResourceParser(definitions).toFile(implDir+filename);						 
			generatedFilenames.add(filename);			
		}
		
		// Generate resource serializer entrypoint
		{
			String filename = serializersDir + "FhirSerializer.cs";
			
			new CSharpSerializerGenerator(definitions)
				.generateResourceSerializer().toFile(implDir+filename);						 
			generatedFilenames.add(filename);			
		}
		
	    // Generate C# project file
	    CSharpProjectGenerator projGen = new CSharpProjectGenerator();
	    projGen.build(implDir, generatedFilenames);
	    
		String modelSupportDir = "Model.Support" + sl;
		String parsersSupportDir = "Parsers.Support" + sl;
		String serializersSupportDir = "Serializers.Support" + sl;
		String supportDir = "Support" + sl;
		
		ZipGenerator zip = new ZipGenerator(destDir + "CSharp.zip");
		zip.addFiles(implDir+modelDir, modelDir, ".cs");
		zip.addFiles(implDir+parsersDir, parsersDir, ".cs");
		zip.addFiles(implDir+serializersDir, serializersDir, ".cs");
		zip.addFiles(implDir+modelSupportDir, modelSupportDir, ".cs");
		zip.addFiles(implDir+parsersSupportDir, parsersSupportDir, ".cs");
		zip.addFiles(implDir+serializersSupportDir, serializersSupportDir, ".cs");
		zip.addFiles(implDir+supportDir, supportDir, ".cs");
		zip.addFiles(implDir+"Properties" + sl, "Properties"+sl, ".cs");
		zip.addFiles(implDir, "", ".csproj");
		zip.addFiles(implDir, "", ".sln");
		zip.addFiles(implDir, "", "Local.testsettings");
		zip.addFiles(implDir, "", "HL7.Fhir.Instance.vsmdi");
		// Include supporting libraries
		String librariesDir = "Libraries" + sl;
		zip.addFiles(implDir+librariesDir, librariesDir, ".dll");
		
		// Include test project
		String testProjectDir = "HL7.Fhir.Instance.Tests" + sl;
		zip.addFiles(implDir+testProjectDir, testProjectDir, ".cs");
		zip.addFiles(implDir+testProjectDir + "Properties" + sl, testProjectDir+"Properties"+sl, ".cs");
		zip.addFiles(implDir+testProjectDir, testProjectDir, ".csproj");
		
		zip.close();		
	}

  public boolean doesCompile() {
    return false;
  }

  public boolean compile(String rootDir, List<String> errors) {
    return false;
  }

  public boolean doesTest() {
    return false;
  }

  public void loadAndSave(String rootDir, String sourceFile, String destFile) {
  }

  public String checkFragments(String rootDir, String fragments) throws Exception {
    return "Not supported by C# implementation";
  }
}