package org.hl7.fhir.instance.model;

/*
  Copyright (c) 2011-2013, HL7, Inc.
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

// Generated on Mon, Jul 15, 2013 10:55+1000 for FHIR v0.09

import java.util.*;

/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
public class Encounter extends Resource {

    public enum EncounterState {
        planned, // 
        current, // 
        onleave, // 
        finished, // 
        cancelled, // 
        Null; // added to help the parsers
        public static EncounterState fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("planned".equals(codeString))
          return planned;
        if ("current".equals(codeString))
          return current;
        if ("onleave".equals(codeString))
          return onleave;
        if ("finished".equals(codeString))
          return finished;
        if ("cancelled".equals(codeString))
          return cancelled;
        throw new Exception("Unknown EncounterState code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case planned: return "planned";
            case current: return "current";
            case onleave: return "onleave";
            case finished: return "finished";
            case cancelled: return "cancelled";
            default: return "?";
          }
        }
    }

  public class EncounterStateEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("planned".equals(codeString))
          return EncounterState.planned;
        if ("current".equals(codeString))
          return EncounterState.current;
        if ("onleave".equals(codeString))
          return EncounterState.onleave;
        if ("finished".equals(codeString))
          return EncounterState.finished;
        if ("cancelled".equals(codeString))
          return EncounterState.cancelled;
        throw new Exception("Unknown EncounterState code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == EncounterState.planned)
        return "planned";
      if (code == EncounterState.current)
        return "current";
      if (code == EncounterState.onleave)
        return "onleave";
      if (code == EncounterState.finished)
        return "finished";
      if (code == EncounterState.cancelled)
        return "cancelled";
      return "?";
      }
    }

    public enum EncounterClass {
        inpatient, // A patient that stays overnight
        outpatient, // 
        ambulatory, // 
        emergency, // 
        home, // 
        field, // 
        acute, // 
        nonMinusacute, // 
        daytime, // 
        virtual, // 
        Null; // added to help the parsers
        public static EncounterClass fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("inpatient".equals(codeString))
          return inpatient;
        if ("outpatient".equals(codeString))
          return outpatient;
        if ("ambulatory".equals(codeString))
          return ambulatory;
        if ("emergency".equals(codeString))
          return emergency;
        if ("home".equals(codeString))
          return home;
        if ("field".equals(codeString))
          return field;
        if ("acute".equals(codeString))
          return acute;
        if ("non-acute".equals(codeString))
          return nonMinusacute;
        if ("daytime".equals(codeString))
          return daytime;
        if ("virtual".equals(codeString))
          return virtual;
        throw new Exception("Unknown EncounterClass code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case inpatient: return "inpatient";
            case outpatient: return "outpatient";
            case ambulatory: return "ambulatory";
            case emergency: return "emergency";
            case home: return "home";
            case field: return "field";
            case acute: return "acute";
            case nonMinusacute: return "non-acute";
            case daytime: return "daytime";
            case virtual: return "virtual";
            default: return "?";
          }
        }
    }

  public class EncounterClassEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("inpatient".equals(codeString))
          return EncounterClass.inpatient;
        if ("outpatient".equals(codeString))
          return EncounterClass.outpatient;
        if ("ambulatory".equals(codeString))
          return EncounterClass.ambulatory;
        if ("emergency".equals(codeString))
          return EncounterClass.emergency;
        if ("home".equals(codeString))
          return EncounterClass.home;
        if ("field".equals(codeString))
          return EncounterClass.field;
        if ("acute".equals(codeString))
          return EncounterClass.acute;
        if ("non-acute".equals(codeString))
          return EncounterClass.nonMinusacute;
        if ("daytime".equals(codeString))
          return EncounterClass.daytime;
        if ("virtual".equals(codeString))
          return EncounterClass.virtual;
        throw new Exception("Unknown EncounterClass code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == EncounterClass.inpatient)
        return "inpatient";
      if (code == EncounterClass.outpatient)
        return "outpatient";
      if (code == EncounterClass.ambulatory)
        return "ambulatory";
      if (code == EncounterClass.emergency)
        return "emergency";
      if (code == EncounterClass.home)
        return "home";
      if (code == EncounterClass.field)
        return "field";
      if (code == EncounterClass.acute)
        return "acute";
      if (code == EncounterClass.nonMinusacute)
        return "non-acute";
      if (code == EncounterClass.daytime)
        return "daytime";
      if (code == EncounterClass.virtual)
        return "virtual";
      return "?";
      }
    }

    public enum ParticipantType {
        admitter, // 
        discharger, // 
        responsible, // 
        attending, // 
        consulting, // 
        emergencyMinuscontact, // 
        dischargeMinuscontact, // 
        Null; // added to help the parsers
        public static ParticipantType fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("admitter".equals(codeString))
          return admitter;
        if ("discharger".equals(codeString))
          return discharger;
        if ("responsible".equals(codeString))
          return responsible;
        if ("attending".equals(codeString))
          return attending;
        if ("consulting".equals(codeString))
          return consulting;
        if ("emergency-contact".equals(codeString))
          return emergencyMinuscontact;
        if ("discharge-contact".equals(codeString))
          return dischargeMinuscontact;
        throw new Exception("Unknown ParticipantType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case admitter: return "admitter";
            case discharger: return "discharger";
            case responsible: return "responsible";
            case attending: return "attending";
            case consulting: return "consulting";
            case emergencyMinuscontact: return "emergency-contact";
            case dischargeMinuscontact: return "discharge-contact";
            default: return "?";
          }
        }
    }

  public class ParticipantTypeEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("admitter".equals(codeString))
          return ParticipantType.admitter;
        if ("discharger".equals(codeString))
          return ParticipantType.discharger;
        if ("responsible".equals(codeString))
          return ParticipantType.responsible;
        if ("attending".equals(codeString))
          return ParticipantType.attending;
        if ("consulting".equals(codeString))
          return ParticipantType.consulting;
        if ("emergency-contact".equals(codeString))
          return ParticipantType.emergencyMinuscontact;
        if ("discharge-contact".equals(codeString))
          return ParticipantType.dischargeMinuscontact;
        throw new Exception("Unknown ParticipantType code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == ParticipantType.admitter)
        return "admitter";
      if (code == ParticipantType.discharger)
        return "discharger";
      if (code == ParticipantType.responsible)
        return "responsible";
      if (code == ParticipantType.attending)
        return "attending";
      if (code == ParticipantType.consulting)
        return "consulting";
      if (code == ParticipantType.emergencyMinuscontact)
        return "emergency-contact";
      if (code == ParticipantType.dischargeMinuscontact)
        return "discharge-contact";
      return "?";
      }
    }

    public class EncounterParticipantComponent extends Element {
        /**
         * Kind of involvement of the participant
         */
        protected List<Enumeration<ParticipantType>> type = new ArrayList<Enumeration<ParticipantType>>();

        /**
         * The practitioner that is involved
         */
        protected ResourceReference practitioner;

        public List<Enumeration<ParticipantType>> getType() { 
          return this.type;
        }

        public ResourceReference getPractitioner() { 
          return this.practitioner;
        }

        public void setPractitioner(ResourceReference value) { 
          this.practitioner = value;
        }

      public EncounterParticipantComponent copy(Encounter e) {
        EncounterParticipantComponent dst = e.new EncounterParticipantComponent();
        dst.type = new ArrayList<Enumeration<ParticipantType>>();
        for (Enumeration<ParticipantType> i : type)
          dst.type.add(i.copy());
        dst.practitioner = practitioner == null ? null : practitioner.copy();
        return dst;
      }

  }

    public class EncounterHospitalizationComponent extends Element {
        /**
         * Pre-admission identifier
         */
        protected Identifier preAdmissionIdentifier;

        /**
         * Tests to be done before admission
         */
        protected CodeableConcept preAdmissionTest;

        /**
         * The location the patient came from before admission
         */
        protected ResourceReference origin;

        /**
         * Where the patient was admitted from (physician referral, transfer)
         */
        protected CodeableConcept admitSource;

        /**
         * Period of hospitalization.
         */
        protected Period period;

        /**
         * Where the patient stays during this encounter
         */
        protected List<EncounterHospitalizationAccomodationComponent> accomodation = new ArrayList<EncounterHospitalizationAccomodationComponent>();

        /**
         * Dietary restrictions for the patient
         */
        protected CodeableConcept diet;

        /**
         * Special courtesies (vip, hospital board member)
         */
        protected List<CodeableConcept> specialCourtesy = new ArrayList<CodeableConcept>();

        /**
         * Special arrangements (wheelchair, translator, stretcher)
         */
        protected List<CodeableConcept> specialArrangement = new ArrayList<CodeableConcept>();

        /**
         * Location the patient is discharged to
         */
        protected ResourceReference destination;

        /**
         * Disposition a patient was released into
         */
        protected CodeableConcept dischargeDisposition;

        /**
         * Is readmission?
         */
        protected Boolean reAdmission;

        public Identifier getPreAdmissionIdentifier() { 
          return this.preAdmissionIdentifier;
        }

        public void setPreAdmissionIdentifier(Identifier value) { 
          this.preAdmissionIdentifier = value;
        }

        public CodeableConcept getPreAdmissionTest() { 
          return this.preAdmissionTest;
        }

        public void setPreAdmissionTest(CodeableConcept value) { 
          this.preAdmissionTest = value;
        }

        public ResourceReference getOrigin() { 
          return this.origin;
        }

        public void setOrigin(ResourceReference value) { 
          this.origin = value;
        }

        public CodeableConcept getAdmitSource() { 
          return this.admitSource;
        }

        public void setAdmitSource(CodeableConcept value) { 
          this.admitSource = value;
        }

        public Period getPeriod() { 
          return this.period;
        }

        public void setPeriod(Period value) { 
          this.period = value;
        }

        public List<EncounterHospitalizationAccomodationComponent> getAccomodation() { 
          return this.accomodation;
        }

        public CodeableConcept getDiet() { 
          return this.diet;
        }

        public void setDiet(CodeableConcept value) { 
          this.diet = value;
        }

        public List<CodeableConcept> getSpecialCourtesy() { 
          return this.specialCourtesy;
        }

        public List<CodeableConcept> getSpecialArrangement() { 
          return this.specialArrangement;
        }

        public ResourceReference getDestination() { 
          return this.destination;
        }

        public void setDestination(ResourceReference value) { 
          this.destination = value;
        }

        public CodeableConcept getDischargeDisposition() { 
          return this.dischargeDisposition;
        }

        public void setDischargeDisposition(CodeableConcept value) { 
          this.dischargeDisposition = value;
        }

        public Boolean getReAdmission() { 
          return this.reAdmission;
        }

        public void setReAdmission(Boolean value) { 
          this.reAdmission = value;
        }

        public boolean getReAdmissionSimple() { 
          return this.reAdmission == null ? null : this.reAdmission.getValue();
        }

        public void setReAdmissionSimple(boolean value) { 
          if (value == false)
            this.reAdmission = null;
          else {
            if (this.reAdmission == null)
              this.reAdmission = new Boolean();
            this.reAdmission.setValue(value);
          }
        }

      public EncounterHospitalizationComponent copy(Encounter e) {
        EncounterHospitalizationComponent dst = e.new EncounterHospitalizationComponent();
        dst.preAdmissionIdentifier = preAdmissionIdentifier == null ? null : preAdmissionIdentifier.copy();
        dst.preAdmissionTest = preAdmissionTest == null ? null : preAdmissionTest.copy();
        dst.origin = origin == null ? null : origin.copy();
        dst.admitSource = admitSource == null ? null : admitSource.copy();
        dst.period = period == null ? null : period.copy();
        dst.accomodation = new ArrayList<EncounterHospitalizationAccomodationComponent>();
        for (EncounterHospitalizationAccomodationComponent i : accomodation)
          dst.accomodation.add(i.copy(e));
        dst.diet = diet == null ? null : diet.copy();
        dst.specialCourtesy = new ArrayList<CodeableConcept>();
        for (CodeableConcept i : specialCourtesy)
          dst.specialCourtesy.add(i.copy());
        dst.specialArrangement = new ArrayList<CodeableConcept>();
        for (CodeableConcept i : specialArrangement)
          dst.specialArrangement.add(i.copy());
        dst.destination = destination == null ? null : destination.copy();
        dst.dischargeDisposition = dischargeDisposition == null ? null : dischargeDisposition.copy();
        dst.reAdmission = reAdmission == null ? null : reAdmission.copy();
        return dst;
      }

  }

    public class EncounterHospitalizationAccomodationComponent extends Element {
        /**
         * Bed
         */
        protected ResourceReference bed;

        /**
         * Period during which the patient was assigned the bed
         */
        protected Period period;

        public ResourceReference getBed() { 
          return this.bed;
        }

        public void setBed(ResourceReference value) { 
          this.bed = value;
        }

        public Period getPeriod() { 
          return this.period;
        }

        public void setPeriod(Period value) { 
          this.period = value;
        }

      public EncounterHospitalizationAccomodationComponent copy(Encounter e) {
        EncounterHospitalizationAccomodationComponent dst = e.new EncounterHospitalizationAccomodationComponent();
        dst.bed = bed == null ? null : bed.copy();
        dst.period = period == null ? null : period.copy();
        return dst;
      }

  }

    public class EncounterLocationComponent extends Element {
        /**
         * The location the encounter takes place
         */
        protected ResourceReference location;

        /**
         * Time period during which the patient was present at the location
         */
        protected Period period;

        public ResourceReference getLocation() { 
          return this.location;
        }

        public void setLocation(ResourceReference value) { 
          this.location = value;
        }

        public Period getPeriod() { 
          return this.period;
        }

        public void setPeriod(Period value) { 
          this.period = value;
        }

      public EncounterLocationComponent copy(Encounter e) {
        EncounterLocationComponent dst = e.new EncounterLocationComponent();
        dst.location = location == null ? null : location.copy();
        dst.period = period == null ? null : period.copy();
        return dst;
      }

  }

    /**
     * Identifier(s) by which this encounter is known
     */
    protected List<Identifier> identifier = new ArrayList<Identifier>();

    /**
     * E.g. active, aborted, finished
     */
    protected Enumeration<EncounterState> status;

    /**
     * Inpatient | Outpatient etc
     */
    protected Enumeration<EncounterClass> class_;

    /**
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)
     */
    protected List<CodeableConcept> type = new ArrayList<CodeableConcept>();

    /**
     * The patient present at the encounter
     */
    protected ResourceReference subject;

    /**
     * The main practitioner responsible for providing the service
     */
    protected List<EncounterParticipantComponent> participant = new ArrayList<EncounterParticipantComponent>();

    /**
     * The appointment that scheduled this encounter
     */
    protected ResourceReference fulfills;

    /**
     * The date and time the encounter starts, e.g. the patient arrives
     */
    protected DateTime start;

    /**
     * Quantity of time the encounter lasted. This excludes the time during leaves of absence.
     */
    protected Duration length;

    /**
     * Reason the encounter takes place
     */
    protected Type reason;

    /**
     * Reason the encounter takes place
     */
    protected ResourceReference indication;

    /**
     * Indicates the urgency of the encounter
     */
    protected CodeableConcept priority;

    /**
     * Details about an admission to a clinic
     */
    protected EncounterHospitalizationComponent hospitalization;

    /**
     * List of locations the patient has been at.
     */
    protected List<EncounterLocationComponent> location = new ArrayList<EncounterLocationComponent>();

    /**
     * The department or team that is providing care
     */
    protected ResourceReference serviceProvider;

    /**
     * Another Encounter this encounter is part of (administratively or in time)
     */
    protected ResourceReference partOf;

    public List<Identifier> getIdentifier() { 
      return this.identifier;
    }

    public Enumeration<EncounterState> getStatus() { 
      return this.status;
    }

    public void setStatus(Enumeration<EncounterState> value) { 
      this.status = value;
    }

    public EncounterState getStatusSimple() { 
      return this.status == null ? null : this.status.getValue();
    }

    public void setStatusSimple(EncounterState value) { 
        if (this.status == null)
          this.status = new Enumeration<EncounterState>();
        this.status.setValue(value);
    }

    public Enumeration<EncounterClass> getClass_() { 
      return this.class_;
    }

    public void setClass_(Enumeration<EncounterClass> value) { 
      this.class_ = value;
    }

    public EncounterClass getClass_Simple() { 
      return this.class_ == null ? null : this.class_.getValue();
    }

    public void setClass_Simple(EncounterClass value) { 
        if (this.class_ == null)
          this.class_ = new Enumeration<EncounterClass>();
        this.class_.setValue(value);
    }

    public List<CodeableConcept> getType() { 
      return this.type;
    }

    public ResourceReference getSubject() { 
      return this.subject;
    }

    public void setSubject(ResourceReference value) { 
      this.subject = value;
    }

    public List<EncounterParticipantComponent> getParticipant() { 
      return this.participant;
    }

    public ResourceReference getFulfills() { 
      return this.fulfills;
    }

    public void setFulfills(ResourceReference value) { 
      this.fulfills = value;
    }

    public DateTime getStart() { 
      return this.start;
    }

    public void setStart(DateTime value) { 
      this.start = value;
    }

    public String getStartSimple() { 
      return this.start == null ? null : this.start.getValue();
    }

    public void setStartSimple(String value) { 
      if (value == null)
        this.start = null;
      else {
        if (this.start == null)
          this.start = new DateTime();
        this.start.setValue(value);
      }
    }

    public Duration getLength() { 
      return this.length;
    }

    public void setLength(Duration value) { 
      this.length = value;
    }

    public Type getReason() { 
      return this.reason;
    }

    public void setReason(Type value) { 
      this.reason = value;
    }

    public ResourceReference getIndication() { 
      return this.indication;
    }

    public void setIndication(ResourceReference value) { 
      this.indication = value;
    }

    public CodeableConcept getPriority() { 
      return this.priority;
    }

    public void setPriority(CodeableConcept value) { 
      this.priority = value;
    }

    public EncounterHospitalizationComponent getHospitalization() { 
      return this.hospitalization;
    }

    public void setHospitalization(EncounterHospitalizationComponent value) { 
      this.hospitalization = value;
    }

    public List<EncounterLocationComponent> getLocation() { 
      return this.location;
    }

    public ResourceReference getServiceProvider() { 
      return this.serviceProvider;
    }

    public void setServiceProvider(ResourceReference value) { 
      this.serviceProvider = value;
    }

    public ResourceReference getPartOf() { 
      return this.partOf;
    }

    public void setPartOf(ResourceReference value) { 
      this.partOf = value;
    }

      public Encounter copy() {
        Encounter dst = new Encounter();
        dst.identifier = new ArrayList<Identifier>();
        for (Identifier i : identifier)
          dst.identifier.add(i.copy());
        dst.status = status == null ? null : status.copy();
        dst.class_ = class_ == null ? null : class_.copy();
        dst.type = new ArrayList<CodeableConcept>();
        for (CodeableConcept i : type)
          dst.type.add(i.copy());
        dst.subject = subject == null ? null : subject.copy();
        dst.participant = new ArrayList<EncounterParticipantComponent>();
        for (EncounterParticipantComponent i : participant)
          dst.participant.add(i.copy(dst));
        dst.fulfills = fulfills == null ? null : fulfills.copy();
        dst.start = start == null ? null : start.copy();
        dst.length = length == null ? null : length.copy();
        dst.reason = reason == null ? null : reason.copy();
        dst.indication = indication == null ? null : indication.copy();
        dst.priority = priority == null ? null : priority.copy();
        dst.hospitalization = hospitalization == null ? null : hospitalization.copy(dst);
        dst.location = new ArrayList<EncounterLocationComponent>();
        for (EncounterLocationComponent i : location)
          dst.location.add(i.copy(dst));
        dst.serviceProvider = serviceProvider == null ? null : serviceProvider.copy();
        dst.partOf = partOf == null ? null : partOf.copy();
        return dst;
      }

      protected Encounter typedCopy() {
        return copy();
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Encounter;
   }


}

