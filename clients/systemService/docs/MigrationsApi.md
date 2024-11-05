# MigrationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SystemServiceMigrationsGet**](MigrationsApi.md#apiV2SystemServiceMigrationsGet) | **GET** /api/v2/SystemService/Migrations |  |
| [**apiV2SystemServiceMigrationsMigratePost**](MigrationsApi.md#apiV2SystemServiceMigrationsMigratePost) | **POST** /api/v2/SystemService/Migrations/Migrate |  |


<a id="apiV2SystemServiceMigrationsGet"></a>
# **apiV2SystemServiceMigrationsGet**
> StringListEnvelope apiV2SystemServiceMigrationsGet(pending, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val pending : kotlin.Boolean = true // kotlin.Boolean | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : StringListEnvelope = apiInstance.apiV2SystemServiceMigrationsGet(pending, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#apiV2SystemServiceMigrationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#apiV2SystemServiceMigrationsGet")
    e.printStackTrace()
}
```

### Parameters
| **pending** | **kotlin.Boolean**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**StringListEnvelope**](StringListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SystemServiceMigrationsMigratePost"></a>
# **apiV2SystemServiceMigrationsMigratePost**
> StringListEnvelope apiV2SystemServiceMigrationsMigratePost(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : StringListEnvelope = apiInstance.apiV2SystemServiceMigrationsMigratePost(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#apiV2SystemServiceMigrationsMigratePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#apiV2SystemServiceMigrationsMigratePost")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**StringListEnvelope**](StringListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

