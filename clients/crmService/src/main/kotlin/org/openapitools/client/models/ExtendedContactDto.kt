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
import org.openapitools.client.models.SimpleContactDto
import org.openapitools.client.models.SocialProfileDto
import org.openapitools.client.models.WalletDto

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
 * @param duns 
 * @param taxId 
 * @param email 
 * @param about 
 * @param street 
 * @param cartId 
 * @param cityId 
 * @param zipCode 
 * @param stateId 
 * @param walletId 
 * @param faxNumber 
 * @param postalCode 
 * @param currencyId 
 * @param streetLine1 
 * @param streetLine2 
 * @param territoryId 
 * @param mobilePhone 
 * @param enrollmentId 
 * @param annualRevenue 
 * @param relatedUserId 
 * @param businessPhone 
 * @param ownerContactId 
 * @param relatedTenantId 
 * @param activityFeedId 
 * @param parentContactId 
 * @param identityProvider 
 * @param partnerProfileId 
 * @param primaryContactId 
 * @param activeDirectoryId 
 * @param identityProviderAccessToken 
 * @param birthday 
 * @param cart 
 * @param wallet 
 * @param socialProfile 
 * @param parentContact 
 * @param primaryContact 
 */


data class ExtendedContactDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "qualifiedName")
    val qualifiedName: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "type")
    val type: ExtendedContactDto.Type? = null,

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
    val githubUsername: kotlin.String? = null,

    @Json(name = "duns")
    val duns: kotlin.String? = null,

    @Json(name = "taxId")
    val taxId: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "about")
    val about: kotlin.String? = null,

    @Json(name = "street")
    val street: kotlin.String? = null,

    @Json(name = "cartId")
    val cartId: kotlin.String? = null,

    @Json(name = "cityId")
    val cityId: kotlin.String? = null,

    @Json(name = "zipCode")
    val zipCode: kotlin.String? = null,

    @Json(name = "stateId")
    val stateId: kotlin.String? = null,

    @Json(name = "walletId")
    val walletId: kotlin.String? = null,

    @Json(name = "faxNumber")
    val faxNumber: kotlin.String? = null,

    @Json(name = "postalCode")
    val postalCode: kotlin.String? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "streetLine1")
    val streetLine1: kotlin.String? = null,

    @Json(name = "streetLine2")
    val streetLine2: kotlin.String? = null,

    @Json(name = "territoryId")
    val territoryId: kotlin.String? = null,

    @Json(name = "mobilePhone")
    val mobilePhone: kotlin.String? = null,

    @Json(name = "enrollmentId")
    val enrollmentId: kotlin.String? = null,

    @Json(name = "annualRevenue")
    val annualRevenue: kotlin.String? = null,

    @Json(name = "relatedUserId")
    val relatedUserId: kotlin.String? = null,

    @Json(name = "businessPhone")
    val businessPhone: kotlin.String? = null,

    @Json(name = "ownerContactId")
    val ownerContactId: kotlin.String? = null,

    @Json(name = "relatedTenantId")
    val relatedTenantId: kotlin.String? = null,

    @Json(name = "activityFeedId")
    val activityFeedId: kotlin.String? = null,

    @Json(name = "parentContactId")
    val parentContactId: kotlin.String? = null,

    @Json(name = "identityProvider")
    val identityProvider: kotlin.String? = null,

    @Json(name = "partnerProfileId")
    val partnerProfileId: kotlin.String? = null,

    @Json(name = "primaryContactId")
    val primaryContactId: kotlin.String? = null,

    @Json(name = "activeDirectoryId")
    val activeDirectoryId: kotlin.String? = null,

    @Json(name = "identityProviderAccessToken")
    val identityProviderAccessToken: kotlin.String? = null,

    @Json(name = "birthday")
    val birthday: java.time.OffsetDateTime? = null,

    @Json(name = "cart")
    val cart: CartDto? = null,

    @Json(name = "wallet")
    val wallet: WalletDto? = null,

    @Json(name = "socialProfile")
    val socialProfile: SocialProfileDto? = null,

    @Json(name = "parentContact")
    val parentContact: SimpleContactDto? = null,

    @Json(name = "primaryContact")
    val primaryContact: SimpleContactDto? = null

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

