# QuotesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**calculateQuote**](QuotesApi.md#calculateQuote) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Calculate | Calculate a quote. |
| [**calculateQuoteLine**](QuotesApi.md#calculateQuoteLine) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId}/Calculate | Calculate a quote line. |
| [**closeQuote**](QuotesApi.md#closeQuote) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Close | Close a quote. |
| [**createOrderFromQuote**](QuotesApi.md#createOrderFromQuote) | **POST** /api/v2/QuotesService/Quotes/{quoteId}/Orders | Create an order from a quote. |
| [**createQuote**](QuotesApi.md#createQuote) | **POST** /api/v2/QuotesService/Quotes | Create a new quote. |
| [**createQuoteLine**](QuotesApi.md#createQuoteLine) | **POST** /api/v2/QuotesService/Quotes/{quoteId}/Lines | Create a new quote line. |
| [**deleteQuote**](QuotesApi.md#deleteQuote) | **DELETE** /api/v2/QuotesService/Quotes/{quoteId} | Delete a quote. |
| [**deleteQuoteLine**](QuotesApi.md#deleteQuoteLine) | **DELETE** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} | Delete a quote line. |
| [**getExtendedQuotes**](QuotesApi.md#getExtendedQuotes) | **GET** /api/v2/QuotesService/Quotes/Extended | Get a list of extended quotes. |
| [**getQuote**](QuotesApi.md#getQuote) | **GET** /api/v2/QuotesService/Quotes/{quoteId} | Get a quote by ID. |
| [**getQuoteLine**](QuotesApi.md#getQuoteLine) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} | Get a quote line by ID. |
| [**getQuoteLines**](QuotesApi.md#getQuoteLines) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines | Get quote lines for a quote. |
| [**getQuoteLinesCount**](QuotesApi.md#getQuoteLinesCount) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines/Count | Get the count of quote lines. |
| [**getQuotes**](QuotesApi.md#getQuotes) | **GET** /api/v2/QuotesService/Quotes | Get a list of quotes. |
| [**getQuotesCount**](QuotesApi.md#getQuotesCount) | **GET** /api/v2/QuotesService/Quotes/Count | Get the count of quotes. |
| [**previewQuoteEmailTemplate**](QuotesApi.md#previewQuoteEmailTemplate) | **POST** /api/v2/QuotesService/Quotes/{quoteId}/Emails/Preview | Preview the rendered email for an invoice. |
| [**quoteLineExists**](QuotesApi.md#quoteLineExists) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines/Exists | Check if a quote line exists. |
| [**reopenQuote**](QuotesApi.md#reopenQuote) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Reopen | Reopen a closed quote. |
| [**sendQuoteEmail**](QuotesApi.md#sendQuoteEmail) | **POST** /api/v2/QuotesService/Quotes/{quoteId}/Emails/Send | Send a quote transactional email to recipients. |
| [**updateQuote**](QuotesApi.md#updateQuote) | **PUT** /api/v2/QuotesService/Quotes/{quoteId} | Update an existing quote. |
| [**updateQuoteLine**](QuotesApi.md#updateQuoteLine) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} | Update a quote line. |
| [**upsertQuoteLine**](QuotesApi.md#upsertQuoteLine) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId}/Upsert | Upsert a quote line. |


<a id="calculateQuote"></a>
# **calculateQuote**
> EmptyEnvelope calculateQuote(quoteId, tenantId)

Calculate a quote.

Performs calculation logic for the specified quote.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.calculateQuote(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#calculateQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#calculateQuote")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="calculateQuoteLine"></a>
# **calculateQuoteLine**
> EmptyEnvelope calculateQuoteLine(quoteId, quoteLineId, tenantId)

Calculate a quote line.

Performs calculation logic for the specified quote line.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.calculateQuoteLine(quoteId, quoteLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#calculateQuoteLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#calculateQuoteLine")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **quoteLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="closeQuote"></a>
# **closeQuote**
> EmptyEnvelope closeQuote(quoteId, tenantId)

Close a quote.

Closes the specified quote for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.closeQuote(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#closeQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#closeQuote")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createOrderFromQuote"></a>
# **createOrderFromQuote**
> EmptyEnvelope createOrderFromQuote(quoteId, tenantId)

Create an order from a quote.

Creates an order based on the specified quote for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.createOrderFromQuote(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#createOrderFromQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#createOrderFromQuote")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createQuote"></a>
# **createQuote**
> EmptyEnvelope createQuote(tenantId, quoteCreateDto)

Create a new quote.

Creates a new quote for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteCreateDto : QuoteCreateDto =  // QuoteCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createQuote(tenantId, quoteCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#createQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#createQuote")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteCreateDto** | [**QuoteCreateDto**](QuoteCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createQuoteLine"></a>
# **createQuoteLine**
> EmptyEnvelope createQuoteLine(quoteId, tenantId, quoteLineCreateDto)

Create a new quote line.

Creates a new quote line for the specified quote and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineCreateDto : QuoteLineCreateDto =  // QuoteLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createQuoteLine(quoteId, tenantId, quoteLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#createQuoteLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#createQuoteLine")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteLineCreateDto** | [**QuoteLineCreateDto**](QuoteLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteQuote"></a>
# **deleteQuote**
> EmptyEnvelope deleteQuote(quoteId, tenantId)

Delete a quote.

Deletes the specified quote for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteQuote(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#deleteQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#deleteQuote")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteQuoteLine"></a>
# **deleteQuoteLine**
> EmptyEnvelope deleteQuoteLine(quoteId, quoteLineId, tenantId)

Delete a quote line.

Deletes the specified quote line for the quote and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteQuoteLine(quoteId, quoteLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#deleteQuoteLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#deleteQuoteLine")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **quoteLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedQuotes"></a>
# **getExtendedQuotes**
> ExtendedQuoteDtoListEnvelope getExtendedQuotes(tenantId)

Get a list of extended quotes.

Retrieves a list of extended quotes for the specified tenant, supporting OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedQuoteDtoListEnvelope = apiInstance.getExtendedQuotes(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getExtendedQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getExtendedQuotes")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ExtendedQuoteDtoListEnvelope**](ExtendedQuoteDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getQuote"></a>
# **getQuote**
> QuoteDtoEnvelope getQuote(quoteId, tenantId)

Get a quote by ID.

Retrieves a single quote by its unique identifier for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : QuoteDtoEnvelope = apiInstance.getQuote(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getQuote")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**QuoteDtoEnvelope**](QuoteDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getQuoteLine"></a>
# **getQuoteLine**
> QuoteLineDtoEnvelope getQuoteLine(quoteId, quoteLineId, tenantId)

Get a quote line by ID.

Retrieves a single quote line by its unique identifier for the specified quote and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : QuoteLineDtoEnvelope = apiInstance.getQuoteLine(quoteId, quoteLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getQuoteLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getQuoteLine")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **quoteLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**QuoteLineDtoEnvelope**](QuoteLineDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getQuoteLines"></a>
# **getQuoteLines**
> QuoteLineDtoListEnvelope getQuoteLines(quoteId, tenantId, itemId)

Get quote lines for a quote.

Retrieves all quote lines for the specified quote and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : QuoteLineDtoListEnvelope = apiInstance.getQuoteLines(quoteId, tenantId, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getQuoteLines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getQuoteLines")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemId** | **java.util.UUID**|  | [optional] |

### Return type

[**QuoteLineDtoListEnvelope**](QuoteLineDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getQuoteLinesCount"></a>
# **getQuoteLinesCount**
> Int32Envelope getQuoteLinesCount(quoteId, tenantId)

Get the count of quote lines.

Retrieves the total count of quote lines for the specified quote and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getQuoteLinesCount(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getQuoteLinesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getQuoteLinesCount")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getQuotes"></a>
# **getQuotes**
> QuoteDtoListEnvelope getQuotes(tenantId)

Get a list of quotes.

Retrieves a list of quotes for the specified tenant, supporting OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : QuoteDtoListEnvelope = apiInstance.getQuotes(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getQuotes")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**QuoteDtoListEnvelope**](QuoteDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getQuotesCount"></a>
# **getQuotesCount**
> Int32Envelope getQuotesCount(tenantId)

Get the count of quotes.

Retrieves the total count of quotes for the specified tenant, supporting OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getQuotesCount(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getQuotesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getQuotesCount")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="previewQuoteEmailTemplate"></a>
# **previewQuoteEmailTemplate**
> previewQuoteEmailTemplate(quoteId, tenantId, emailDispatchRequest)

Preview the rendered email for an invoice.

This action is only available for users with the &#39;send_email&#39; permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailDispatchRequest : EmailDispatchRequest =  // EmailDispatchRequest | 
try {
    apiInstance.previewQuoteEmailTemplate(quoteId, tenantId, emailDispatchRequest)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#previewQuoteEmailTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#previewQuoteEmailTemplate")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="quoteLineExists"></a>
# **quoteLineExists**
> BooleanEnvelope quoteLineExists(quoteId, tenantId, quoteLineId, itemId)

Check if a quote line exists.

Checks if a quote line exists for the specified quote and tenant, by quote line ID or item ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : BooleanEnvelope = apiInstance.quoteLineExists(quoteId, tenantId, quoteLineId, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#quoteLineExists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#quoteLineExists")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **quoteLineId** | **java.util.UUID**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemId** | **java.util.UUID**|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reopenQuote"></a>
# **reopenQuote**
> EmptyEnvelope reopenQuote(quoteId, tenantId)

Reopen a closed quote.

Reopens a previously closed quote for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.reopenQuote(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#reopenQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#reopenQuote")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="sendQuoteEmail"></a>
# **sendQuoteEmail**
> EmptyEnvelope sendQuoteEmail(quoteId, tenantId, emailDispatchRequest)

Send a quote transactional email to recipients.

This action is only available for users with the &#39;send_email&#39; permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailDispatchRequest : EmailDispatchRequest =  // EmailDispatchRequest | 
try {
    val result : EmptyEnvelope = apiInstance.sendQuoteEmail(quoteId, tenantId, emailDispatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#sendQuoteEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#sendQuoteEmail")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateQuote"></a>
# **updateQuote**
> EmptyEnvelope updateQuote(quoteId, tenantId, quoteUpdateDto)

Update an existing quote.

Updates an existing quote for the specified tenant and quote ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteUpdateDto : QuoteUpdateDto =  // QuoteUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateQuote(quoteId, tenantId, quoteUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#updateQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#updateQuote")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteUpdateDto** | [**QuoteUpdateDto**](QuoteUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateQuoteLine"></a>
# **updateQuoteLine**
> EmptyEnvelope updateQuoteLine(quoteId, quoteLineId, tenantId, quoteLineUpdateDto)

Update a quote line.

Updates an existing quote line for the specified quote and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineUpdateDto : QuoteLineUpdateDto =  // QuoteLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateQuoteLine(quoteId, quoteLineId, tenantId, quoteLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#updateQuoteLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#updateQuoteLine")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **quoteLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteLineUpdateDto** | [**QuoteLineUpdateDto**](QuoteLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="upsertQuoteLine"></a>
# **upsertQuoteLine**
> EmptyEnvelope upsertQuoteLine(quoteId, quoteLineId, tenantId, quoteLineUpsertDto)

Upsert a quote line.

Creates or updates a quote line for the specified quote and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineUpsertDto : QuoteLineUpsertDto =  // QuoteLineUpsertDto | 
try {
    val result : EmptyEnvelope = apiInstance.upsertQuoteLine(quoteId, quoteLineId, tenantId, quoteLineUpsertDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#upsertQuoteLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#upsertQuoteLine")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **quoteLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteLineUpsertDto** | [**QuoteLineUpsertDto**](QuoteLineUpsertDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

