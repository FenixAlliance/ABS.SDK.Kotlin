# MigrationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**migrate**](MigrationsApi.md#migrate) | **POST** /api/v2/SystemService/Migrations/Migrate | Apply pending database migrations |
| [**migrations**](MigrationsApi.md#migrations) | **GET** /api/v2/SystemService/Migrations | Retrieve database migrations |


<a id="migrate"></a>
# **migrate**
> StringListEnvelope migrate(apiVersion, xApiVersion)

Apply pending database migrations

Applies all pending database migrations and returns the list of migrations that were applied.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : StringListEnvelope = apiInstance.migrate(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrate")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrations"></a>
# **migrations**
> StringListEnvelope migrations(pending, apiVersion, xApiVersion)

Retrieve database migrations

Retrieves the list of applied or pending database migrations.

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
    val result : StringListEnvelope = apiInstance.migrations(pending, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrations")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

