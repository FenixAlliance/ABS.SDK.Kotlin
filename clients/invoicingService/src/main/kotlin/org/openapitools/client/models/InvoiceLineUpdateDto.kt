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
 * @param price 
 * @param unitId 
 * @param percent 
 * @param unitGroupId 
 * @param currencyId 
 * @param discountListId 
 * @param roundingPolicyId 
 * @param quantity 
 * @param itemId 
 * @param itemPriceId 
 * @param invoiceLineId 
 * @param taxAmountInUsd 
 * @param taxBaseAmountInUsd 
 */


data class InvoiceLineUpdateDto (

    @Json(name = "price")
    val price: kotlin.Double? = null,

    @Json(name = "unitId")
    val unitId: kotlin.String? = null,

    @Json(name = "percent")
    val percent: kotlin.Double? = null,

    @Json(name = "unitGroupId")
    val unitGroupId: kotlin.String? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "discountListId")
    val discountListId: kotlin.String? = null,

    @Json(name = "roundingPolicyId")
    val roundingPolicyId: kotlin.String? = null,

    @Json(name = "quantity")
    val quantity: kotlin.Int? = null,

    @Json(name = "itemId")
    val itemId: kotlin.String? = null,

    @Json(name = "itemPriceId")
    val itemPriceId: kotlin.String? = null,

    @Json(name = "invoiceLineId")
    val invoiceLineId: kotlin.String? = null,

    @Json(name = "taxAmountInUsd")
    val taxAmountInUsd: kotlin.Double? = null,

    @Json(name = "taxBaseAmountInUsd")
    val taxBaseAmountInUsd: kotlin.Double? = null

) {


}
