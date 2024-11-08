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
 * @param id 
 * @param timestamp 
 * @param qualifiedName 
 * @param tenantId 
 * @param type 
 * @param publicName 
 * @param firstName 
 * @param lastName 
 * @param jobTitle 
 * @param coverUrl 
 * @param avatarUrl 
 * @param countryId 
 * @param timezoneId 
 * @param languageId 
 * @param socialProfileId 
 * @param webUrl 
 * @param gitHubUrl 
 * @param twitchUrl 
 * @param redditUrl 
 * @param tikTokUrl 
 * @param websiteUrl 
 * @param twitterUrl 
 * @param facebookUrl 
 * @param youTubeUrl 
 * @param linkedInUrl 
 * @param instagramUrl 
 * @param githubUsername 
 */


data class SimpleContactDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "qualifiedName")
    val qualifiedName: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "type")
    val type: SimpleContactDto.Type? = null,

    @Json(name = "publicName")
    val publicName: kotlin.String? = null,

    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    @Json(name = "jobTitle")
    val jobTitle: kotlin.String? = null,

    @Json(name = "coverUrl")
    val coverUrl: kotlin.String? = null,

    @Json(name = "avatarUrl")
    val avatarUrl: kotlin.String? = null,

    @Json(name = "countryId")
    val countryId: kotlin.String? = null,

    @Json(name = "timezoneId")
    val timezoneId: kotlin.String? = null,

    @Json(name = "languageId")
    val languageId: kotlin.String? = null,

    @Json(name = "socialProfileId")
    val socialProfileId: kotlin.String? = null,

    @Json(name = "webUrl")
    val webUrl: kotlin.String? = null,

    @Json(name = "gitHubUrl")
    val gitHubUrl: kotlin.String? = null,

    @Json(name = "twitchUrl")
    val twitchUrl: kotlin.String? = null,

    @Json(name = "redditUrl")
    val redditUrl: kotlin.String? = null,

    @Json(name = "tikTokUrl")
    val tikTokUrl: kotlin.String? = null,

    @Json(name = "websiteUrl")
    val websiteUrl: kotlin.String? = null,

    @Json(name = "twitterUrl")
    val twitterUrl: kotlin.String? = null,

    @Json(name = "facebookUrl")
    val facebookUrl: kotlin.String? = null,

    @Json(name = "youTubeUrl")
    val youTubeUrl: kotlin.String? = null,

    @Json(name = "linkedInUrl")
    val linkedInUrl: kotlin.String? = null,

    @Json(name = "instagramUrl")
    val instagramUrl: kotlin.String? = null,

    @Json(name = "githubUsername")
    val githubUsername: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: _0,_1
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1);
    }

}

