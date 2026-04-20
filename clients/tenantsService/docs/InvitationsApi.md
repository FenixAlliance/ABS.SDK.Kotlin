# InvitationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**acceptTenantInvitation**](InvitationsApi.md#acceptTenantInvitation) | **POST** /api/v2/TenantsService/Invitations/{invitationId}/Accept | Accept an invitation to join a tenant |
| [**declineTenantInvitation**](InvitationsApi.md#declineTenantInvitation) | **POST** /api/v2/TenantsService/Invitations/{invitationId}/Decline | Decline an invitation to join a tenant |
| [**deleteTenantInvitation**](InvitationsApi.md#deleteTenantInvitation) | **DELETE** /api/v2/TenantsService/Invitations/{invitationId} | Delete a tenant invitation |
| [**getTenantInvitationById**](InvitationsApi.md#getTenantInvitationById) | **GET** /api/v2/TenantsService/Invitations/{invitationId} | Get a tenant invitation by its ID |
| [**getTenantInvitations**](InvitationsApi.md#getTenantInvitations) | **GET** /api/v2/TenantsService/Invitations | Retrieve a list of tenant invitations |
| [**getTenantInvitationsCount**](InvitationsApi.md#getTenantInvitationsCount) | **GET** /api/v2/TenantsService/Invitations/Count | Get the count of tenant invitations |
| [**sendTenantInvitation**](InvitationsApi.md#sendTenantInvitation) | **POST** /api/v2/TenantsService/Invitations | Send an invitation to a user to join a tenant |


<a id="acceptTenantInvitation"></a>
# **acceptTenantInvitation**
> EmptyEnvelope acceptTenantInvitation(invitationId, apiVersion, xApiVersion)

Accept an invitation to join a tenant

Accept an invitation to join a tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitationsApi()
val invitationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.acceptTenantInvitation(invitationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#acceptTenantInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#acceptTenantInvitation")
    e.printStackTrace()
}
```

### Parameters
| **invitationId** | **java.util.UUID**|  | |
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

<a id="declineTenantInvitation"></a>
# **declineTenantInvitation**
> EmptyEnvelope declineTenantInvitation(invitationId, apiVersion, xApiVersion)

Decline an invitation to join a tenant

Decline an invitation to join a tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitationsApi()
val invitationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.declineTenantInvitation(invitationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#declineTenantInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#declineTenantInvitation")
    e.printStackTrace()
}
```

### Parameters
| **invitationId** | **java.util.UUID**|  | |
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

<a id="deleteTenantInvitation"></a>
# **deleteTenantInvitation**
> EmptyEnvelope deleteTenantInvitation(invitationId, tenantId, apiVersion, xApiVersion)

Delete a tenant invitation

Delete a tenant invitation

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitationsApi()
val invitationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantInvitation(invitationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#deleteTenantInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#deleteTenantInvitation")
    e.printStackTrace()
}
```

### Parameters
| **invitationId** | **java.util.UUID**|  | |
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

<a id="getTenantInvitationById"></a>
# **getTenantInvitationById**
> TenantInvitationDtoEnvelope getTenantInvitationById(invitationId, tenantId, apiVersion, xApiVersion)

Get a tenant invitation by its ID

Get a tenant invitation by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitationsApi()
val invitationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantInvitationDtoEnvelope = apiInstance.getTenantInvitationById(invitationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#getTenantInvitationById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#getTenantInvitationById")
    e.printStackTrace()
}
```

### Parameters
| **invitationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantInvitationDtoEnvelope**](TenantInvitationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantInvitations"></a>
# **getTenantInvitations**
> TenantInvitationDtoListEnvelope getTenantInvitations(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant invitations

Retrieve a list of tenant invitations

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantInvitationDtoListEnvelope = apiInstance.getTenantInvitations(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#getTenantInvitations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#getTenantInvitations")
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

[**TenantInvitationDtoListEnvelope**](TenantInvitationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantInvitationsCount"></a>
# **getTenantInvitationsCount**
> Int32Envelope getTenantInvitationsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant invitations

Get the count of tenant invitations

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantInvitationsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#getTenantInvitationsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#getTenantInvitationsCount")
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

<a id="sendTenantInvitation"></a>
# **sendTenantInvitation**
> EmptyEnvelope sendTenantInvitation(tenantId, apiVersion, xApiVersion, tenantInvitationCreateDto)

Send an invitation to a user to join a tenant

Send an invitation to a user to join a tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvitationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantInvitationCreateDto : TenantInvitationCreateDto =  // TenantInvitationCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.sendTenantInvitation(tenantId, apiVersion, xApiVersion, tenantInvitationCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#sendTenantInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#sendTenantInvitation")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantInvitationCreateDto** | [**TenantInvitationCreateDto**](TenantInvitationCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

