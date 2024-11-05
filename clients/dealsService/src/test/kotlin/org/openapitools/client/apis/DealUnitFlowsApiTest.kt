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

import org.openapitools.client.apis.DealUnitFlowsApi
import org.openapitools.client.models.DealUnitFlowCreateDto
import org.openapitools.client.models.DealUnitFlowDtoEnvelope
import org.openapitools.client.models.DealUnitFlowDtoListEnvelope
import org.openapitools.client.models.DealUnitFlowStageCreateDto
import org.openapitools.client.models.DealUnitFlowStageDtoEnvelope
import org.openapitools.client.models.DealUnitFlowStageDtoListEnvelope
import org.openapitools.client.models.DealUnitFlowStageUpdateDto
import org.openapitools.client.models.DealUnitFlowUpdateDto
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.Int32Envelope

class DealUnitFlowsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of DealUnitFlowsApi
        //val apiInstance = DealUnitFlowsApi()

        // to test apiV2DealsServiceDealUnitFlowsCountGet
        should("test apiV2DealsServiceDealUnitFlowsCountGet") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsCountGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.apiV2DealsServiceDealUnitFlowsCountGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete
        should("test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete
            //val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete(dealUnitFlowId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet
        should("test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet
            //val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : DealUnitFlowDtoEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet(dealUnitFlowId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut
        should("test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut
            //val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val dealUnitFlowUpdateDto : DealUnitFlowUpdateDto =  // DealUnitFlowUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut(dealUnitFlowId, tenantId, apiVersion, xApiVersion, dealUnitFlowUpdateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet
        should("test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet
            //val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet(dealUnitFlowId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete
        should("test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete
            //val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val dealUnitFlowStageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete(dealUnitFlowId, dealUnitFlowStageId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet
        should("test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet
            //val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val dealUnitFlowStageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : DealUnitFlowStageDtoEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet(dealUnitFlowId, dealUnitFlowStageId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut
        should("test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut
            //val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val dealUnitFlowStageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val dealUnitFlowStageUpdateDto : DealUnitFlowStageUpdateDto =  // DealUnitFlowStageUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut(dealUnitFlowId, dealUnitFlowStageId, tenantId, apiVersion, xApiVersion, dealUnitFlowStageUpdateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet
        should("test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet
            //val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : DealUnitFlowStageDtoListEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet(dealUnitFlowId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost
        should("test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost
            //val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val dealUnitFlowStageCreateDto : DealUnitFlowStageCreateDto =  // DealUnitFlowStageCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost(dealUnitFlowId, tenantId, apiVersion, xApiVersion, dealUnitFlowStageCreateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsGet
        should("test apiV2DealsServiceDealUnitFlowsGet") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : DealUnitFlowDtoListEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2DealsServiceDealUnitFlowsPost
        should("test apiV2DealsServiceDealUnitFlowsPost") {
            // uncomment below to test apiV2DealsServiceDealUnitFlowsPost
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val dealUnitFlowCreateDto : DealUnitFlowCreateDto =  // DealUnitFlowCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsPost(tenantId, apiVersion, xApiVersion, dealUnitFlowCreateDto)
            //result shouldBe ("TODO")
        }

    }
}