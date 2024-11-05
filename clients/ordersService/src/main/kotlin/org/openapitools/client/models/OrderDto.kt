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

import org.openapitools.client.models.Currency
import org.openapitools.client.models.Money

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param timestamp 
 * @param closed 
 * @param type 
 * @param title 
 * @param userId 
 * @param tenantId 
 * @param currencyId 
 * @param description 
 * @param priceListId 
 * @param enrollmentId 
 * @param individualId 
 * @param organizationId 
 * @param receiverTenantId 
 * @param firstName 
 * @param lastName 
 * @param companyName 
 * @param billingEmail 
 * @param addressLine1 
 * @param addressLine2 
 * @param postalCode 
 * @param countryId 
 * @param stateId 
 * @param cityId 
 * @param customerNotes 
 * @param forexRate 
 * @param total 
 * @param totalTaxes 
 * @param totalTaxBase 
 * @param totalDiscounts 
 * @param totalSurcharges 
 * @param totalGlobalDiscounts 
 * @param totalGlobalSurcharges 
 * @param totalTaxesInUsd 
 * @param totalAmountInUsd 
 * @param totalProfitInUsd 
 * @param totalTaxBaseInUsd 
 * @param totalDiscountsInUsd 
 * @param totalSurchargesInUsd 
 * @param totalDetailAmountInUsd 
 * @param totalGlobalDiscountsInUsd 
 * @param totalGlobalSurchargesInUsd 
 * @param totalWithholdingTaxesInUsd 
 * @param totalShippingCostInUsd 
 * @param totalShippingTaxesInUsd 
 * @param currency 
 * @param totalInUsd 
 * @param totalTaxAmountInUsd 
 * @param totalTaxBaseAmountInUsd 
 * @param totalDiscountsAmountInUsd 
 * @param totalSurchargesAmountInUsd 
 * @param totalGlobalDiscountsAmountInUsd 
 * @param totalGlobalSurchargesAmountInUsd 
 * @param totalAmount 
 * @param totalTaxAmount 
 * @param totalTaxBaseAmount 
 * @param totalDiscountsAmount 
 * @param totalSurchargesAmount 
 * @param totalGlobalDiscountsAmount 
 * @param totalGlobalSurchargesAmount 
 * @param orderLinesCount 
 * @param quoteId 
 * @param walletId 
 * @param paymentTermId 
 * @param parentOrderId 
 * @param shippingMethodId 
 * @param billingLocationId 
 * @param shippingLocationId 
 * @param qualifiedIdentifier 
 * @param costCalculationMethod 
 * @param freightTerms 
 * @param orderStatus 
 * @param requestedDeliveryDate 
 * @param customTaxAmount 
 * @param customTotalAmount 
 * @param customDetailAmount 
 * @param customProfitAmount 
 * @param customDiscountsAmount 
 * @param customSurchargesAmount 
 * @param customShippingTaxAmount 
 * @param customShippingCostAmount 
 * @param customWithholdingTaxAmount 
 */


data class OrderDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "closed")
    val closed: kotlin.Boolean? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "userId")
    val userId: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "priceListId")
    val priceListId: kotlin.String? = null,

    @Json(name = "enrollmentId")
    val enrollmentId: kotlin.String? = null,

    @Json(name = "individualId")
    val individualId: kotlin.String? = null,

    @Json(name = "organizationId")
    val organizationId: kotlin.String? = null,

    @Json(name = "receiverTenantId")
    val receiverTenantId: kotlin.String? = null,

    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    @Json(name = "companyName")
    val companyName: kotlin.String? = null,

    @Json(name = "billingEmail")
    val billingEmail: kotlin.String? = null,

    @Json(name = "addressLine1")
    val addressLine1: kotlin.String? = null,

    @Json(name = "addressLine2")
    val addressLine2: kotlin.String? = null,

    @Json(name = "postalCode")
    val postalCode: kotlin.String? = null,

    @Json(name = "countryId")
    val countryId: kotlin.String? = null,

    @Json(name = "stateId")
    val stateId: kotlin.String? = null,

    @Json(name = "cityId")
    val cityId: kotlin.String? = null,

    @Json(name = "customerNotes")
    val customerNotes: kotlin.String? = null,

    @Json(name = "forexRate")
    val forexRate: kotlin.Double? = null,

    @Json(name = "total")
    val total: kotlin.Double? = null,

    @Json(name = "totalTaxes")
    val totalTaxes: kotlin.Double? = null,

    @Json(name = "totalTaxBase")
    val totalTaxBase: kotlin.Double? = null,

    @Json(name = "totalDiscounts")
    val totalDiscounts: kotlin.Double? = null,

    @Json(name = "totalSurcharges")
    val totalSurcharges: kotlin.Double? = null,

    @Json(name = "totalGlobalDiscounts")
    val totalGlobalDiscounts: kotlin.Double? = null,

    @Json(name = "totalGlobalSurcharges")
    val totalGlobalSurcharges: kotlin.Double? = null,

    @Json(name = "totalTaxesInUsd")
    val totalTaxesInUsd: kotlin.Double? = null,

    @Json(name = "totalAmountInUsd")
    val totalAmountInUsd: kotlin.Double? = null,

    @Json(name = "totalProfitInUsd")
    val totalProfitInUsd: kotlin.Double? = null,

    @Json(name = "totalTaxBaseInUsd")
    val totalTaxBaseInUsd: kotlin.Double? = null,

    @Json(name = "totalDiscountsInUsd")
    val totalDiscountsInUsd: kotlin.Double? = null,

    @Json(name = "totalSurchargesInUsd")
    val totalSurchargesInUsd: kotlin.Double? = null,

    @Json(name = "totalDetailAmountInUsd")
    val totalDetailAmountInUsd: kotlin.Double? = null,

    @Json(name = "totalGlobalDiscountsInUsd")
    val totalGlobalDiscountsInUsd: kotlin.Double? = null,

    @Json(name = "totalGlobalSurchargesInUsd")
    val totalGlobalSurchargesInUsd: kotlin.Double? = null,

    @Json(name = "totalWithholdingTaxesInUsd")
    val totalWithholdingTaxesInUsd: kotlin.Double? = null,

    @Json(name = "totalShippingCostInUsd")
    val totalShippingCostInUsd: kotlin.Double? = null,

    @Json(name = "totalShippingTaxesInUsd")
    val totalShippingTaxesInUsd: kotlin.Double? = null,

    @Json(name = "currency")
    val currency: Currency? = null,

    @Json(name = "totalInUsd")
    val totalInUsd: Money? = null,

    @Json(name = "totalTaxAmountInUsd")
    val totalTaxAmountInUsd: Money? = null,

    @Json(name = "totalTaxBaseAmountInUsd")
    val totalTaxBaseAmountInUsd: Money? = null,

    @Json(name = "totalDiscountsAmountInUsd")
    val totalDiscountsAmountInUsd: Money? = null,

    @Json(name = "totalSurchargesAmountInUsd")
    val totalSurchargesAmountInUsd: Money? = null,

    @Json(name = "totalGlobalDiscountsAmountInUsd")
    val totalGlobalDiscountsAmountInUsd: Money? = null,

    @Json(name = "totalGlobalSurchargesAmountInUsd")
    val totalGlobalSurchargesAmountInUsd: Money? = null,

    @Json(name = "totalAmount")
    val totalAmount: Money? = null,

    @Json(name = "totalTaxAmount")
    val totalTaxAmount: Money? = null,

    @Json(name = "totalTaxBaseAmount")
    val totalTaxBaseAmount: Money? = null,

    @Json(name = "totalDiscountsAmount")
    val totalDiscountsAmount: Money? = null,

    @Json(name = "totalSurchargesAmount")
    val totalSurchargesAmount: Money? = null,

    @Json(name = "totalGlobalDiscountsAmount")
    val totalGlobalDiscountsAmount: Money? = null,

    @Json(name = "totalGlobalSurchargesAmount")
    val totalGlobalSurchargesAmount: Money? = null,

    @Json(name = "orderLinesCount")
    val orderLinesCount: kotlin.Int? = null,

    @Json(name = "quoteId")
    val quoteId: kotlin.String? = null,

    @Json(name = "walletId")
    val walletId: kotlin.String? = null,

    @Json(name = "paymentTermId")
    val paymentTermId: kotlin.String? = null,

    @Json(name = "parentOrderId")
    val parentOrderId: kotlin.String? = null,

    @Json(name = "shippingMethodId")
    val shippingMethodId: kotlin.String? = null,

    @Json(name = "billingLocationId")
    val billingLocationId: kotlin.String? = null,

    @Json(name = "shippingLocationId")
    val shippingLocationId: kotlin.String? = null,

    @Json(name = "qualifiedIdentifier")
    val qualifiedIdentifier: kotlin.String? = null,

    @Json(name = "costCalculationMethod")
    val costCalculationMethod: OrderDto.CostCalculationMethod? = null,

    @Json(name = "freightTerms")
    val freightTerms: OrderDto.FreightTerms? = null,

    @Json(name = "orderStatus")
    val orderStatus: OrderDto.OrderStatus? = null,

    @Json(name = "requestedDeliveryDate")
    val requestedDeliveryDate: java.time.OffsetDateTime? = null,

    @Json(name = "customTaxAmount")
    val customTaxAmount: kotlin.Double? = null,

    @Json(name = "customTotalAmount")
    val customTotalAmount: kotlin.Double? = null,

    @Json(name = "customDetailAmount")
    val customDetailAmount: kotlin.Double? = null,

    @Json(name = "customProfitAmount")
    val customProfitAmount: kotlin.Double? = null,

    @Json(name = "customDiscountsAmount")
    val customDiscountsAmount: kotlin.Double? = null,

    @Json(name = "customSurchargesAmount")
    val customSurchargesAmount: kotlin.Double? = null,

    @Json(name = "customShippingTaxAmount")
    val customShippingTaxAmount: kotlin.Double? = null,

    @Json(name = "customShippingCostAmount")
    val customShippingCostAmount: kotlin.Double? = null,

    @Json(name = "customWithholdingTaxAmount")
    val customWithholdingTaxAmount: kotlin.Double? = null

) {

    /**
     * 
     *
     * Values: _0,_1
     */
    @JsonClass(generateAdapter = false)
    enum class CostCalculationMethod(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1);
    }
    /**
     * 
     *
     * Values: _0,_1
     */
    @JsonClass(generateAdapter = false)
    enum class FreightTerms(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1);
    }
    /**
     * 
     *
     * Values: _1,_2,_3,_4,_5,_6,_7,_8,_9,_10
     */
    @JsonClass(generateAdapter = false)
    enum class OrderStatus(val value: kotlin.Int) {
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2),
        @Json(name = "3") _3(3),
        @Json(name = "4") _4(4),
        @Json(name = "5") _5(5),
        @Json(name = "6") _6(6),
        @Json(name = "7") _7(7),
        @Json(name = "8") _8(8),
        @Json(name = "9") _9(9),
        @Json(name = "10") _10(10);
    }

}
