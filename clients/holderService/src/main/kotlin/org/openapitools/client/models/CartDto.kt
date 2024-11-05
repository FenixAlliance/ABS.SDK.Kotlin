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
 * @param ip 
 * @param type 
 * @param total 
 * @param taxes 
 * @param freight 
 * @param subTotal 
 * @param currencyId 
 * @param countryId 
 * @param itemCartRecordsCount 
 * @param itemToCompareRecordsCount 
 */


data class CartDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "ip")
    val ip: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "total")
    val total: kotlin.Double? = null,

    @Json(name = "taxes")
    val taxes: kotlin.Double? = null,

    @Json(name = "freight")
    val freight: kotlin.Double? = null,

    @Json(name = "subTotal")
    val subTotal: kotlin.Double? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "countryId")
    val countryId: kotlin.String? = null,

    @Json(name = "itemCartRecordsCount")
    val itemCartRecordsCount: kotlin.Int? = null,

    @Json(name = "itemToCompareRecordsCount")
    val itemToCompareRecordsCount: kotlin.Int? = null

) {


}

