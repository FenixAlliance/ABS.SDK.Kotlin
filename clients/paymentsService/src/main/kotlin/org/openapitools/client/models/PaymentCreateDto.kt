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
 * @param invoiceId 
 * @param tenantId 
 * @param emisorWalletId 
 * @param receiverWalletId 
 * @param currencyId 
 * @param forexRate 
 * @param totalCost 
 * @param totalTaxes 
 * @param closed 
 * @param `data` 
 * @param dataLabel 
 * @param data1 
 * @param data1Label 
 * @param response 
 * @param authorization 
 * @param referenceCode 
 * @param correlationCode 
 * @param lastUpdated 
 * @param onBehalfOf 
 * @param paymentType 
 * @param paymentStatus 
 * @param baseCost 
 * @param signature 
 * @param signatureMismatch 
 * @param isExternal 
 * @param markedForRevision 
 * @param forexRatesSnapshot 
 * @param officialId 
 * @param officialIdExpeditionDate 
 * @param fiscalIdentificationTypeId 
 * @param billingAddress 
 * @param phone 
 * @param cellphone 
 * @param department 
 * @param city 
 * @param countryId 
 * @param locationId 
 * @param entitlementId 
 * @param antiFraudScore 
 * @param callRecordURL 
 * @param called 
 * @param verified 
 * @param payerPictureTimestamp 
 * @param payerPicture 
 * @param identificationPictureTimestamp 
 * @param identificationPicture 
 * @param identificationBackPicture 
 * @param identificationBackPictureTimestamp 
 * @param ipLookupId 
 * @param orderId 
 * @param accountingEntryId 
 * @param paymentGatewayId 
 * @param bankAccountId 
 * @param enrolmentId 
 * @param bankId 
 * @param paymentTokenId 
 * @param emisorWalletAccountId 
 * @param receiverWalletAccountId 
 */


data class PaymentCreateDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "invoiceId")
    val invoiceId: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "emisorWalletId")
    val emisorWalletId: kotlin.String? = null,

    @Json(name = "receiverWalletId")
    val receiverWalletId: kotlin.String? = null,

    @Json(name = "currencyId")
    val currencyId: kotlin.String? = null,

    @Json(name = "forexRate")
    val forexRate: kotlin.Double? = null,

    @Json(name = "totalCost")
    val totalCost: kotlin.Double? = null,

    @Json(name = "totalTaxes")
    val totalTaxes: kotlin.Double? = null,

    @Json(name = "closed")
    val closed: kotlin.Boolean? = null,

    @Json(name = "data")
    val `data`: kotlin.String? = null,

    @Json(name = "dataLabel")
    val dataLabel: kotlin.String? = null,

    @Json(name = "data1")
    val data1: kotlin.String? = null,

    @Json(name = "data1Label")
    val data1Label: kotlin.String? = null,

    @Json(name = "response")
    val response: kotlin.String? = null,

    @Json(name = "authorization")
    val authorization: kotlin.String? = null,

    @Json(name = "referenceCode")
    val referenceCode: kotlin.String? = null,

    @Json(name = "correlationCode")
    val correlationCode: kotlin.String? = null,

    @Json(name = "lastUpdated")
    val lastUpdated: java.time.OffsetDateTime? = null,

    @Json(name = "onBehalfOf")
    val onBehalfOf: PaymentCreateDto.OnBehalfOf? = null,

    @Json(name = "paymentType")
    val paymentType: PaymentCreateDto.PaymentType? = null,

    @Json(name = "paymentStatus")
    val paymentStatus: PaymentCreateDto.PaymentStatus? = null,

    @Json(name = "baseCost")
    val baseCost: kotlin.Double? = null,

    @Json(name = "signature")
    val signature: kotlin.String? = null,

    @Json(name = "signatureMismatch")
    val signatureMismatch: kotlin.Boolean? = null,

    @Json(name = "isExternal")
    val isExternal: kotlin.Boolean? = null,

    @Json(name = "markedForRevision")
    val markedForRevision: kotlin.Boolean? = null,

    @Json(name = "forexRatesSnapshot")
    val forexRatesSnapshot: kotlin.String? = null,

    @Json(name = "officialId")
    val officialId: kotlin.String? = null,

    @Json(name = "officialIdExpeditionDate")
    val officialIdExpeditionDate: java.time.OffsetDateTime? = null,

    @Json(name = "fiscalIdentificationTypeId")
    val fiscalIdentificationTypeId: kotlin.String? = null,

    @Json(name = "billingAddress")
    val billingAddress: kotlin.String? = null,

    @Json(name = "phone")
    val phone: kotlin.String? = null,

    @Json(name = "cellphone")
    val cellphone: kotlin.String? = null,

    @Json(name = "department")
    val department: kotlin.String? = null,

    @Json(name = "city")
    val city: kotlin.String? = null,

    @Json(name = "countryId")
    val countryId: kotlin.String? = null,

    @Json(name = "locationId")
    val locationId: kotlin.String? = null,

    @Json(name = "entitlementId")
    val entitlementId: kotlin.String? = null,

    @Json(name = "antiFraudScore")
    val antiFraudScore: kotlin.Double? = null,

    @Json(name = "callRecordURL")
    val callRecordURL: kotlin.String? = null,

    @Json(name = "called")
    val called: kotlin.Boolean? = null,

    @Json(name = "verified")
    val verified: kotlin.Boolean? = null,

    @Json(name = "payerPictureTimestamp")
    val payerPictureTimestamp: kotlin.String? = null,

    @Json(name = "payerPicture")
    val payerPicture: kotlin.String? = null,

    @Json(name = "identificationPictureTimestamp")
    val identificationPictureTimestamp: kotlin.String? = null,

    @Json(name = "identificationPicture")
    val identificationPicture: kotlin.String? = null,

    @Json(name = "identificationBackPicture")
    val identificationBackPicture: kotlin.String? = null,

    @Json(name = "identificationBackPictureTimestamp")
    val identificationBackPictureTimestamp: kotlin.String? = null,

    @Json(name = "ipLookupId")
    val ipLookupId: kotlin.String? = null,

    @Json(name = "orderId")
    val orderId: kotlin.String? = null,

    @Json(name = "accountingEntryId")
    val accountingEntryId: kotlin.String? = null,

    @Json(name = "paymentGatewayId")
    val paymentGatewayId: kotlin.String? = null,

    @Json(name = "bankAccountId")
    val bankAccountId: kotlin.String? = null,

    @Json(name = "enrolmentId")
    val enrolmentId: kotlin.String? = null,

    @Json(name = "bankId")
    val bankId: kotlin.String? = null,

    @Json(name = "paymentTokenId")
    val paymentTokenId: kotlin.String? = null,

    @Json(name = "emisorWalletAccountId")
    val emisorWalletAccountId: kotlin.String? = null,

    @Json(name = "receiverWalletAccountId")
    val receiverWalletAccountId: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: _0,_1,_2,_3
     */
    @JsonClass(generateAdapter = false)
    enum class OnBehalfOf(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2),
        @Json(name = "3") _3(3);
    }
    /**
     * 
     *
     * Values: _0,_1,_2
     */
    @JsonClass(generateAdapter = false)
    enum class PaymentType(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2);
    }
    /**
     * 
     *
     * Values: _0,_1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11
     */
    @JsonClass(generateAdapter = false)
    enum class PaymentStatus(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2),
        @Json(name = "3") _3(3),
        @Json(name = "4") _4(4),
        @Json(name = "5") _5(5),
        @Json(name = "6") _6(6),
        @Json(name = "7") _7(7),
        @Json(name = "8") _8(8),
        @Json(name = "9") _9(9),
        @Json(name = "10") _10(10),
        @Json(name = "11") _11(11);
    }

}

