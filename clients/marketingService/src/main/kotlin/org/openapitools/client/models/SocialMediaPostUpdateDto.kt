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

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param title 
 * @param content 
 * @param featuredImageUrl 
 * @param tenantId 
 * @param socialPostBucketId 
 * @param enrolmentId 
 */


data class SocialMediaPostUpdateDto (

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "featuredImageUrl")
    val featuredImageUrl: java.net.URI? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "socialPostBucketId")
    val socialPostBucketId: kotlin.String? = null,

    @Json(name = "enrolmentId")
    val enrolmentId: kotlin.String? = null

) {


}

