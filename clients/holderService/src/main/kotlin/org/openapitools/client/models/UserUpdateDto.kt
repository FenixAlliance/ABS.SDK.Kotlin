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
 * @param birthday 
 * @param firstName 
 * @param lastName 
 * @param publicName 
 * @param idProvider 
 * @param languageId 
 * @param timezoneId 
 * @param gender 
 * @param cityId 
 * @param currencyId 
 * @param status 
 * @param stateId 
 * @param about 
 * @param webUrl 
 * @param jobTitle 
 * @param coverUrl 
 * @param avatarUrl 
 * @param gitHubUrl 
 * @param websiteUrl 
 * @param twitterUrl 
 * @param facebookUrl 
 * @param youTubeUrl 
 * @param linkedInUrl 
 * @param instagramUrl 
 * @param countryId 
 * @param githubUsername 
 * @param availability 
 */


data class UserUpdateDto (

    @Json(name = "birthday")
    val birthday: java.time.OffsetDateTime? = null,

    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    @Json(name = "publicName")
    val publicName: kotlin.String? = null,

    @Json(name = "idProvider")
    val idProvider: kotlin.String? = null,

    @Json(name = "languageId")
    val languageId: kotlin.String? = null,

    @Json(name = "timezoneId")
    val timezoneId: kotlin.String? = null,

    @Json(name = "gender")
    val gender: kotlin.String? = null,

    @Json(name = "cityId")
    val cityId: kotlin.String? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "status")
    val status: kotlin.String? = null,

    @Json(name = "stateId")
    val stateId: kotlin.String? = null,

    @Json(name = "about")
    val about: kotlin.String? = null,

    @Json(name = "webUrl")
    val webUrl: kotlin.String? = null,

    @Json(name = "jobTitle")
    val jobTitle: kotlin.String? = null,

    @Json(name = "coverUrl")
    val coverUrl: kotlin.String? = null,

    @Json(name = "avatarUrl")
    val avatarUrl: kotlin.String? = null,

    @Json(name = "gitHubUrl")
    val gitHubUrl: kotlin.String? = null,

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

    @Json(name = "countryId")
    val countryId: kotlin.String? = null,

    @Json(name = "githubUsername")
    val githubUsername: kotlin.String? = null,

    @Json(name = "availability")
    val availability: UserUpdateDto.Availability? = null

) {

    /**
     * 
     *
     * Values: _0,_1,_2,_3,_4
     */
    @JsonClass(generateAdapter = false)
    enum class Availability(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2),
        @Json(name = "3") _3(3),
        @Json(name = "4") _4(4);
    }

}
