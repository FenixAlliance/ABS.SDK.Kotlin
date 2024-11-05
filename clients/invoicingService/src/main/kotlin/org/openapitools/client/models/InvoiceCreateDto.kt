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

import org.openapitools.client.models.InvoiceAdjustmentDto
import org.openapitools.client.models.InvoiceItemRecordDto
import org.openapitools.client.models.InvoiceReferenceDto

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
 * @param paid 
 * @param number 
 * @param notes 
 * @param customerNotes 
 * @param orderId 
 * @param enumeration 
 * @param paymentModeId 
 * @param receiverTenantId 
 * @param enumerationRangeId 
 * @param emisorBillingProfileId 
 * @param receiverBillingProfileId 
 * @param emisorWalletAccountId 
 * @param receiverWalletAccountId 
 * @param paymentDue 
 * @param invoiceType 
 * @param documentType 
 * @param invoiceStatus 
 * @param validFrom 
 * @param validTo 
 * @param invoiceReferences 
 * @param invoiceItemRecords 
 * @param invoiceAdjustments 
 */


data class InvoiceCreateDto (

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

    @Json(name = "paid")
    val paid: kotlin.Boolean? = null,

    @Json(name = "number")
    val number: kotlin.Int? = null,

    @Json(name = "notes")
    val notes: kotlin.String? = null,

    @Json(name = "customerNotes")
    val customerNotes: kotlin.String? = null,

    @Json(name = "orderId")
    val orderId: kotlin.String? = null,

    @Json(name = "enumeration")
    val enumeration: kotlin.String? = null,

    @Json(name = "paymentModeId")
    val paymentModeId: kotlin.String? = null,

    @Json(name = "receiverTenantId")
    val receiverTenantId: kotlin.String? = null,

    @Json(name = "enumerationRangeId")
    val enumerationRangeId: kotlin.String? = null,

    @Json(name = "emisorBillingProfileId")
    val emisorBillingProfileId: kotlin.String? = null,

    @Json(name = "receiverBillingProfileId")
    val receiverBillingProfileId: kotlin.String? = null,

    @Json(name = "emisorWalletAccountId")
    val emisorWalletAccountId: kotlin.String? = null,

    @Json(name = "receiverWalletAccountId")
    val receiverWalletAccountId: kotlin.String? = null,

    @Json(name = "paymentDue")
    val paymentDue: java.time.OffsetDateTime? = null,

    @Json(name = "invoiceType")
    val invoiceType: InvoiceCreateDto.InvoiceType? = null,

    @Json(name = "documentType")
    val documentType: InvoiceCreateDto.DocumentType? = null,

    @Json(name = "invoiceStatus")
    val invoiceStatus: InvoiceCreateDto.InvoiceStatus? = null,

    @Json(name = "validFrom")
    val validFrom: java.time.OffsetDateTime? = null,

    @Json(name = "validTo")
    val validTo: java.time.OffsetDateTime? = null,

    @Json(name = "invoiceReferences")
    val invoiceReferences: kotlin.collections.List<InvoiceReferenceDto>? = null,

    @Json(name = "invoiceItemRecords")
    val invoiceItemRecords: kotlin.collections.List<InvoiceItemRecordDto>? = null,

    @Json(name = "invoiceAdjustments")
    val invoiceAdjustments: kotlin.collections.List<InvoiceAdjustmentDto>? = null

) {

    /**
     * 
     *
     * Values: _0,_1
     */
    @JsonClass(generateAdapter = false)
    enum class InvoiceType(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1);
    }
    /**
     * 
     *
     * Values: _0,_1,_2
     */
    @JsonClass(generateAdapter = false)
    enum class DocumentType(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2);
    }
    /**
     * 
     *
     * Values: _0,_1,_2,_3,_4
     */
    @JsonClass(generateAdapter = false)
    enum class InvoiceStatus(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2),
        @Json(name = "3") _3(3),
        @Json(name = "4") _4(4);
    }

}
