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
 * @param startDate 
 * @param dueLine 
 */


data class ProjectTaskUpdateDto (

    @Json(name = "startDate")
    val startDate: java.time.OffsetDateTime? = null,

    @Json(name = "dueLine")
    val dueLine: java.time.OffsetDateTime? = null

) {


}
