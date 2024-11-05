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
 * @param description 
 * @param accountHolderID 
 * @param contactID 
 * @param businessID 
 * @param businessProfileRecordID 
 * @param supportTicketTypeID 
 * @param supportEntitlementID 
 * @param supportPriorityID 
 */


data class SupportTicketCreateDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "accountHolderID")
    val accountHolderID: kotlin.String? = null,

    @Json(name = "contactID")
    val contactID: kotlin.String? = null,

    @Json(name = "businessID")
    val businessID: kotlin.String? = null,

    @Json(name = "businessProfileRecordID")
    val businessProfileRecordID: kotlin.String? = null,

    @Json(name = "supportTicketTypeID")
    val supportTicketTypeID: kotlin.String? = null,

    @Json(name = "supportEntitlementID")
    val supportEntitlementID: kotlin.String? = null,

    @Json(name = "supportPriorityID")
    val supportPriorityID: kotlin.String? = null

) {


}
