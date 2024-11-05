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
import org.openapitools.client.models.ExtendedTenantDtoListEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.TenantCreateDto
import org.openapitools.client.models.TenantDtoEnvelope
import org.openapitools.client.models.TenantDtoListEnvelope
import org.openapitools.client.models.TenantUpdateDto

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

class TenantsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Create a new tenant.
     * This action is only available for global administrators.
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param tenantCreateDto  (optional)
     * @return TenantDtoEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createTenant(apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null, tenantCreateDto: TenantCreateDto? = null) : TenantDtoEnvelope {
        val localVarResponse = createTenantWithHttpInfo(apiVersion = apiVersion, xApiVersion = xApiVersion, tenantCreateDto = tenantCreateDto)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TenantDtoEnvelope
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
     * Create a new tenant.
     * This action is only available for global administrators.
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param tenantCreateDto  (optional)
     * @return ApiResponse<TenantDtoEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createTenantWithHttpInfo(apiVersion: kotlin.String?, xApiVersion: kotlin.String?, tenantCreateDto: TenantCreateDto?) : ApiResponse<TenantDtoEnvelope?> {
        val localVariableConfig = createTenantRequestConfig(apiVersion = apiVersion, xApiVersion = xApiVersion, tenantCreateDto = tenantCreateDto)

        return request<TenantCreateDto, TenantDtoEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createTenant
     *
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param tenantCreateDto  (optional)
     * @return RequestConfig
     */
    fun createTenantRequestConfig(apiVersion: kotlin.String?, xApiVersion: kotlin.String?, tenantCreateDto: TenantCreateDto?) : RequestConfig<TenantCreateDto> {
        val localVariableBody = tenantCreateDto
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
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
            path = "/api/v2/SystemService/Tenants",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete a specific tenant by ID.
     * This action is only available for global administrators.
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
    fun deleteTenant(tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = deleteTenantWithHttpInfo(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * Delete a specific tenant by ID.
     * This action is only available for global administrators.
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteTenantWithHttpInfo(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = deleteTenantRequestConfig(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteTenant
     *
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun deleteTenantRequestConfig(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            method = RequestMethod.DELETE,
            path = "/api/v2/SystemService/Tenants/{tenantId}".replace("{"+"tenantId"+"}", encodeURIComponent(tenantId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get all extended tenants available on this suite server instance.
     * This action is only available for global administrators.
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ExtendedTenantDtoListEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAllExtendedTenants(apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : ExtendedTenantDtoListEnvelope {
        val localVarResponse = getAllExtendedTenantsWithHttpInfo(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ExtendedTenantDtoListEnvelope
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
     * Get all extended tenants available on this suite server instance.
     * This action is only available for global administrators.
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<ExtendedTenantDtoListEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAllExtendedTenantsWithHttpInfo(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<ExtendedTenantDtoListEnvelope?> {
        val localVariableConfig = getAllExtendedTenantsRequestConfig(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, ExtendedTenantDtoListEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAllExtendedTenants
     *
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun getAllExtendedTenantsRequestConfig(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/SystemService/Tenants/Extended",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get all tenants available on this suite server instance.
     * This action is only available for global administrators.
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return TenantDtoListEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAllTenants(apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : TenantDtoListEnvelope {
        val localVarResponse = getAllTenantsWithHttpInfo(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TenantDtoListEnvelope
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
     * Get all tenants available on this suite server instance.
     * This action is only available for global administrators.
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<TenantDtoListEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAllTenantsWithHttpInfo(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<TenantDtoListEnvelope?> {
        val localVariableConfig = getAllTenantsRequestConfig(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, TenantDtoListEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAllTenants
     *
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun getAllTenantsRequestConfig(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/SystemService/Tenants",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get the total count of extended tenants available on this suite server instance.
     * This action is only available for global administrators.
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
    fun getExtendedTenantsCount(apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : Int32Envelope {
        val localVarResponse = getExtendedTenantsCountWithHttpInfo(apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * Get the total count of extended tenants available on this suite server instance.
     * This action is only available for global administrators.
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<Int32Envelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getExtendedTenantsCountWithHttpInfo(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<Int32Envelope?> {
        val localVariableConfig = getExtendedTenantsCountRequestConfig(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, Int32Envelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getExtendedTenantsCount
     *
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun getExtendedTenantsCountRequestConfig(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/SystemService/Tenants/Extended/Count",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get a specific tenant by ID.
     * This action is only available for global administrators.
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return TenantDtoEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTenant(tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : TenantDtoEnvelope {
        val localVarResponse = getTenantWithHttpInfo(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TenantDtoEnvelope
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
     * Get a specific tenant by ID.
     * This action is only available for global administrators.
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<TenantDtoEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getTenantWithHttpInfo(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<TenantDtoEnvelope?> {
        val localVariableConfig = getTenantRequestConfig(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, TenantDtoEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTenant
     *
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun getTenantRequestConfig(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/SystemService/Tenants/{tenantId}".replace("{"+"tenantId"+"}", encodeURIComponent(tenantId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get the total count of tenants available on this suite server instance.
     * This action is only available for global administrators.
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
    fun getTenantsCount(apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : Int32Envelope {
        val localVarResponse = getTenantsCountWithHttpInfo(apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * Get the total count of tenants available on this suite server instance.
     * This action is only available for global administrators.
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<Int32Envelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getTenantsCountWithHttpInfo(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<Int32Envelope?> {
        val localVariableConfig = getTenantsCountRequestConfig(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, Int32Envelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTenantsCount
     *
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun getTenantsCountRequestConfig(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/SystemService/Tenants/Count",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update a specific tenant by ID.
     * This action is only available for global administrators.
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param tenantUpdateDto  (optional)
     * @return TenantDtoEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateTenant(tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null, tenantUpdateDto: TenantUpdateDto? = null) : TenantDtoEnvelope {
        val localVarResponse = updateTenantWithHttpInfo(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion, tenantUpdateDto = tenantUpdateDto)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TenantDtoEnvelope
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
     * Update a specific tenant by ID.
     * This action is only available for global administrators.
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param tenantUpdateDto  (optional)
     * @return ApiResponse<TenantDtoEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateTenantWithHttpInfo(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?, tenantUpdateDto: TenantUpdateDto?) : ApiResponse<TenantDtoEnvelope?> {
        val localVariableConfig = updateTenantRequestConfig(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion, tenantUpdateDto = tenantUpdateDto)

        return request<TenantUpdateDto, TenantDtoEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateTenant
     *
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param tenantUpdateDto  (optional)
     * @return RequestConfig
     */
    fun updateTenantRequestConfig(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?, tenantUpdateDto: TenantUpdateDto?) : RequestConfig<TenantUpdateDto> {
        val localVariableBody = tenantUpdateDto
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
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
            path = "/api/v2/SystemService/Tenants/{tenantId}".replace("{"+"tenantId"+"}", encodeURIComponent(tenantId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
