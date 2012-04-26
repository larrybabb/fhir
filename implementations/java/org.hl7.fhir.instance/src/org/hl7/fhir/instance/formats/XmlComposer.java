package org.hl7.fhir.instance.formats;

// Copyright HL7 (http://www.hl7.org). Generated on 21:27 Apr 15, 2012 for FHIR v0.01

import org.hl7.fhir.instance.model.*;
import org.hl7.fhir.instance.model.Integer;
import org.hl7.fhir.instance.model.Boolean;

public class XmlComposer extends XmlComposerBase {

  private void composeExtension(String name, Extension element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("code", element.getCode());
      composeUri("definition", element.getDefinition());
      composeString("ref", element.getRef());
      if (element.getState() != null)
        composeString("state", element.getState().toCode());
      composeType("value", element.getValue());
      if (element.getExtension().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtension()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConstraint(String name, Constraint element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("type", element.getType());
      composeString("name", element.getName());
      composeString("purpose", element.getPurpose());
      if (element.getElement().size() > 0) {
        xml.open(FHIR_NS, "elements");
        for (Constraint.Element_ e : element.getElement()) 
          composeConstraintElement_("element", e);
        xml.close(FHIR_NS, "elements");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConstraintElement_(String name, Constraint.Element_ element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("path", element.getPath());
      composeString("name", element.getName());
      composeString("purpose", element.getPurpose());
      composeInt("min", element.getMin());
      composeString("max", element.getMax());
      composeString("type", element.getType());
      if (element.getConformance() != null)
        composeString("conformance", element.getConformance().toCode());
      composeString("condition", element.getCondition());
      composeBool("mustSupport", element.getMustSupport());
      composeBool("mustUnderstand", element.getMustUnderstand());
      composeString("definition", element.getDefinition());
      if (element.getMapping().size() > 0) {
        xml.open(FHIR_NS, "mappings");
        for (Constraint.Mapping e : element.getMapping()) 
          composeConstraintMapping("mapping", e);
        xml.close(FHIR_NS, "mappings");
      }
      composeConstraintAggregation("aggregation", element.getAggregation());
      composeString("valueSet", element.getValueSet());
      if (element.getValue().size() > 0) {
        xml.open(FHIR_NS, "values");
        for (Constraint.Value e : element.getValue()) 
          composeConstraintValue("value", e);
        xml.close(FHIR_NS, "values");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConstraintMapping(String name, Constraint.Mapping element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("target", element.getTarget());
      composeString("map", element.getMap());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConstraintAggregation(String name, Constraint.Aggregation element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeBool("aggregated", element.getAggregated());
      composeString("name", element.getName());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConstraintValue(String name, Constraint.Value element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("name", element.getName());
      composeType("", element.getValue());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeNarrative(String name, Narrative element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getStatus() != null)
        composeString("status", element.getStatus().toCode());
      composeXhtml("xhtml", element.getXhtml());
      if (element.getImage().size() > 0) {
        xml.open(FHIR_NS, "images");
        for (Narrative.Image e : element.getImage()) 
          composeNarrativeImage("image", e);
        xml.close(FHIR_NS, "images");
      }
      if (element.getMap().size() > 0) {
        xml.open(FHIR_NS, "maps");
        for (Narrative.Map e : element.getMap()) 
          composeNarrativeMap("map", e);
        xml.close(FHIR_NS, "maps");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeNarrativeImage(String name, Narrative.Image element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("mimeType", element.getMimeType());
      composeBytes("content", element.getContent());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeNarrativeMap(String name, Narrative.Map element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("text", element.getText());
      composeString("data", element.getData());
      if (element.getSource() != null)
        composeString("source", element.getSource().toCode());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeCoding(String name, Coding element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("code", element.getCode());
      composeUri("system", element.getSystem());
      composeString("display", element.getDisplay());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeInterval_Quantity(String name, Interval<Quantity> element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeQuantity("low", element.getLow());
      composeQuantity("high", element.getHigh());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeInterval_DateTime(String name, Interval<DateTime> element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeDateTime("low", element.getLow());
      composeDateTime("high", element.getHigh());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeInterval_Date(String name, Interval<Date> element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeDate("low", element.getLow());
      composeDate("high", element.getHigh());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeQuantity(String name, Quantity element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeBigDecimal("value", element.getValue());
      if (element.getStatus() != null)
        composeString("status", element.getStatus().toCode());
      composeString("units", element.getUnits());
      composeString("code", element.getCode());
      composeUri("system", element.getSystem());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeChoice(String name, Choice element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("code", element.getCode());
      for (Choice.Value e : element.getValue()) 
        composeChoiceValue("value", e);
      composeBool("isOrdered", element.getIsOrdered());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeChoiceValue(String name, Choice.Value element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("code", element.getCode());
      composeString("display", element.getDisplay());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeAttachment(String name, Attachment element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("mimeType", element.getMimeType());
      composeBytes("data", element.getData());
      composeUri("url", element.getUrl());
      composeBytes("hash", element.getHash());
      composeString("lang", element.getLang());
      composeString("title", element.getTitle());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeRatio(String name, Ratio element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeQuantity("numerator", element.getNumerator());
      composeQuantity("denominator", element.getDenominator());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeCodeableConcept(String name, CodeableConcept element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      for (CodeableConcept.Coding e : element.getCoding()) 
        composeCodeableConceptCoding("coding", e);
      composeString("text", element.getText());
      composeString("primary", element.getPrimary());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeCodeableConceptCoding(String name, CodeableConcept.Coding element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString("code", element.getCode());
      composeUri("system", element.getSystem());
      composeString("display", element.getDisplay());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeIdentifier(String name, Identifier element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeUri("system", element.getSystem());
      composeString("id", element.getId());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeCount(String name, Count element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeBigDecimal("value", element.getValue());
      if (element.getStatus() != null)
        composeString("status", element.getStatus().toCode());
      composeString("units", element.getUnits());
      composeString("code", element.getCode());
      composeUri("system", element.getSystem());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeMoney(String name, Money element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeBigDecimal("value", element.getValue());
      if (element.getStatus() != null)
        composeString("status", element.getStatus().toCode());
      composeString("units", element.getUnits());
      composeString("code", element.getCode());
      composeUri("system", element.getSystem());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDistance(String name, Distance element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeBigDecimal("value", element.getValue());
      if (element.getStatus() != null)
        composeString("status", element.getStatus().toCode());
      composeString("units", element.getUnits());
      composeString("code", element.getCode());
      composeUri("system", element.getSystem());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDuration(String name, Duration element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeBigDecimal("value", element.getValue());
      if (element.getStatus() != null)
        composeString("status", element.getStatus().toCode());
      composeString("units", element.getUnits());
      composeString("code", element.getCode());
      composeUri("system", element.getSystem());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeSchedule(String name, Schedule element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      for (Interval<DateTime> e : element.getEvent()) 
        composeInterval_DateTime("event", e);
      composeScheduleRepeat("repeat", element.getRepeat());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeScheduleRepeat(String name, Schedule.Repeat element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeInt("frequency", element.getFrequency());
      if (element.getWhen() != null)
        composeString("when", element.getWhen().toCode());
      composeDuration("duration", element.getDuration());
      composeInt("count", element.getCount());
      composeString("end", element.getEnd());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeContact(String name, Contact element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getSystem() != null)
        composeString("system", element.getSystem().toCode());
      composeString("value", element.getValue());
      if (element.getUse() != null)
        composeString("use", element.getUse().toCode());
      composeInterval_DateTime("period", element.getPeriod());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeAddress(String name, Address element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getUse() != null)
        composeString("use", element.getUse().toCode());
      composeString("text", element.getText());
      for (Address.Part e : element.getPart()) 
        composeAddressPart("part", e);
      composeInterval_DateTime("period", element.getPeriod());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeAddressPart(String name, Address.Part element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getType() != null)
        composeString("type", element.getType().toCode());
      composeString("value", element.getValue());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeHumanName(String name, HumanName element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getUse() != null)
        composeString("use", element.getUse().toCode());
      composeString("text", element.getText());
      for (HumanName.Part e : element.getPart()) 
        composeHumanNamePart("part", e);
      composeInterval_DateTime("period", element.getPeriod());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeHumanNamePart(String name, HumanName.Part element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getType() != null)
        composeString("type", element.getType().toCode());
      composeString("value", element.getValue());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeHumanId(String name, HumanId element) throws Exception {
    if (element != null) {
      composeTypeAttributes(element);
      xml.open(FHIR_NS, name);
      composeCoding("type", element.getType());
      composeIdentifier("identifier", element.getIdentifier());
      composeInterval_DateTime("period", element.getPeriod());
      composeResourceReference("assigner", element.getAssigner());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConformance(String name, Conformance element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      composeDateTime("date", element.getDate());
      composeConformancePublisher("publisher", element.getPublisher());
      composeConformanceSoftware("software", element.getSoftware());
      if (element.getMode() != null)
        composeString("mode", element.getMode().toCode());
      composeConstraint("resource", element.getResource());
      composeConformanceOperation("operation", element.getOperation());
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConformancePublisher(String name, Conformance.Publisher element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString_("name", element.getName());
      if (element.getAddress().size() > 0) {
        xml.open(FHIR_NS, "addresses");
        for (Address e : element.getAddress()) 
          composeAddress("address", e);
        xml.close(FHIR_NS, "addresses");
      }
      if (element.getContact().size() > 0) {
        xml.open(FHIR_NS, "contacts");
        for (Contact e : element.getContact()) 
          composeContact("contact", e);
        xml.close(FHIR_NS, "contacts");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConformanceSoftware(String name, Conformance.Software element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString_("name", element.getName());
      composeString_("version", element.getVersion());
      composeDateTime("releaseDate", element.getReleaseDate());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConformanceOperation(String name, Conformance.Operation element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeBoolean("read", element.getRead());
      composeBoolean("vread", element.getVread());
      composeBoolean("update", element.getUpdate());
      composeBoolean("delete", element.getDelete());
      composeBoolean("validate", element.getValidate());
      composeBoolean("history", element.getHistory());
      composeConformanceTransaction("transaction", element.getTransaction());
      composeConformanceSearch("search", element.getSearch());
      composeConformanceCreate("create", element.getCreate());
      composeBoolean("updates", element.getUpdates());
      composeBoolean("schema", element.getSchema());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConformanceTransaction(String name, Conformance.Transaction element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getName().size() > 0) {
        xml.open(FHIR_NS, "names");
        for (Code e : element.getName()) 
          composeCode("name", e);
        xml.close(FHIR_NS, "names");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConformanceSearch(String name, Conformance.Search element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getParam().size() > 0) {
        xml.open(FHIR_NS, "params");
        for (String_ e : element.getParam()) 
          composeString_("param", e);
        xml.close(FHIR_NS, "params");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeConformanceCreate(String name, Conformance.Create element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeCode("id", element.getId());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDocument(String name, Document element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      composeInstant("instant", element.getInstant());
      composeCodeableConcept("type", element.getType());
      composeString_("title", element.getTitle());
      composeId("setId", element.getSetId());
      composeInteger("version", element.getVersion());
      composeId("replaces", element.getReplaces());
      composeResourceReference("subject", element.getSubject());
      if (element.getAuthor().size() > 0) {
        xml.open(FHIR_NS, "authors");
        for (Document.Author e : element.getAuthor()) 
          composeDocumentAuthor("author", e);
        xml.close(FHIR_NS, "authors");
      }
      if (element.getAttestor().size() > 0) {
        xml.open(FHIR_NS, "attestors");
        for (Document.Attestor e : element.getAttestor()) 
          composeDocumentAttestor("attestor", e);
        xml.close(FHIR_NS, "attestors");
      }
      if (element.getRecipient().size() > 0) {
        xml.open(FHIR_NS, "recipients");
        for (ResourceReference e : element.getRecipient()) 
          composeResourceReference("recipient", e);
        xml.close(FHIR_NS, "recipients");
      }
      composeResourceReference("custodian", element.getCustodian());
      composeResourceReference("event", element.getEvent());
      composeResourceReference("encounter", element.getEncounter());
      if (element.getSection().size() > 0) {
        xml.open(FHIR_NS, "sections");
        for (Document.Section e : element.getSection()) 
          composeDocumentSection("section", e);
        xml.close(FHIR_NS, "sections");
      }
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDocumentAuthor(String name, Document.Author element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeDateTime("time", element.getTime());
      composeResourceReference("party", element.getParty());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDocumentAttestor(String name, Document.Attestor element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getMode() != null)
        composeString("mode", element.getMode().toCode());
      composeDateTime("time", element.getTime());
      composeResourceReference("party", element.getParty());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDocumentSection(String name, Document.Section element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeCodeableConcept("type", element.getType());
      composeInstant("instant", element.getInstant());
      composeDocumentAuthorA("author", element.getAuthor());
      composeResourceReference("enterer", element.getEnterer());
      composeResourceReference("subject", element.getSubject());
      composeResourceReference("informant", element.getInformant());
      composeResourceReference("content", element.getContent());
      if (element.getSection().size() > 0) {
        xml.open(FHIR_NS, "sections");
        for (Document.Section e : element.getSection()) 
          composeDocumentSection("section", e);
        xml.close(FHIR_NS, "sections");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDocumentAuthorA(String name, Document.AuthorA element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeDateTime("time", element.getTime());
      composeResourceReference("party", element.getParty());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeMessage(String name, Message element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      composeId("threadId", element.getThreadId());
      composeInstant("instant", element.getInstant());
      composeCode("event", element.getEvent());
      composeMessageResponse("response", element.getResponse());
      composeResourceReference("source", element.getSource());
      composeResourceReference("destination", element.getDestination());
      composeResourceReference("enterer", element.getEnterer());
      composeResourceReference("author", element.getAuthor());
      composeResourceReference("responsible", element.getResponsible());
      composeInterval_DateTime("effective", element.getEffective());
      composeCodeableConcept("reason", element.getReason());
      composeResourceReference("data", element.getData());
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeMessageResponse(String name, Message.Response element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      if (element.getCode() != null)
        composeString("code", element.getCode().toCode());
      composeBoolean("duplicate", element.getDuplicate());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeMessageConformance(String name, MessageConformance element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      composeDateTime("date", element.getDate());
      composeMessageConformancePublisher("publisher", element.getPublisher());
      composeMessageConformanceSoftware("software", element.getSoftware());
      if (element.getEvent().size() > 0) {
        xml.open(FHIR_NS, "events");
        for (MessageConformance.Event e : element.getEvent()) 
          composeMessageConformanceEvent("event", e);
        xml.close(FHIR_NS, "events");
      }
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeMessageConformancePublisher(String name, MessageConformance.Publisher element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString_("name", element.getName());
      if (element.getAddress().size() > 0) {
        xml.open(FHIR_NS, "addresses");
        for (Address e : element.getAddress()) 
          composeAddress("address", e);
        xml.close(FHIR_NS, "addresses");
      }
      if (element.getContact().size() > 0) {
        xml.open(FHIR_NS, "contacts");
        for (Contact e : element.getContact()) 
          composeContact("contact", e);
        xml.close(FHIR_NS, "contacts");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeMessageConformanceSoftware(String name, MessageConformance.Software element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString_("name", element.getName());
      composeString_("version", element.getVersion());
      composeDateTime("releaseDate", element.getReleaseDate());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeMessageConformanceEvent(String name, MessageConformance.Event element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeCode("code", element.getCode());
      composeCode("resource", element.getResource());
      if (element.getMode() != null)
        composeString("mode", element.getMode().toCode());
      composeMessageConformanceRequest("request", element.getRequest());
      composeMessageConformanceResponse("response", element.getResponse());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeMessageConformanceRequest(String name, MessageConformance.Request element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getResource().size() > 0) {
        xml.open(FHIR_NS, "resources");
        for (Constraint e : element.getResource()) 
          composeConstraint("resource", e);
        xml.close(FHIR_NS, "resources");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeMessageConformanceResponse(String name, MessageConformance.Response element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getResource().size() > 0) {
        xml.open(FHIR_NS, "resources");
        for (Constraint e : element.getResource()) 
          composeConstraint("resource", e);
        xml.close(FHIR_NS, "resources");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeAgent(String name, Agent element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      composeResourceReference("person", element.getPerson());
      composeResourceReference("organization", element.getOrganization());
      if (element.getRole().size() > 0) {
        xml.open(FHIR_NS, "roles");
        for (CodeableConcept e : element.getRole()) 
          composeCodeableConcept("role", e);
        xml.close(FHIR_NS, "roles");
      }
      composeInterval_DateTime("period", element.getPeriod());
      if (element.getIdentifier().size() > 0) {
        xml.open(FHIR_NS, "identifiers");
        for (HumanId e : element.getIdentifier()) 
          composeHumanId("identifier", e);
        xml.close(FHIR_NS, "identifiers");
      }
      if (element.getAddress().size() > 0) {
        xml.open(FHIR_NS, "addresses");
        for (Address e : element.getAddress()) 
          composeAddress("address", e);
        xml.close(FHIR_NS, "addresses");
      }
      if (element.getContact().size() > 0) {
        xml.open(FHIR_NS, "contacts");
        for (Contact e : element.getContact()) 
          composeContact("contact", e);
        xml.close(FHIR_NS, "contacts");
      }
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeAnimal(String name, Animal element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      if (element.getIdentifier().size() > 0) {
        xml.open(FHIR_NS, "identifiers");
        for (HumanId e : element.getIdentifier()) 
          composeHumanId("identifier", e);
        xml.close(FHIR_NS, "identifiers");
      }
      if (element.getName().size() > 0) {
        xml.open(FHIR_NS, "names");
        for (HumanName e : element.getName()) 
          composeHumanName("name", e);
        xml.close(FHIR_NS, "names");
      }
      composeDateTime("dob", element.getDob());
      composeCodeableConcept("species", element.getSpecies());
      composeCodeableConcept("strain", element.getStrain());
      composeCodeableConcept("gender", element.getGender());
      if (element.getRelatedEntity().size() > 0) {
        xml.open(FHIR_NS, "relatedEntities");
        for (Animal.RelatedEntity e : element.getRelatedEntity()) 
          composeAnimalRelatedEntity("relatedEntity", e);
        xml.close(FHIR_NS, "relatedEntities");
      }
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeAnimalRelatedEntity(String name, Animal.RelatedEntity element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeHumanId("id", element.getId());
      composeCodeableConcept("role", element.getRole());
      composeHumanName("name", element.getName());
      if (element.getAddress().size() > 0) {
        xml.open(FHIR_NS, "addresses");
        for (Address e : element.getAddress()) 
          composeAddress("address", e);
        xml.close(FHIR_NS, "addresses");
      }
      if (element.getContact().size() > 0) {
        xml.open(FHIR_NS, "contacts");
        for (Contact e : element.getContact()) 
          composeContact("contact", e);
        xml.close(FHIR_NS, "contacts");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composePrescription(String name, Prescription element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      if (element.getIdentifier().size() > 0) {
        xml.open(FHIR_NS, "identifiers");
        for (HumanId e : element.getIdentifier()) 
          composeHumanId("identifier", e);
        xml.close(FHIR_NS, "identifiers");
      }
      if (element.getStatus() != null)
        composeString("status", element.getStatus().toCode());
      composeResourceReference("patient", element.getPatient());
      composeResourceReference("prescriber", element.getPrescriber());
      composeDateTime("prescribed", element.getPrescribed());
      composePrescriptionDispense("dispense", element.getDispense());
      composePrescriptionMedicine("medicine", element.getMedicine());
      composePrescriptionAdministrationRequest("administrationRequest", element.getAdministrationRequest());
      composeCodeableConcept("reason", element.getReason());
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composePrescriptionDispense(String name, Prescription.Dispense element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeInteger("repeats", element.getRepeats());
      composeQuantity("quantity", element.getQuantity());
      composeResourceReference("dispenser", element.getDispenser());
      xml.close(FHIR_NS, name);
    }
  }

  private void composePrescriptionMedicine(String name, Prescription.Medicine element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeCoding("productCode", element.getProductCode());
      composeString_("description", element.getDescription());
      if (element.getActiveIngredient().size() > 0) {
        xml.open(FHIR_NS, "activeIngredients");
        for (Prescription.ActiveIngredient e : element.getActiveIngredient()) 
          composePrescriptionActiveIngredient("activeIngredient", e);
        xml.close(FHIR_NS, "activeIngredients");
      }
      if (element.getInactiveIngredient().size() > 0) {
        xml.open(FHIR_NS, "inactiveIngredients");
        for (Prescription.InactiveIngredient e : element.getInactiveIngredient()) 
          composePrescriptionInactiveIngredient("inactiveIngredient", e);
        xml.close(FHIR_NS, "inactiveIngredients");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composePrescriptionActiveIngredient(String name, Prescription.ActiveIngredient element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeCoding("productCode", element.getProductCode());
      composeRatio("quantity", element.getQuantity());
      xml.close(FHIR_NS, name);
    }
  }

  private void composePrescriptionInactiveIngredient(String name, Prescription.InactiveIngredient element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeCoding("productCode", element.getProductCode());
      composeRatio("quantity", element.getQuantity());
      xml.close(FHIR_NS, name);
    }
  }

  private void composePrescriptionAdministrationRequest(String name, Prescription.AdministrationRequest element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString_("description", element.getDescription());
      composeRatio("totalPeriodicDosis", element.getTotalPeriodicDosis());
      composeDateTime("start", element.getStart());
      composeDateTime("end", element.getEnd());
      composeQuantity("duration", element.getDuration());
      composeInteger("numberOfAdministrations", element.getNumberOfAdministrations());
      if (element.getDosageInstruction().size() > 0) {
        xml.open(FHIR_NS, "dosageInstructions");
        for (Prescription.DosageInstruction e : element.getDosageInstruction()) 
          composePrescriptionDosageInstruction("dosageInstruction", e);
        xml.close(FHIR_NS, "dosageInstructions");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composePrescriptionDosageInstruction(String name, Prescription.DosageInstruction element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      if (element.getPrecondition().size() > 0) {
        xml.open(FHIR_NS, "preconditions");
        for (CodeableConcept e : element.getPrecondition()) 
          composeCodeableConcept("precondition", e);
        xml.close(FHIR_NS, "preconditions");
      }
      if (element.getPrn() != null)
        composeString("prn", element.getPrn().toCode());
      if (element.getAdditionalInstruction().size() > 0) {
        xml.open(FHIR_NS, "additionalInstructions");
        for (CodeableConcept e : element.getAdditionalInstruction()) 
          composeCodeableConcept("additionalInstruction", e);
        xml.close(FHIR_NS, "additionalInstructions");
      }
      composeCodeableConcept("route", element.getRoute());
      composeType("dose", element.getDose());
      composeQuantity("rate", element.getRate());
      if (element.getSchedule().size() > 0) {
        xml.open(FHIR_NS, "schedules");
        for (Schedule e : element.getSchedule()) 
          composeSchedule("schedule", e);
        xml.close(FHIR_NS, "schedules");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composePatient(String name, Patient element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      if (element.getLink().size() > 0) {
        xml.open(FHIR_NS, "links");
        for (ResourceReference e : element.getLink()) 
          composeResourceReference("link", e);
        xml.close(FHIR_NS, "links");
      }
      composeBoolean("active", element.getActive());
      composeResourceReference("person", element.getPerson());
      composeResourceReference("animal", element.getAnimal());
      composeResourceReference("provider", element.getProvider());
      if (element.getIdentifier().size() > 0) {
        xml.open(FHIR_NS, "identifiers");
        for (HumanId e : element.getIdentifier()) 
          composeHumanId("identifier", e);
        xml.close(FHIR_NS, "identifiers");
      }
      composeCodeableConcept("diet", element.getDiet());
      composeCodeableConcept("confidentiality", element.getConfidentiality());
      composeCodeableConcept("recordLocation", element.getRecordLocation());
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeOrganization(String name, Organization element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      composeCodeableConcept("code", element.getCode());
      composeCodeableConcept("industryCode", element.getIndustryCode());
      if (element.getIdentifier().size() > 0) {
        xml.open(FHIR_NS, "identifiers");
        for (HumanId e : element.getIdentifier()) 
          composeHumanId("identifier", e);
        xml.close(FHIR_NS, "identifiers");
      }
      if (element.getName().size() > 0) {
        xml.open(FHIR_NS, "names");
        for (Organization.Name e : element.getName()) 
          composeOrganizationName("name", e);
        xml.close(FHIR_NS, "names");
      }
      if (element.getAddress().size() > 0) {
        xml.open(FHIR_NS, "addresses");
        for (Address e : element.getAddress()) 
          composeAddress("address", e);
        xml.close(FHIR_NS, "addresses");
      }
      if (element.getContact().size() > 0) {
        xml.open(FHIR_NS, "contacts");
        for (Contact e : element.getContact()) 
          composeContact("contact", e);
        xml.close(FHIR_NS, "contacts");
      }
      if (element.getAccreditation().size() > 0) {
        xml.open(FHIR_NS, "accreditations");
        for (Organization.Accreditation e : element.getAccreditation()) 
          composeOrganizationAccreditation("accreditation", e);
        xml.close(FHIR_NS, "accreditations");
      }
      if (element.getRelatedOrganization().size() > 0) {
        xml.open(FHIR_NS, "relatedOrganizations");
        for (Organization.RelatedOrganization e : element.getRelatedOrganization()) 
          composeOrganizationRelatedOrganization("relatedOrganization", e);
        xml.close(FHIR_NS, "relatedOrganizations");
      }
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeOrganizationName(String name, Organization.Name element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString_("value", element.getValue());
      composeInterval_DateTime("period", element.getPeriod());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeOrganizationAccreditation(String name, Organization.Accreditation element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeIdentifier("id", element.getId());
      composeCodeableConcept("code", element.getCode());
      composeResourceReference("institution", element.getInstitution());
      composeInterval_DateTime("period", element.getPeriod());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeOrganizationRelatedOrganization(String name, Organization.RelatedOrganization element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeHumanId("id", element.getId());
      composeCodeableConcept("code", element.getCode());
      composeString_("name", element.getName());
      if (element.getAddress().size() > 0) {
        xml.open(FHIR_NS, "addresses");
        for (Address e : element.getAddress()) 
          composeAddress("address", e);
        xml.close(FHIR_NS, "addresses");
      }
      if (element.getContact().size() > 0) {
        xml.open(FHIR_NS, "contacts");
        for (Contact e : element.getContact()) 
          composeContact("contact", e);
        xml.close(FHIR_NS, "contacts");
      }
      composeInterval_DateTime("period", element.getPeriod());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDocumentConformance(String name, DocumentConformance element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      composeDateTime("date", element.getDate());
      composeDocumentConformancePublisher("publisher", element.getPublisher());
      composeDocumentConformanceSoftware("software", element.getSoftware());
      if (element.getDocument().size() > 0) {
        xml.open(FHIR_NS, "documents");
        for (DocumentConformance.Document e : element.getDocument()) 
          composeDocumentConformanceDocument("document", e);
        xml.close(FHIR_NS, "documents");
      }
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDocumentConformancePublisher(String name, DocumentConformance.Publisher element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString_("name", element.getName());
      if (element.getAddress().size() > 0) {
        xml.open(FHIR_NS, "addresses");
        for (Address e : element.getAddress()) 
          composeAddress("address", e);
        xml.close(FHIR_NS, "addresses");
      }
      if (element.getContact().size() > 0) {
        xml.open(FHIR_NS, "contacts");
        for (Contact e : element.getContact()) 
          composeContact("contact", e);
        xml.close(FHIR_NS, "contacts");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDocumentConformanceSoftware(String name, DocumentConformance.Software element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString_("name", element.getName());
      composeString_("version", element.getVersion());
      composeDateTime("releaseDate", element.getReleaseDate());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeDocumentConformanceDocument(String name, DocumentConformance.Document element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeString_("name", element.getName());
      composeString_("purpose", element.getPurpose());
      if (element.getResource().size() > 0) {
        xml.open(FHIR_NS, "resources");
        for (Constraint e : element.getResource()) 
          composeConstraint("resource", e);
        xml.close(FHIR_NS, "resources");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeLabReport(String name, LabReport element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      if (element.getStatus() != null)
        composeString("status", element.getStatus().toCode());
      composeInstant("issued", element.getIssued());
      composeResourceReference("patient", element.getPatient());
      composeResourceReference("admission", element.getAdmission());
      composeResourceReference("laboratory", element.getLaboratory());
      composeId("reportId", element.getReportId());
      if (element.getRequestDetail().size() > 0) {
        xml.open(FHIR_NS, "requestDetails");
        for (LabReport.RequestDetail e : element.getRequestDetail()) 
          composeLabReportRequestDetail("requestDetail", e);
        xml.close(FHIR_NS, "requestDetails");
      }
      composeCodeableConcept("reportName", element.getReportName());
      composeCodeableConcept("service", element.getService());
      composeDateTime("diagnosticTime", element.getDiagnosticTime());
      if (element.getSpecimen().size() > 0) {
        xml.open(FHIR_NS, "specimen");
        for (ResourceReference e : element.getSpecimen()) 
          composeResourceReference("specimen", e);
        xml.close(FHIR_NS, "specimen");
      }
      if (element.getResultGroup().size() > 0) {
        xml.open(FHIR_NS, "resultGroups");
        for (LabReport.ResultGroup e : element.getResultGroup()) 
          composeLabReportResultGroup("resultGroup", e);
        xml.close(FHIR_NS, "resultGroups");
      }
      composeNarrative("conclusion", element.getConclusion());
      if (element.getCodedDiagnosis().size() > 0) {
        xml.open(FHIR_NS, "codedDiagnoses");
        for (CodeableConcept e : element.getCodedDiagnosis()) 
          composeCodeableConcept("codedDiagnosis", e);
        xml.close(FHIR_NS, "codedDiagnoses");
      }
      if (element.getRepresentation().size() > 0) {
        xml.open(FHIR_NS, "representations");
        for (Attachment e : element.getRepresentation()) 
          composeAttachment("representation", e);
        xml.close(FHIR_NS, "representations");
      }
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeLabReportRequestDetail(String name, LabReport.RequestDetail element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeIdentifier("requestOrderId", element.getRequestOrderId());
      composeIdentifier("receiverOrderId", element.getReceiverOrderId());
      if (element.getRequestTest().size() > 0) {
        xml.open(FHIR_NS, "requestTests");
        for (CodeableConcept e : element.getRequestTest()) 
          composeCodeableConcept("requestTest", e);
        xml.close(FHIR_NS, "requestTests");
      }
      composeResourceReference("requester", element.getRequester());
      composeResourceReference("clinicalInfo", element.getClinicalInfo());
      xml.close(FHIR_NS, name);
    }
  }

  private void composeLabReportResultGroup(String name, LabReport.ResultGroup element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeCodeableConcept("name", element.getName());
      composeResourceReference("specimen", element.getSpecimen());
      if (element.getResult().size() > 0) {
        xml.open(FHIR_NS, "results");
        for (LabReport.Result e : element.getResult()) 
          composeLabReportResult("result", e);
        xml.close(FHIR_NS, "results");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeLabReportResult(String name, LabReport.Result element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeCodeableConcept("name", element.getName());
      composeType("value", element.getValue());
      if (element.getFlag() != null)
        composeString("flag", element.getFlag().toCode());
      if (element.getStatus() != null)
        composeString("status", element.getStatus().toCode());
      composeString_("comments", element.getComments());
      if (element.getReferenceRange().size() > 0) {
        xml.open(FHIR_NS, "referenceRanges");
        for (LabReport.ReferenceRange e : element.getReferenceRange()) 
          composeLabReportReferenceRange("referenceRange", e);
        xml.close(FHIR_NS, "referenceRanges");
      }
      xml.close(FHIR_NS, name);
    }
  }

  private void composeLabReportReferenceRange(String name, LabReport.ReferenceRange element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeCodeableConcept("meaning", element.getMeaning());
      composeType("range", element.getRange());
      xml.close(FHIR_NS, name);
    }
  }

  private void composePerson(String name, Person element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeId("id", element.getId());
      if (element.getIdentifier().size() > 0) {
        xml.open(FHIR_NS, "identifiers");
        for (HumanId e : element.getIdentifier()) 
          composeHumanId("identifier", e);
        xml.close(FHIR_NS, "identifiers");
      }
      if (element.getName().size() > 0) {
        xml.open(FHIR_NS, "names");
        for (HumanName e : element.getName()) 
          composeHumanName("name", e);
        xml.close(FHIR_NS, "names");
      }
      if (element.getAddress().size() > 0) {
        xml.open(FHIR_NS, "addresses");
        for (Address e : element.getAddress()) 
          composeAddress("address", e);
        xml.close(FHIR_NS, "addresses");
      }
      if (element.getContact().size() > 0) {
        xml.open(FHIR_NS, "contacts");
        for (Contact e : element.getContact()) 
          composeContact("contact", e);
        xml.close(FHIR_NS, "contacts");
      }
      composeDateTime("dob", element.getDob());
      composeCodeableConcept("gender", element.getGender());
      composeCodeableConcept("religion", element.getReligion());
      if (element.getQualification().size() > 0) {
        xml.open(FHIR_NS, "qualifications");
        for (Person.Qualification e : element.getQualification()) 
          composePersonQualification("qualification", e);
        xml.close(FHIR_NS, "qualifications");
      }
      if (element.getLanguage().size() > 0) {
        xml.open(FHIR_NS, "languages");
        for (Person.Language e : element.getLanguage()) 
          composePersonLanguage("language", e);
        xml.close(FHIR_NS, "languages");
      }
      if (element.getRelatedPerson().size() > 0) {
        xml.open(FHIR_NS, "relatedPeople");
        for (Person.RelatedPerson e : element.getRelatedPerson()) 
          composePersonRelatedPerson("relatedPerson", e);
        xml.close(FHIR_NS, "relatedPeople");
      }
      if (element.getExtensions().size() > 0) {
        xml.open(FHIR_NS, "extensions");
        for (Extension e : element.getExtensions()) 
          composeExtension("extension", e);
        xml.close(FHIR_NS, "extensions");
      }
      composeNarrative("text", element.getText());
      xml.close(FHIR_NS, name);
    }
  }

  private void composePersonQualification(String name, Person.Qualification element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeIdentifier("id", element.getId());
      composeCodeableConcept("code", element.getCode());
      composeResourceReference("institution", element.getInstitution());
      composeInterval_Date("period", element.getPeriod());
      xml.close(FHIR_NS, name);
    }
  }

  private void composePersonLanguage(String name, Person.Language element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeCode("code", element.getCode());
      if (element.getUse() != null)
        composeString("use", element.getUse().toCode());
      xml.close(FHIR_NS, name);
    }
  }

  private void composePersonRelatedPerson(String name, Person.RelatedPerson element) throws Exception {
    if (element != null) {
      composeElementAttributes(element);
      xml.open(FHIR_NS, name);
      composeHumanId("id", element.getId());
      composeCodeableConcept("role", element.getRole());
      composeHumanName("name", element.getName());
      if (element.getContact().size() > 0) {
        xml.open(FHIR_NS, "contacts");
        for (Contact e : element.getContact()) 
          composeContact("contact", e);
        xml.close(FHIR_NS, "contacts");
      }
      xml.close(FHIR_NS, name);
    }
  }

  @Override
  protected void composeResource(Resource resource) throws Exception {
    if (resource instanceof Conformance)
      composeConformance("Conformance", (Conformance)resource);
    else if (resource instanceof Document)
      composeDocument("Document", (Document)resource);
    else if (resource instanceof Message)
      composeMessage("Message", (Message)resource);
    else if (resource instanceof MessageConformance)
      composeMessageConformance("MessageConformance", (MessageConformance)resource);
    else if (resource instanceof Agent)
      composeAgent("Agent", (Agent)resource);
    else if (resource instanceof Animal)
      composeAnimal("Animal", (Animal)resource);
    else if (resource instanceof Prescription)
      composePrescription("Prescription", (Prescription)resource);
    else if (resource instanceof Patient)
      composePatient("Patient", (Patient)resource);
    else if (resource instanceof Organization)
      composeOrganization("Organization", (Organization)resource);
    else if (resource instanceof DocumentConformance)
      composeDocumentConformance("DocumentConformance", (DocumentConformance)resource);
    else if (resource instanceof LabReport)
      composeLabReport("LabReport", (LabReport)resource);
    else if (resource instanceof Person)
      composePerson("Person", (Person)resource);
    else
      throw new Exception("Unhanded resource type");
  }

  @SuppressWarnings("unchecked")
  protected void composeType(String prefix, Type type) throws Exception {
    if (type == null)
      ;
    else if (type instanceof Coding)
       composeCoding(prefix+"Coding", (Coding) type);
    else if (type instanceof Interval && ((Interval<Ordered>) type).getType().equals("Quantity"))
      composeInterval_Quantity(prefix+"Interval_Quantity", (Interval<Quantity>) type);
    else if (type instanceof Interval && ((Interval<Ordered>) type).getType().equals("DateTime"))
      composeInterval_DateTime(prefix+"Interval_DateTime", (Interval<DateTime>) type);
    else if (type instanceof Interval && ((Interval<Ordered>) type).getType().equals("Date"))
      composeInterval_Date(prefix+"Interval_Date", (Interval<Date>) type);
    else if (type instanceof Quantity)
       composeQuantity(prefix+"Quantity", (Quantity) type);
    else if (type instanceof Choice)
       composeChoice(prefix+"Choice", (Choice) type);
    else if (type instanceof Attachment)
       composeAttachment(prefix+"Attachment", (Attachment) type);
    else if (type instanceof Ratio)
       composeRatio(prefix+"Ratio", (Ratio) type);
    else if (type instanceof CodeableConcept)
       composeCodeableConcept(prefix+"CodeableConcept", (CodeableConcept) type);
    else if (type instanceof Identifier)
       composeIdentifier(prefix+"Identifier", (Identifier) type);
    else if (type instanceof Count)
       composeCount(prefix+"Count", (Count) type);
    else if (type instanceof Money)
       composeMoney(prefix+"Money", (Money) type);
    else if (type instanceof Distance)
       composeDistance(prefix+"Distance", (Distance) type);
    else if (type instanceof Duration)
       composeDuration(prefix+"Duration", (Duration) type);
    else if (type instanceof Schedule)
       composeSchedule(prefix+"Schedule", (Schedule) type);
    else if (type instanceof Contact)
       composeContact(prefix+"Contact", (Contact) type);
    else if (type instanceof Address)
       composeAddress(prefix+"Address", (Address) type);
    else if (type instanceof HumanName)
       composeHumanName(prefix+"HumanName", (HumanName) type);
    else if (type instanceof HumanId)
       composeHumanId(prefix+"HumanId", (HumanId) type);
    else if (type instanceof Sid)
       composeSid(prefix+"Sid", (Sid) type);
    else if (type instanceof DateTime)
       composeDateTime(prefix+"DateTime", (DateTime) type);
    else if (type instanceof Integer)
       composeInteger(prefix+"Integer", (Integer) type);
    else if (type instanceof Code)
       composeCode(prefix+"Code", (Code) type);
    else if (type instanceof Date)
       composeDate(prefix+"Date", (Date) type);
    else if (type instanceof Decimal)
       composeDecimal(prefix+"Decimal", (Decimal) type);
    else if (type instanceof Uri)
       composeUri(prefix+"Uri", (Uri) type);
    else if (type instanceof Id)
       composeId(prefix+"Id", (Id) type);
    else if (type instanceof Base64Binary)
       composeBase64Binary(prefix+"Base64Binary", (Base64Binary) type);
    else if (type instanceof Oid)
       composeOid(prefix+"Oid", (Oid) type);
    else if (type instanceof String_)
       composeString_(prefix+"String", (String_) type);
    else if (type instanceof Boolean)
       composeBoolean(prefix+"Boolean", (Boolean) type);
    else if (type instanceof Uuid)
       composeUuid(prefix+"Uuid", (Uuid) type);
    else if (type instanceof Instant)
       composeInstant(prefix+"Instant", (Instant) type);
    else
      throw new Exception("Unhanded type");
  }

}
