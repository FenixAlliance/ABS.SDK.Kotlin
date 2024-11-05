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

import org.openapitools.client.apis.NewslettersApi
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.NewsletterCreateDto
import org.openapitools.client.models.NewsletterDtoEnvelope
import org.openapitools.client.models.NewsletterUpdateDto

class NewslettersApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of NewslettersApi
        //val apiInstance = NewslettersApi()

        // to test apiV2MarketingServiceNewslettersCountGet
        should("test apiV2MarketingServiceNewslettersCountGet") {
            // uncomment below to test apiV2MarketingServiceNewslettersCountGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.apiV2MarketingServiceNewslettersCountGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2MarketingServiceNewslettersGet
        should("test apiV2MarketingServiceNewslettersGet") {
            // uncomment below to test apiV2MarketingServiceNewslettersGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //apiInstance.apiV2MarketingServiceNewslettersGet(tenantId, apiVersion, xApiVersion)
        }

        // to test apiV2MarketingServiceNewslettersNewsletterIdDelete
        should("test apiV2MarketingServiceNewslettersNewsletterIdDelete") {
            // uncomment below to test apiV2MarketingServiceNewslettersNewsletterIdDelete
            //val newsletterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceNewslettersNewsletterIdDelete(newsletterId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2MarketingServiceNewslettersNewsletterIdGet
        should("test apiV2MarketingServiceNewslettersNewsletterIdGet") {
            // uncomment below to test apiV2MarketingServiceNewslettersNewsletterIdGet
            //val newsletterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : NewsletterDtoEnvelope = apiInstance.apiV2MarketingServiceNewslettersNewsletterIdGet(newsletterId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2MarketingServiceNewslettersNewsletterIdPut
        should("test apiV2MarketingServiceNewslettersNewsletterIdPut") {
            // uncomment below to test apiV2MarketingServiceNewslettersNewsletterIdPut
            //val newsletterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val newsletterUpdateDto : NewsletterUpdateDto =  // NewsletterUpdateDto | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceNewslettersNewsletterIdPut(newsletterId, tenantId, newsletterUpdateDto, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2MarketingServiceNewslettersPost
        should("test apiV2MarketingServiceNewslettersPost") {
            // uncomment below to test apiV2MarketingServiceNewslettersPost
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val newsletterCreateDto : NewsletterCreateDto =  // NewsletterCreateDto | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceNewslettersPost(tenantId, newsletterCreateDto, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

    }
}