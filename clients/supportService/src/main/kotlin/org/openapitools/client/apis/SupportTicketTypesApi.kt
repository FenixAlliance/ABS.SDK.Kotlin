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

import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.SupportTicketTypeCreateDto
import org.openapitools.client.models.SupportTicketTypeDtoEnvelope
import org.openapitools.client.models.SupportTicketTypeDtoListEnvelope
import org.openapitools.client.models.SupportTicketTypeUpdateDto

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

class SupportTicketTypesApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * 
     * 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return Int32Envelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2SupportServiceSupportTicketTypesCountGet(tenantId: java.util.UUID? = null, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : Int32Envelope {
        val localVarResponse = apiV2SupportServiceSupportTicketTypesCountGetWithHttpInfo(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Int32Envelope
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
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<Int32Envelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2SupportServiceSupportTicketTypesCountGetWithHttpInfo(tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<Int32Envelope?> {
        val localVariableConfig = apiV2SupportServiceSupportTicketTypesCountGetRequestConfig(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, Int32Envelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2SupportServiceSupportTicketTypesCountGet
     *
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2SupportServiceSupportTicketTypesCountGetRequestConfig(tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (tenantId != null) {
                    put("tenantId", listOf(tenantId.toString()))
                }
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/SupportService/SupportTicketTypes/Count",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return SupportTicketTypeDtoListEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2SupportServiceSupportTicketTypesGet(tenantId: java.util.UUID? = null, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : SupportTicketTypeDtoListEnvelope {
        val localVarResponse = apiV2SupportServiceSupportTicketTypesGetWithHttpInfo(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SupportTicketTypeDtoListEnvelope
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
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<SupportTicketTypeDtoListEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2SupportServiceSupportTicketTypesGetWithHttpInfo(tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<SupportTicketTypeDtoListEnvelope?> {
        val localVariableConfig = apiV2SupportServiceSupportTicketTypesGetRequestConfig(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, SupportTicketTypeDtoListEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2SupportServiceSupportTicketTypesGet
     *
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2SupportServiceSupportTicketTypesGetRequestConfig(tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (tenantId != null) {
                    put("tenantId", listOf(tenantId.toString()))
                }
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/SupportService/SupportTicketTypes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param supportTicketTypeCreateDto 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return EmptyEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2SupportServiceSupportTicketTypesPost(supportTicketTypeCreateDto: SupportTicketTypeCreateDto, tenantId: java.util.UUID? = null, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = apiV2SupportServiceSupportTicketTypesPostWithHttpInfo(supportTicketTypeCreateDto = supportTicketTypeCreateDto, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EmptyEnvelope
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
     * @param supportTicketTypeCreateDto 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2SupportServiceSupportTicketTypesPostWithHttpInfo(supportTicketTypeCreateDto: SupportTicketTypeCreateDto, tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = apiV2SupportServiceSupportTicketTypesPostRequestConfig(supportTicketTypeCreateDto = supportTicketTypeCreateDto, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<SupportTicketTypeCreateDto, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2SupportServiceSupportTicketTypesPost
     *
     * @param supportTicketTypeCreateDto 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2SupportServiceSupportTicketTypesPostRequestConfig(supportTicketTypeCreateDto: SupportTicketTypeCreateDto, tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<SupportTicketTypeCreateDto> {
        val localVariableBody = supportTicketTypeCreateDto
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (tenantId != null) {
                    put("tenantId", listOf(tenantId.toString()))
                }
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
            path = "/api/v2/SupportService/SupportTicketTypes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param supportTicketTypeId 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return EmptyEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete(supportTicketTypeId: java.util.UUID, tenantId: java.util.UUID? = null, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDeleteWithHttpInfo(supportTicketTypeId = supportTicketTypeId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EmptyEnvelope
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
     * @param supportTicketTypeId 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDeleteWithHttpInfo(supportTicketTypeId: java.util.UUID, tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDeleteRequestConfig(supportTicketTypeId = supportTicketTypeId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete
     *
     * @param supportTicketTypeId 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDeleteRequestConfig(supportTicketTypeId: java.util.UUID, tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (tenantId != null) {
                    put("tenantId", listOf(tenantId.toString()))
                }
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId}".replace("{"+"supportTicketTypeId"+"}", encodeURIComponent(supportTicketTypeId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param supportTicketTypeId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return SupportTicketTypeDtoEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet(supportTicketTypeId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : SupportTicketTypeDtoEnvelope {
        val localVarResponse = apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGetWithHttpInfo(supportTicketTypeId = supportTicketTypeId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SupportTicketTypeDtoEnvelope
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
     * @param supportTicketTypeId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<SupportTicketTypeDtoEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGetWithHttpInfo(supportTicketTypeId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<SupportTicketTypeDtoEnvelope?> {
        val localVariableConfig = apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGetRequestConfig(supportTicketTypeId = supportTicketTypeId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, SupportTicketTypeDtoEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet
     *
     * @param supportTicketTypeId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGetRequestConfig(supportTicketTypeId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId}".replace("{"+"supportTicketTypeId"+"}", encodeURIComponent(supportTicketTypeId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param supportTicketTypeId 
     * @param supportTicketTypeUpdateDto 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return EmptyEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut(supportTicketTypeId: java.util.UUID, supportTicketTypeUpdateDto: SupportTicketTypeUpdateDto, tenantId: java.util.UUID? = null, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPutWithHttpInfo(supportTicketTypeId = supportTicketTypeId, supportTicketTypeUpdateDto = supportTicketTypeUpdateDto, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EmptyEnvelope
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
     * @param supportTicketTypeId 
     * @param supportTicketTypeUpdateDto 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPutWithHttpInfo(supportTicketTypeId: java.util.UUID, supportTicketTypeUpdateDto: SupportTicketTypeUpdateDto, tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPutRequestConfig(supportTicketTypeId = supportTicketTypeId, supportTicketTypeUpdateDto = supportTicketTypeUpdateDto, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<SupportTicketTypeUpdateDto, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut
     *
     * @param supportTicketTypeId 
     * @param supportTicketTypeUpdateDto 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPutRequestConfig(supportTicketTypeId: java.util.UUID, supportTicketTypeUpdateDto: SupportTicketTypeUpdateDto, tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<SupportTicketTypeUpdateDto> {
        val localVariableBody = supportTicketTypeUpdateDto
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (tenantId != null) {
                    put("tenantId", listOf(tenantId.toString()))
                }
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
            path = "/api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId}".replace("{"+"supportTicketTypeId"+"}", encodeURIComponent(supportTicketTypeId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
