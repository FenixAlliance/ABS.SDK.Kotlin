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
 * @param notes 
 * @param title 
 * @param author 
 * @param isFolder 
 * @param hash 
 * @param fileUrl 
 * @param filePath 
 * @param fileName 
 * @param `abstract` 
 * @param keyWords 
 * @param metadata 
 * @param fileLength 
 * @param contentType 
 * @param parentFileId 
 * @param validResponse 
 * @param userId 
 * @param tenantId 
 * @param enrollmentId 
 * @param socialProfileId 
 * @param folderPath 
 * @param supportRequestID 
 */


data class SupportRequestAttachmentDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "notes")
    val notes: kotlin.String? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "author")
    val author: kotlin.String? = null,

    @Json(name = "isFolder")
    val isFolder: kotlin.Boolean? = null,

    @Json(name = "hash")
    val hash: kotlin.String? = null,

    @Json(name = "fileUrl")
    val fileUrl: kotlin.String? = null,

    @Json(name = "filePath")
    val filePath: kotlin.String? = null,

    @Json(name = "fileName")
    val fileName: kotlin.String? = null,

    @Json(name = "abstract")
    val `abstract`: kotlin.String? = null,

    @Json(name = "keyWords")
    val keyWords: kotlin.String? = null,

    @Json(name = "metadata")
    val metadata: kotlin.String? = null,

    @Json(name = "fileLength")
    val fileLength: kotlin.Long? = null,

    @Json(name = "contentType")
    val contentType: kotlin.String? = null,

    @Json(name = "parentFileId")
    val parentFileId: kotlin.String? = null,

    @Json(name = "validResponse")
    val validResponse: kotlin.Boolean? = null,

    @Json(name = "userId")
    val userId: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    @Json(name = "enrollmentId")
    val enrollmentId: kotlin.String? = null,

    @Json(name = "socialProfileId")
    val socialProfileId: kotlin.String? = null,

    @Json(name = "folderPath")
    val folderPath: kotlin.String? = null,

    @Json(name = "supportRequestID")
    val supportRequestID: kotlin.String? = null

) {


}

