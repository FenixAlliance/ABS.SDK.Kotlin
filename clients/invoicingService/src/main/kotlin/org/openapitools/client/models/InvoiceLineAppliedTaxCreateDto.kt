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
 * @param tenantId 
 * @param invoiceId 
 * @param taxPolicyId 
 * @param enrollmentId 
 */


data class InvoiceLineAppliedTaxCreateDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "invoiceId")
    val invoiceId: kotlin.String? = null,

    @Json(name = "taxPolicyId")
    val taxPolicyId: kotlin.String? = null,

    @Json(name = "enrollmentId")
    val enrollmentId: kotlin.String? = null

) {


}

