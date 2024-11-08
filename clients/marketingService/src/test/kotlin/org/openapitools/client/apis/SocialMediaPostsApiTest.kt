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

import org.openapitools.client.apis.SocialMediaPostsApi
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.SocialMediaPostCreateDto
import org.openapitools.client.models.SocialMediaPostDtoEnvelope
import org.openapitools.client.models.SocialMediaPostDtoListEnvelope
import org.openapitools.client.models.SocialMediaPostUpdateDto

class SocialMediaPostsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SocialMediaPostsApi
        //val apiInstance = SocialMediaPostsApi()

        // to test apiV2MarketingServiceSocialMediaPostsCountGet
        should("test apiV2MarketingServiceSocialMediaPostsCountGet") {
            // uncomment below to test apiV2MarketingServiceSocialMediaPostsCountGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.apiV2MarketingServiceSocialMediaPostsCountGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2MarketingServiceSocialMediaPostsGet
        should("test apiV2MarketingServiceSocialMediaPostsGet") {
            // uncomment below to test apiV2MarketingServiceSocialMediaPostsGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SocialMediaPostDtoListEnvelope = apiInstance.apiV2MarketingServiceSocialMediaPostsGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2MarketingServiceSocialMediaPostsPost
        should("test apiV2MarketingServiceSocialMediaPostsPost") {
            // uncomment below to test apiV2MarketingServiceSocialMediaPostsPost
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val socialMediaPostCreateDto : SocialMediaPostCreateDto =  // SocialMediaPostCreateDto | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceSocialMediaPostsPost(tenantId, socialMediaPostCreateDto, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete
        should("test apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete") {
            // uncomment below to test apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete
            //val socialmediapostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete(socialmediapostId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet
        should("test apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet") {
            // uncomment below to test apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet
            //val socialmediapostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SocialMediaPostDtoEnvelope = apiInstance.apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet(socialmediapostId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut
        should("test apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut") {
            // uncomment below to test apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut
            //val socialmediapostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val socialMediaPostUpdateDto : SocialMediaPostUpdateDto =  // SocialMediaPostUpdateDto | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut(socialmediapostId, tenantId, socialMediaPostUpdateDto, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

    }
}
