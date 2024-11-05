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

import org.openapitools.client.apis.UsersApi
import org.openapitools.client.models.AccountHolderCreateDto
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.ExtendedUserDtoEnvelope
import org.openapitools.client.models.ExtendedUserDtoListEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.UserDtoEnvelope
import org.openapitools.client.models.UserDtoListEnvelope

class UsersApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UsersApi
        //val apiInstance = UsersApi()

        // to test apiV2SystemServiceUsersCountGet
        should("test apiV2SystemServiceUsersCountGet") {
            // uncomment below to test apiV2SystemServiceUsersCountGet
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.apiV2SystemServiceUsersCountGet(apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SystemServiceUsersExtendedCountGet
        should("test apiV2SystemServiceUsersExtendedCountGet") {
            // uncomment below to test apiV2SystemServiceUsersExtendedCountGet
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.apiV2SystemServiceUsersExtendedCountGet(apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SystemServiceUsersExtendedGet
        should("test apiV2SystemServiceUsersExtendedGet") {
            // uncomment below to test apiV2SystemServiceUsersExtendedGet
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : ExtendedUserDtoListEnvelope = apiInstance.apiV2SystemServiceUsersExtendedGet(apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SystemServiceUsersGet
        should("test apiV2SystemServiceUsersGet") {
            // uncomment below to test apiV2SystemServiceUsersGet
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : UserDtoListEnvelope = apiInstance.apiV2SystemServiceUsersGet(apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SystemServiceUsersPost
        should("test apiV2SystemServiceUsersPost") {
            // uncomment below to test apiV2SystemServiceUsersPost
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val accountHolderCreateDto : AccountHolderCreateDto =  // AccountHolderCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2SystemServiceUsersPost(apiVersion, xApiVersion, accountHolderCreateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2SystemServiceUsersUserIdDelete
        should("test apiV2SystemServiceUsersUserIdDelete") {
            // uncomment below to test apiV2SystemServiceUsersUserIdDelete
            //val userId : kotlin.String = userId_example // kotlin.String | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SystemServiceUsersUserIdDelete(userId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SystemServiceUsersUserIdExtendedGet
        should("test apiV2SystemServiceUsersUserIdExtendedGet") {
            // uncomment below to test apiV2SystemServiceUsersUserIdExtendedGet
            //val userId : kotlin.String = userId_example // kotlin.String | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : ExtendedUserDtoEnvelope = apiInstance.apiV2SystemServiceUsersUserIdExtendedGet(userId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SystemServiceUsersUserIdPut
        should("test apiV2SystemServiceUsersUserIdPut") {
            // uncomment below to test apiV2SystemServiceUsersUserIdPut
            //val userId : kotlin.String = userId_example // kotlin.String | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val body : kotlin.Any = Object // kotlin.Any | 
            //val result : EmptyEnvelope = apiInstance.apiV2SystemServiceUsersUserIdPut(userId, apiVersion, xApiVersion, body)
            //result shouldBe ("TODO")
        }

        // to test getUserAsync
        should("test getUserAsync") {
            // uncomment below to test getUserAsync
            //val userId : kotlin.String = userId_example // kotlin.String | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : UserDtoEnvelope = apiInstance.getUserAsync(userId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

    }
}