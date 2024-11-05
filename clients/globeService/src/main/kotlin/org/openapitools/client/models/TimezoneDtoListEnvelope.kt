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

import org.openapitools.client.models.TimezoneDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param isSuccess 
 * @param errorMessage 
 * @param correlationId 
 * @param timestamp 
 * @param activityId 
 * @param result 
 */


data class TimezoneDtoListEnvelope (

    @Json(name = "isSuccess")
    val isSuccess: kotlin.Boolean? = null,

    @Json(name = "errorMessage")
    val errorMessage: kotlin.String? = null,

    @Json(name = "correlationId")
    val correlationId: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "activityId")
    val activityId: kotlin.String? = null,

    @Json(name = "result")
    val result: kotlin.collections.List<TimezoneDto>? = null

) {


}

