package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.dstu2.model.Enumerations.SearchParamType;
import org.hl7.fhir.dstu2.model.Enumerations.SearchParamTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.SearchParameterEnum.XPathUsageType;
import org.hl7.fhir.android.generated.dstu2.SearchParameterEnum.XPathUsageTypeEnumFactory;

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
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 */
public class SearchParameter extends DomainResource {

    /**
     * An absolute URL that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published.
     */
    protected UriType url;

    /**
     * A free text natural language name identifying the search parameter.
     */
    protected StringType name;

    /**
     * The status of this search parameter definition.
     */
    protected Enumeration<ConformanceResourceStatus> status;

    /**
     * A flag to indicate that this search parameter definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    protected BooleanType experimental;

    /**
     * The name of the individual or organization that published the search parameter.
     */
    protected StringType publisher;

    /**
     * Contacts to assist a user in finding and communicating with the publisher.
     */
    protected List<SearchParameterContactComponent> contact;

    /**
     * The date  (and optionally time) when the search parameter definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.
     */
    protected DateTimeType date;

    /**
     * The Scope and Usage that this search parameter was created to meet.
     */
    protected StringType requirements;

    /**
     * The code used in the URL or the parameter name in a parameters resource for this search parameter.
     */
    protected CodeType code;

    /**
     * The base resource type that this search parameter refers to.
     */
    protected CodeType base;

    /**
     * The type of value a search parameter refers to, and how the content is interpreted.
     */
    protected Enumeration<SearchParamType> type;

    /**
     * A description of the search parameters and how it used.
     */
    protected StringType description;

    /**
     * An XPath expression that returns a set of elements for the search parameter.
     */
    protected StringType xpath;

    /**
     * How the search parameter relates to the set of elements returned by evaluating the xpath query.
     */
    protected Enumeration<XPathUsageType> xpathUsage;

    /**
     * Types of resource (if a resource is referenced).
     */
    protected List<CodeType> target;

    private static final long serialVersionUID = -742596414L;

    /*
   * Constructor
   */
    public SearchParameter() {
        super();
    }

    /*
   * Constructor
   */
    public SearchParameter(UriType url, StringType name, CodeType code, CodeType base, Enumeration<SearchParamType> type, StringType description) {
        super();
        this.url = url;
        this.name = name;
        this.code = code;
        this.base = base;
        this.type = type;
        this.description = description;
    }

    /**
     * @return {@link #url} (An absolute URL that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.url");
            else if (Configuration.doAutoCreate())
                // bb
                this.url = new UriType();
        return this.url;
    }

    public boolean hasUrlElement() {
        return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() {
        return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute URL that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public SearchParameter setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return An absolute URL that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URL that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published.
     */
    public SearchParameter setUrl(String value) {
        if (this.url == null)
            this.url = new UriType();
        this.url.setValue(value);
        return this;
    }

    /**
     * @return {@link #name} (A free text natural language name identifying the search parameter.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.name");
            else if (Configuration.doAutoCreate())
                // bb
                this.name = new StringType();
        return this.name;
    }

    public boolean hasNameElement() {
        return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A free text natural language name identifying the search parameter.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public SearchParameter setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A free text natural language name identifying the search parameter.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A free text natural language name identifying the search parameter.
     */
    public SearchParameter setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #status} (The status of this search parameter definition.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ConformanceResourceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this search parameter definition.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public SearchParameter setStatusElement(Enumeration<ConformanceResourceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of this search parameter definition.
     */
    public ConformanceResourceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this search parameter definition.
     */
    public SearchParameter setStatus(ConformanceResourceStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #experimental} (A flag to indicate that this search parameter definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() {
        if (this.experimental == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.experimental");
            else if (Configuration.doAutoCreate())
                // bb
                this.experimental = new BooleanType();
        return this.experimental;
    }

    public boolean hasExperimentalElement() {
        return this.experimental != null && !this.experimental.isEmpty();
    }

    public boolean hasExperimental() {
        return this.experimental != null && !this.experimental.isEmpty();
    }

    /**
     * @param value {@link #experimental} (A flag to indicate that this search parameter definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public SearchParameter setExperimentalElement(BooleanType value) {
        this.experimental = value;
        return this;
    }

    /**
     * @return A flag to indicate that this search parameter definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public boolean getExperimental() {
        return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value A flag to indicate that this search parameter definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public SearchParameter setExperimental(boolean value) {
        if (this.experimental == null)
            this.experimental = new BooleanType();
        this.experimental.setValue(value);
        return this;
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the search parameter.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() {
        if (this.publisher == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.publisher");
            else if (Configuration.doAutoCreate())
                // bb
                this.publisher = new StringType();
        return this.publisher;
    }

    public boolean hasPublisherElement() {
        return this.publisher != null && !this.publisher.isEmpty();
    }

    public boolean hasPublisher() {
        return this.publisher != null && !this.publisher.isEmpty();
    }

    /**
     * @param value {@link #publisher} (The name of the individual or organization that published the search parameter.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public SearchParameter setPublisherElement(StringType value) {
        this.publisher = value;
        return this;
    }

    /**
     * @return The name of the individual or organization that published the search parameter.
     */
    public String getPublisher() {
        return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the search parameter.
     */
    public SearchParameter setPublisher(String value) {
        if (Utilities.noString(value))
            this.publisher = null;
        else {
            if (this.publisher == null)
                this.publisher = new StringType();
            this.publisher.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    public List<SearchParameterContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<SearchParameterContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (SearchParameterContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public SearchParameterContactComponent addContact() {
        // 3
        SearchParameterContactComponent t = new SearchParameterContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<SearchParameterContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public SearchParameter addContact(SearchParameterContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<SearchParameterContactComponent>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #date} (The date  (and optionally time) when the search parameter definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.date");
            else if (Configuration.doAutoCreate())
                // bb
                this.date = new DateTimeType();
        return this.date;
    }

    public boolean hasDateElement() {
        return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() {
        return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The date  (and optionally time) when the search parameter definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public SearchParameter setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date  (and optionally time) when the search parameter definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date  (and optionally time) when the search parameter definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.
     */
    public SearchParameter setDate(Date value) {
        if (value == null)
            this.date = null;
        else {
            if (this.date == null)
                this.date = new DateTimeType();
            this.date.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #requirements} (The Scope and Usage that this search parameter was created to meet.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public StringType getRequirementsElement() {
        if (this.requirements == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.requirements");
            else if (Configuration.doAutoCreate())
                // bb
                this.requirements = new StringType();
        return this.requirements;
    }

    public boolean hasRequirementsElement() {
        return this.requirements != null && !this.requirements.isEmpty();
    }

    public boolean hasRequirements() {
        return this.requirements != null && !this.requirements.isEmpty();
    }

    /**
     * @param value {@link #requirements} (The Scope and Usage that this search parameter was created to meet.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public SearchParameter setRequirementsElement(StringType value) {
        this.requirements = value;
        return this;
    }

    /**
     * @return The Scope and Usage that this search parameter was created to meet.
     */
    public String getRequirements() {
        return this.requirements == null ? null : this.requirements.getValue();
    }

    /**
     * @param value The Scope and Usage that this search parameter was created to meet.
     */
    public SearchParameter setRequirements(String value) {
        if (Utilities.noString(value))
            this.requirements = null;
        else {
            if (this.requirements == null)
                this.requirements = new StringType();
            this.requirements.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #code} (The code used in the URL or the parameter name in a parameters resource for this search parameter.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public CodeType getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.code");
            else if (Configuration.doAutoCreate())
                // bb
                this.code = new CodeType();
        return this.code;
    }

    public boolean hasCodeElement() {
        return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (The code used in the URL or the parameter name in a parameters resource for this search parameter.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public SearchParameter setCodeElement(CodeType value) {
        this.code = value;
        return this;
    }

    /**
     * @return The code used in the URL or the parameter name in a parameters resource for this search parameter.
     */
    public String getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value The code used in the URL or the parameter name in a parameters resource for this search parameter.
     */
    public SearchParameter setCode(String value) {
        if (this.code == null)
            this.code = new CodeType();
        this.code.setValue(value);
        return this;
    }

    /**
     * @return {@link #base} (The base resource type that this search parameter refers to.). This is the underlying object with id, value and extensions. The accessor "getBase" gives direct access to the value
     */
    public CodeType getBaseElement() {
        if (this.base == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.base");
            else if (Configuration.doAutoCreate())
                // bb
                this.base = new CodeType();
        return this.base;
    }

    public boolean hasBaseElement() {
        return this.base != null && !this.base.isEmpty();
    }

    public boolean hasBase() {
        return this.base != null && !this.base.isEmpty();
    }

    /**
     * @param value {@link #base} (The base resource type that this search parameter refers to.). This is the underlying object with id, value and extensions. The accessor "getBase" gives direct access to the value
     */
    public SearchParameter setBaseElement(CodeType value) {
        this.base = value;
        return this;
    }

    /**
     * @return The base resource type that this search parameter refers to.
     */
    public String getBase() {
        return this.base == null ? null : this.base.getValue();
    }

    /**
     * @param value The base resource type that this search parameter refers to.
     */
    public SearchParameter setBase(String value) {
        if (this.base == null)
            this.base = new CodeType();
        this.base.setValue(value);
        return this;
    }

    /**
     * @return {@link #type} (The type of value a search parameter refers to, and how the content is interpreted.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<SearchParamType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<SearchParamType>(new SearchParamTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of value a search parameter refers to, and how the content is interpreted.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public SearchParameter setTypeElement(Enumeration<SearchParamType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return The type of value a search parameter refers to, and how the content is interpreted.
     */
    public SearchParamType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The type of value a search parameter refers to, and how the content is interpreted.
     */
    public SearchParameter setType(SearchParamType value) {
        if (this.type == null)
            this.type = new Enumeration<SearchParamType>(new SearchParamTypeEnumFactory());
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (A description of the search parameters and how it used.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.description");
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
     * @param value {@link #description} (A description of the search parameters and how it used.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public SearchParameter setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A description of the search parameters and how it used.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A description of the search parameters and how it used.
     */
    public SearchParameter setDescription(String value) {
        if (this.description == null)
            this.description = new StringType();
        this.description.setValue(value);
        return this;
    }

    /**
     * @return {@link #xpath} (An XPath expression that returns a set of elements for the search parameter.). This is the underlying object with id, value and extensions. The accessor "getXpath" gives direct access to the value
     */
    public StringType getXpathElement() {
        if (this.xpath == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.xpath");
            else if (Configuration.doAutoCreate())
                // bb
                this.xpath = new StringType();
        return this.xpath;
    }

    public boolean hasXpathElement() {
        return this.xpath != null && !this.xpath.isEmpty();
    }

    public boolean hasXpath() {
        return this.xpath != null && !this.xpath.isEmpty();
    }

    /**
     * @param value {@link #xpath} (An XPath expression that returns a set of elements for the search parameter.). This is the underlying object with id, value and extensions. The accessor "getXpath" gives direct access to the value
     */
    public SearchParameter setXpathElement(StringType value) {
        this.xpath = value;
        return this;
    }

    /**
     * @return An XPath expression that returns a set of elements for the search parameter.
     */
    public String getXpath() {
        return this.xpath == null ? null : this.xpath.getValue();
    }

    /**
     * @param value An XPath expression that returns a set of elements for the search parameter.
     */
    public SearchParameter setXpath(String value) {
        if (Utilities.noString(value))
            this.xpath = null;
        else {
            if (this.xpath == null)
                this.xpath = new StringType();
            this.xpath.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #xpathUsage} (How the search parameter relates to the set of elements returned by evaluating the xpath query.). This is the underlying object with id, value and extensions. The accessor "getXpathUsage" gives direct access to the value
     */
    public Enumeration<XPathUsageType> getXpathUsageElement() {
        if (this.xpathUsage == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SearchParameter.xpathUsage");
            else if (Configuration.doAutoCreate())
                // bb
                this.xpathUsage = new Enumeration<XPathUsageType>(new XPathUsageTypeEnumFactory());
        return this.xpathUsage;
    }

    public boolean hasXpathUsageElement() {
        return this.xpathUsage != null && !this.xpathUsage.isEmpty();
    }

    public boolean hasXpathUsage() {
        return this.xpathUsage != null && !this.xpathUsage.isEmpty();
    }

    /**
     * @param value {@link #xpathUsage} (How the search parameter relates to the set of elements returned by evaluating the xpath query.). This is the underlying object with id, value and extensions. The accessor "getXpathUsage" gives direct access to the value
     */
    public SearchParameter setXpathUsageElement(Enumeration<XPathUsageType> value) {
        this.xpathUsage = value;
        return this;
    }

    /**
     * @return How the search parameter relates to the set of elements returned by evaluating the xpath query.
     */
    public XPathUsageType getXpathUsage() {
        return this.xpathUsage == null ? null : this.xpathUsage.getValue();
    }

    /**
     * @param value How the search parameter relates to the set of elements returned by evaluating the xpath query.
     */
    public SearchParameter setXpathUsage(XPathUsageType value) {
        if (value == null)
            this.xpathUsage = null;
        else {
            if (this.xpathUsage == null)
                this.xpathUsage = new Enumeration<XPathUsageType>(new XPathUsageTypeEnumFactory());
            this.xpathUsage.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #target} (Types of resource (if a resource is referenced).)
     */
    public List<CodeType> getTarget() {
        if (this.target == null)
            this.target = new ArrayList<CodeType>();
        return this.target;
    }

    public boolean hasTarget() {
        if (this.target == null)
            return false;
        for (CodeType item : this.target) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #target} (Types of resource (if a resource is referenced).)
     */
    // syntactic sugar
    public CodeType addTargetElement() {
        // 2
        CodeType t = new CodeType();
        if (this.target == null)
            this.target = new ArrayList<CodeType>();
        this.target.add(t);
        return t;
    }

    /**
     * @param value {@link #target} (Types of resource (if a resource is referenced).)
     */
    public SearchParameter addTarget(String value) {
        // 1
        CodeType t = new CodeType();
        t.setValue(value);
        if (this.target == null)
            this.target = new ArrayList<CodeType>();
        this.target.add(t);
        return this;
    }

    /**
     * @param value {@link #target} (Types of resource (if a resource is referenced).)
     */
    public boolean hasTarget(String value) {
        if (this.target == null)
            return false;
        for (CodeType v : this.target) if (// code
        v.equals(value))
            return true;
        return false;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("url", "uri", "An absolute URL that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("name", "string", "A free text natural language name identifying the search parameter.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("status", "code", "The status of this search parameter definition.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("experimental", "boolean", "A flag to indicate that this search parameter definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.", 0, java.lang.Integer.MAX_VALUE, experimental));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the search parameter.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "", "Contacts to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("date", "dateTime", "The date  (and optionally time) when the search parameter definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("requirements", "string", "The Scope and Usage that this search parameter was created to meet.", 0, java.lang.Integer.MAX_VALUE, requirements));
        childrenList.add(new Property("code", "code", "The code used in the URL or the parameter name in a parameters resource for this search parameter.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("base", "code", "The base resource type that this search parameter refers to.", 0, java.lang.Integer.MAX_VALUE, base));
        childrenList.add(new Property("type", "code", "The type of value a search parameter refers to, and how the content is interpreted.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("description", "string", "A description of the search parameters and how it used.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("xpath", "string", "An XPath expression that returns a set of elements for the search parameter.", 0, java.lang.Integer.MAX_VALUE, xpath));
        childrenList.add(new Property("xpathUsage", "code", "How the search parameter relates to the set of elements returned by evaluating the xpath query.", 0, java.lang.Integer.MAX_VALUE, xpathUsage));
        childrenList.add(new Property("target", "code", "Types of resource (if a resource is referenced).", 0, java.lang.Integer.MAX_VALUE, target));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("status"))
            // Enumeration<ConformanceResourceStatus>
            this.status = new ConformanceResourceStatusEnumFactory().fromType(value);
        else if (name.equals("experimental"))
            // BooleanType
            this.experimental = castToBoolean(value);
        else if (name.equals("publisher"))
            // StringType
            this.publisher = castToString(value);
        else if (name.equals("contact"))
            this.getContact().add((SearchParameterContactComponent) value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("requirements"))
            // StringType
            this.requirements = castToString(value);
        else if (name.equals("code"))
            // CodeType
            this.code = castToCode(value);
        else if (name.equals("base"))
            // CodeType
            this.base = castToCode(value);
        else if (name.equals("type"))
            // Enumeration<SearchParamType>
            this.type = new SearchParamTypeEnumFactory().fromType(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("xpath"))
            // StringType
            this.xpath = castToString(value);
        else if (name.equals("xpathUsage"))
            // Enumeration<XPathUsageType>
            this.xpathUsage = new XPathUsageTypeEnumFactory().fromType(value);
        else if (name.equals("target"))
            this.getTarget().add(castToCode(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.url");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.name");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.status");
        } else if (name.equals("experimental")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.experimental");
        } else if (name.equals("publisher")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.publisher");
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.date");
        } else if (name.equals("requirements")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.requirements");
        } else if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.code");
        } else if (name.equals("base")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.base");
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.type");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.description");
        } else if (name.equals("xpath")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.xpath");
        } else if (name.equals("xpathUsage")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.xpathUsage");
        } else if (name.equals("target")) {
            throw new FHIRException("Cannot call addChild on a primitive type SearchParameter.target");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "SearchParameter";
    }

    public SearchParameter copy() {
        SearchParameter dst = new SearchParameter();
        copyValues(dst);
        dst.url = url == null ? null : url.copy();
        dst.name = name == null ? null : name.copy();
        dst.status = status == null ? null : status.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
            dst.contact = new ArrayList<SearchParameterContactComponent>();
            for (SearchParameterContactComponent i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.date = date == null ? null : date.copy();
        dst.requirements = requirements == null ? null : requirements.copy();
        dst.code = code == null ? null : code.copy();
        dst.base = base == null ? null : base.copy();
        dst.type = type == null ? null : type.copy();
        dst.description = description == null ? null : description.copy();
        dst.xpath = xpath == null ? null : xpath.copy();
        dst.xpathUsage = xpathUsage == null ? null : xpathUsage.copy();
        if (target != null) {
            dst.target = new ArrayList<CodeType>();
            for (CodeType i : target) dst.target.add(i.copy());
        }
        ;
        return dst;
    }

    protected SearchParameter typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SearchParameter))
            return false;
        SearchParameter o = (SearchParameter) other;
        return compareDeep(url, o.url, true) && compareDeep(name, o.name, true) && compareDeep(status, o.status, true) && compareDeep(experimental, o.experimental, true) && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(date, o.date, true) && compareDeep(requirements, o.requirements, true) && compareDeep(code, o.code, true) && compareDeep(base, o.base, true) && compareDeep(type, o.type, true) && compareDeep(description, o.description, true) && compareDeep(xpath, o.xpath, true) && compareDeep(xpathUsage, o.xpathUsage, true) && compareDeep(target, o.target, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SearchParameter))
            return false;
        SearchParameter o = (SearchParameter) other;
        return compareValues(url, o.url, true) && compareValues(name, o.name, true) && compareValues(status, o.status, true) && compareValues(experimental, o.experimental, true) && compareValues(publisher, o.publisher, true) && compareValues(date, o.date, true) && compareValues(requirements, o.requirements, true) && compareValues(code, o.code, true) && compareValues(base, o.base, true) && compareValues(type, o.type, true) && compareValues(description, o.description, true) && compareValues(xpath, o.xpath, true) && compareValues(xpathUsage, o.xpathUsage, true) && compareValues(target, o.target, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (url == null || url.isEmpty()) && (name == null || name.isEmpty()) && (status == null || status.isEmpty()) && (experimental == null || experimental.isEmpty()) && (publisher == null || publisher.isEmpty()) && (contact == null || contact.isEmpty()) && (date == null || date.isEmpty()) && (requirements == null || requirements.isEmpty()) && (code == null || code.isEmpty()) && (base == null || base.isEmpty()) && (type == null || type.isEmpty()) && (description == null || description.isEmpty()) && (xpath == null || xpath.isEmpty()) && (xpathUsage == null || xpathUsage.isEmpty()) && (target == null || target.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.SearchParameter;
    }

    public static final String SP_CODE = "code";

    public static final String SP_NAME = "name";

    public static final String SP_DESCRIPTION = "description";

    public static final String SP_TYPE = "type";

    public static final String SP_URL = "url";

    public static final String SP_BASE = "base";

    public static final String SP_TARGET = "target";
}