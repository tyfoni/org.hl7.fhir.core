package org.hl7.fhir.convertors.advisors.impl

import org.hl7.fhir.convertors.advisors.interfaces.BaseAdvisor
import org.hl7.fhir.convertors.advisors.interfaces.bundle.BundleAdvisor50
import org.hl7.fhir.convertors.advisors.interfaces.codesystem.CodeSystemAdvisor50
import org.hl7.fhir.convertors.advisors.interfaces.extension.ExtensionAdvisor50
import org.hl7.fhir.r5.model.CodeSystem
import org.hl7.fhir.r5.model.DataType
import org.hl7.fhir.r5.model.Expression
import org.hl7.fhir.r5.model.ValueSet
import java.util.*

open class BaseAdvisor_10_50(val failFast: Boolean = true) : BaseAdvisor, BundleAdvisor50, CodeSystemAdvisor50,
    ExtensionAdvisor50<org.hl7.fhir.dstu2.model.Extension> {

    val cslist = ArrayList<CodeSystem>()

    private val ignoredUrls = listOf(
        "http://hl7.org/fhir/3.0/StructureDefinition/extension-CapabilityStatement.acceptUnknown",
    )

    private val ignoredExtensionTypes = listOf(
        Expression::class.java,
    )

    override fun failFastOnNullOrUnknownEntry(): Boolean {
        return failFast
    }

    override fun ignoreExtension(path: String, url: String): Boolean {
        return ignoredUrls.contains(url)
    }

    override fun ignoreType(path: String, type: DataType): Boolean {
        return ignoredExtensionTypes.contains(type::class.java)
    }

    override fun handleCodeSystem(tgtcs: CodeSystem, source: ValueSet) {
        tgtcs.id = source.id
        tgtcs.valueSet = source.url
        cslist.add(tgtcs)
    }
}