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
 * @param name 
 * @param about 
 * @param cover 
 * @param avatar 
 * @param countryId 
 * @param countryName 
 * @param identityId 
 * @param followsCount 
 * @param messagesCount 
 * @param followersCount 
 * @param notificationsCount 
 * @param unreadNotificationsCount 
 * @param unreadMessagesCount 
 * @param type 
 * @param socialFeedId 
 * @param twitterUrl 
 * @param facebookURL 
 * @param linkedInURL 
 * @param youtubeURL 
 * @param githubURL 
 * @param pinterestURL 
 * @param dribbleURL 
 * @param domain 
 * @param notes 
 */


data class SocialProfileDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "about")
    val about: kotlin.String? = null,

    @Json(name = "cover")
    val cover: kotlin.String? = null,

    @Json(name = "avatar")
    val avatar: kotlin.String? = null,

    @Json(name = "countryId")
    val countryId: kotlin.String? = null,

    @Json(name = "countryName")
    val countryName: kotlin.String? = null,

    @Json(name = "identityId")
    val identityId: kotlin.String? = null,

    @Json(name = "followsCount")
    val followsCount: kotlin.Int? = null,

    @Json(name = "messagesCount")
    val messagesCount: kotlin.Int? = null,

    @Json(name = "followersCount")
    val followersCount: kotlin.Int? = null,

    @Json(name = "notificationsCount")
    val notificationsCount: kotlin.Int? = null,

    @Json(name = "unreadNotificationsCount")
    val unreadNotificationsCount: kotlin.Int? = null,

    @Json(name = "unreadMessagesCount")
    val unreadMessagesCount: kotlin.Int? = null,

    @Json(name = "type")
    val type: SocialProfileDto.Type? = null,

    @Json(name = "socialFeedId")
    val socialFeedId: kotlin.String? = null,

    @Json(name = "twitterUrl")
    val twitterUrl: kotlin.String? = null,

    @Json(name = "facebookURL")
    val facebookURL: kotlin.String? = null,

    @Json(name = "linkedInURL")
    val linkedInURL: kotlin.String? = null,

    @Json(name = "youtubeURL")
    val youtubeURL: kotlin.String? = null,

    @Json(name = "githubURL")
    val githubURL: kotlin.String? = null,

    @Json(name = "pinterestURL")
    val pinterestURL: kotlin.String? = null,

    @Json(name = "dribbleURL")
    val dribbleURL: kotlin.String? = null,

    @Json(name = "domain")
    val domain: kotlin.String? = null,

    @Json(name = "notes")
    val notes: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: _0,_1,_2
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2);
    }

}

