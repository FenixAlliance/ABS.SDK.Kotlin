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
 * @param closed 
 * @param title 
 * @param userId 
 * @param tenantId 
 * @param forexRate 
 * @param currencyId 
 * @param priceListId 
 * @param description 
 * @param enrollmentId 
 * @param individualId 
 * @param paymentTermId 
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
 * @param billingLocationId 
 * @param shippingLocationId 
 * @param shippingMethodId 
 */


data class InvoiceUpdateDto (

    @Json(name = "closed")
    val closed: kotlin.Boolean? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "userId")
    val userId: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "forexRate")
    val forexRate: kotlin.Double? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

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

    @Json(name = "billingLocationId")
    val billingLocationId: kotlin.String? = null,

    @Json(name = "shippingLocationId")
    val shippingLocationId: kotlin.String? = null,

    @Json(name = "shippingMethodId")
    val shippingMethodId: kotlin.String? = null

) {


}

