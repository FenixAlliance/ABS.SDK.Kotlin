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
 * @param projectId 
 * @param projectTaskId 
 * @param taskCategoryId 
 * @param projectPeriodId 
 * @param responsibleContactId 
 * @param creatorContactId 
 * @param recordType 
 * @param timeStamp 
 * @param timeSpan 
 * @param logDate 
 * @param comments 
 * @param type 
 */


data class ProjectTimeLogDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "projectId")
    val projectId: kotlin.String? = null,

    @Json(name = "projectTaskId")
    val projectTaskId: kotlin.String? = null,

    @Json(name = "taskCategoryId")
    val taskCategoryId: kotlin.String? = null,

    @Json(name = "projectPeriodId")
    val projectPeriodId: kotlin.String? = null,

    @Json(name = "responsibleContactId")
    val responsibleContactId: kotlin.String? = null,

    @Json(name = "creatorContactId")
    val creatorContactId: kotlin.String? = null,

    @Json(name = "recordType")
    val recordType: ProjectTimeLogDto.RecordType? = null,

    @Json(name = "timeStamp")
    val timeStamp: java.time.OffsetDateTime? = null,

    @Json(name = "timeSpan")
    val timeSpan: kotlin.String? = null,

    @Json(name = "logDate")
    val logDate: java.time.OffsetDateTime? = null,

    @Json(name = "comments")
    val comments: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: _0,_1,_2
     */
    @JsonClass(generateAdapter = false)
    enum class RecordType(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2);
    }

}

