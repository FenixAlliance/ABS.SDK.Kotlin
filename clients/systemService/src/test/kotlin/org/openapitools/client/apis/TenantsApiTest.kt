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

import org.openapitools.client.apis.TenantsApi
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.ExtendedTenantDtoListEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.TenantCreateDto
import org.openapitools.client.models.TenantDtoEnvelope
import org.openapitools.client.models.TenantDtoListEnvelope
import org.openapitools.client.models.TenantUpdateDto

class TenantsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TenantsApi
        //val apiInstance = TenantsApi()

        // to test createTenant
        should("test createTenant") {
            // uncomment below to test createTenant
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val tenantCreateDto : TenantCreateDto =  // TenantCreateDto | 
            //val result : TenantDtoEnvelope = apiInstance.createTenant(apiVersion, xApiVersion, tenantCreateDto)
            //result shouldBe ("TODO")
        }

        // to test deleteTenant
        should("test deleteTenant") {
            // uncomment below to test deleteTenant
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.deleteTenant(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getAllExtendedTenants
        should("test getAllExtendedTenants") {
            // uncomment below to test getAllExtendedTenants
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : ExtendedTenantDtoListEnvelope = apiInstance.getAllExtendedTenants(apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getAllTenants
        should("test getAllTenants") {
            // uncomment below to test getAllTenants
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : TenantDtoListEnvelope = apiInstance.getAllTenants(apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getExtendedTenantsCount
        should("test getExtendedTenantsCount") {
            // uncomment below to test getExtendedTenantsCount
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.getExtendedTenantsCount(apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getTenant
        should("test getTenant") {
            // uncomment below to test getTenant
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : TenantDtoEnvelope = apiInstance.getTenant(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getTenantsCount
        should("test getTenantsCount") {
            // uncomment below to test getTenantsCount
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.getTenantsCount(apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test updateTenant
        should("test updateTenant") {
            // uncomment below to test updateTenant
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val tenantUpdateDto : TenantUpdateDto =  // TenantUpdateDto | 
            //val result : TenantDtoEnvelope = apiInstance.updateTenant(tenantId, apiVersion, xApiVersion, tenantUpdateDto)
            //result shouldBe ("TODO")
        }

    }
}