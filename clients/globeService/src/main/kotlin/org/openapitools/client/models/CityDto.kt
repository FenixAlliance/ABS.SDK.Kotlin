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
 * @param imageUrl 
 * @param stateID 
 * @param countryID 
 * @param latitude 
 * @param longitude 
 */


data class CityDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "imageUrl")
    val imageUrl: kotlin.String? = null,

    @Json(name = "stateID")
    val stateID: kotlin.String? = null,

    @Json(name = "countryID")
    val countryID: kotlin.String? = null,

    @Json(name = "latitude")
    val latitude: kotlin.String? = null,

    @Json(name = "longitude")
    val longitude: kotlin.String? = null

) {


}

