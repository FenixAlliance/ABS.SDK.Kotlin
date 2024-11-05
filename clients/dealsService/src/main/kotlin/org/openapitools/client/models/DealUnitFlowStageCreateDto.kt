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
 * @param order 
 * @param name 
 * @param dealUnitFlowId 
 * @param tenantId 
 * @param description 
 * @param enrolmentId 
 * @param parentBusinessProcessStageId 
 */


data class DealUnitFlowStageCreateDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "dealUnitFlowId")
    val dealUnitFlowId: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "enrolmentId")
    val enrolmentId: kotlin.String? = null,

    @Json(name = "parentBusinessProcessStageId")
    val parentBusinessProcessStageId: kotlin.String? = null

) {


}

