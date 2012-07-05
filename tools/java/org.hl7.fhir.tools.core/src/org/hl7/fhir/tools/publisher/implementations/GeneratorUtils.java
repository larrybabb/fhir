package org.hl7.fhir.tools.publisher.implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hl7.fhir.definitions.ecore.fhir.CompositeTypeDefn;
import org.hl7.fhir.definitions.ecore.fhir.ElementDefn;
import org.hl7.fhir.definitions.ecore.fhir.FhirFactory;
import org.hl7.fhir.definitions.ecore.fhir.TypeDefn;
import org.hl7.fhir.definitions.ecore.fhir.TypeRef;
import org.hl7.fhir.utilities.Utilities;

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

public class GeneratorUtils {

	public static class NamedElementGroup
	{
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private String name;

		
		private List<ElementDefn> elements;


		public List<ElementDefn> getElements() {
			return elements;
		}
		public void setElements(List<ElementDefn> elements) {
			this.elements = elements;
		}
		
	}
	
	
	public static boolean isCSharpReservedWord(String word) {
	    if (word.equals("abstract")) return true;
	    if (word.equals("as")) return true;
	    if (word.equals("base")) return true;
	    if (word.equals("bool")) return true;
	    if (word.equals("break")) return true;
	    if (word.equals("byte")) return true;
	    if (word.equals("case")) return true;
	    if (word.equals("catch")) return true;
	    if (word.equals("char")) return true;
	    if (word.equals("checked")) return true;
	    if (word.equals("class")) return true;
	    if (word.equals("const")) return true;
	    if (word.equals("continue")) return true;
	    if (word.equals("decimal")) return true;
	    if (word.equals("default")) return true;
	    if (word.equals("delegate")) return true;
	    if (word.equals("do")) return true;
	    if (word.equals("double")) return true;
	    if (word.equals("else")) return true;
	    if (word.equals("enum")) return true;
	    if (word.equals("event")) return true;
	    if (word.equals("explicit")) return true;
	    if (word.equals("extern")) return true;
	    if (word.equals("false")) return true;
	    if (word.equals("finally")) return true;
	    if (word.equals("fixed")) return true;
	    if (word.equals("float")) return true;
	    if (word.equals("for")) return true;
	    if (word.equals("foreach")) return true;
	    if (word.equals("goto")) return true;
	    if (word.equals("if")) return true;
	    if (word.equals("implicit")) return true;
	    if (word.equals("in")) return true;
	    if (word.equals("in(genericmodifier)")) return true;
	    if (word.equals("int")) return true;
	    if (word.equals("interface")) return true;
	    if (word.equals("internal")) return true;
	    if (word.equals("is")) return true;
	    if (word.equals("lock")) return true;
	    if (word.equals("long")) return true;
	    if (word.equals("namespace")) return true;
	    if (word.equals("new")) return true;
	    if (word.equals("null")) return true;
	    if (word.equals("object")) return true;
	    if (word.equals("operator")) return true;
	    if (word.equals("out")) return true;
	    if (word.equals("out(genericmodifier)")) return true;
	    if (word.equals("override")) return true;
	    if (word.equals("params")) return true;
	    if (word.equals("private")) return true;
	    if (word.equals("protected")) return true;
	    if (word.equals("public")) return true;
	    if (word.equals("readonly")) return true;
	    if (word.equals("ref")) return true;
	    if (word.equals("return")) return true;
	    if (word.equals("sbyte")) return true;
	    if (word.equals("sealed")) return true;
	    if (word.equals("short")) return true;
	    if (word.equals("sizeof")) return true;
	    if (word.equals("stackalloc")) return true;
	    if (word.equals("static")) return true;
	    if (word.equals("string")) return true;
	    if (word.equals("struct")) return true;
	    if (word.equals("switch")) return true;
	    if (word.equals("this")) return true;
	    if (word.equals("throw")) return true;
	    if (word.equals("true")) return true;
	    if (word.equals("try")) return true;
	    if (word.equals("typeof")) return true;
	    if (word.equals("uint")) return true;
	    if (word.equals("ulong")) return true;
	    if (word.equals("unchecked")) return true;
	    if (word.equals("unsafe")) return true;
	    if (word.equals("ushort")) return true;
	    if (word.equals("using")) return true;
	    if (word.equals("virtual")) return true;
	    if (word.equals("void")) return true;
	    if (word.equals("volatile")) return true;
	    if (word.equals("while")) return true;
	    return false;
	}
	
	public static boolean isJavaReservedWord(String word) {
    if (word.equals("abstract")) return true;   
		if (word.equals("assert")) return true;
		if (word.equals("boolean")) return true;
		if (word.equals("break")) return true; 	
		if (word.equals("byte")) return true; 	
		if (word.equals("case")) return true;
		if (word.equals("catch")) return true; 	
		if (word.equals("char")) return true; 	
		if (word.equals("class")) return true; 	
		if (word.equals("const")) return true; 	
		if (word.equals("continue")) return true; 	
		if (word.equals("default")) return true;
		if (word.equals("double")) return true; 	
		if (word.equals("do")) return true; 	
		if (word.equals("else")) return true; 	
		if (word.equals("enum")) return true; 	
		if (word.equals("extends")) return true; 	
		if (word.equals("false")) return true;
		if (word.equals("final")) return true; 	
		if (word.equals("finally")) return true; 	
		if (word.equals("float")) return true; 	
		if (word.equals("for")) return true; 	
		if (word.equals("goto")) return true; 	
		if (word.equals("if")) return true;
		if (word.equals("implements")) return true; 	
		if (word.equals("import")) return true; 	
		if (word.equals("instanceof")) return true; 	
		if (word.equals("int")) return true; 	
		if (word.equals("interface")) return true; 	
		if (word.equals("long")) return true;
		if (word.equals("native")) return true; 	
		if (word.equals("new")) return true; 	
		if (word.equals("null")) return true; 	
		if (word.equals("package")) return true; 	
		if (word.equals("private")) return true; 	
		if (word.equals("protected")) return true;
		if (word.equals("public")) return true; 	
		if (word.equals("return")) return true; 	
		if (word.equals("short")) return true; 	
		if (word.equals("static")) return true; 	
		if (word.equals("strictfp")) return true; 	
		if (word.equals("super")) return true;
		if (word.equals("switch")) return true; 	
		if (word.equals("synchronized")) return true; 	
		if (word.equals("this")) return true; 	
		if (word.equals("throw")) return true; 	
		if (word.equals("throws")) return true; 	
		if (word.equals("transient")) return true;
		if (word.equals("true")) return true; 	
		if (word.equals("try")) return true; 	
		if (word.equals("void")) return true; 	
		if (word.equals("volatile")) return true;
		if (word.equals("while")) return true;
		return false;
	}

	public static boolean isDelphiReservedWord(String word) {
	  if (word.equals("and")) return true;
	  if (word.equals("array")) return true;
	  if (word.equals("as")) return true;
	  if (word.equals("asm")) return true;
	  if (word.equals("begin")) return true;
	  if (word.equals("case")) return true;
	  if (word.equals("class")) return true;
	  if (word.equals("const")) return true;
	  if (word.equals("constructor")) return true;
	  if (word.equals("create")) return true;
	  if (word.equals("destructor")) return true;
	  if (word.equals("dispinterface")) return true;
	  if (word.equals("div")) return true;
	  if (word.equals("do")) return true;
	  if (word.equals("downto")) return true;
	  if (word.equals("else")) return true;
	  if (word.equals("end")) return true;
	  if (word.equals("except")) return true;
	  if (word.equals("exports")) return true;
	  if (word.equals("file")) return true;
	  if (word.equals("finalization")) return true;
	  if (word.equals("finally")) return true;
	  if (word.equals("for")) return true;
	  if (word.equals("function")) return true;
	  if (word.equals("goto")) return true;
	  if (word.equals("if")) return true;
	  if (word.equals("implementation")) return true;
	  if (word.equals("in")) return true;
	  if (word.equals("inherited")) return true;
	  if (word.equals("initialization")) return true;
	  if (word.equals("inline")) return true;
	  if (word.equals("interface")) return true;
	  if (word.equals("is")) return true;
	  if (word.equals("label")) return true;
	  if (word.equals("library")) return true;
	  if (word.equals("link")) return true;
	  if (word.equals("mod")) return true;
	  if (word.equals("nil")) return true;
	  if (word.equals("not")) return true;
	  if (word.equals("object")) return true;
	  if (word.equals("of")) return true;
	  if (word.equals("or")) return true;
	  if (word.equals("out")) return true;
	  if (word.equals("packed")) return true;
	  if (word.equals("procedure")) return true;
	  if (word.equals("program")) return true;
	  if (word.equals("property")) return true;
	  if (word.equals("raise")) return true;
	  if (word.equals("record")) return true;
	  if (word.equals("repeat")) return true;
	  if (word.equals("resourcestring")) return true;
	  if (word.equals("set")) return true;
	  if (word.equals("shl")) return true;
	  if (word.equals("shr")) return true;
	  if (word.equals("string")) return true;
	  if (word.equals("then")) return true;
	  if (word.equals("threadvar")) return true;
	  if (word.equals("to")) return true;
	  if (word.equals("try")) return true;
	  if (word.equals("type")) return true;
	  if (word.equals("unit")) return true;
	  if (word.equals("until")) return true;
	  if (word.equals("uses")) return true;
	  if (word.equals("var")) return true;
	  if (word.equals("while")) return true;
	  if (word.equals("with")) return true;
	  if (word.equals("xor")) return true;
    return false;
	}

	
	public static String mapPrimitiveToCSharpType(String name) throws Exception
	{
		if (name.equals("boolean"))
			return "bool";
		else if (name.equals("integer"))
			return "int";
		else if (name.equals("decimal"))
			return "decimal";
		else if (name.equals("base64Binary"))
			return "byte[]";
		else if (name.equals("instant"))
			return "FhirDateTime";
		else if (name.equals("string"))
			return "string";
		else if (name.equals("uri"))
			return "System.Uri";
		else if (name.equals("code"))
			return "string";
		else if (name.equals("oid"))
			return "string";
		else if (name.equals("uuid"))
			return "string";
		else if (name.equals("sid"))
			return "string";
		else if (name.equals("id"))
			return "string";
		else if (name.equals("date"))
			return "FhirDateTime";
		else if (name.equals("dateTime"))
			return "FhirDateTime";
		else
			throw new Exception( "Unrecognized primitive" );
	}
	
	public static String mapPrimitiveToFhirCSharpType(String name) {
		if (name.equals("boolean"))
			return "FhirBoolean";
		else if (name.equals("integer"))
			return "Integer";
		else if (name.equals("decimal"))
			return "FhirDecimal";
		else if (name.equals("base64Binary"))
			return "Base64Binary";
		else if (name.equals("instant"))
			return "Instant";
		else if (name.equals("string"))
			return "FhirString";
		else if (name.equals("uri"))
			return "FhirUri";
		else if (name.equals("code"))
			return "Code";
		else if (name.equals("oid"))
			return "Oid";
		else if (name.equals("uuid"))
			return "Uuid";
		else if (name.equals("sid"))
			return "Sid";
		else if (name.equals("id"))
			return "Id";
		else if (name.equals("date"))
			return "FhirDateTime";
		else if (name.equals("dateTime"))
			return "FhirDateTime";
		else
			return null;
	}
	
	
	/*
	  private static String mapPrimitiveToCSharpType(String name) {
		if (name.equals("boolean"))
			return "bool";
		else if (name.equals("integer"))
			return "int";
		else if (name.equals("decimal"))
			return "decimal";
		else if (name.equals("base64Binary"))
			return "byte[]";
		else if (name.equals("instant"))
			return "FhirDateTime";
		else if (name.equals("string"))
			return "string";
		else if (name.equals("uri"))
			return "System.Uri";
		else if (name.equals("code"))
			return "string";
		else if (name.equals("oid"))
			return "Oid";
		else if (name.equals("uuid"))
			return "Uuid";
		else if (name.equals("sid"))
			return "Sid";
		else if (name.equals("id"))
			return "Id";
		else if (name.equals("date"))
			return "FhirDateTime";
		else if (name.equals("dateTime"))
			return "FhirDateTime";
		else
			return null;
	}
	*/
	
	
	public static String generateCSharpTypeName(String name) {
		String result = mapPrimitiveToFhirCSharpType(name);
		
		if( result == null )
			result = Utilities.capitalize(name);
		
		return result;
	}
	
//	public static String generateCSharpMemberName(String name) {
//		return generateCSharpMemberName(null, name);
//	}
	
	
	public static String generateCSharpMemberName(CompositeTypeDefn context, String name) {
		String result;
		
		if (name.equals("<"))
			result = "LessThan";
		else if (name.equals("<="))
			result = "LessOrEqual";
		else if (name.equals(">"))
			result = "GreaterThan";
		else if (name.equals(">="))
			result = "GreaterOrEqual";
		else if (name.equals("="))
			result = "Equal";
		else if (name.startsWith("-"))
			result = name.replace("-", "Minus");	
		else
			result = Utilities.capitalize(name);

		result = result.replace("-", "_").replace("+", "Plus");

		if( context != null )
		{
			// An attribute cannot have the same name as a nested type
			for( CompositeTypeDefn composite : context.getLocalCompositeTypes() )
				if( composite.getName().equals(result) )
				{
					result += "_";
					break;
				}
			
			// An attribute cannot have the same name as its enclosing type
			if( result.equals( context.getName() ) )
				result += "_";
		}
		
		return result;
	}

	
	public static Map<ElementDefn, NamedElementGroup> generateNamedGroupsForNestedElements(CompositeTypeDefn composite)
	{
		return generateNamedGroupsForNestedElements("", composite);
	}
	

	public static Map<ElementDefn, NamedElementGroup> generateNamedGroupsForNestedElements( String rootName, CompositeTypeDefn composite )
	{
		Map<ElementDefn, NamedElementGroup> result = new HashMap<ElementDefn, NamedElementGroup>();

		for( ElementDefn childElem : composite.getElements() )
		{
			if( childElem.hasNestedElements() )
			{
				String childTypeName = rootName + Utilities.capitalize(childElem.getName());
				result.putAll( generateNamedGroupForNestedElements(childTypeName, childElem) );
			}
		}

		for( CompositeTypeDefn childComponent : composite.getLocalCompositeTypes() )
		{
			result.putAll( generateNamedGroupsForNestedElements(rootName + childComponent.getName(), childComponent));
		}
		
		return result;
	}
	
	
	private static Map<ElementDefn, NamedElementGroup> generateNamedGroupForNestedElements( String name,  ElementDefn root )
	{
		Map<ElementDefn, NamedElementGroup> result = new HashMap<ElementDefn, NamedElementGroup>();

		for( ElementDefn elem : root.getElements() )
		{
			if( elem.hasNestedElements() )
			{
				String childGroupName = name.concat( Utilities.capitalize(elem.getName()) );
				result.putAll( generateNamedGroupForNestedElements(childGroupName, elem) );
			}
		}

		NamedElementGroup newGroup = new NamedElementGroup();
		newGroup.setName(name.concat("Component"));
		newGroup.setElements(root.getElements());
		
		result.put( root, newGroup );
		
		return result;
	}
	

		
	/* If we have a combination of types for an element, we should generate
	 * the element to have a type of the most specialized possible supertype.
	 * 
	 * If categories of types are mixed (primitives/composites), the function
	 * will return the appropriate supertype. Polymorphic combinations
	 * with other categories are not supported.
	 * 
	 * NB: If the element has multiple typerefs of the same type (only possible for
	 * generic types), it will map to a common typename without generic parameters.
	 * This function will work incorrectly for other cases, like multiple codes
	 * with different CodeList bindings, these will be mapped to Code.  
	 */
	public static TypeRef getMostSpecializedCommonBaseForElement( ElementDefn elem )
			//	throws Exception
	{
		boolean hasPrimitives = false;
		boolean hasComposites = false; // includes ResourceRefs
		boolean hasOthers = false;
		
		String sharedGenericTypeName = elem.getTypes().get(0).getName();
		
		CompositeTypeDefn parent = elem.getParentType();
		
		for( TypeRef ref : elem.getTypes() )
		{
			if( !ref.getName().equals(sharedGenericTypeName) )
				sharedGenericTypeName = null;
			
			if( ref.getName().equals(TypeRef.COMPOSITE_PSEUDOTYPE_NAME) )
				hasComposites = true;
			else if( ref.getName().equals(TypeRef.PRIMITIVE_PSEUDOTYPE_NAME) )
				hasPrimitives = true;
			else if( ref.getName().equals(TypeRef.XHTML_PSEUDOTYPE_NAME) ||
					 ref.getName().equals(TypeRef.IDREF_PSEUDOTYPE_NAME) )
				hasOthers = true;
			else
			{
				TypeDefn def = parent.resolveType(ref.getName());
			
				if( def == null )
					return null;
//					throw new Exception( "Cannot find common base for a typeref of type " + ref.getName() +
//								" in " + elem.getElementPath());
				
				if( def.isPrimitive() ) hasPrimitives = true;
				else if( def.isComposite() ) hasComposites = true;
				else if( def.isConstrained() ) hasComposites = true;
				else
				{
					// Note that we cannot actually encounter a TypeRef to a
					// resource, since these are always ResourceReferences,
					// and thus Composites
					hasOthers = true;
				}
			}
		}
		
		if( sharedGenericTypeName != null )
			return newTypeRef(sharedGenericTypeName);
					
		if( hasOthers )
			return null;
		//	throw new Exception( "Cannot find common base for the type combination of " + elem.getElementPath());
		else if( hasPrimitives && !hasComposites )
			return newTypeRef("Primitive");
		else if( !hasPrimitives && hasComposites )
			return newTypeRef("Composite");
		else if( hasPrimitives && hasComposites )
			return newTypeRef("Data");
		else // Huh? Shouldn't happen.
			return null;
		//	throw new Exception( "Cannot find common base for the types of " + elem.getElementPath());

	}
		
	private static TypeRef newTypeRef(String name)
	{
		TypeRef result = FhirFactory.eINSTANCE.createTypeRef();
		result.setName(name);
		
		return result;
	}

}