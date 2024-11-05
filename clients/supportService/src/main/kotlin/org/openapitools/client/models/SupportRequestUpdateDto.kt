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
 * @param description 
 * @param approved 
 * @param approvedTimestamp 
 * @param supportEntitlementID 
 */


data class SupportRequestUpdateDto (

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "approved")
    val approved: kotlin.Boolean? = null,

    @Json(name = "approvedTimestamp")
    val approvedTimestamp: java.time.OffsetDateTime? = null,

    @Json(name = "supportEntitlementID")
    val supportEntitlementID: kotlin.String? = null

) {


}

