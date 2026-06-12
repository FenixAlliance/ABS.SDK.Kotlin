# NonFungibleTokensApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createNonFungibleTokenAsync**](NonFungibleTokensApi.md#createNonFungibleTokenAsync) | **POST** /api/v2/BlockchainsService/NonFungibleTokens | Create a new NFT |
| [**deleteNonFungibleTokenAsync**](NonFungibleTokensApi.md#deleteNonFungibleTokenAsync) | **DELETE** /api/v2/BlockchainsService/NonFungibleTokens/{id} | Delete an NFT |
| [**getNonFungibleTokenByIdAsync**](NonFungibleTokensApi.md#getNonFungibleTokenByIdAsync) | **GET** /api/v2/BlockchainsService/NonFungibleTokens/{id} | Get NFT by ID |
| [**getNonFungibleTokensAsync**](NonFungibleTokensApi.md#getNonFungibleTokensAsync) | **GET** /api/v2/BlockchainsService/NonFungibleTokens | Get all non-fungible tokens |
| [**getNonFungibleTokensCountAsync**](NonFungibleTokensApi.md#getNonFungibleTokensCountAsync) | **GET** /api/v2/BlockchainsService/NonFungibleTokens/Count | Get NFTs count |
| [**patchNonFungibleTokenAsync**](NonFungibleTokensApi.md#patchNonFungibleTokenAsync) | **PATCH** /api/v2/BlockchainsService/NonFungibleTokens/{id} | Patch a non-fungible token |
| [**updateNonFungibleTokenAsync**](NonFungibleTokensApi.md#updateNonFungibleTokenAsync) | **PUT** /api/v2/BlockchainsService/NonFungibleTokens/{id} | Update an NFT |


<a id="createNonFungibleTokenAsync"></a>
# **createNonFungibleTokenAsync**
> createNonFungibleTokenAsync(tenantId, apiVersion, xApiVersion, nonFungibleTokenCreateDto)

Create a new NFT

Creates a new non-fungible token for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonFungibleTokensApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val nonFungibleTokenCreateDto : NonFungibleTokenCreateDto =  // NonFungibleTokenCreateDto | 
try {
    apiInstance.createNonFungibleTokenAsync(tenantId, apiVersion, xApiVersion, nonFungibleTokenCreateDto)
} catch (e: ClientException) {
    println("4xx response calling NonFungibleTokensApi#createNonFungibleTokenAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonFungibleTokensApi#createNonFungibleTokenAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nonFungibleTokenCreateDto** | [**NonFungibleTokenCreateDto**](NonFungibleTokenCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteNonFungibleTokenAsync"></a>
# **deleteNonFungibleTokenAsync**
> deleteNonFungibleTokenAsync(id, tenantId, apiVersion, xApiVersion)

Delete an NFT

Deletes a non-fungible token for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonFungibleTokensApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteNonFungibleTokenAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling NonFungibleTokensApi#deleteNonFungibleTokenAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonFungibleTokensApi#deleteNonFungibleTokenAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getNonFungibleTokenByIdAsync"></a>
# **getNonFungibleTokenByIdAsync**
> NonFungibleTokenDto getNonFungibleTokenByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get NFT by ID

Retrieves a specific non-fungible token by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonFungibleTokensApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : NonFungibleTokenDto = apiInstance.getNonFungibleTokenByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NonFungibleTokensApi#getNonFungibleTokenByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonFungibleTokensApi#getNonFungibleTokenByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**NonFungibleTokenDto**](NonFungibleTokenDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getNonFungibleTokensAsync"></a>
# **getNonFungibleTokensAsync**
> NonFungibleTokenDtoListEnvelope getNonFungibleTokensAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)

Get all non-fungible tokens

Retrieves all NFTs for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonFungibleTokensApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val oDataQueryOptions : NonFungibleTokenDtoODataQueryOptions =  // NonFungibleTokenDtoODataQueryOptions | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : NonFungibleTokenDtoListEnvelope = apiInstance.getNonFungibleTokensAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NonFungibleTokensApi#getNonFungibleTokensAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonFungibleTokensApi#getNonFungibleTokensAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **oDataQueryOptions** | [**NonFungibleTokenDtoODataQueryOptions**](.md)|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**NonFungibleTokenDtoListEnvelope**](NonFungibleTokenDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getNonFungibleTokensCountAsync"></a>
# **getNonFungibleTokensCountAsync**
> Int32Envelope getNonFungibleTokensCountAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)

Get NFTs count

Returns the count of NFTs for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonFungibleTokensApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val oDataQueryOptions : NonFungibleTokenDtoODataQueryOptions =  // NonFungibleTokenDtoODataQueryOptions | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getNonFungibleTokensCountAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NonFungibleTokensApi#getNonFungibleTokensCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonFungibleTokensApi#getNonFungibleTokensCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **oDataQueryOptions** | [**NonFungibleTokenDtoODataQueryOptions**](.md)|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchNonFungibleTokenAsync"></a>
# **patchNonFungibleTokenAsync**
> EmptyEnvelope patchNonFungibleTokenAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a non-fungible token

Patch a non-fungible token

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonFungibleTokensApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchNonFungibleTokenAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NonFungibleTokensApi#patchNonFungibleTokenAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonFungibleTokensApi#patchNonFungibleTokenAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateNonFungibleTokenAsync"></a>
# **updateNonFungibleTokenAsync**
> updateNonFungibleTokenAsync(id, tenantId, apiVersion, xApiVersion, nonFungibleTokenUpdateDto)

Update an NFT

Updates an existing non-fungible token for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonFungibleTokensApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val nonFungibleTokenUpdateDto : NonFungibleTokenUpdateDto =  // NonFungibleTokenUpdateDto | 
try {
    apiInstance.updateNonFungibleTokenAsync(id, tenantId, apiVersion, xApiVersion, nonFungibleTokenUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling NonFungibleTokensApi#updateNonFungibleTokenAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonFungibleTokensApi#updateNonFungibleTokenAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nonFungibleTokenUpdateDto** | [**NonFungibleTokenUpdateDto**](NonFungibleTokenUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

