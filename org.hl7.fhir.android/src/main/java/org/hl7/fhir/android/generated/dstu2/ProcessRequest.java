package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ProcessRequestEnum.ActionList;
import org.hl7.fhir.android.generated.dstu2.ProcessRequestEnum.ActionListEnumFactory;

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
 * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
 */
public class ProcessRequest extends DomainResource {

    /**
     * The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest.
     */
    protected Enumeration<ActionList> action;

    /**
     * The ProcessRequest business identifier.
     */
    protected List<Identifier> identifier;

    /**
     * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
     */
    protected Coding ruleset;

    /**
     * The style (standard) and version of the original material which was converted into this resource.
     */
    protected Coding originalRuleset;

    /**
     * The date when this resource was created.
     */
    protected DateTimeType created;

    /**
     * The organization which is the target of the request.
     */
    protected Reference target;

    /**
     * The actual object that is the target of the reference (The organization which is the target of the request.)
     */
    protected Organization targetTarget;

    /**
     * The practitioner who is responsible for the action specified in thise request.
     */
    protected Reference provider;

    /**
     * The actual object that is the target of the reference (The practitioner who is responsible for the action specified in thise request.)
     */
    protected Practitioner providerTarget;

    /**
     * The organization which is responsible for the action speccified in thise request.
     */
    protected Reference organization;

    /**
     * The actual object that is the target of the reference (The organization which is responsible for the action speccified in thise request.)
     */
    protected Organization organizationTarget;

    /**
     * Reference of resource which is the target or subject of this action.
     */
    protected Reference request;

    /**
     * The actual object that is the target of the reference (Reference of resource which is the target or subject of this action.)
     */
    protected Resource requestTarget;

    /**
     * Reference of a prior response to resource which is the target or subject of this action.
     */
    protected Reference response;

    /**
     * The actual object that is the target of the reference (Reference of a prior response to resource which is the target or subject of this action.)
     */
    protected Resource responseTarget;

    /**
     * If true remove all history excluding audit.
     */
    protected BooleanType nullify;

    /**
     * A reference to supply which authenticates the process.
     */
    protected StringType reference;

    /**
     * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
     */
    protected List<ItemsComponent> item;

    /**
     * Names of resource types to include.
     */
    protected List<StringType> include;

    /**
     * Names of resource types to exclude.
     */
    protected List<StringType> exclude;

    /**
     * A period of time during which the fulfilling resources would have been created.
     */
    protected Period period;

    private static final long serialVersionUID = -1332331220L;

    /*
   * Constructor
   */
    public ProcessRequest() {
        super();
    }

    /*
   * Constructor
   */
    public ProcessRequest(Enumeration<ActionList> action) {
        super();
        this.action = action;
    }

    /**
     * @return {@link #action} (The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest.). This is the underlying object with id, value and extensions. The accessor "getAction" gives direct access to the value
     */
    public Enumeration<ActionList> getActionElement() {
        if (this.action == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.action");
            else if (Configuration.doAutoCreate())
                // bb
                this.action = new Enumeration<ActionList>(new ActionListEnumFactory());
        return this.action;
    }

    public boolean hasActionElement() {
        return this.action != null && !this.action.isEmpty();
    }

    public boolean hasAction() {
        return this.action != null && !this.action.isEmpty();
    }

    /**
     * @param value {@link #action} (The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest.). This is the underlying object with id, value and extensions. The accessor "getAction" gives direct access to the value
     */
    public ProcessRequest setActionElement(Enumeration<ActionList> value) {
        this.action = value;
        return this;
    }

    /**
     * @return The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest.
     */
    public ActionList getAction() {
        return this.action == null ? null : this.action.getValue();
    }

    /**
     * @param value The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest.
     */
    public ProcessRequest setAction(ActionList value) {
        if (this.action == null)
            this.action = new Enumeration<ActionList>(new ActionListEnumFactory());
        this.action.setValue(value);
        return this;
    }

    /**
     * @return {@link #identifier} (The ProcessRequest business identifier.)
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
     * @return {@link #identifier} (The ProcessRequest business identifier.)
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
    public ProcessRequest addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public Coding getRuleset() {
        if (this.ruleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.ruleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.ruleset = new Coding();
        return this.ruleset;
    }

    public boolean hasRuleset() {
        return this.ruleset != null && !this.ruleset.isEmpty();
    }

    /**
     * @param value {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public ProcessRequest setRuleset(Coding value) {
        this.ruleset = value;
        return this;
    }

    /**
     * @return {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public Coding getOriginalRuleset() {
        if (this.originalRuleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.originalRuleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.originalRuleset = new Coding();
        return this.originalRuleset;
    }

    public boolean hasOriginalRuleset() {
        return this.originalRuleset != null && !this.originalRuleset.isEmpty();
    }

    /**
     * @param value {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public ProcessRequest setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
        return this;
    }

    /**
     * @return {@link #created} (The date when this resource was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() {
        if (this.created == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.created");
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
     * @param value {@link #created} (The date when this resource was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public ProcessRequest setCreatedElement(DateTimeType value) {
        this.created = value;
        return this;
    }

    /**
     * @return The date when this resource was created.
     */
    public Date getCreated() {
        return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value The date when this resource was created.
     */
    public ProcessRequest setCreated(Date value) {
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
     * @return {@link #target} (The organization which is the target of the request.)
     */
    public Reference getTarget() {
        if (this.target == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.target");
            else if (Configuration.doAutoCreate())
                // cc
                this.target = new Reference();
        return this.target;
    }

    public boolean hasTarget() {
        return this.target != null && !this.target.isEmpty();
    }

    /**
     * @param value {@link #target} (The organization which is the target of the request.)
     */
    public ProcessRequest setTarget(Reference value) {
        this.target = value;
        return this;
    }

    /**
     * @return {@link #target} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization which is the target of the request.)
     */
    public Organization getTargetTarget() {
        if (this.targetTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.target");
            else if (Configuration.doAutoCreate())
                // aa
                this.targetTarget = new Organization();
        return this.targetTarget;
    }

    /**
     * @param value {@link #target} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization which is the target of the request.)
     */
    public ProcessRequest setTargetTarget(Organization value) {
        this.targetTarget = value;
        return this;
    }

    /**
     * @return {@link #provider} (The practitioner who is responsible for the action specified in thise request.)
     */
    public Reference getProvider() {
        if (this.provider == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.provider");
            else if (Configuration.doAutoCreate())
                // cc
                this.provider = new Reference();
        return this.provider;
    }

    public boolean hasProvider() {
        return this.provider != null && !this.provider.isEmpty();
    }

    /**
     * @param value {@link #provider} (The practitioner who is responsible for the action specified in thise request.)
     */
    public ProcessRequest setProvider(Reference value) {
        this.provider = value;
        return this;
    }

    /**
     * @return {@link #provider} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The practitioner who is responsible for the action specified in thise request.)
     */
    public Practitioner getProviderTarget() {
        if (this.providerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.provider");
            else if (Configuration.doAutoCreate())
                // aa
                this.providerTarget = new Practitioner();
        return this.providerTarget;
    }

    /**
     * @param value {@link #provider} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The practitioner who is responsible for the action specified in thise request.)
     */
    public ProcessRequest setProviderTarget(Practitioner value) {
        this.providerTarget = value;
        return this;
    }

    /**
     * @return {@link #organization} (The organization which is responsible for the action speccified in thise request.)
     */
    public Reference getOrganization() {
        if (this.organization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.organization");
            else if (Configuration.doAutoCreate())
                // cc
                this.organization = new Reference();
        return this.organization;
    }

    public boolean hasOrganization() {
        return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (The organization which is responsible for the action speccified in thise request.)
     */
    public ProcessRequest setOrganization(Reference value) {
        this.organization = value;
        return this;
    }

    /**
     * @return {@link #organization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the action speccified in thise request.)
     */
    public Organization getOrganizationTarget() {
        if (this.organizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.organization");
            else if (Configuration.doAutoCreate())
                // aa
                this.organizationTarget = new Organization();
        return this.organizationTarget;
    }

    /**
     * @param value {@link #organization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the action speccified in thise request.)
     */
    public ProcessRequest setOrganizationTarget(Organization value) {
        this.organizationTarget = value;
        return this;
    }

    /**
     * @return {@link #request} (Reference of resource which is the target or subject of this action.)
     */
    public Reference getRequest() {
        if (this.request == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.request");
            else if (Configuration.doAutoCreate())
                // cc
                this.request = new Reference();
        return this.request;
    }

    public boolean hasRequest() {
        return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (Reference of resource which is the target or subject of this action.)
     */
    public ProcessRequest setRequest(Reference value) {
        this.request = value;
        return this;
    }

    /**
     * @return {@link #request} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Reference of resource which is the target or subject of this action.)
     */
    public Resource getRequestTarget() {
        return this.requestTarget;
    }

    /**
     * @param value {@link #request} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Reference of resource which is the target or subject of this action.)
     */
    public ProcessRequest setRequestTarget(Resource value) {
        this.requestTarget = value;
        return this;
    }

    /**
     * @return {@link #response} (Reference of a prior response to resource which is the target or subject of this action.)
     */
    public Reference getResponse() {
        if (this.response == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.response");
            else if (Configuration.doAutoCreate())
                // cc
                this.response = new Reference();
        return this.response;
    }

    public boolean hasResponse() {
        return this.response != null && !this.response.isEmpty();
    }

    /**
     * @param value {@link #response} (Reference of a prior response to resource which is the target or subject of this action.)
     */
    public ProcessRequest setResponse(Reference value) {
        this.response = value;
        return this;
    }

    /**
     * @return {@link #response} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Reference of a prior response to resource which is the target or subject of this action.)
     */
    public Resource getResponseTarget() {
        return this.responseTarget;
    }

    /**
     * @param value {@link #response} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Reference of a prior response to resource which is the target or subject of this action.)
     */
    public ProcessRequest setResponseTarget(Resource value) {
        this.responseTarget = value;
        return this;
    }

    /**
     * @return {@link #nullify} (If true remove all history excluding audit.). This is the underlying object with id, value and extensions. The accessor "getNullify" gives direct access to the value
     */
    public BooleanType getNullifyElement() {
        if (this.nullify == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.nullify");
            else if (Configuration.doAutoCreate())
                // bb
                this.nullify = new BooleanType();
        return this.nullify;
    }

    public boolean hasNullifyElement() {
        return this.nullify != null && !this.nullify.isEmpty();
    }

    public boolean hasNullify() {
        return this.nullify != null && !this.nullify.isEmpty();
    }

    /**
     * @param value {@link #nullify} (If true remove all history excluding audit.). This is the underlying object with id, value and extensions. The accessor "getNullify" gives direct access to the value
     */
    public ProcessRequest setNullifyElement(BooleanType value) {
        this.nullify = value;
        return this;
    }

    /**
     * @return If true remove all history excluding audit.
     */
    public boolean getNullify() {
        return this.nullify == null || this.nullify.isEmpty() ? false : this.nullify.getValue();
    }

    /**
     * @param value If true remove all history excluding audit.
     */
    public ProcessRequest setNullify(boolean value) {
        if (this.nullify == null)
            this.nullify = new BooleanType();
        this.nullify.setValue(value);
        return this;
    }

    /**
     * @return {@link #reference} (A reference to supply which authenticates the process.). This is the underlying object with id, value and extensions. The accessor "getReference" gives direct access to the value
     */
    public StringType getReferenceElement() {
        if (this.reference == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.reference");
            else if (Configuration.doAutoCreate())
                // bb
                this.reference = new StringType();
        return this.reference;
    }

    public boolean hasReferenceElement() {
        return this.reference != null && !this.reference.isEmpty();
    }

    public boolean hasReference() {
        return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (A reference to supply which authenticates the process.). This is the underlying object with id, value and extensions. The accessor "getReference" gives direct access to the value
     */
    public ProcessRequest setReferenceElement(StringType value) {
        this.reference = value;
        return this;
    }

    /**
     * @return A reference to supply which authenticates the process.
     */
    public String getReference() {
        return this.reference == null ? null : this.reference.getValue();
    }

    /**
     * @param value A reference to supply which authenticates the process.
     */
    public ProcessRequest setReference(String value) {
        if (Utilities.noString(value))
            this.reference = null;
        else {
            if (this.reference == null)
                this.reference = new StringType();
            this.reference.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #item} (List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.)
     */
    public List<ItemsComponent> getItem() {
        if (this.item == null)
            this.item = new ArrayList<ItemsComponent>();
        return this.item;
    }

    public boolean hasItem() {
        if (this.item == null)
            return false;
        for (ItemsComponent item : this.item) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #item} (List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.)
     */
    // syntactic sugar
    public ItemsComponent addItem() {
        // 3
        ItemsComponent t = new ItemsComponent();
        if (this.item == null)
            this.item = new ArrayList<ItemsComponent>();
        this.item.add(t);
        return t;
    }

    // syntactic sugar
    public ProcessRequest addItem(ItemsComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.item == null)
            this.item = new ArrayList<ItemsComponent>();
        this.item.add(t);
        return this;
    }

    /**
     * @return {@link #include} (Names of resource types to include.)
     */
    public List<StringType> getInclude() {
        if (this.include == null)
            this.include = new ArrayList<StringType>();
        return this.include;
    }

    public boolean hasInclude() {
        if (this.include == null)
            return false;
        for (StringType item : this.include) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #include} (Names of resource types to include.)
     */
    // syntactic sugar
    public StringType addIncludeElement() {
        // 2
        StringType t = new StringType();
        if (this.include == null)
            this.include = new ArrayList<StringType>();
        this.include.add(t);
        return t;
    }

    /**
     * @param value {@link #include} (Names of resource types to include.)
     */
    public ProcessRequest addInclude(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.include == null)
            this.include = new ArrayList<StringType>();
        this.include.add(t);
        return this;
    }

    /**
     * @param value {@link #include} (Names of resource types to include.)
     */
    public boolean hasInclude(String value) {
        if (this.include == null)
            return false;
        for (StringType v : this.include) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #exclude} (Names of resource types to exclude.)
     */
    public List<StringType> getExclude() {
        if (this.exclude == null)
            this.exclude = new ArrayList<StringType>();
        return this.exclude;
    }

    public boolean hasExclude() {
        if (this.exclude == null)
            return false;
        for (StringType item : this.exclude) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #exclude} (Names of resource types to exclude.)
     */
    // syntactic sugar
    public StringType addExcludeElement() {
        // 2
        StringType t = new StringType();
        if (this.exclude == null)
            this.exclude = new ArrayList<StringType>();
        this.exclude.add(t);
        return t;
    }

    /**
     * @param value {@link #exclude} (Names of resource types to exclude.)
     */
    public ProcessRequest addExclude(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.exclude == null)
            this.exclude = new ArrayList<StringType>();
        this.exclude.add(t);
        return this;
    }

    /**
     * @param value {@link #exclude} (Names of resource types to exclude.)
     */
    public boolean hasExclude(String value) {
        if (this.exclude == null)
            return false;
        for (StringType v : this.exclude) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #period} (A period of time during which the fulfilling resources would have been created.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessRequest.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (A period of time during which the fulfilling resources would have been created.)
     */
    public ProcessRequest setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("action", "code", "The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest.", 0, java.lang.Integer.MAX_VALUE, action));
        childrenList.add(new Property("identifier", "Identifier", "The ProcessRequest business identifier.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("ruleset", "Coding", "The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.", 0, java.lang.Integer.MAX_VALUE, ruleset));
        childrenList.add(new Property("originalRuleset", "Coding", "The style (standard) and version of the original material which was converted into this resource.", 0, java.lang.Integer.MAX_VALUE, originalRuleset));
        childrenList.add(new Property("created", "dateTime", "The date when this resource was created.", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("target", "Reference(Organization)", "The organization which is the target of the request.", 0, java.lang.Integer.MAX_VALUE, target));
        childrenList.add(new Property("provider", "Reference(Practitioner)", "The practitioner who is responsible for the action specified in thise request.", 0, java.lang.Integer.MAX_VALUE, provider));
        childrenList.add(new Property("organization", "Reference(Organization)", "The organization which is responsible for the action speccified in thise request.", 0, java.lang.Integer.MAX_VALUE, organization));
        childrenList.add(new Property("request", "Reference(Any)", "Reference of resource which is the target or subject of this action.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("response", "Reference(Any)", "Reference of a prior response to resource which is the target or subject of this action.", 0, java.lang.Integer.MAX_VALUE, response));
        childrenList.add(new Property("nullify", "boolean", "If true remove all history excluding audit.", 0, java.lang.Integer.MAX_VALUE, nullify));
        childrenList.add(new Property("reference", "string", "A reference to supply which authenticates the process.", 0, java.lang.Integer.MAX_VALUE, reference));
        childrenList.add(new Property("item", "", "List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.", 0, java.lang.Integer.MAX_VALUE, item));
        childrenList.add(new Property("include", "string", "Names of resource types to include.", 0, java.lang.Integer.MAX_VALUE, include));
        childrenList.add(new Property("exclude", "string", "Names of resource types to exclude.", 0, java.lang.Integer.MAX_VALUE, exclude));
        childrenList.add(new Property("period", "Period", "A period of time during which the fulfilling resources would have been created.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("action"))
            // Enumeration<ActionList>
            this.action = new ActionListEnumFactory().fromType(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("ruleset"))
            // Coding
            this.ruleset = castToCoding(value);
        else if (name.equals("originalRuleset"))
            // Coding
            this.originalRuleset = castToCoding(value);
        else if (name.equals("created"))
            // DateTimeType
            this.created = castToDateTime(value);
        else if (name.equals("target"))
            // Reference
            this.target = castToReference(value);
        else if (name.equals("provider"))
            // Reference
            this.provider = castToReference(value);
        else if (name.equals("organization"))
            // Reference
            this.organization = castToReference(value);
        else if (name.equals("request"))
            // Reference
            this.request = castToReference(value);
        else if (name.equals("response"))
            // Reference
            this.response = castToReference(value);
        else if (name.equals("nullify"))
            // BooleanType
            this.nullify = castToBoolean(value);
        else if (name.equals("reference"))
            // StringType
            this.reference = castToString(value);
        else if (name.equals("item"))
            this.getItem().add((ItemsComponent) value);
        else if (name.equals("include"))
            this.getInclude().add(castToString(value));
        else if (name.equals("exclude"))
            this.getExclude().add(castToString(value));
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("action")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcessRequest.action");
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("ruleset")) {
            this.ruleset = new Coding();
            return this.ruleset;
        } else if (name.equals("originalRuleset")) {
            this.originalRuleset = new Coding();
            return this.originalRuleset;
        } else if (name.equals("created")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcessRequest.created");
        } else if (name.equals("target")) {
            this.target = new Reference();
            return this.target;
        } else if (name.equals("provider")) {
            this.provider = new Reference();
            return this.provider;
        } else if (name.equals("organization")) {
            this.organization = new Reference();
            return this.organization;
        } else if (name.equals("request")) {
            this.request = new Reference();
            return this.request;
        } else if (name.equals("response")) {
            this.response = new Reference();
            return this.response;
        } else if (name.equals("nullify")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcessRequest.nullify");
        } else if (name.equals("reference")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcessRequest.reference");
        } else if (name.equals("item")) {
            return addItem();
        } else if (name.equals("include")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcessRequest.include");
        } else if (name.equals("exclude")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcessRequest.exclude");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ProcessRequest";
    }

    public ProcessRequest copy() {
        ProcessRequest dst = new ProcessRequest();
        copyValues(dst);
        dst.action = action == null ? null : action.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.ruleset = ruleset == null ? null : ruleset.copy();
        dst.originalRuleset = originalRuleset == null ? null : originalRuleset.copy();
        dst.created = created == null ? null : created.copy();
        dst.target = target == null ? null : target.copy();
        dst.provider = provider == null ? null : provider.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.request = request == null ? null : request.copy();
        dst.response = response == null ? null : response.copy();
        dst.nullify = nullify == null ? null : nullify.copy();
        dst.reference = reference == null ? null : reference.copy();
        if (item != null) {
            dst.item = new ArrayList<ItemsComponent>();
            for (ItemsComponent i : item) dst.item.add(i.copy());
        }
        ;
        if (include != null) {
            dst.include = new ArrayList<StringType>();
            for (StringType i : include) dst.include.add(i.copy());
        }
        ;
        if (exclude != null) {
            dst.exclude = new ArrayList<StringType>();
            for (StringType i : exclude) dst.exclude.add(i.copy());
        }
        ;
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    protected ProcessRequest typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ProcessRequest))
            return false;
        ProcessRequest o = (ProcessRequest) other;
        return compareDeep(action, o.action, true) && compareDeep(identifier, o.identifier, true) && compareDeep(ruleset, o.ruleset, true) && compareDeep(originalRuleset, o.originalRuleset, true) && compareDeep(created, o.created, true) && compareDeep(target, o.target, true) && compareDeep(provider, o.provider, true) && compareDeep(organization, o.organization, true) && compareDeep(request, o.request, true) && compareDeep(response, o.response, true) && compareDeep(nullify, o.nullify, true) && compareDeep(reference, o.reference, true) && compareDeep(item, o.item, true) && compareDeep(include, o.include, true) && compareDeep(exclude, o.exclude, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ProcessRequest))
            return false;
        ProcessRequest o = (ProcessRequest) other;
        return compareValues(action, o.action, true) && compareValues(created, o.created, true) && compareValues(nullify, o.nullify, true) && compareValues(reference, o.reference, true) && compareValues(include, o.include, true) && compareValues(exclude, o.exclude, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (action == null || action.isEmpty()) && (identifier == null || identifier.isEmpty()) && (ruleset == null || ruleset.isEmpty()) && (originalRuleset == null || originalRuleset.isEmpty()) && (created == null || created.isEmpty()) && (target == null || target.isEmpty()) && (provider == null || provider.isEmpty()) && (organization == null || organization.isEmpty()) && (request == null || request.isEmpty()) && (response == null || response.isEmpty()) && (nullify == null || nullify.isEmpty()) && (reference == null || reference.isEmpty()) && (item == null || item.isEmpty()) && (include == null || include.isEmpty()) && (exclude == null || exclude.isEmpty()) && (period == null || period.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ProcessRequest;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PROVIDER = "provider";

    public static final String SP_ORGANIZATION = "organization";

    public static final String SP_ACTION = "action";
}