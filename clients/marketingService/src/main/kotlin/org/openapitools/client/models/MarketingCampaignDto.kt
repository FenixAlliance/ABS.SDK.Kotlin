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
 * @param offer 
 * @param active 
 * @param proposedStart 
 * @param proposedEnd 
 * @param actualStart 
 * @param actualEnd 
 * @param code 
 * @param allocatedBudget 
 * @param activityCost 
 * @param miscCost 
 * @param expectedResponsePercent 
 * @param marketingAreaId 
 * @param currencyId 
 * @param tenantId 
 * @param enrolmentId 
 */


data class MarketingCampaignDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "offer")
    val offer: kotlin.String? = null,

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "proposedStart")
    val proposedStart: java.time.OffsetDateTime? = null,

    @Json(name = "proposedEnd")
    val proposedEnd: java.time.OffsetDateTime? = null,

    @Json(name = "actualStart")
    val actualStart: java.time.OffsetDateTime? = null,

    @Json(name = "actualEnd")
    val actualEnd: java.time.OffsetDateTime? = null,

    @Json(name = "code")
    val code: kotlin.String? = null,

    @Json(name = "allocatedBudget")
    val allocatedBudget: kotlin.Double? = null,

    @Json(name = "activityCost")
    val activityCost: kotlin.Double? = null,

    @Json(name = "miscCost")
    val miscCost: kotlin.Double? = null,

    @Json(name = "expectedResponsePercent")
    val expectedResponsePercent: kotlin.Double? = null,

    @Json(name = "marketingAreaId")
    val marketingAreaId: kotlin.String? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "enrolmentId")
    val enrolmentId: kotlin.String? = null

) {


}

