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
import org.openapitools.client.models.PaymentCreateDto
import org.openapitools.client.models.PaymentDtoListEnvelope
import org.openapitools.client.models.PaymentUpdateDto

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

class PaymentsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
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
     * @return PaymentDtoListEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2PaymentsServicePaymentsGet(tenantId: java.util.UUID) : PaymentDtoListEnvelope {
        val localVarResponse = apiV2PaymentsServicePaymentsGetWithHttpInfo(tenantId = tenantId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymentDtoListEnvelope
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
     * @return ApiResponse<PaymentDtoListEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2PaymentsServicePaymentsGetWithHttpInfo(tenantId: java.util.UUID) : ApiResponse<PaymentDtoListEnvelope?> {
        val localVariableConfig = apiV2PaymentsServicePaymentsGetRequestConfig(tenantId = tenantId)

        return request<Unit, PaymentDtoListEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2PaymentsServicePaymentsGet
     *
     * @param tenantId 
     * @return RequestConfig
     */
    fun apiV2PaymentsServicePaymentsGetRequestConfig(tenantId: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("tenantId", listOf(tenantId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/PaymentsService/Payments",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param paymentId 
     * @param tenantId 
     * @return EmptyEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2PaymentsServicePaymentsPaymentIdDelete(paymentId: java.util.UUID, tenantId: java.util.UUID) : EmptyEnvelope {
        val localVarResponse = apiV2PaymentsServicePaymentsPaymentIdDeleteWithHttpInfo(paymentId = paymentId, tenantId = tenantId)

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
     * @param paymentId 
     * @param tenantId 
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2PaymentsServicePaymentsPaymentIdDeleteWithHttpInfo(paymentId: java.util.UUID, tenantId: java.util.UUID) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = apiV2PaymentsServicePaymentsPaymentIdDeleteRequestConfig(paymentId = paymentId, tenantId = tenantId)

        return request<Unit, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2PaymentsServicePaymentsPaymentIdDelete
     *
     * @param paymentId 
     * @param tenantId 
     * @return RequestConfig
     */
    fun apiV2PaymentsServicePaymentsPaymentIdDeleteRequestConfig(paymentId: java.util.UUID, tenantId: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("tenantId", listOf(tenantId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v2/PaymentsService/Payments/{paymentId}".replace("{"+"paymentId"+"}", encodeURIComponent(paymentId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param paymentId 
     * @return PaymentDtoListEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun apiV2PaymentsServicePaymentsPaymentIdDetailsGet(paymentId: java.util.UUID) : PaymentDtoListEnvelope {
        @Suppress("DEPRECATION")
        val localVarResponse = apiV2PaymentsServicePaymentsPaymentIdDetailsGetWithHttpInfo(paymentId = paymentId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymentDtoListEnvelope
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
     * @param paymentId 
     * @return ApiResponse<PaymentDtoListEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun apiV2PaymentsServicePaymentsPaymentIdDetailsGetWithHttpInfo(paymentId: java.util.UUID) : ApiResponse<PaymentDtoListEnvelope?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = apiV2PaymentsServicePaymentsPaymentIdDetailsGetRequestConfig(paymentId = paymentId)

        return request<Unit, PaymentDtoListEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2PaymentsServicePaymentsPaymentIdDetailsGet
     *
     * @param paymentId 
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun apiV2PaymentsServicePaymentsPaymentIdDetailsGetRequestConfig(paymentId: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/PaymentsService/Payments/{paymentId}/Details".replace("{"+"paymentId"+"}", encodeURIComponent(paymentId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param paymentId 
     * @return PaymentDtoListEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2PaymentsServicePaymentsPaymentIdGet(paymentId: java.util.UUID) : PaymentDtoListEnvelope {
        val localVarResponse = apiV2PaymentsServicePaymentsPaymentIdGetWithHttpInfo(paymentId = paymentId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymentDtoListEnvelope
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
     * @param paymentId 
     * @return ApiResponse<PaymentDtoListEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2PaymentsServicePaymentsPaymentIdGetWithHttpInfo(paymentId: java.util.UUID) : ApiResponse<PaymentDtoListEnvelope?> {
        val localVariableConfig = apiV2PaymentsServicePaymentsPaymentIdGetRequestConfig(paymentId = paymentId)

        return request<Unit, PaymentDtoListEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2PaymentsServicePaymentsPaymentIdGet
     *
     * @param paymentId 
     * @return RequestConfig
     */
    fun apiV2PaymentsServicePaymentsPaymentIdGetRequestConfig(paymentId: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/PaymentsService/Payments/{paymentId}".replace("{"+"paymentId"+"}", encodeURIComponent(paymentId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param paymentId 
     * @param tenantId 
     * @param paymentUpdateDto  (optional)
     * @return EmptyEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2PaymentsServicePaymentsPaymentIdPut(paymentId: java.util.UUID, tenantId: java.util.UUID, paymentUpdateDto: PaymentUpdateDto? = null) : EmptyEnvelope {
        val localVarResponse = apiV2PaymentsServicePaymentsPaymentIdPutWithHttpInfo(paymentId = paymentId, tenantId = tenantId, paymentUpdateDto = paymentUpdateDto)

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
     * @param paymentId 
     * @param tenantId 
     * @param paymentUpdateDto  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2PaymentsServicePaymentsPaymentIdPutWithHttpInfo(paymentId: java.util.UUID, tenantId: java.util.UUID, paymentUpdateDto: PaymentUpdateDto?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = apiV2PaymentsServicePaymentsPaymentIdPutRequestConfig(paymentId = paymentId, tenantId = tenantId, paymentUpdateDto = paymentUpdateDto)

        return request<PaymentUpdateDto, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2PaymentsServicePaymentsPaymentIdPut
     *
     * @param paymentId 
     * @param tenantId 
     * @param paymentUpdateDto  (optional)
     * @return RequestConfig
     */
    fun apiV2PaymentsServicePaymentsPaymentIdPutRequestConfig(paymentId: java.util.UUID, tenantId: java.util.UUID, paymentUpdateDto: PaymentUpdateDto?) : RequestConfig<PaymentUpdateDto> {
        val localVariableBody = paymentUpdateDto
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("tenantId", listOf(tenantId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v2/PaymentsService/Payments/{paymentId}".replace("{"+"paymentId"+"}", encodeURIComponent(paymentId.toString())),
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
     * @param paymentCreateDto  (optional)
     * @return EmptyEnvelope
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2PaymentsServicePaymentsPost(tenantId: java.util.UUID, paymentCreateDto: PaymentCreateDto? = null) : EmptyEnvelope {
        val localVarResponse = apiV2PaymentsServicePaymentsPostWithHttpInfo(tenantId = tenantId, paymentCreateDto = paymentCreateDto)

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
     * @param paymentCreateDto  (optional)
     * @return ApiResponse<EmptyEnvelope?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2PaymentsServicePaymentsPostWithHttpInfo(tenantId: java.util.UUID, paymentCreateDto: PaymentCreateDto?) : ApiResponse<EmptyEnvelope?> {
        val localVariableConfig = apiV2PaymentsServicePaymentsPostRequestConfig(tenantId = tenantId, paymentCreateDto = paymentCreateDto)

        return request<PaymentCreateDto, EmptyEnvelope>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2PaymentsServicePaymentsPost
     *
     * @param tenantId 
     * @param paymentCreateDto  (optional)
     * @return RequestConfig
     */
    fun apiV2PaymentsServicePaymentsPostRequestConfig(tenantId: java.util.UUID, paymentCreateDto: PaymentCreateDto?) : RequestConfig<PaymentCreateDto> {
        val localVariableBody = paymentCreateDto
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("tenantId", listOf(tenantId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/PaymentsService/Payments",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
