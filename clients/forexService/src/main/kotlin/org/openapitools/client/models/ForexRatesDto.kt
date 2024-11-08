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
 * @param success 
 * @param date 
 * @param base 
 * @param timestamp 
 * @param requestTimestamp 
 * @param rates 
 */


data class ForexRatesDto (

    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    @Json(name = "date")
    val date: kotlin.String? = null,

    @Json(name = "base")
    val base: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: kotlin.Long? = null,

    @Json(name = "requestTimestamp")
    val requestTimestamp: java.time.OffsetDateTime? = null,

    @Json(name = "rates")
    val rates: kotlin.collections.Map<kotlin.String, kotlin.Double>? = null

) {


}

