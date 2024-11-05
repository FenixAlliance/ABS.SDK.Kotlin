/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.LicensesApi
import org.openapitools.client.models.BooleanEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.LicenseAttributesListEnvelope
import org.openapitools.client.models.LicenseKey
import org.openapitools.client.models.LicenseKeyRequest
import org.openapitools.client.models.LicenseValidationErrorListEnvelope
import org.openapitools.client.models.StringEnvelope

class LicensesApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of LicensesApi
        //val apiInstance = LicensesApi()

        // to test apiLicensingLicensesGeneratePost
        should("test apiLicensingLicensesGeneratePost") {
            // uncomment below to test apiLicensingLicensesGeneratePost
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val licenseKeyRequest : LicenseKeyRequest =  // LicenseKeyRequest | 
            //val result : StringEnvelope = apiInstance.apiLicensingLicensesGeneratePost(tenantId, apiVersion, xApiVersion, licenseKeyRequest)
            //result shouldBe ("TODO")
        }

        // to test apiLicensingLicensesValidateAttributesGet
        should("test apiLicensingLicensesValidateAttributesGet") {
            // uncomment below to test apiLicensingLicensesValidateAttributesGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val licenseKey : LicenseKey =  // LicenseKey | 
            //val result : LicenseAttributesListEnvelope = apiInstance.apiLicensingLicensesValidateAttributesGet(tenantId, apiVersion, xApiVersion, licenseKey)
            //result shouldBe ("TODO")
        }

        // to test apiLicensingLicensesValidateErrorsGet
        should("test apiLicensingLicensesValidateErrorsGet") {
            // uncomment below to test apiLicensingLicensesValidateErrorsGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val licenseKey : LicenseKey =  // LicenseKey | 
            //val result : LicenseValidationErrorListEnvelope = apiInstance.apiLicensingLicensesValidateErrorsGet(tenantId, apiVersion, xApiVersion, licenseKey)
            //result shouldBe ("TODO")
        }

        // to test apiLicensingLicensesValidateGet
        should("test apiLicensingLicensesValidateGet") {
            // uncomment below to test apiLicensingLicensesValidateGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val licenseKey : LicenseKey =  // LicenseKey | 
            //val result : BooleanEnvelope = apiInstance.apiLicensingLicensesValidateGet(tenantId, apiVersion, xApiVersion, licenseKey)
            //result shouldBe ("TODO")
        }

    }
}