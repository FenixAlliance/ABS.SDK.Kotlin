# DepartmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantDepartment**](DepartmentsApi.md#createTenantDepartment) | **POST** /api/v2/TenantsService/Departments | Create a new tenant department |
| [**deleteTenantDepartment**](DepartmentsApi.md#deleteTenantDepartment) | **DELETE** /api/v2/TenantsService/Departments/{tenantDepartmentId} | Delete a tenant department |
| [**getTenantDepartmentById**](DepartmentsApi.md#getTenantDepartmentById) | **GET** /api/v2/TenantsService/Departments/{tenantDepartmentId} | Retrieve a single tenant department by its ID |
| [**getTenantDepartments**](DepartmentsApi.md#getTenantDepartments) | **GET** /api/v2/TenantsService/Departments | Retrieve a list of tenant departments |
| [**getTenantDepartmentsCount**](DepartmentsApi.md#getTenantDepartmentsCount) | **GET** /api/v2/TenantsService/Departments/Count | Get the count of tenant departments |
| [**updateTenantDepartment**](DepartmentsApi.md#updateTenantDepartment) | **PUT** /api/v2/TenantsService/Departments/{tenantDepartmentId} | Update a tenant department |


<a id="createTenantDepartment"></a>
# **createTenantDepartment**
> EmptyEnvelope createTenantDepartment(tenantId, apiVersion, xApiVersion, tenantDepartmentCreateDto)

Create a new tenant department

Create a new tenant department

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantDepartmentCreateDto : TenantDepartmentCreateDto =  // TenantDepartmentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantDepartment(tenantId, apiVersion, xApiVersion, tenantDepartmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentsApi#createTenantDepartment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentsApi#createTenantDepartment")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantDepartmentCreateDto** | [**TenantDepartmentCreateDto**](TenantDepartmentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantDepartment"></a>
# **deleteTenantDepartment**
> EmptyEnvelope deleteTenantDepartment(tenantDepartmentId, tenantId, apiVersion, xApiVersion)

Delete a tenant department

Delete a tenant department

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentsApi()
val tenantDepartmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantDepartment(tenantDepartmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentsApi#deleteTenantDepartment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentsApi#deleteTenantDepartment")
    e.printStackTrace()
}
```

### Parameters
| **tenantDepartmentId** | **java.util.UUID**|  | |
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

<a id="getTenantDepartmentById"></a>
# **getTenantDepartmentById**
> TenantDepartmentDtoEnvelope getTenantDepartmentById(tenantDepartmentId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant department by its ID

Retrieve a single tenant department by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentsApi()
val tenantDepartmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantDepartmentDtoEnvelope = apiInstance.getTenantDepartmentById(tenantDepartmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentsApi#getTenantDepartmentById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentsApi#getTenantDepartmentById")
    e.printStackTrace()
}
```

### Parameters
| **tenantDepartmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantDepartmentDtoEnvelope**](TenantDepartmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantDepartments"></a>
# **getTenantDepartments**
> TenantDepartmentDtoListEnvelope getTenantDepartments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant departments

Retrieve a list of tenant departments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantDepartmentDtoListEnvelope = apiInstance.getTenantDepartments(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentsApi#getTenantDepartments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentsApi#getTenantDepartments")
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

[**TenantDepartmentDtoListEnvelope**](TenantDepartmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantDepartmentsCount"></a>
# **getTenantDepartmentsCount**
> Int32Envelope getTenantDepartmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant departments

Get the count of tenant departments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantDepartmentsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentsApi#getTenantDepartmentsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentsApi#getTenantDepartmentsCount")
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

<a id="updateTenantDepartment"></a>
# **updateTenantDepartment**
> EmptyEnvelope updateTenantDepartment(tenantDepartmentId, tenantId, apiVersion, xApiVersion, tenantDepartmentUpdateDto)

Update a tenant department

Update a tenant department

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DepartmentsApi()
val tenantDepartmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantDepartmentUpdateDto : TenantDepartmentUpdateDto =  // TenantDepartmentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantDepartment(tenantDepartmentId, tenantId, apiVersion, xApiVersion, tenantDepartmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepartmentsApi#updateTenantDepartment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepartmentsApi#updateTenantDepartment")
    e.printStackTrace()
}
```

### Parameters
| **tenantDepartmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantDepartmentUpdateDto** | [**TenantDepartmentUpdateDto**](TenantDepartmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

