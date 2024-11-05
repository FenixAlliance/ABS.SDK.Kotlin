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
 * @param locked 
 * @param name 
 * @param purpose 
 * @param description 
 * @param source 
 * @param cost 
 * @param modifiedOn 
 * @param lastUsedOn 
 * @param currencyId 
 * @param tenantId 
 * @param enrolmentId 
 * @param marketingListType 
 * @param marketingListTarget 
 */


data class MarketingListDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "locked")
    val locked: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "purpose")
    val purpose: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "source")
    val source: kotlin.String? = null,

    @Json(name = "cost")
    val cost: kotlin.Double? = null,

    @Json(name = "modifiedOn")
    val modifiedOn: java.time.OffsetDateTime? = null,

    @Json(name = "lastUsedOn")
    val lastUsedOn: java.time.OffsetDateTime? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "enrolmentId")
    val enrolmentId: kotlin.String? = null,

    @Json(name = "marketingListType")
    val marketingListType: MarketingListDto.MarketingListType? = null,

    @Json(name = "marketingListTarget")
    val marketingListTarget: MarketingListDto.MarketingListTarget? = null

) {

    /**
     * 
     *
     * Values: _0,_1
     */
    @JsonClass(generateAdapter = false)
    enum class MarketingListType(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1);
    }
    /**
     * 
     *
     * Values: _0,_1,_2
     */
    @JsonClass(generateAdapter = false)
    enum class MarketingListTarget(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2);
    }

}

