package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.List;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.QuantityEnum.QuantityComparator;
import org.hl7.fhir.android.generated.dstu2.QuantityEnum.QuantityComparatorEnumFactory;

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
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
 */
public class Quantity extends Type implements ICompositeType {

    /**
     * The value of the measured amount. The value includes an implicit precision in the presentation of the value.
     */
    protected DecimalType value;

    /**
     * How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "<" , then the real value is < stated value.
     */
    protected Enumeration<QuantityComparator> comparator;

    /**
     * A human-readable form of the unit.
     */
    protected StringType unit;

    /**
     * The identification of the system that provides the coded form of the unit.
     */
    protected UriType system;

    /**
     * A computer processable form of the unit in some unit representation system.
     */
    protected CodeType code;

    private static final long serialVersionUID = 1069574054L;

    /*
   * Constructor
   */
    public Quantity() {
        super();
    }

    /**
     * @return {@link #value} (The value of the measured amount. The value includes an implicit precision in the presentation of the value.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public DecimalType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Quantity.value");
            else if (Configuration.doAutoCreate())
                // bb
                this.value = new DecimalType();
        return this.value;
    }

    public boolean hasValueElement() {
        return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The value of the measured amount. The value includes an implicit precision in the presentation of the value.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public Quantity setValueElement(DecimalType value) {
        this.value = value;
        return this;
    }

    /**
     * @return The value of the measured amount. The value includes an implicit precision in the presentation of the value.
     */
    public BigDecimal getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The value of the measured amount. The value includes an implicit precision in the presentation of the value.
     */
    public Quantity setValue(BigDecimal value) {
        if (value == null)
            this.value = null;
        else {
            if (this.value == null)
                this.value = new DecimalType();
            this.value.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #comparator} (How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "<" , then the real value is < stated value.). This is the underlying object with id, value and extensions. The accessor "getComparator" gives direct access to the value
     */
    public Enumeration<QuantityComparator> getComparatorElement() {
        if (this.comparator == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Quantity.comparator");
            else if (Configuration.doAutoCreate())
                // bb
                this.comparator = new Enumeration<QuantityComparator>(new QuantityComparatorEnumFactory());
        return this.comparator;
    }

    public boolean hasComparatorElement() {
        return this.comparator != null && !this.comparator.isEmpty();
    }

    public boolean hasComparator() {
        return this.comparator != null && !this.comparator.isEmpty();
    }

    /**
     * @param value {@link #comparator} (How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "<" , then the real value is < stated value.). This is the underlying object with id, value and extensions. The accessor "getComparator" gives direct access to the value
     */
    public Quantity setComparatorElement(Enumeration<QuantityComparator> value) {
        this.comparator = value;
        return this;
    }

    /**
     * @return How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "<" , then the real value is < stated value.
     */
    public QuantityComparator getComparator() {
        return this.comparator == null ? null : this.comparator.getValue();
    }

    /**
     * @param value How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "<" , then the real value is < stated value.
     */
    public Quantity setComparator(QuantityComparator value) {
        if (value == null)
            this.comparator = null;
        else {
            if (this.comparator == null)
                this.comparator = new Enumeration<QuantityComparator>(new QuantityComparatorEnumFactory());
            this.comparator.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #unit} (A human-readable form of the unit.). This is the underlying object with id, value and extensions. The accessor "getUnit" gives direct access to the value
     */
    public StringType getUnitElement() {
        if (this.unit == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Quantity.unit");
            else if (Configuration.doAutoCreate())
                // bb
                this.unit = new StringType();
        return this.unit;
    }

    public boolean hasUnitElement() {
        return this.unit != null && !this.unit.isEmpty();
    }

    public boolean hasUnit() {
        return this.unit != null && !this.unit.isEmpty();
    }

    /**
     * @param value {@link #unit} (A human-readable form of the unit.). This is the underlying object with id, value and extensions. The accessor "getUnit" gives direct access to the value
     */
    public Quantity setUnitElement(StringType value) {
        this.unit = value;
        return this;
    }

    /**
     * @return A human-readable form of the unit.
     */
    public String getUnit() {
        return this.unit == null ? null : this.unit.getValue();
    }

    /**
     * @param value A human-readable form of the unit.
     */
    public Quantity setUnit(String value) {
        if (Utilities.noString(value))
            this.unit = null;
        else {
            if (this.unit == null)
                this.unit = new StringType();
            this.unit.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #system} (The identification of the system that provides the coded form of the unit.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public UriType getSystemElement() {
        if (this.system == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Quantity.system");
            else if (Configuration.doAutoCreate())
                // bb
                this.system = new UriType();
        return this.system;
    }

    public boolean hasSystemElement() {
        return this.system != null && !this.system.isEmpty();
    }

    public boolean hasSystem() {
        return this.system != null && !this.system.isEmpty();
    }

    /**
     * @param value {@link #system} (The identification of the system that provides the coded form of the unit.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public Quantity setSystemElement(UriType value) {
        this.system = value;
        return this;
    }

    /**
     * @return The identification of the system that provides the coded form of the unit.
     */
    public String getSystem() {
        return this.system == null ? null : this.system.getValue();
    }

    /**
     * @param value The identification of the system that provides the coded form of the unit.
     */
    public Quantity setSystem(String value) {
        if (Utilities.noString(value))
            this.system = null;
        else {
            if (this.system == null)
                this.system = new UriType();
            this.system.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #code} (A computer processable form of the unit in some unit representation system.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public CodeType getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Quantity.code");
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
     * @param value {@link #code} (A computer processable form of the unit in some unit representation system.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public Quantity setCodeElement(CodeType value) {
        this.code = value;
        return this;
    }

    /**
     * @return A computer processable form of the unit in some unit representation system.
     */
    public String getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value A computer processable form of the unit in some unit representation system.
     */
    public Quantity setCode(String value) {
        if (Utilities.noString(value))
            this.code = null;
        else {
            if (this.code == null)
                this.code = new CodeType();
            this.code.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("value", "decimal", "The value of the measured amount. The value includes an implicit precision in the presentation of the value.", 0, java.lang.Integer.MAX_VALUE, value));
        childrenList.add(new Property("comparator", "code", "How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is \"<\" , then the real value is < stated value.", 0, java.lang.Integer.MAX_VALUE, comparator));
        childrenList.add(new Property("unit", "string", "A human-readable form of the unit.", 0, java.lang.Integer.MAX_VALUE, unit));
        childrenList.add(new Property("system", "uri", "The identification of the system that provides the coded form of the unit.", 0, java.lang.Integer.MAX_VALUE, system));
        childrenList.add(new Property("code", "code", "A computer processable form of the unit in some unit representation system.", 0, java.lang.Integer.MAX_VALUE, code));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("value"))
            // DecimalType
            this.value = castToDecimal(value);
        else if (name.equals("comparator"))
            // Enumeration<QuantityComparator>
            this.comparator = new QuantityComparatorEnumFactory().fromType(value);
        else if (name.equals("unit"))
            // StringType
            this.unit = castToString(value);
        else if (name.equals("system"))
            // UriType
            this.system = castToUri(value);
        else if (name.equals("code"))
            // CodeType
            this.code = castToCode(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type Quantity.value");
        } else if (name.equals("comparator")) {
            throw new FHIRException("Cannot call addChild on a primitive type Quantity.comparator");
        } else if (name.equals("unit")) {
            throw new FHIRException("Cannot call addChild on a primitive type Quantity.unit");
        } else if (name.equals("system")) {
            throw new FHIRException("Cannot call addChild on a primitive type Quantity.system");
        } else if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type Quantity.code");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Quantity";
    }

    public Quantity copy() {
        Quantity dst = new Quantity();
        copyValues(dst);
        dst.value = value == null ? null : value.copy();
        dst.comparator = comparator == null ? null : comparator.copy();
        dst.unit = unit == null ? null : unit.copy();
        dst.system = system == null ? null : system.copy();
        dst.code = code == null ? null : code.copy();
        return dst;
    }

    protected Quantity typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Quantity))
            return false;
        Quantity o = (Quantity) other;
        return compareDeep(value, o.value, true) && compareDeep(comparator, o.comparator, true) && compareDeep(unit, o.unit, true) && compareDeep(system, o.system, true) && compareDeep(code, o.code, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Quantity))
            return false;
        Quantity o = (Quantity) other;
        return compareValues(value, o.value, true) && compareValues(comparator, o.comparator, true) && compareValues(unit, o.unit, true) && compareValues(system, o.system, true) && compareValues(code, o.code, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (value == null || value.isEmpty()) && (comparator == null || comparator.isEmpty()) && (unit == null || unit.isEmpty()) && (system == null || system.isEmpty()) && (code == null || code.isEmpty());
    }
}