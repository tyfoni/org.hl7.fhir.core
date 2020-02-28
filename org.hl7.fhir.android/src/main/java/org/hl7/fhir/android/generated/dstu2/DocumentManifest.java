package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

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
/**
 * A manifest that defines a set of documents.
 */
public class DocumentManifest extends DomainResource {

    /**
     * A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.
     */
    protected Identifier masterIdentifier;

    /**
     * Other identifiers associated with the document manifest, including version independent  identifiers.
     */
    protected List<Identifier> identifier;

    /**
     * Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).)
     */
    protected Resource subjectTarget;

    /**
     * A patient, practitioner, or organization for which this set of documents is intended.
     */
    protected List<Reference> recipient;

    /**
     * The actual objects that are the target of the reference (A patient, practitioner, or organization for which this set of documents is intended.)
     */
    protected List<Resource> recipientTarget;

    /**
     * Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider.
     */
    protected CodeableConcept type;

    /**
     * Identifies who is responsible for creating the manifest, and adding  documents to it.
     */
    protected List<Reference> author;

    /**
     * The actual objects that are the target of the reference (Identifies who is responsible for creating the manifest, and adding  documents to it.)
     */
    protected List<Resource> authorTarget;

    /**
     * When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).
     */
    protected DateTimeType created;

    /**
     * Identifies the source system, application, or software that produced the document manifest.
     */
    protected UriType source;

    /**
     * The status of this document manifest.
     */
    protected Enumeration<DocumentReferenceStatus> status;

    /**
     * Human-readable description of the source document. This is sometimes known as the "title".
     */
    protected StringType description;

    /**
     * The list of Documents included in the manifest.
     */
    protected List<DocumentManifestContentComponent> content;

    /**
     * Related identifiers or resources associated with the DocumentManifest.
     */
    protected List<DocumentManifestRelatedComponent> related;

    private static final long serialVersionUID = -2056683927L;

    /*
   * Constructor
   */
    public DocumentManifest() {
        super();
    }

    /*
   * Constructor
   */
    public DocumentManifest(Enumeration<DocumentReferenceStatus> status) {
        super();
        this.status = status;
    }

    /**
     * @return {@link #masterIdentifier} (A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.)
     */
    public Identifier getMasterIdentifier() {
        if (this.masterIdentifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentManifest.masterIdentifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.masterIdentifier = new Identifier();
        return this.masterIdentifier;
    }

    public boolean hasMasterIdentifier() {
        return this.masterIdentifier != null && !this.masterIdentifier.isEmpty();
    }

    /**
     * @param value {@link #masterIdentifier} (A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.)
     */
    public DocumentManifest setMasterIdentifier(Identifier value) {
        this.masterIdentifier = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Other identifiers associated with the document manifest, including version independent  identifiers.)
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
     * @return {@link #identifier} (Other identifiers associated with the document manifest, including version independent  identifiers.)
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
    public DocumentManifest addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #subject} (Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentManifest.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).)
     */
    public DocumentManifest setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).)
     */
    public DocumentManifest setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #recipient} (A patient, practitioner, or organization for which this set of documents is intended.)
     */
    public List<Reference> getRecipient() {
        if (this.recipient == null)
            this.recipient = new ArrayList<Reference>();
        return this.recipient;
    }

    public boolean hasRecipient() {
        if (this.recipient == null)
            return false;
        for (Reference item : this.recipient) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #recipient} (A patient, practitioner, or organization for which this set of documents is intended.)
     */
    // syntactic sugar
    public Reference addRecipient() {
        // 3
        Reference t = new Reference();
        if (this.recipient == null)
            this.recipient = new ArrayList<Reference>();
        this.recipient.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentManifest addRecipient(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.recipient == null)
            this.recipient = new ArrayList<Reference>();
        this.recipient.add(t);
        return this;
    }

    /**
     * @return {@link #recipient} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. A patient, practitioner, or organization for which this set of documents is intended.)
     */
    public List<Resource> getRecipientTarget() {
        if (this.recipientTarget == null)
            this.recipientTarget = new ArrayList<Resource>();
        return this.recipientTarget;
    }

    /**
     * @return {@link #type} (Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentManifest.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider.)
     */
    public DocumentManifest setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #author} (Identifies who is responsible for creating the manifest, and adding  documents to it.)
     */
    public List<Reference> getAuthor() {
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        return this.author;
    }

    public boolean hasAuthor() {
        if (this.author == null)
            return false;
        for (Reference item : this.author) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #author} (Identifies who is responsible for creating the manifest, and adding  documents to it.)
     */
    // syntactic sugar
    public Reference addAuthor() {
        // 3
        Reference t = new Reference();
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        this.author.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentManifest addAuthor(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        this.author.add(t);
        return this;
    }

    /**
     * @return {@link #author} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies who is responsible for creating the manifest, and adding  documents to it.)
     */
    public List<Resource> getAuthorTarget() {
        if (this.authorTarget == null)
            this.authorTarget = new ArrayList<Resource>();
        return this.authorTarget;
    }

    /**
     * @return {@link #created} (When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() {
        if (this.created == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentManifest.created");
            else if (Configuration.doAutoCreate())
                // bb
                this.created = new DateTimeType();
        return this.created;
    }

    public boolean hasCreatedElement() {
        return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() {
        return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DocumentManifest setCreatedElement(DateTimeType value) {
        this.created = value;
        return this;
    }

    /**
     * @return When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).
     */
    public Date getCreated() {
        return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).
     */
    public DocumentManifest setCreated(Date value) {
        if (value == null)
            this.created = null;
        else {
            if (this.created == null)
                this.created = new DateTimeType();
            this.created.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #source} (Identifies the source system, application, or software that produced the document manifest.). This is the underlying object with id, value and extensions. The accessor "getSource" gives direct access to the value
     */
    public UriType getSourceElement() {
        if (this.source == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentManifest.source");
            else if (Configuration.doAutoCreate())
                // bb
                this.source = new UriType();
        return this.source;
    }

    public boolean hasSourceElement() {
        return this.source != null && !this.source.isEmpty();
    }

    public boolean hasSource() {
        return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (Identifies the source system, application, or software that produced the document manifest.). This is the underlying object with id, value and extensions. The accessor "getSource" gives direct access to the value
     */
    public DocumentManifest setSourceElement(UriType value) {
        this.source = value;
        return this;
    }

    /**
     * @return Identifies the source system, application, or software that produced the document manifest.
     */
    public String getSource() {
        return this.source == null ? null : this.source.getValue();
    }

    /**
     * @param value Identifies the source system, application, or software that produced the document manifest.
     */
    public DocumentManifest setSource(String value) {
        if (Utilities.noString(value))
            this.source = null;
        else {
            if (this.source == null)
                this.source = new UriType();
            this.source.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #status} (The status of this document manifest.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DocumentReferenceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentManifest.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<DocumentReferenceStatus>(new DocumentReferenceStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this document manifest.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public DocumentManifest setStatusElement(Enumeration<DocumentReferenceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of this document manifest.
     */
    public DocumentReferenceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this document manifest.
     */
    public DocumentManifest setStatus(DocumentReferenceStatus value) {
        if (this.status == null)
            this.status = new Enumeration<DocumentReferenceStatus>(new DocumentReferenceStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (Human-readable description of the source document. This is sometimes known as the "title".). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentManifest.description");
            else if (Configuration.doAutoCreate())
                // bb
                this.description = new StringType();
        return this.description;
    }

    public boolean hasDescriptionElement() {
        return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Human-readable description of the source document. This is sometimes known as the "title".). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public DocumentManifest setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Human-readable description of the source document. This is sometimes known as the "title".
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Human-readable description of the source document. This is sometimes known as the "title".
     */
    public DocumentManifest setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #content} (The list of Documents included in the manifest.)
     */
    public List<DocumentManifestContentComponent> getContent() {
        if (this.content == null)
            this.content = new ArrayList<DocumentManifestContentComponent>();
        return this.content;
    }

    public boolean hasContent() {
        if (this.content == null)
            return false;
        for (DocumentManifestContentComponent item : this.content) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #content} (The list of Documents included in the manifest.)
     */
    // syntactic sugar
    public DocumentManifestContentComponent addContent() {
        // 3
        DocumentManifestContentComponent t = new DocumentManifestContentComponent();
        if (this.content == null)
            this.content = new ArrayList<DocumentManifestContentComponent>();
        this.content.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentManifest addContent(DocumentManifestContentComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.content == null)
            this.content = new ArrayList<DocumentManifestContentComponent>();
        this.content.add(t);
        return this;
    }

    /**
     * @return {@link #related} (Related identifiers or resources associated with the DocumentManifest.)
     */
    public List<DocumentManifestRelatedComponent> getRelated() {
        if (this.related == null)
            this.related = new ArrayList<DocumentManifestRelatedComponent>();
        return this.related;
    }

    public boolean hasRelated() {
        if (this.related == null)
            return false;
        for (DocumentManifestRelatedComponent item : this.related) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #related} (Related identifiers or resources associated with the DocumentManifest.)
     */
    // syntactic sugar
    public DocumentManifestRelatedComponent addRelated() {
        // 3
        DocumentManifestRelatedComponent t = new DocumentManifestRelatedComponent();
        if (this.related == null)
            this.related = new ArrayList<DocumentManifestRelatedComponent>();
        this.related.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentManifest addRelated(DocumentManifestRelatedComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.related == null)
            this.related = new ArrayList<DocumentManifestRelatedComponent>();
        this.related.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("masterIdentifier", "Identifier", "A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.", 0, java.lang.Integer.MAX_VALUE, masterIdentifier));
        childrenList.add(new Property("identifier", "Identifier", "Other identifiers associated with the document manifest, including version independent  identifiers.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("subject", "Reference(Patient|Practitioner|Group|Device)", "Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("recipient", "Reference(Patient|Practitioner|RelatedPerson|Organization)", "A patient, practitioner, or organization for which this set of documents is intended.", 0, java.lang.Integer.MAX_VALUE, recipient));
        childrenList.add(new Property("type", "CodeableConcept", "Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("author", "Reference(Practitioner|Organization|Device|Patient|RelatedPerson)", "Identifies who is responsible for creating the manifest, and adding  documents to it.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("created", "dateTime", "When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("source", "uri", "Identifies the source system, application, or software that produced the document manifest.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("status", "code", "The status of this document manifest.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("description", "string", "Human-readable description of the source document. This is sometimes known as the \"title\".", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("content", "", "The list of Documents included in the manifest.", 0, java.lang.Integer.MAX_VALUE, content));
        childrenList.add(new Property("related", "", "Related identifiers or resources associated with the DocumentManifest.", 0, java.lang.Integer.MAX_VALUE, related));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("masterIdentifier"))
            // Identifier
            this.masterIdentifier = castToIdentifier(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("recipient"))
            this.getRecipient().add(castToReference(value));
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("author"))
            this.getAuthor().add(castToReference(value));
        else if (name.equals("created"))
            // DateTimeType
            this.created = castToDateTime(value);
        else if (name.equals("source"))
            // UriType
            this.source = castToUri(value);
        else if (name.equals("status"))
            // Enumeration<DocumentReferenceStatus>
            this.status = new DocumentReferenceStatusEnumFactory().fromType(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("content"))
            this.getContent().add((DocumentManifestContentComponent) value);
        else if (name.equals("related"))
            this.getRelated().add((DocumentManifestRelatedComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("masterIdentifier")) {
            this.masterIdentifier = new Identifier();
            return this.masterIdentifier;
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("recipient")) {
            return addRecipient();
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("author")) {
            return addAuthor();
        } else if (name.equals("created")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentManifest.created");
        } else if (name.equals("source")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentManifest.source");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentManifest.status");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentManifest.description");
        } else if (name.equals("content")) {
            return addContent();
        } else if (name.equals("related")) {
            return addRelated();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "DocumentManifest";
    }

    public DocumentManifest copy() {
        DocumentManifest dst = new DocumentManifest();
        copyValues(dst);
        dst.masterIdentifier = masterIdentifier == null ? null : masterIdentifier.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.subject = subject == null ? null : subject.copy();
        if (recipient != null) {
            dst.recipient = new ArrayList<Reference>();
            for (Reference i : recipient) dst.recipient.add(i.copy());
        }
        ;
        dst.type = type == null ? null : type.copy();
        if (author != null) {
            dst.author = new ArrayList<Reference>();
            for (Reference i : author) dst.author.add(i.copy());
        }
        ;
        dst.created = created == null ? null : created.copy();
        dst.source = source == null ? null : source.copy();
        dst.status = status == null ? null : status.copy();
        dst.description = description == null ? null : description.copy();
        if (content != null) {
            dst.content = new ArrayList<DocumentManifestContentComponent>();
            for (DocumentManifestContentComponent i : content) dst.content.add(i.copy());
        }
        ;
        if (related != null) {
            dst.related = new ArrayList<DocumentManifestRelatedComponent>();
            for (DocumentManifestRelatedComponent i : related) dst.related.add(i.copy());
        }
        ;
        return dst;
    }

    protected DocumentManifest typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DocumentManifest))
            return false;
        DocumentManifest o = (DocumentManifest) other;
        return compareDeep(masterIdentifier, o.masterIdentifier, true) && compareDeep(identifier, o.identifier, true) && compareDeep(subject, o.subject, true) && compareDeep(recipient, o.recipient, true) && compareDeep(type, o.type, true) && compareDeep(author, o.author, true) && compareDeep(created, o.created, true) && compareDeep(source, o.source, true) && compareDeep(status, o.status, true) && compareDeep(description, o.description, true) && compareDeep(content, o.content, true) && compareDeep(related, o.related, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DocumentManifest))
            return false;
        DocumentManifest o = (DocumentManifest) other;
        return compareValues(created, o.created, true) && compareValues(source, o.source, true) && compareValues(status, o.status, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (masterIdentifier == null || masterIdentifier.isEmpty()) && (identifier == null || identifier.isEmpty()) && (subject == null || subject.isEmpty()) && (recipient == null || recipient.isEmpty()) && (type == null || type.isEmpty()) && (author == null || author.isEmpty()) && (created == null || created.isEmpty()) && (source == null || source.isEmpty()) && (status == null || status.isEmpty()) && (description == null || description.isEmpty()) && (content == null || content.isEmpty()) && (related == null || related.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.DocumentManifest;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_RELATEDID = "related-id";

    public static final String SP_CONTENTREF = "content-ref";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_AUTHOR = "author";

    public static final String SP_CREATED = "created";

    public static final String SP_DESCRIPTION = "description";

    public static final String SP_SOURCE = "source";

    public static final String SP_TYPE = "type";

    public static final String SP_RELATEDREF = "related-ref";

    public static final String SP_PATIENT = "patient";

    public static final String SP_RECIPIENT = "recipient";

    public static final String SP_STATUS = "status";
}