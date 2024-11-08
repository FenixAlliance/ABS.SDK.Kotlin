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
 * @param tenantId 
 * @param licenseString 
 * @param enrollmentId 
 * @param expirationDate 
 * @param availableSeats 
 * @param totalSeats 
 */


data class SuiteLicenseDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "licenseString")
    val licenseString: kotlin.String? = null,

    @Json(name = "enrollmentId")
    val enrollmentId: kotlin.String? = null,

    @Json(name = "expirationDate")
    val expirationDate: java.time.OffsetDateTime? = null,

    @Json(name = "availableSeats")
    val availableSeats: kotlin.Int? = null,

    @Json(name = "totalSeats")
    val totalSeats: kotlin.Int? = null

) {


}

