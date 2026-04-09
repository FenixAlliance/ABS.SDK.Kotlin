# CountriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countCountries**](CountriesApi.md#countCountries) | **GET** /api/v2/GlobeService/Countries/Count | Count countries |
| [**getAllCountries**](CountriesApi.md#getAllCountries) | **GET** /api/v2/GlobeService/Countries | Get all countries |
| [**getCallingCodesByCountryIdAsync**](CountriesApi.md#getCallingCodesByCountryIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/CallingCodes | Get calling codes for a country |
| [**getCitiesByCountryStateIdAsync**](CountriesApi.md#getCitiesByCountryStateIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/States/{countryStateId}/Cities | Get cities for a state |
| [**getCountryById**](CountriesApi.md#getCountryById) | **GET** /api/v2/GlobeService/Countries/{countryId} | Get country by ID |
| [**getCountryStateByIdAsync**](CountriesApi.md#getCountryStateByIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/States/{countryStateId} | Get state by ID |
| [**getCountryStatesAsync**](CountriesApi.md#getCountryStatesAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/States | Get states for a country |
| [**getEnabledCurrenciesByCountryIdAsync**](CountriesApi.md#getEnabledCurrenciesByCountryIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/Currencies | Get currencies for a country |
| [**getTimeZonesByCountryIdAsync**](CountriesApi.md#getTimeZonesByCountryIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/Timezones | Get timezones for a country |
| [**getTopLevelDomainsByCountryIdAsync**](CountriesApi.md#getTopLevelDomainsByCountryIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/TopLevelDomains | Get top-level domains for a country |
| [**searchCountriesByNameAsync**](CountriesApi.md#searchCountriesByNameAsync) | **GET** /api/v2/GlobeService/Countries/Search | Search countries by name |


<a id="countCountries"></a>
# **countCountries**
> Int32Envelope countCountries(apiVersion, xApiVersion)

Count countries

Returns the total number of countries, with optional OData filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countCountries(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#countCountries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#countCountries")
    e.printStackTrace()
}
```

### Parameters
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

<a id="getAllCountries"></a>
# **getAllCountries**
> CountryDtoListEnvelope getAllCountries(apiVersion, xApiVersion)

Get all countries

Retrieves a list of all countries with optional OData pagination and filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountriesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryDtoListEnvelope = apiInstance.getAllCountries(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getAllCountries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getAllCountries")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCallingCodesByCountryIdAsync"></a>
# **getCallingCodesByCountryIdAsync**
> CountryCallingCodeDtoListEnvelope getCallingCodesByCountryIdAsync(countryId, apiVersion, xApiVersion)

Get calling codes for a country

Retrieves the list of international telephone calling codes associated with the specified country.

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
    val result : CountryCallingCodeDtoListEnvelope = apiInstance.getCallingCodesByCountryIdAsync(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getCallingCodesByCountryIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getCallingCodesByCountryIdAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCitiesByCountryStateIdAsync"></a>
# **getCitiesByCountryStateIdAsync**
> CityDtoListEnvelope getCitiesByCountryStateIdAsync(countryStateId, countryId, apiVersion, xApiVersion)

Get cities for a state

Retrieves the list of cities belonging to the specified state or province.

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
    val result : CityDtoListEnvelope = apiInstance.getCitiesByCountryStateIdAsync(countryStateId, countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getCitiesByCountryStateIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getCitiesByCountryStateIdAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCountryById"></a>
# **getCountryById**
> CountryDtoEnvelope getCountryById(countryId, apiVersion, xApiVersion)

Get country by ID

Retrieves a single country by its unique identifier.

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
    val result : CountryDtoEnvelope = apiInstance.getCountryById(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getCountryById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getCountryById")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCountryStateByIdAsync"></a>
# **getCountryStateByIdAsync**
> CountryStateDtoEnvelope getCountryStateByIdAsync(countryStateId, countryId, apiVersion, xApiVersion)

Get state by ID

Retrieves a single state or province by its unique identifier within a country.

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
    val result : CountryStateDtoEnvelope = apiInstance.getCountryStateByIdAsync(countryStateId, countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getCountryStateByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getCountryStateByIdAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCountryStatesAsync"></a>
# **getCountryStatesAsync**
> CountryStateDtoListEnvelope getCountryStatesAsync(countryId, apiVersion, xApiVersion)

Get states for a country

Retrieves the list of states or provinces belonging to the specified country.

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
    val result : CountryStateDtoListEnvelope = apiInstance.getCountryStatesAsync(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getCountryStatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getCountryStatesAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEnabledCurrenciesByCountryIdAsync"></a>
# **getEnabledCurrenciesByCountryIdAsync**
> CurrencyDtoListEnvelope getEnabledCurrenciesByCountryIdAsync(countryId, apiVersion, xApiVersion)

Get currencies for a country

Retrieves the list of enabled currencies for the specified country.

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
    val result : CurrencyDtoListEnvelope = apiInstance.getEnabledCurrenciesByCountryIdAsync(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getEnabledCurrenciesByCountryIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getEnabledCurrenciesByCountryIdAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTimeZonesByCountryIdAsync"></a>
# **getTimeZonesByCountryIdAsync**
> TimezoneDtoListEnvelope getTimeZonesByCountryIdAsync(countryId, apiVersion, xApiVersion)

Get timezones for a country

Retrieves the list of timezones associated with the specified country.

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
    val result : TimezoneDtoListEnvelope = apiInstance.getTimeZonesByCountryIdAsync(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getTimeZonesByCountryIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getTimeZonesByCountryIdAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTopLevelDomainsByCountryIdAsync"></a>
# **getTopLevelDomainsByCountryIdAsync**
> CountryTopLevelDomainDtoListEnvelope getTopLevelDomainsByCountryIdAsync(countryId, apiVersion, xApiVersion)

Get top-level domains for a country

Retrieves the list of internet top-level domains (TLDs) associated with the specified country.

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
    val result : CountryTopLevelDomainDtoListEnvelope = apiInstance.getTopLevelDomainsByCountryIdAsync(countryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getTopLevelDomainsByCountryIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getTopLevelDomainsByCountryIdAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchCountriesByNameAsync"></a>
# **searchCountriesByNameAsync**
> CountryDtoListEnvelope searchCountriesByNameAsync(countryName, apiVersion, xApiVersion)

Search countries by name

Searches for countries whose name matches the specified search term.

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
    val result : CountryDtoListEnvelope = apiInstance.searchCountriesByNameAsync(countryName, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#searchCountriesByNameAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#searchCountriesByNameAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

