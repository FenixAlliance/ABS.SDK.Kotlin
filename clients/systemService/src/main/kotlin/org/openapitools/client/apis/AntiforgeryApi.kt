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

class AntiforgeryApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * 
     * 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2SystemServiceAntiforgeryGetAndStoreTokensGet(apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : Unit {
        val localVarResponse = apiV2SystemServiceAntiforgeryGetAndStoreTokensGetWithHttpInfo(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2SystemServiceAntiforgeryGetAndStoreTokensGetWithHttpInfo(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2SystemServiceAntiforgeryGetAndStoreTokensGetRequestConfig(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2SystemServiceAntiforgeryGetAndStoreTokensGet
     *
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2SystemServiceAntiforgeryGetAndStoreTokensGetRequestConfig(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/SystemService/Antiforgery/GetAndStoreTokens",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2SystemServiceAntiforgeryIsRequestValidGet(apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : Unit {
        val localVarResponse = apiV2SystemServiceAntiforgeryIsRequestValidGetWithHttpInfo(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2SystemServiceAntiforgeryIsRequestValidGetWithHttpInfo(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2SystemServiceAntiforgeryIsRequestValidGetRequestConfig(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2SystemServiceAntiforgeryIsRequestValidGet
     *
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun apiV2SystemServiceAntiforgeryIsRequestValidGetRequestConfig(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/SystemService/Antiforgery/IsRequestValid",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
