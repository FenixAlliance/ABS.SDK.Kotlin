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

class AvatarsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Get the avatar for a given social profile.
     * 
     * @param socialProfileId 
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
    fun getAvatar(socialProfileId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = getAvatarWithHttpInfo(socialProfileId = socialProfileId, apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * Get the avatar for a given social profile.
     * 
     * @param socialProfileId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAvatarWithHttpInfo(socialProfileId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = getAvatarRequestConfig(socialProfileId = socialProfileId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAvatar
     *
     * @param socialProfileId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun getAvatarRequestConfig(socialProfileId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/StorageService/Avatars/{socialProfileId}".replace("{"+"socialProfileId"+"}", encodeURIComponent(socialProfileId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get the avatar for a given contact.
     * 
     * @param contactId 
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
    fun getContactAvatar(contactId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = getContactAvatarWithHttpInfo(contactId = contactId, apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * Get the avatar for a given contact.
     * 
     * @param contactId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getContactAvatarWithHttpInfo(contactId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = getContactAvatarRequestConfig(contactId = contactId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getContactAvatar
     *
     * @param contactId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun getContactAvatarRequestConfig(contactId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/StorageService/Avatars/Contact/{contactId}".replace("{"+"contactId"+"}", encodeURIComponent(contactId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get the avatar for the current user.
     * 
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
    fun getCurrentUserAvatar(apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = getCurrentUserAvatarWithHttpInfo(apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * Get the avatar for the current user.
     * 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getCurrentUserAvatarWithHttpInfo(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = getCurrentUserAvatarRequestConfig(apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getCurrentUserAvatar
     *
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun getCurrentUserAvatarRequestConfig(apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/StorageService/Avatars/User",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get the avatar for a given tenant.
     * 
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
    fun getTenantAvatar(tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = getTenantAvatarWithHttpInfo(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * Get the avatar for a given tenant.
     * 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getTenantAvatarWithHttpInfo(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = getTenantAvatarRequestConfig(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTenantAvatar
     *
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun getTenantAvatarRequestConfig(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/StorageService/Avatars/Tenant/{tenantId}".replace("{"+"tenantId"+"}", encodeURIComponent(tenantId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get the avatar for a given user.
     * 
     * @param userId 
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
    fun getUserAvatar(userId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null) : EmptyEnvelope {
        val localVarResponse = getUserAvatarWithHttpInfo(userId = userId, apiVersion = apiVersion, xApiVersion = xApiVersion)

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
     * Get the avatar for a given user.
     * 
     * @param userId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getUserAvatarWithHttpInfo(userId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = getUserAvatarRequestConfig(userId = userId, apiVersion = apiVersion, xApiVersion = xApiVersion)

        return request<Unit, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getUserAvatar
     *
     * @param userId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @return RequestConfig
     */
    fun getUserAvatarRequestConfig(userId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v2/StorageService/Avatars/User/{userId}".replace("{"+"userId"+"}", encodeURIComponent(userId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update the avatar for a given contact.
     * 
     * @param contactId 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param avatar  (optional)
     * @return EmptyEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateContactAvatar(contactId: java.util.UUID, tenantId: java.util.UUID? = null, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null, avatar: java.io.File? = null) : EmptyEnvelope {
        val localVarResponse = updateContactAvatarWithHttpInfo(contactId = contactId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion, avatar = avatar)

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
     * Update the avatar for a given contact.
     * 
     * @param contactId 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param avatar  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateContactAvatarWithHttpInfo(contactId: java.util.UUID, tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?, avatar: java.io.File?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = updateContactAvatarRequestConfig(contactId = contactId, tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion, avatar = avatar)

        return request<Map<String, PartConfig<*>>, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateContactAvatar
     *
     * @param contactId 
     * @param tenantId  (optional)
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param avatar  (optional)
     * @return RequestConfig
     */
    fun updateContactAvatarRequestConfig(contactId: java.util.UUID, tenantId: java.util.UUID?, apiVersion: kotlin.String?, xApiVersion: kotlin.String?, avatar: java.io.File?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "avatar" to PartConfig(body = avatar, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (tenantId != null) {
                    put("tenantId", listOf(tenantId.toString()))
                }
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/StorageService/Avatars/Contacts/{contactId}".replace("{"+"contactId"+"}", encodeURIComponent(contactId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update the avatar for a given tenant.
     * 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param avatar  (optional)
     * @return EmptyEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateTenantAvatar(tenantId: java.util.UUID, apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null, avatar: java.io.File? = null) : EmptyEnvelope {
        val localVarResponse = updateTenantAvatarWithHttpInfo(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion, avatar = avatar)

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
     * Update the avatar for a given tenant.
     * 
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param avatar  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateTenantAvatarWithHttpInfo(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?, avatar: java.io.File?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = updateTenantAvatarRequestConfig(tenantId = tenantId, apiVersion = apiVersion, xApiVersion = xApiVersion, avatar = avatar)

        return request<Map<String, PartConfig<*>>, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateTenantAvatar
     *
     * @param tenantId 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param avatar  (optional)
     * @return RequestConfig
     */
    fun updateTenantAvatarRequestConfig(tenantId: java.util.UUID, apiVersion: kotlin.String?, xApiVersion: kotlin.String?, avatar: java.io.File?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "avatar" to PartConfig(body = avatar, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/StorageService/Avatars/Tenant/{tenantId}".replace("{"+"tenantId"+"}", encodeURIComponent(tenantId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update the avatar for the current user.
     * 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param avatar  (optional)
     * @return EmptyEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateUserAvatar(apiVersion: kotlin.String? = null, xApiVersion: kotlin.String? = null, avatar: java.io.File? = null) : EmptyEnvelope {
        val localVarResponse = updateUserAvatarWithHttpInfo(apiVersion = apiVersion, xApiVersion = xApiVersion, avatar = avatar)

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
     * Update the avatar for the current user.
     * 
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param avatar  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateUserAvatarWithHttpInfo(apiVersion: kotlin.String?, xApiVersion: kotlin.String?, avatar: java.io.File?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = updateUserAvatarRequestConfig(apiVersion = apiVersion, xApiVersion = xApiVersion, avatar = avatar)

        return request<Map<String, PartConfig<*>>, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateUserAvatar
     *
     * @param apiVersion  (optional)
     * @param xApiVersion  (optional)
     * @param avatar  (optional)
     * @return RequestConfig
     */
    fun updateUserAvatarRequestConfig(apiVersion: kotlin.String?, xApiVersion: kotlin.String?, avatar: java.io.File?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "avatar" to PartConfig(body = avatar, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (apiVersion != null) {
                    put("api-version", listOf(apiVersion.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")
        xApiVersion?.apply { localVariableHeaders["x-api-version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/StorageService/Avatars/User",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
