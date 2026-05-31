# TeamsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantTeam**](TeamsApi.md#createTenantTeam) | **POST** /api/v2/TenantsService/Teams | Create a new tenant team |
| [**deleteTenantTeam**](TeamsApi.md#deleteTenantTeam) | **DELETE** /api/v2/TenantsService/Teams/{tenantTeamId} | Delete a tenant team |
| [**getTenantTeamById**](TeamsApi.md#getTenantTeamById) | **GET** /api/v2/TenantsService/Teams/{tenantTeamId} | Retrieve a single tenant team by its ID |
| [**getTenantTeams**](TeamsApi.md#getTenantTeams) | **GET** /api/v2/TenantsService/Teams | Retrieve a list of tenant teams |
| [**getTenantTeamsCount**](TeamsApi.md#getTenantTeamsCount) | **GET** /api/v2/TenantsService/Teams/Count | Get the count of tenant teams |
| [**updateTenantTeam**](TeamsApi.md#updateTenantTeam) | **PUT** /api/v2/TenantsService/Teams/{tenantTeamId} | Update a tenant team |


<a id="createTenantTeam"></a>
# **createTenantTeam**
> EmptyEnvelope createTenantTeam(tenantId, apiVersion, xApiVersion, tenantTeamCreateDto)

Create a new tenant team

Create a new tenant team

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTeamCreateDto : TenantTeamCreateDto =  // TenantTeamCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantTeam(tenantId, apiVersion, xApiVersion, tenantTeamCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#createTenantTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#createTenantTeam")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTeamCreateDto** | [**TenantTeamCreateDto**](TenantTeamCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantTeam"></a>
# **deleteTenantTeam**
> EmptyEnvelope deleteTenantTeam(tenantTeamId, tenantId, apiVersion, xApiVersion)

Delete a tenant team

Delete a tenant team

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val tenantTeamId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantTeam(tenantTeamId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#deleteTenantTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#deleteTenantTeam")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamId** | **java.util.UUID**|  | |
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

<a id="getTenantTeamById"></a>
# **getTenantTeamById**
> TenantTeamDtoEnvelope getTenantTeamById(tenantTeamId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant team by its ID

Retrieve a single tenant team by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val tenantTeamId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTeamDtoEnvelope = apiInstance.getTenantTeamById(tenantTeamId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#getTenantTeamById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#getTenantTeamById")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantTeamDtoEnvelope**](TenantTeamDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTeams"></a>
# **getTenantTeams**
> TenantTeamDtoListEnvelope getTenantTeams(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant teams

Retrieve a list of tenant teams

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTeamDtoListEnvelope = apiInstance.getTenantTeams(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#getTenantTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#getTenantTeams")
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

[**TenantTeamDtoListEnvelope**](TenantTeamDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTeamsCount"></a>
# **getTenantTeamsCount**
> Int32Envelope getTenantTeamsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant teams

Get the count of tenant teams

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantTeamsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#getTenantTeamsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#getTenantTeamsCount")
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

<a id="updateTenantTeam"></a>
# **updateTenantTeam**
> EmptyEnvelope updateTenantTeam(tenantTeamId, tenantId, apiVersion, xApiVersion, tenantTeamUpdateDto)

Update a tenant team

Update a tenant team

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val tenantTeamId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTeamUpdateDto : TenantTeamUpdateDto =  // TenantTeamUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantTeam(tenantTeamId, tenantId, apiVersion, xApiVersion, tenantTeamUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#updateTenantTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#updateTenantTeam")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTeamUpdateDto** | [**TenantTeamUpdateDto**](TenantTeamUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

