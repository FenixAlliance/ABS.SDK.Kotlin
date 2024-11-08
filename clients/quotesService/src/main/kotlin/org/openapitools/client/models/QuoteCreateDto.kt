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
 * @param closed 
 * @param title 
 * @param userId 
 * @param tenantId 
 * @param priceListId 
 * @param description 
 * @param enrollmentId 
 * @param individualId 
 * @param paymentTermId 
 * @param organizationId 
 * @param currencyId 
 * @param forexRate 
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
 * @param cartId 
 * @param dealUnitId 
 * @param receiverTenantId 
 * @param effectiveTo 
 * @param effectiveFrom 
 * @param quoteStatus 
 */


data class QuoteCreateDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "closed")
    val closed: kotlin.Boolean? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "userId")
    val userId: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "priceListId")
    val priceListId: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "enrollmentId")
    val enrollmentId: kotlin.String? = null,

    @Json(name = "individualId")
    val individualId: kotlin.String? = null,

    @Json(name = "paymentTermId")
    val paymentTermId: kotlin.String? = null,

    @Json(name = "organizationId")
    val organizationId: kotlin.String? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "forexRate")
    val forexRate: kotlin.Double? = null,

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

    @Json(name = "cartId")
    val cartId: kotlin.String? = null,

    @Json(name = "dealUnitId")
    val dealUnitId: kotlin.String? = null,

    @Json(name = "receiverTenantId")
    val receiverTenantId: kotlin.String? = null,

    @Json(name = "effectiveTo")
    val effectiveTo: java.time.OffsetDateTime? = null,

    @Json(name = "effectiveFrom")
    val effectiveFrom: java.time.OffsetDateTime? = null,

    @Json(name = "quoteStatus")
    val quoteStatus: QuoteCreateDto.QuoteStatus? = null

) {

    /**
     * 
     *
     * Values: _0,_1,_2,_3,_4
     */
    @JsonClass(generateAdapter = false)
    enum class QuoteStatus(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2),
        @Json(name = "3") _3(3),
        @Json(name = "4") _4(4);
    }

}

