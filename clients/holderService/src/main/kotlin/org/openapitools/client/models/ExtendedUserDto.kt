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

import org.openapitools.client.models.CartDto
import org.openapitools.client.models.SocialProfileDto
import org.openapitools.client.models.UserSettingsDto
import org.openapitools.client.models.WalletDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param timestamp 
 * @param fullName 
 * @param qualifiedName 
 * @param publicName 
 * @param lastName 
 * @param firstName 
 * @param coverUrl 
 * @param avatarUrl 
 * @param gitHubUrl 
 * @param countryId 
 * @param timezoneId 
 * @param websiteUrl 
 * @param twitterUrl 
 * @param youTubeUrl 
 * @param linkedInUrl 
 * @param facebookUrl 
 * @param instagramUrl 
 * @param socialProfileId 
 * @param birthday 
 * @param idProvider 
 * @param languageId 
 * @param gender 
 * @param cityId 
 * @param stateId 
 * @param email 
 * @param about 
 * @param jobTitle 
 * @param socialFeedId 
 * @param currentTenantId 
 * @param currentEnrollmentId 
 * @param status 
 * @param cartId 
 * @param walletId 
 * @param userName 
 * @param currencyId 
 * @param phoneNumber 
 * @param publicIdentifier 
 * @param identityProvider 
 * @param phoneNumberConfirmed 
 * @param emailConfirmed 
 * @param availability 
 * @param lockoutEnabled 
 * @param lockoutEnd 
 * @param enrollmentsCount 
 * @param siteTheme 
 * @param cart 
 * @param wallet 
 * @param socialProfile 
 * @param settings 
 */


data class ExtendedUserDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "fullName")
    val fullName: kotlin.String? = null,

    @Json(name = "qualifiedName")
    val qualifiedName: kotlin.String? = null,

    @Json(name = "publicName")
    val publicName: kotlin.String? = null,

    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    @Json(name = "coverUrl")
    val coverUrl: kotlin.String? = null,

    @Json(name = "avatarUrl")
    val avatarUrl: kotlin.String? = null,

    @Json(name = "gitHubUrl")
    val gitHubUrl: kotlin.String? = null,

    @Json(name = "countryId")
    val countryId: kotlin.String? = null,

    @Json(name = "timezoneId")
    val timezoneId: kotlin.String? = null,

    @Json(name = "websiteUrl")
    val websiteUrl: kotlin.String? = null,

    @Json(name = "twitterUrl")
    val twitterUrl: kotlin.String? = null,

    @Json(name = "youTubeUrl")
    val youTubeUrl: kotlin.String? = null,

    @Json(name = "linkedInUrl")
    val linkedInUrl: kotlin.String? = null,

    @Json(name = "facebookUrl")
    val facebookUrl: kotlin.String? = null,

    @Json(name = "instagramUrl")
    val instagramUrl: kotlin.String? = null,

    @Json(name = "socialProfileId")
    val socialProfileId: kotlin.String? = null,

    @Json(name = "birthday")
    val birthday: java.time.OffsetDateTime? = null,

    @Json(name = "idProvider")
    val idProvider: kotlin.String? = null,

    @Json(name = "languageId")
    val languageId: kotlin.String? = null,

    @Json(name = "gender")
    val gender: ExtendedUserDto.Gender? = null,

    @Json(name = "cityId")
    val cityId: kotlin.String? = null,

    @Json(name = "stateId")
    val stateId: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "about")
    val about: kotlin.String? = null,

    @Json(name = "jobTitle")
    val jobTitle: kotlin.String? = null,

    @Json(name = "socialFeedId")
    val socialFeedId: kotlin.String? = null,

    @Json(name = "currentTenantId")
    val currentTenantId: kotlin.String? = null,

    @Json(name = "currentEnrollmentId")
    val currentEnrollmentId: kotlin.String? = null,

    @Json(name = "status")
    val status: kotlin.String? = null,

    @Json(name = "cartId")
    val cartId: kotlin.String? = null,

    @Json(name = "walletId")
    val walletId: kotlin.String? = null,

    @Json(name = "userName")
    val userName: kotlin.String? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "phoneNumber")
    val phoneNumber: kotlin.String? = null,

    @Json(name = "publicIdentifier")
    val publicIdentifier: kotlin.String? = null,

    @Json(name = "identityProvider")
    val identityProvider: kotlin.String? = null,

    @Json(name = "phoneNumberConfirmed")
    val phoneNumberConfirmed: kotlin.Boolean? = null,

    @Json(name = "emailConfirmed")
    val emailConfirmed: kotlin.Boolean? = null,

    @Json(name = "availability")
    val availability: ExtendedUserDto.Availability? = null,

    @Json(name = "lockoutEnabled")
    val lockoutEnabled: kotlin.Boolean? = null,

    @Json(name = "lockoutEnd")
    val lockoutEnd: java.time.OffsetDateTime? = null,

    @Json(name = "enrollmentsCount")
    val enrollmentsCount: kotlin.Int? = null,

    @Json(name = "siteTheme")
    val siteTheme: ExtendedUserDto.SiteTheme? = null,

    @Json(name = "cart")
    val cart: CartDto? = null,

    @Json(name = "wallet")
    val wallet: WalletDto? = null,

    @Json(name = "socialProfile")
    val socialProfile: SocialProfileDto? = null,

    @Json(name = "settings")
    val settings: UserSettingsDto? = null

) {

    /**
     * 
     *
     * Values: _0,_1,_2
     */
    @JsonClass(generateAdapter = false)
    enum class Gender(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2);
    }
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
    /**
     * 
     *
     * Values: _0,_1,_2
     */
    @JsonClass(generateAdapter = false)
    enum class SiteTheme(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2);
    }

}

