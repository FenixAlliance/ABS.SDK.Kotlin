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

package org.openapitools.client.apis

import java.io.IOException
import okhttp3.Call
import okhttp3.HttpUrl

import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.TaskTypeCreateDto
import org.openapitools.client.models.TaskTypeDto
import org.openapitools.client.models.TaskTypeUpdateDto

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class TaskTypesApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * 
     * 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeCreateDto  (optional)
     * @return TaskTypeDto
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2ProjectsServiceTaskTypesPost(tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null, taskTypeCreateDto: TaskTypeCreateDto? = null) : TaskTypeDto {
        val localVarResponse = apiV2ProjectsServiceTaskTypesPostWithHttpInfo(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion, taskTypeCreateDto = taskTypeCreateDto)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskTypeDto
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeCreateDto  (optional)
     * @return ApiResponse<TaskTypeDto?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2ProjectsServiceTaskTypesPostWithHttpInfo(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?, taskTypeCreateDto: TaskTypeCreateDto?) : ApiResponse<TaskTypeDto?> {
        val localVariableConfig = apiV2ProjectsServiceTaskTypesPostRequestConfig(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion, taskTypeCreateDto = taskTypeCreateDto)

        return request<TaskTypeCreateDto, TaskTypeDto>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2ProjectsServiceTaskTypesPost
     *
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeCreateDto  (optional)
     * @return RequestConfig
     */
    fun apiV2ProjectsServiceTaskTypesPostRequestConfig(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?, taskTypeCreateDto: TaskTypeCreateDto?) : RequestConfig<TaskTypeCreateDto> {
        val localVariableBody = taskTypeCreateDto
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("tenantId", listOf(tenantId.toString()))
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/ProjectsService/TaskTypes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param taskTypeId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return TaskTypeDto
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2ProjectsServiceTaskTypesTaskTypeIdDelete(taskTypeId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : TaskTypeDto {
        val localVarResponse = apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteWithHttpInfo(taskTypeId = taskTypeId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskTypeDto
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param taskTypeId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<TaskTypeDto?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteWithHttpInfo(taskTypeId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<TaskTypeDto?> {
        val localVariableConfig = apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteRequestConfig(taskTypeId = taskTypeId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, TaskTypeDto>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2ProjectsServiceTaskTypesTaskTypeIdDelete
     *
     * @param taskTypeId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2ProjectsServiceTaskTypesTaskTypeIdDeleteRequestConfig(taskTypeId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("tenantId", listOf(tenantId.toString()))
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v2/ProjectsService/TaskTypes/{taskTypeId}".replace("{"+"taskTypeId"+"}", encodeURIComponent(taskTypeId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param taskTypeId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return TaskTypeDto
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2ProjectsServiceTaskTypesTaskTypeIdGet(taskTypeId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : TaskTypeDto {
        val localVarResponse = apiV2ProjectsServiceTaskTypesTaskTypeIdGetWithHttpInfo(taskTypeId = taskTypeId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskTypeDto
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param taskTypeId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<TaskTypeDto?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2ProjectsServiceTaskTypesTaskTypeIdGetWithHttpInfo(taskTypeId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<TaskTypeDto?> {
        val localVariableConfig = apiV2ProjectsServiceTaskTypesTaskTypeIdGetRequestConfig(taskTypeId = taskTypeId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, TaskTypeDto>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2ProjectsServiceTaskTypesTaskTypeIdGet
     *
     * @param taskTypeId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2ProjectsServiceTaskTypesTaskTypeIdGetRequestConfig(taskTypeId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("tenantId", listOf(tenantId.toString()))
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/ProjectsService/TaskTypes/{taskTypeId}".replace("{"+"taskTypeId"+"}", encodeURIComponent(taskTypeId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param taskTypeId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeUpdateDto  (optional)
     * @return TaskTypeDto
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2ProjectsServiceTaskTypesTaskTypeIdPut(taskTypeId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null, taskTypeUpdateDto: TaskTypeUpdateDto? = null) : TaskTypeDto {
        val localVarResponse = apiV2ProjectsServiceTaskTypesTaskTypeIdPutWithHttpInfo(taskTypeId = taskTypeId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion, taskTypeUpdateDto = taskTypeUpdateDto)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskTypeDto
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param taskTypeId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeUpdateDto  (optional)
     * @return ApiResponse<TaskTypeDto?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2ProjectsServiceTaskTypesTaskTypeIdPutWithHttpInfo(taskTypeId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?, taskTypeUpdateDto: TaskTypeUpdateDto?) : ApiResponse<TaskTypeDto?> {
        val localVariableConfig = apiV2ProjectsServiceTaskTypesTaskTypeIdPutRequestConfig(taskTypeId = taskTypeId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion, taskTypeUpdateDto = taskTypeUpdateDto)

        return request<TaskTypeUpdateDto, TaskTypeDto>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2ProjectsServiceTaskTypesTaskTypeIdPut
     *
     * @param taskTypeId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param taskTypeUpdateDto  (optional)
     * @return RequestConfig
     */
    fun apiV2ProjectsServiceTaskTypesTaskTypeIdPutRequestConfig(taskTypeId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?, taskTypeUpdateDto: TaskTypeUpdateDto?) : RequestConfig<TaskTypeUpdateDto> {
        val localVariableBody = taskTypeUpdateDto
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("tenantId", listOf(tenantId.toString()))
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v2/ProjectsService/TaskTypes/{taskTypeId}".replace("{"+"taskTypeId"+"}", encodeURIComponent(taskTypeId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
