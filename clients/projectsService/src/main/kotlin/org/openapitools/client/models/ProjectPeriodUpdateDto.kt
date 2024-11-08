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
 * @param periodStartDate 
 * @param periodEndDate 
 */


data class ProjectPeriodUpdateDto (

    @Json(name = "periodStartDate")
    val periodStartDate: java.time.OffsetDateTime? = null,

    @Json(name = "periodEndDate")
    val periodEndDate: java.time.OffsetDateTime? = null

) {


}

