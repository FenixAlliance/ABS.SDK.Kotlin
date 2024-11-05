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
import org.openapitools.client.models.MarketingListCreateDto
import org.openapitools.client.models.MarketingListDtoEnvelope
import org.openapitools.client.models.MarketingListDtoListEnvelope
import org.openapitools.client.models.MarketingListUpdateDto

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

class MarketingListsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
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
     * @return Int32Envelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2MarketingServiceMarketingListsCountGet(tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : Int32Envelope {
        val localVarResponse = apiV2MarketingServiceMarketingListsCountGetWithHttpInfo(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<Int32Envelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2MarketingServiceMarketingListsCountGetWithHttpInfo(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<Int32Envelope?> {
        val localVariableConfig = apiV2MarketingServiceMarketingListsCountGetRequestConfig(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, Int32Envelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2MarketingServiceMarketingListsCountGet
     *
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2MarketingServiceMarketingListsCountGetRequestConfig(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/MarketingService/MarketingLists/Count",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return MarketingListDtoListEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2MarketingServiceMarketingListsGet(tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : MarketingListDtoListEnvelope {
        val localVarResponse = apiV2MarketingServiceMarketingListsGetWithHttpInfo(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MarketingListDtoListEnvelope
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
     * @return ApiResponse<MarketingListDtoListEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2MarketingServiceMarketingListsGetWithHttpInfo(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<MarketingListDtoListEnvelope?> {
        val localVariableConfig = apiV2MarketingServiceMarketingListsGetRequestConfig(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, MarketingListDtoListEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2MarketingServiceMarketingListsGet
     *
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2MarketingServiceMarketingListsGetRequestConfig(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/MarketingService/MarketingLists",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param marketinglistId 
     * @param tenantId 
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
    fun apiV2MarketingServiceMarketingListsMarketinglistIdDelete(marketinglistId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = apiV2MarketingServiceMarketingListsMarketinglistIdDeleteWithHttpInfo(marketinglistId = marketinglistId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * @param marketinglistId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2MarketingServiceMarketingListsMarketinglistIdDeleteWithHttpInfo(marketinglistId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = apiV2MarketingServiceMarketingListsMarketinglistIdDeleteRequestConfig(marketinglistId = marketinglistId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2MarketingServiceMarketingListsMarketinglistIdDelete
     *
     * @param marketinglistId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2MarketingServiceMarketingListsMarketinglistIdDeleteRequestConfig(marketinglistId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/MarketingService/MarketingLists/{marketinglistId}".replace("{"+"marketinglistId"+"}", encodeURIComponent(marketinglistId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param marketinglistId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return MarketingListDtoEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2MarketingServiceMarketingListsMarketinglistIdGet(marketinglistId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : MarketingListDtoEnvelope {
        val localVarResponse = apiV2MarketingServiceMarketingListsMarketinglistIdGetWithHttpInfo(marketinglistId = marketinglistId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MarketingListDtoEnvelope
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
     * @param marketinglistId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<MarketingListDtoEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2MarketingServiceMarketingListsMarketinglistIdGetWithHttpInfo(marketinglistId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<MarketingListDtoEnvelope?> {
        val localVariableConfig = apiV2MarketingServiceMarketingListsMarketinglistIdGetRequestConfig(marketinglistId = marketinglistId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, MarketingListDtoEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2MarketingServiceMarketingListsMarketinglistIdGet
     *
     * @param marketinglistId 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2MarketingServiceMarketingListsMarketinglistIdGetRequestConfig(marketinglistId: java.util.UUID, tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/MarketingService/MarketingLists/{marketinglistId}".replace("{"+"marketinglistId"+"}", encodeURIComponent(marketinglistId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param marketinglistId 
     * @param tenantId 
     * @param marketingListUpdateDto 
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
    fun apiV2MarketingServiceMarketingListsMarketinglistIdPut(marketinglistId: java.util.UUID, tenantId: java.util.UUID, marketingListUpdateDto: MarketingListUpdateDto, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = apiV2MarketingServiceMarketingListsMarketinglistIdPutWithHttpInfo(marketinglistId = marketinglistId, tenantId = tenantId, marketingListUpdateDto = marketingListUpdateDto, apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * @param marketinglistId 
     * @param tenantId 
     * @param marketingListUpdateDto 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2MarketingServiceMarketingListsMarketinglistIdPutWithHttpInfo(marketinglistId: java.util.UUID, tenantId: java.util.UUID, marketingListUpdateDto: MarketingListUpdateDto, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = apiV2MarketingServiceMarketingListsMarketinglistIdPutRequestConfig(marketinglistId = marketinglistId, tenantId = tenantId, marketingListUpdateDto = marketingListUpdateDto, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<MarketingListUpdateDto, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2MarketingServiceMarketingListsMarketinglistIdPut
     *
     * @param marketinglistId 
     * @param tenantId 
     * @param marketingListUpdateDto 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2MarketingServiceMarketingListsMarketinglistIdPutRequestConfig(marketinglistId: java.util.UUID, tenantId: java.util.UUID, marketingListUpdateDto: MarketingListUpdateDto, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<MarketingListUpdateDto> {
        val localVariableBody = marketingListUpdateDto
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
            path = "/api/v2/MarketingService/MarketingLists/{marketinglistId}".replace("{"+"marketinglistId"+"}", encodeURIComponent(marketinglistId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param tenantId 
     * @param marketingListCreateDto 
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
    fun apiV2MarketingServiceMarketingListsPost(tenantId: java.util.UUID, marketingListCreateDto: MarketingListCreateDto, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = apiV2MarketingServiceMarketingListsPostWithHttpInfo(tenantId = tenantId, marketingListCreateDto = marketingListCreateDto, apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * @param tenantId 
     * @param marketingListCreateDto 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2MarketingServiceMarketingListsPostWithHttpInfo(tenantId: java.util.UUID, marketingListCreateDto: MarketingListCreateDto, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = apiV2MarketingServiceMarketingListsPostRequestConfig(tenantId = tenantId, marketingListCreateDto = marketingListCreateDto, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<MarketingListCreateDto, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2MarketingServiceMarketingListsPost
     *
     * @param tenantId 
     * @param marketingListCreateDto 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2MarketingServiceMarketingListsPostRequestConfig(tenantId: java.util.UUID, marketingListCreateDto: MarketingListCreateDto, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<MarketingListCreateDto> {
        val localVariableBody = marketingListCreateDto
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
            path = "/api/v2/MarketingService/MarketingLists",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}