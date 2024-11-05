# CountriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2GlobeServiceCountriesCountryIdCallingCodesGet**](CountriesApi.md#apiV2GlobeServiceCountriesCountryIdCallingCodesGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/CallingCodes |  |
| [**apiV2GlobeServiceCountriesCountryIdCurrenciesGet**](CountriesApi.md#apiV2GlobeServiceCountriesCountryIdCurrenciesGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/Currencies |  |
| [**apiV2GlobeServiceCountriesCountryIdGet**](CountriesApi.md#apiV2GlobeServiceCountriesCountryIdGet) | **GET** /api/v2/GlobeService/Countries/{countryId} |  |
| [**apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdCitiesGet**](CountriesApi.md#apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdCitiesGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/States/{countryStateId}/Cities |  |
| [**apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdGet**](CountriesApi.md#apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/States/{countryStateId} |  |
| [**apiV2GlobeServiceCountriesCountryIdStatesGet**](CountriesApi.md#apiV2GlobeServiceCountriesCountryIdStatesGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/States |  |
| [**apiV2GlobeServiceCountriesCountryIdTimezonesGet**](CountriesApi.md#apiV2GlobeServiceCountriesCountryIdTimezonesGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/Timezones |  |
| [**apiV2GlobeServiceCountriesCountryIdTopLevelDomainsGet**](CountriesApi.md#apiV2GlobeServiceCountriesCountryIdTopLevelDomainsGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/TopLevelDomains |  |
| [**apiV2GlobeServiceCountriesGet**](CountriesApi.md#apiV2GlobeServiceCountriesGet) | **GET** /api/v2/GlobeService/Countries |  |
| [**apiV2GlobeServiceCountriesSearchGet**](CountriesApi.md#apiV2GlobeServiceCountriesSearchGet) | **GET** /api/v2/GlobeService/Countries/Search |  |


<a id="apiV2GlobeServiceCountriesCountryIdCallingCodesGet"></a>
# **apiV2GlobeServiceCountriesCountryIdCallingCodesGet**
> CountryCallingCodeDtoListEnvelope apiV2GlobeServiceCountriesCountryIdCallingCodesGet(countryId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val countryId : kotlin.String = countryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryCallingCodeDtoListEnvelope = apiInstance.apiV2GlobeServiceCountriesCountryIdCallingCodesGet(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdCallingCodesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdCallingCodesGet")
    e.printStackTrace()
}
```

### Parameters
| **countryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountryCallingCodeDtoListEnvelope**](CountryCallingCodeDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceCountriesCountryIdCurrenciesGet"></a>
# **apiV2GlobeServiceCountriesCountryIdCurrenciesGet**
> CurrencyDtoListEnvelope apiV2GlobeServiceCountriesCountryIdCurrenciesGet(countryId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val countryId : kotlin.String = countryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CurrencyDtoListEnvelope = apiInstance.apiV2GlobeServiceCountriesCountryIdCurrenciesGet(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdCurrenciesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdCurrenciesGet")
    e.printStackTrace()
}
```

### Parameters
| **countryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CurrencyDtoListEnvelope**](CurrencyDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceCountriesCountryIdGet"></a>
# **apiV2GlobeServiceCountriesCountryIdGet**
> CountryDtoEnvelope apiV2GlobeServiceCountriesCountryIdGet(countryId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val countryId : kotlin.String = countryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryDtoEnvelope = apiInstance.apiV2GlobeServiceCountriesCountryIdGet(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdGet")
    e.printStackTrace()
}
```

### Parameters
| **countryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountryDtoEnvelope**](CountryDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdCitiesGet"></a>
# **apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdCitiesGet**
> CityDtoListEnvelope apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdCitiesGet(countryStateId, countryId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val countryStateId : kotlin.String = countryStateId_example // kotlin.String | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CityDtoListEnvelope = apiInstance.apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdCitiesGet(countryStateId, countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdCitiesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdCitiesGet")
    e.printStackTrace()
}
```

### Parameters
| **countryStateId** | **kotlin.String**|  | |
| **countryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CityDtoListEnvelope**](CityDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdGet"></a>
# **apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdGet**
> CountryStateDtoEnvelope apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdGet(countryStateId, countryId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val countryStateId : kotlin.String = countryStateId_example // kotlin.String | 
val countryId : kotlin.String = countryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryStateDtoEnvelope = apiInstance.apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdGet(countryStateId, countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdGet")
    e.printStackTrace()
}
```

### Parameters
| **countryStateId** | **kotlin.String**|  | |
| **countryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountryStateDtoEnvelope**](CountryStateDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceCountriesCountryIdStatesGet"></a>
# **apiV2GlobeServiceCountriesCountryIdStatesGet**
> CountryStateDtoListEnvelope apiV2GlobeServiceCountriesCountryIdStatesGet(countryId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val countryId : kotlin.String = countryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryStateDtoListEnvelope = apiInstance.apiV2GlobeServiceCountriesCountryIdStatesGet(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdStatesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdStatesGet")
    e.printStackTrace()
}
```

### Parameters
| **countryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountryStateDtoListEnvelope**](CountryStateDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceCountriesCountryIdTimezonesGet"></a>
# **apiV2GlobeServiceCountriesCountryIdTimezonesGet**
> TimezoneDtoListEnvelope apiV2GlobeServiceCountriesCountryIdTimezonesGet(countryId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val countryId : kotlin.String = countryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TimezoneDtoListEnvelope = apiInstance.apiV2GlobeServiceCountriesCountryIdTimezonesGet(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdTimezonesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdTimezonesGet")
    e.printStackTrace()
}
```

### Parameters
| **countryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TimezoneDtoListEnvelope**](TimezoneDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceCountriesCountryIdTopLevelDomainsGet"></a>
# **apiV2GlobeServiceCountriesCountryIdTopLevelDomainsGet**
> CountryTopLevelDomainDtoListEnvelope apiV2GlobeServiceCountriesCountryIdTopLevelDomainsGet(countryId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val countryId : kotlin.String = countryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryTopLevelDomainDtoListEnvelope = apiInstance.apiV2GlobeServiceCountriesCountryIdTopLevelDomainsGet(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdTopLevelDomainsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#apiV2GlobeServiceCountriesCountryIdTopLevelDomainsGet")
    e.printStackTrace()
}
```

### Parameters
| **countryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountryTopLevelDomainDtoListEnvelope**](CountryTopLevelDomainDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceCountriesGet"></a>
# **apiV2GlobeServiceCountriesGet**
> CountryDtoListEnvelope apiV2GlobeServiceCountriesGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryDtoListEnvelope = apiInstance.apiV2GlobeServiceCountriesGet(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#apiV2GlobeServiceCountriesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#apiV2GlobeServiceCountriesGet")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountryDtoListEnvelope**](CountryDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceCountriesSearchGet"></a>
# **apiV2GlobeServiceCountriesSearchGet**
> CountryDtoListEnvelope apiV2GlobeServiceCountriesSearchGet(countryName, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val countryName : kotlin.String = countryName_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryDtoListEnvelope = apiInstance.apiV2GlobeServiceCountriesSearchGet(countryName, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#apiV2GlobeServiceCountriesSearchGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#apiV2GlobeServiceCountriesSearchGet")
    e.printStackTrace()
}
```

### Parameters
| **countryName** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountryDtoListEnvelope**](CountryDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

