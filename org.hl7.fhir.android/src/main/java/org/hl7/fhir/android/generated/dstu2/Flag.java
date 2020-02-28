package org.hl7.fhir.android.generated.dstu2;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/*
  Copyright (c) 2011+, HL7, Inc.
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
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.FlagEnum.FlagStatus;
import org.hl7.fhir.android.generated.dstu2.FlagEnum.FlagStatusEnumFactory;

/**
 * Prospective warnings of potential issues when providing care to the patient.
 */
public class Flag extends DomainResource {

    /**
     * Identifier assigned to the flag for external use (outside the FHIR environment).
     */
    protected List<Identifier> identifier;

    /**
     * Allows an flag to be divided into different categories like clinical, administrative etc. Intended to be used as a means of filtering which flags are displayed to particular user or in a given context.
     */
    protected CodeableConcept category;

    /**
     * Supports basic workflow.
     */
    protected Enumeration<FlagStatus> status;

    /**
     * The period of time from the activation of the flag to inactivation of the flag. If the flag is active, the end of the period should be unspecified.
     */
    protected Period period;

    /**
     * The patient, location, group , organization , or practitioner this is about record this flag is associated with.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (The patient, location, group , organization , or practitioner this is about record this flag is associated with.)
     */
    protected Resource subjectTarget;

    /**
     * This alert is only relevant during the encounter.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (This alert is only relevant during the encounter.)
     */
    protected Encounter encounterTarget;

    /**
     * The person, organization or device that created the flag.
     */
    protected Reference author;

    /**
     * The actual object that is the target of the reference (The person, organization or device that created the flag.)
     */
    protected Resource authorTarget;

    /**
     * The coded value or textual component of the flag to display to the user.
     */
    protected CodeableConcept code;

    private static final long serialVersionUID = 701147751L;

    /*
   * Constructor
   */
    public Flag() {
        super();
    }

    /*
   * Constructor
   */
    public Flag(Enumeration<FlagStatus> status, Reference subject, CodeableConcept code) {
        super();
        this.status = status;
        this.subject = subject;
        this.code = code;
    }

    /**
     * @return {@link #identifier} (Identifier assigned to the flag for external use (outside the FHIR environment).)
     */
    public List<Identifier> getIdentifier() {
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        if (this.identifier == null)
            return false;
        for (Identifier item : this.identifier) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #identifier} (Identifier assigned to the flag for external use (outside the FHIR environment).)
     */
    // syntactic sugar
    public Identifier addIdentifier() {
        // 3
        Identifier t = new Identifier();
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return t;
    }

    // syntactic sugar
    public Flag addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #category} (Allows an flag to be divided into different categories like clinical, administrative etc. Intended to be used as a means of filtering which flags are displayed to particular user or in a given context.)
     */
    public CodeableConcept getCategory() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Flag.category");
            else if (Configuration.doAutoCreate())
                // cc
                this.category = new CodeableConcept();
        return this.category;
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (Allows an flag to be divided into different categories like clinical, administrative etc. Intended to be used as a means of filtering which flags are displayed to particular user or in a given context.)
     */
    public Flag setCategory(CodeableConcept value) {
        this.category = value;
        return this;
    }

    /**
     * @return {@link #status} (Supports basic workflow.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<FlagStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Flag.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<FlagStatus>(new FlagStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Supports basic workflow.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Flag setStatusElement(Enumeration<FlagStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Supports basic workflow.
     */
    public FlagStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Supports basic workflow.
     */
    public Flag setStatus(FlagStatus value) {
        if (this.status == null)
            this.status = new Enumeration<FlagStatus>(new FlagStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #period} (The period of time from the activation of the flag to inactivation of the flag. If the flag is active, the end of the period should be unspecified.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Flag.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period of time from the activation of the flag to inactivation of the flag. If the flag is active, the end of the period should be unspecified.)
     */
    public Flag setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #subject} (The patient, location, group , organization , or practitioner this is about record this flag is associated with.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Flag.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The patient, location, group , organization , or practitioner this is about record this flag is associated with.)
     */
    public Flag setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient, location, group , organization , or practitioner this is about record this flag is associated with.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient, location, group , organization , or practitioner this is about record this flag is associated with.)
     */
    public Flag setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (This alert is only relevant during the encounter.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Flag.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (This alert is only relevant during the encounter.)
     */
    public Flag setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (This alert is only relevant during the encounter.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Flag.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (This alert is only relevant during the encounter.)
     */
    public Flag setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #author} (The person, organization or device that created the flag.)
     */
    public Reference getAuthor() {
        if (this.author == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Flag.author");
            else if (Configuration.doAutoCreate())
                // cc
                this.author = new Reference();
        return this.author;
    }

    public boolean hasAuthor() {
        return this.author != null && !this.author.isEmpty();
    }

    /**
     * @param value {@link #author} (The person, organization or device that created the flag.)
     */
    public Flag setAuthor(Reference value) {
        this.author = value;
        return this;
    }

    /**
     * @return {@link #author} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person, organization or device that created the flag.)
     */
    public Resource getAuthorTarget() {
        return this.authorTarget;
    }

    /**
     * @param value {@link #author} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person, organization or device that created the flag.)
     */
    public Flag setAuthorTarget(Resource value) {
        this.authorTarget = value;
        return this;
    }

    /**
     * @return {@link #code} (The coded value or textual component of the flag to display to the user.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Flag.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (The coded value or textual component of the flag to display to the user.)
     */
    public Flag setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifier assigned to the flag for external use (outside the FHIR environment).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("category", "CodeableConcept", "Allows an flag to be divided into different categories like clinical, administrative etc. Intended to be used as a means of filtering which flags are displayed to particular user or in a given context.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("status", "code", "Supports basic workflow.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("period", "Period", "The period of time from the activation of the flag to inactivation of the flag. If the flag is active, the end of the period should be unspecified.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("subject", "Reference(Patient|Location|Group|Organization|Practitioner)", "The patient, location, group , organization , or practitioner this is about record this flag is associated with.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "This alert is only relevant during the encounter.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("author", "Reference(Device|Organization|Patient|Practitioner)", "The person, organization or device that created the flag.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("code", "CodeableConcept", "The coded value or textual component of the flag to display to the user.", 0, java.lang.Integer.MAX_VALUE, code));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("category"))
            // CodeableConcept
            this.category = castToCodeableConcept(value);
        else if (name.equals("status"))
            // Enumeration<FlagStatus>
            this.status = new FlagStatusEnumFactory().fromType(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("author"))
            // Reference
            this.author = castToReference(value);
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("category")) {
            this.category = new CodeableConcept();
            return this.category;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Flag.status");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("author")) {
            this.author = new Reference();
            return this.author;
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Flag";
    }

    public Flag copy() {
        Flag dst = new Flag();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.category = category == null ? null : category.copy();
        dst.status = status == null ? null : status.copy();
        dst.period = period == null ? null : period.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.author = author == null ? null : author.copy();
        dst.code = code == null ? null : code.copy();
        return dst;
    }

    protected Flag typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Flag))
            return false;
        Flag o = (Flag) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(category, o.category, true) && compareDeep(status, o.status, true) && compareDeep(period, o.period, true) && compareDeep(subject, o.subject, true) && compareDeep(encounter, o.encounter, true) && compareDeep(author, o.author, true) && compareDeep(code, o.code, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Flag))
            return false;
        Flag o = (Flag) other;
        return compareValues(status, o.status, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (category == null || category.isEmpty()) && (status == null || status.isEmpty()) && (period == null || period.isEmpty()) && (subject == null || subject.isEmpty()) && (encounter == null || encounter.isEmpty()) && (author == null || author.isEmpty()) && (code == null || code.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Flag;
    }

    public static final String SP_DATE = "date";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_PATIENT = "patient";

    public static final String SP_AUTHOR = "author";

    public static final String SP_ENCOUNTER = "encounter";
}