# PortalsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countPortalsAsync**](PortalsApi.md#countPortalsAsync) | **GET** /api/v2/ContentService/Portals/Count | Count portals |
| [**createWebPortalAsync**](PortalsApi.md#createWebPortalAsync) | **POST** /api/v2/ContentService/Portals | Create a new web portal |
| [**deleteWebPortalAsync**](PortalsApi.md#deleteWebPortalAsync) | **DELETE** /api/v2/ContentService/Portals/{portalId} | Delete a web portal |
| [**getCurrentWebPortalAsync**](PortalsApi.md#getCurrentWebPortalAsync) | **GET** /api/v2/ContentService/Portals/Current | Get the current portal |
| [**getCurrentWebPortalOptionsAsync**](PortalsApi.md#getCurrentWebPortalOptionsAsync) | **GET** /api/v2/ContentService/Portals/Current/Options | Get the current portal&#39;s options |
| [**getPortalsAsync**](PortalsApi.md#getPortalsAsync) | **GET** /api/v2/ContentService/Portals | Get portals |
| [**getRootWebPortalAsync**](PortalsApi.md#getRootWebPortalAsync) | **GET** /api/v2/ContentService/Portals/Root | Get the root portal |
| [**getWebPortalByIdAsync**](PortalsApi.md#getWebPortalByIdAsync) | **GET** /api/v2/ContentService/Portals/{portalId} | Get a web portal by its ID |
| [**getWebPortalOptionsAsync**](PortalsApi.md#getWebPortalOptionsAsync) | **GET** /api/v2/ContentService/Portals/{portalId}/Options | Get a web portal&#39;s options by its ID |
| [**getWebPortalSettingsAsync**](PortalsApi.md#getWebPortalSettingsAsync) | **GET** /api/v2/ContentService/Portals/{portalId}/Settings | Get a web portal&#39;s settings by its ID |
| [**initializeCurrentWebPortalAsync**](PortalsApi.md#initializeCurrentWebPortalAsync) | **POST** /api/v2/ContentService/Portals/Initialize | Initialize the current portal |
| [**patchWebPortalAsync**](PortalsApi.md#patchWebPortalAsync) | **PATCH** /api/v2/ContentService/Portals/{portalId} | Partially update a web portal |
| [**searchWebPortalAsync**](PortalsApi.md#searchWebPortalAsync) | **GET** /api/v2/ContentService/Portals/Search | Search for a portal by its domain |
| [**updateWebPortalAsync**](PortalsApi.md#updateWebPortalAsync) | **PUT** /api/v2/ContentService/Portals/{portalId} | Update an existing web portal |


<a id="countPortalsAsync"></a>
# **countPortalsAsync**
> Int32Envelope countPortalsAsync(tenantId, apiVersion, xApiVersion)

Count portals

Counts all portals for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countPortalsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#countPortalsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#countPortalsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
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

<a id="createWebPortalAsync"></a>
# **createWebPortalAsync**
> EmptyEnvelope createWebPortalAsync(tenantId, apiVersion, xApiVersion, webPortalCreateDto)

Create a new web portal

Create a new web portal

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPortalCreateDto : WebPortalCreateDto =  // WebPortalCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWebPortalAsync(tenantId, apiVersion, xApiVersion, webPortalCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#createWebPortalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#createWebPortalAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPortalCreateDto** | [**WebPortalCreateDto**](WebPortalCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWebPortalAsync"></a>
# **deleteWebPortalAsync**
> EmptyEnvelope deleteWebPortalAsync(portalId, tenantId, apiVersion, xApiVersion)

Delete a web portal

Delete a web portal

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWebPortalAsync(portalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#deleteWebPortalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#deleteWebPortalAsync")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCurrentWebPortalAsync"></a>
# **getCurrentWebPortalAsync**
> WebPortalDtoEnvelope getCurrentWebPortalAsync(apiVersion, xApiVersion)

Get the current portal

Get the current portal of the this server instance

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPortalDtoEnvelope = apiInstance.getCurrentWebPortalAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#getCurrentWebPortalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#getCurrentWebPortalAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPortalDtoEnvelope**](WebPortalDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCurrentWebPortalOptionsAsync"></a>
# **getCurrentWebPortalOptionsAsync**
> PortalOptionsEnvelope getCurrentWebPortalOptionsAsync(apiVersion, xApiVersion)

Get the current portal&#39;s options

Get the current portal&#39;s options for the current user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PortalOptionsEnvelope = apiInstance.getCurrentWebPortalOptionsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#getCurrentWebPortalOptionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#getCurrentWebPortalOptionsAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PortalOptionsEnvelope**](PortalOptionsEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPortalsAsync"></a>
# **getPortalsAsync**
> WebPortalDtoListEnvelope getPortalsAsync(tenantId, apiVersion, xApiVersion)

Get portals

Retrieves all portals for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPortalDtoListEnvelope = apiInstance.getPortalsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#getPortalsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#getPortalsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPortalDtoListEnvelope**](WebPortalDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRootWebPortalAsync"></a>
# **getRootWebPortalAsync**
> WebPortalDtoEnvelope getRootWebPortalAsync(apiVersion, xApiVersion)

Get the root portal

Get the root portal of the this server instance

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPortalDtoEnvelope = apiInstance.getRootWebPortalAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#getRootWebPortalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#getRootWebPortalAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPortalDtoEnvelope**](WebPortalDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebPortalByIdAsync"></a>
# **getWebPortalByIdAsync**
> WebPortalDtoEnvelope getWebPortalByIdAsync(portalId, apiVersion, xApiVersion)

Get a web portal by its ID

Get a web portal by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPortalDtoEnvelope = apiInstance.getWebPortalByIdAsync(portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#getWebPortalByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#getWebPortalByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPortalDtoEnvelope**](WebPortalDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebPortalOptionsAsync"></a>
# **getWebPortalOptionsAsync**
> PortalOptionsEnvelope getWebPortalOptionsAsync(portalId, apiVersion, xApiVersion)

Get a web portal&#39;s options by its ID

Get a web portal&#39;s options by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PortalOptionsEnvelope = apiInstance.getWebPortalOptionsAsync(portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#getWebPortalOptionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#getWebPortalOptionsAsync")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PortalOptionsEnvelope**](PortalOptionsEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebPortalSettingsAsync"></a>
# **getWebPortalSettingsAsync**
> PortalSettingsEnvelope getWebPortalSettingsAsync(portalId, apiVersion, xApiVersion)

Get a web portal&#39;s settings by its ID

Get a web portal&#39;s settings by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PortalSettingsEnvelope = apiInstance.getWebPortalSettingsAsync(portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#getWebPortalSettingsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#getWebPortalSettingsAsync")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PortalSettingsEnvelope**](PortalSettingsEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="initializeCurrentWebPortalAsync"></a>
# **initializeCurrentWebPortalAsync**
> WebPortalDtoEnvelope initializeCurrentWebPortalAsync(apiVersion, xApiVersion)

Initialize the current portal

Initialize the current portal for the current user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPortalDtoEnvelope = apiInstance.initializeCurrentWebPortalAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#initializeCurrentWebPortalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#initializeCurrentWebPortalAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPortalDtoEnvelope**](WebPortalDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchWebPortalAsync"></a>
# **patchWebPortalAsync**
> EmptyEnvelope patchWebPortalAsync(portalId, tenantId, apiVersion, xApiVersion, operation)

Partially update a web portal

Partially update a web portal

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchWebPortalAsync(portalId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#patchWebPortalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#patchWebPortalAsync")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
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

<a id="searchWebPortalAsync"></a>
# **searchWebPortalAsync**
> WebPortalDtoEnvelope searchWebPortalAsync(domain, apiVersion, xApiVersion)

Search for a portal by its domain

Search for a portal by its domain

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val domain : kotlin.String = domain_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPortalDtoEnvelope = apiInstance.searchWebPortalAsync(domain, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#searchWebPortalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#searchWebPortalAsync")
    e.printStackTrace()
}
```

### Parameters
| **domain** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPortalDtoEnvelope**](WebPortalDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateWebPortalAsync"></a>
# **updateWebPortalAsync**
> EmptyEnvelope updateWebPortalAsync(portalId, tenantId, apiVersion, xApiVersion, webPortalUpdateDto)

Update an existing web portal

Update an existing web portal

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPortalUpdateDto : WebPortalUpdateDto =  // WebPortalUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWebPortalAsync(portalId, tenantId, apiVersion, xApiVersion, webPortalUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#updateWebPortalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#updateWebPortalAsync")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPortalUpdateDto** | [**WebPortalUpdateDto**](WebPortalUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

