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

import org.openapitools.client.models.Money

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param timestamp 
 * @param itemId 
 * @param unitId 
 * @param unitGroupId 
 * @param priceId 
 * @param priceListId 
 * @param discountId 
 * @param discountListId 
 * @param tenantId 
 * @param enrollmentId 
 * @param roundingPolicyId 
 * @param effectiveDiscountPercent 
 * @param currencyId 
 * @param totalBaseAmount 
 * @param totalDiscountsAmount 
 * @param totalSurchargesAmount 
 * @param totalShippingAmount 
 * @param totalShippingTaxAmount 
 * @param totalTaxAmount 
 * @param totalAmount 
 */


data class PriceCalculationDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "itemId")
    val itemId: kotlin.String? = null,

    @Json(name = "unitId")
    val unitId: kotlin.String? = null,

    @Json(name = "unitGroupId")
    val unitGroupId: kotlin.String? = null,

    @Json(name = "priceId")
    val priceId: kotlin.String? = null,

    @Json(name = "priceListId")
    val priceListId: kotlin.String? = null,

    @Json(name = "discountId")
    val discountId: kotlin.String? = null,

    @Json(name = "discountListId")
    val discountListId: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "enrollmentId")
    val enrollmentId: kotlin.String? = null,

    @Json(name = "roundingPolicyId")
    val roundingPolicyId: kotlin.String? = null,

    @Json(name = "effectiveDiscountPercent")
    val effectiveDiscountPercent: kotlin.Double? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "totalBaseAmount")
    val totalBaseAmount: Money? = null,

    @Json(name = "totalDiscountsAmount")
    val totalDiscountsAmount: Money? = null,

    @Json(name = "totalSurchargesAmount")
    val totalSurchargesAmount: Money? = null,

    @Json(name = "totalShippingAmount")
    val totalShippingAmount: Money? = null,

    @Json(name = "totalShippingTaxAmount")
    val totalShippingTaxAmount: Money? = null,

    @Json(name = "totalTaxAmount")
    val totalTaxAmount: Money? = null,

    @Json(name = "totalAmount")
    val totalAmount: Money? = null

) {


}
