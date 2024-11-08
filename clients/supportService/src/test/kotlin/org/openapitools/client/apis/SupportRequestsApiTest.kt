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

import org.openapitools.client.apis.SupportRequestsApi
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.SupportRequestAttachmentCreateDto
import org.openapitools.client.models.SupportRequestAttachmentDtoEnvelope
import org.openapitools.client.models.SupportRequestAttachmentDtoListEnvelope
import org.openapitools.client.models.SupportRequestCreateDto
import org.openapitools.client.models.SupportRequestDtoEnvelope
import org.openapitools.client.models.SupportRequestDtoListEnvelope
import org.openapitools.client.models.SupportRequestUpdateDto
import org.openapitools.client.models.SupportTicketDtoListEnvelope

class SupportRequestsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SupportRequestsApi
        //val apiInstance = SupportRequestsApi()

        // to test apiV2SupportServiceSupportRequestsCountGet
        should("test apiV2SupportServiceSupportRequestsCountGet") {
            // uncomment below to test apiV2SupportServiceSupportRequestsCountGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.apiV2SupportServiceSupportRequestsCountGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportRequestsGet
        should("test apiV2SupportServiceSupportRequestsGet") {
            // uncomment below to test apiV2SupportServiceSupportRequestsGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SupportRequestDtoListEnvelope = apiInstance.apiV2SupportServiceSupportRequestsGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportRequestsPost
        should("test apiV2SupportServiceSupportRequestsPost") {
            // uncomment below to test apiV2SupportServiceSupportRequestsPost
            //val supportRequestCreateDto : SupportRequestCreateDto =  // SupportRequestCreateDto | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestsPost(supportRequestCreateDto, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet
        should("test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet") {
            // uncomment below to test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet
            //val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val attachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SupportRequestAttachmentDtoEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet(supportRequestId, attachmentId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet
        should("test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet") {
            // uncomment below to test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet
            //val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet(supportRequestId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet
        should("test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet") {
            // uncomment below to test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet
            //val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SupportRequestAttachmentDtoListEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet(supportRequestId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost
        should("test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost") {
            // uncomment below to test apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost
            //val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val supportRequestAttachmentCreateDto : SupportRequestAttachmentCreateDto =  // SupportRequestAttachmentCreateDto | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost(supportRequestId, supportRequestAttachmentCreateDto, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportRequestsSupportRequestIdDelete
        should("test apiV2SupportServiceSupportRequestsSupportRequestIdDelete") {
            // uncomment below to test apiV2SupportServiceSupportRequestsSupportRequestIdDelete
            //val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdDelete(supportRequestId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportRequestsSupportRequestIdGet
        should("test apiV2SupportServiceSupportRequestsSupportRequestIdGet") {
            // uncomment below to test apiV2SupportServiceSupportRequestsSupportRequestIdGet
            //val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SupportRequestDtoEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdGet(supportRequestId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportRequestsSupportRequestIdPut
        should("test apiV2SupportServiceSupportRequestsSupportRequestIdPut") {
            // uncomment below to test apiV2SupportServiceSupportRequestsSupportRequestIdPut
            //val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val supportRequestUpdateDto : SupportRequestUpdateDto =  // SupportRequestUpdateDto | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdPut(supportRequestId, supportRequestUpdateDto, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet
        should("test apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet") {
            // uncomment below to test apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet
            //val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SupportTicketDtoListEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet(supportRequestId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

    }
}
