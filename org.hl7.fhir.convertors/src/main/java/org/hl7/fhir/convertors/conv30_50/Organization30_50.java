package org.hl7.fhir.convertors.conv30_50;

import org.hl7.fhir.convertors.VersionConvertor_30_50;
import org.hl7.fhir.exceptions.FHIRException;
import java.util.Collections;

public class Organization30_50 {

    public static org.hl7.fhir.r5.model.Organization convertOrganization(org.hl7.fhir.dstu3.model.Organization src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Organization tgt = new org.hl7.fhir.r5.model.Organization();
        VersionConvertor_30_50.copyDomainResource(src, tgt);
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_30_50.convertIdentifier(t));
        }
        if (src.hasActiveElement())
            tgt.setActiveElement((org.hl7.fhir.r5.model.BooleanType) VersionConvertor_30_50.convertType(src.getActiveElement()));
        if (src.hasType()) {
            for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getType()) tgt.addType(VersionConvertor_30_50.convertCodeableConcept(t));
        }
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_30_50.convertType(src.getNameElement()));
        if (src.hasAlias()) {
            for (org.hl7.fhir.dstu3.model.StringType t : src.getAlias()) tgt.addAlias(t.getValue());
        }
        if (src.hasTelecom()) {
            for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_30_50.convertContactPoint(t));
        }
        if (src.hasAddress()) {
            for (org.hl7.fhir.dstu3.model.Address t : src.getAddress()) tgt.addAddress(VersionConvertor_30_50.convertAddress(t));
        }
        if (src.hasPartOf())
            tgt.setPartOf(VersionConvertor_30_50.convertReference(src.getPartOf()));
        if (src.hasContact()) {
            for (org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent t : src.getContact()) tgt.addContact(convertOrganizationContactComponent(t));
        }
        if (src.hasEndpoint()) {
            for (org.hl7.fhir.dstu3.model.Reference t : src.getEndpoint()) tgt.addEndpoint(VersionConvertor_30_50.convertReference(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Organization convertOrganization(org.hl7.fhir.r5.model.Organization src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Organization tgt = new org.hl7.fhir.dstu3.model.Organization();
        VersionConvertor_30_50.copyDomainResource(src, tgt);
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_30_50.convertIdentifier(t));
        }
        if (src.hasActiveElement())
            tgt.setActiveElement((org.hl7.fhir.dstu3.model.BooleanType) VersionConvertor_30_50.convertType(src.getActiveElement()));
        if (src.hasType()) {
            for (org.hl7.fhir.r5.model.CodeableConcept t : src.getType()) tgt.addType(VersionConvertor_30_50.convertCodeableConcept(t));
        }
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_50.convertType(src.getNameElement()));
        if (src.hasAlias()) {
            for (org.hl7.fhir.r5.model.StringType t : src.getAlias()) tgt.addAlias(t.getValue());
        }
        if (src.hasTelecom()) {
            for (org.hl7.fhir.r5.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_30_50.convertContactPoint(t));
        }
        if (src.hasAddress()) {
            for (org.hl7.fhir.r5.model.Address t : src.getAddress()) tgt.addAddress(VersionConvertor_30_50.convertAddress(t));
        }
        if (src.hasPartOf())
            tgt.setPartOf(VersionConvertor_30_50.convertReference(src.getPartOf()));
        if (src.hasContact()) {
            for (org.hl7.fhir.r5.model.Organization.OrganizationContactComponent t : src.getContact()) tgt.addContact(convertOrganizationContactComponent(t));
        }
        if (src.hasEndpoint()) {
            for (org.hl7.fhir.r5.model.Reference t : src.getEndpoint()) tgt.addEndpoint(VersionConvertor_30_50.convertReference(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent convertOrganizationContactComponent(org.hl7.fhir.r5.model.Organization.OrganizationContactComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent tgt = new org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasPurpose())
            tgt.setPurpose(VersionConvertor_30_50.convertCodeableConcept(src.getPurpose()));
        if (src.hasName())
            tgt.setName(VersionConvertor_30_50.convertHumanName(src.getName()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.r5.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_30_50.convertContactPoint(t));
        }
        if (src.hasAddress())
            tgt.setAddress(VersionConvertor_30_50.convertAddress(src.getAddress()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Organization.OrganizationContactComponent convertOrganizationContactComponent(org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Organization.OrganizationContactComponent tgt = new org.hl7.fhir.r5.model.Organization.OrganizationContactComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasPurpose())
            tgt.setPurpose(VersionConvertor_30_50.convertCodeableConcept(src.getPurpose()));
        if (src.hasName())
            tgt.setName(VersionConvertor_30_50.convertHumanName(src.getName()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_30_50.convertContactPoint(t));
        }
        if (src.hasAddress())
            tgt.setAddress(VersionConvertor_30_50.convertAddress(src.getAddress()));
        return tgt;
    }
}