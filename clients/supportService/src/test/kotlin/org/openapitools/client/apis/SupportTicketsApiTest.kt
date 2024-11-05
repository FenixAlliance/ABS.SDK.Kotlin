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

import org.openapitools.client.apis.SupportTicketsApi
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.PrivateMessageDtoListEnvelope
import org.openapitools.client.models.SupportTicketConversationCreateDto
import org.openapitools.client.models.SupportTicketConversationDtoEnvelope
import org.openapitools.client.models.SupportTicketConversationDtoListEnvelope
import org.openapitools.client.models.SupportTicketCreateDto
import org.openapitools.client.models.SupportTicketDtoEnvelope
import org.openapitools.client.models.SupportTicketDtoListEnvelope
import org.openapitools.client.models.SupportTicketUpdateDto

class SupportTicketsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SupportTicketsApi
        //val apiInstance = SupportTicketsApi()

        // to test apiV2SupportServiceSupportTicketsCountGet
        should("test apiV2SupportServiceSupportTicketsCountGet") {
            // uncomment below to test apiV2SupportServiceSupportTicketsCountGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.apiV2SupportServiceSupportTicketsCountGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportTicketsGet
        should("test apiV2SupportServiceSupportTicketsGet") {
            // uncomment below to test apiV2SupportServiceSupportTicketsGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SupportTicketDtoListEnvelope = apiInstance.apiV2SupportServiceSupportTicketsGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportTicketsPost
        should("test apiV2SupportServiceSupportTicketsPost") {
            // uncomment below to test apiV2SupportServiceSupportTicketsPost
            //val supportTicketCreateDto : SupportTicketCreateDto =  // SupportTicketCreateDto | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketsPost(supportTicketCreateDto, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet
        should("test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet") {
            // uncomment below to test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet
            //val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SupportTicketConversationDtoListEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet(supportTicketId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost
        should("test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost") {
            // uncomment below to test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost
            //val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val supportTicketConversationCreateDto : SupportTicketConversationCreateDto =  // SupportTicketConversationCreateDto | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost(supportTicketId, supportTicketConversationCreateDto, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete
        should("test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete") {
            // uncomment below to test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete
            //val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val supportTicketConversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete(supportTicketId, supportTicketConversationId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet
        should("test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet") {
            // uncomment below to test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet
            //val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val supportTicketConversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SupportTicketConversationDtoEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet(supportTicketId, supportTicketConversationId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet
        should("test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet") {
            // uncomment below to test apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet
            //val supportTicketConversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val supportTicketId : kotlin.String = supportTicketId_example // kotlin.String | 
            //val pageNumber : kotlin.Int = 56 // kotlin.Int | 
            //val pageSize : kotlin.Int = 56 // kotlin.Int | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : PrivateMessageDtoListEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet(supportTicketConversationId, supportTicketId, pageNumber, pageSize, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportTicketsSupportTicketIdDelete
        should("test apiV2SupportServiceSupportTicketsSupportTicketIdDelete") {
            // uncomment below to test apiV2SupportServiceSupportTicketsSupportTicketIdDelete
            //val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdDelete(supportTicketId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportTicketsSupportTicketIdGet
        should("test apiV2SupportServiceSupportTicketsSupportTicketIdGet") {
            // uncomment below to test apiV2SupportServiceSupportTicketsSupportTicketIdGet
            //val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SupportTicketDtoEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdGet(supportTicketId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportTicketsSupportTicketIdPut
        should("test apiV2SupportServiceSupportTicketsSupportTicketIdPut") {
            // uncomment below to test apiV2SupportServiceSupportTicketsSupportTicketIdPut
            //val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val supportTicketUpdateDto : SupportTicketUpdateDto =  // SupportTicketUpdateDto | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdPut(supportTicketId, supportTicketUpdateDto, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

    }
}
