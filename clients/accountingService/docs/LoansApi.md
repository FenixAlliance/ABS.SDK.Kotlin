# LoansApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLoanApplicationAsync**](LoansApi.md#createLoanApplicationAsync) | **POST** /api/v2/AccountingService/Loans/Applications | Creates a loan application |
| [**createLoanAsync**](LoansApi.md#createLoanAsync) | **POST** /api/v2/AccountingService/Loans | Creates a new loan |
| [**deleteLoanApplicationAsync**](LoansApi.md#deleteLoanApplicationAsync) | **DELETE** /api/v2/AccountingService/Loans/Applications/{applicationId} | Deletes a loan application |
| [**deleteLoanAsync**](LoansApi.md#deleteLoanAsync) | **DELETE** /api/v2/AccountingService/Loans/{loanId} | Deletes a loan |
| [**getLoanApplicationDetailsAsync**](LoansApi.md#getLoanApplicationDetailsAsync) | **GET** /api/v2/AccountingService/Loans/Applications/{applicationId} | Gets a loan application by ID |
| [**getLoanApplicationsAsync**](LoansApi.md#getLoanApplicationsAsync) | **GET** /api/v2/AccountingService/Loans/Applications | Gets all loan applications |
| [**getLoanApplicationsCountAsync**](LoansApi.md#getLoanApplicationsCountAsync) | **GET** /api/v2/AccountingService/Loans/Applications/Count | Counts loan applications |
| [**getLoanDetailsAsync**](LoansApi.md#getLoanDetailsAsync) | **GET** /api/v2/AccountingService/Loans/{loanId} | Gets a loan by ID |
| [**getLoansAsync**](LoansApi.md#getLoansAsync) | **GET** /api/v2/AccountingService/Loans | Gets all loans |
| [**getLoansCountAsync**](LoansApi.md#getLoansCountAsync) | **GET** /api/v2/AccountingService/Loans/Count | Counts loans |
| [**updateLoanApplicationAsync**](LoansApi.md#updateLoanApplicationAsync) | **PUT** /api/v2/AccountingService/Loans/Applications/{applicationId} | Updates a loan application |
| [**updateLoanAsync**](LoansApi.md#updateLoanAsync) | **PUT** /api/v2/AccountingService/Loans/{loanId} | Updates a loan |


<a id="createLoanApplicationAsync"></a>
# **createLoanApplicationAsync**
> EmptyEnvelope createLoanApplicationAsync(tenantId, loanApplicationCreateDto, apiVersion, xApiVersion)

Creates a loan application

Creates a new loan application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val loanApplicationCreateDto : LoanApplicationCreateDto =  // LoanApplicationCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createLoanApplicationAsync(tenantId, loanApplicationCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#createLoanApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#createLoanApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **loanApplicationCreateDto** | [**LoanApplicationCreateDto**](LoanApplicationCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createLoanAsync"></a>
# **createLoanAsync**
> EmptyEnvelope createLoanAsync(tenantId, loanCreateDto, apiVersion, xApiVersion)

Creates a new loan

Creates a new loan for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val loanCreateDto : LoanCreateDto =  // LoanCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createLoanAsync(tenantId, loanCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#createLoanAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#createLoanAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **loanCreateDto** | [**LoanCreateDto**](LoanCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLoanApplicationAsync"></a>
# **deleteLoanApplicationAsync**
> EmptyEnvelope deleteLoanApplicationAsync(applicationId, tenantId, apiVersion, xApiVersion)

Deletes a loan application

Deletes the specified loan application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val applicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteLoanApplicationAsync(applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#deleteLoanApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#deleteLoanApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **java.util.UUID**|  | |
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

<a id="deleteLoanAsync"></a>
# **deleteLoanAsync**
> EmptyEnvelope deleteLoanAsync(loanId, tenantId, apiVersion, xApiVersion)

Deletes a loan

Deletes the specified loan.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val loanId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteLoanAsync(loanId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#deleteLoanAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#deleteLoanAsync")
    e.printStackTrace()
}
```

### Parameters
| **loanId** | **java.util.UUID**|  | |
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

<a id="getLoanApplicationDetailsAsync"></a>
# **getLoanApplicationDetailsAsync**
> LoanApplicationDtoEnvelope getLoanApplicationDetailsAsync(applicationId, tenantId, apiVersion, xApiVersion)

Gets a loan application by ID

Retrieves the details of a loan application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val applicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LoanApplicationDtoEnvelope = apiInstance.getLoanApplicationDetailsAsync(applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#getLoanApplicationDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#getLoanApplicationDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**LoanApplicationDtoEnvelope**](LoanApplicationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLoanApplicationsAsync"></a>
# **getLoanApplicationsAsync**
> LoanApplicationDtoIReadOnlyListEnvelope getLoanApplicationsAsync(tenantId, apiVersion, xApiVersion)

Gets all loan applications

Retrieves all loan applications for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LoanApplicationDtoIReadOnlyListEnvelope = apiInstance.getLoanApplicationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#getLoanApplicationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#getLoanApplicationsAsync")
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

[**LoanApplicationDtoIReadOnlyListEnvelope**](LoanApplicationDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLoanApplicationsCountAsync"></a>
# **getLoanApplicationsCountAsync**
> Int32Envelope getLoanApplicationsCountAsync(tenantId, apiVersion, xApiVersion)

Counts loan applications

Gets the count of loan applications for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getLoanApplicationsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#getLoanApplicationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#getLoanApplicationsCountAsync")
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

<a id="getLoanDetailsAsync"></a>
# **getLoanDetailsAsync**
> LoanDtoEnvelope getLoanDetailsAsync(loanId, tenantId, apiVersion, xApiVersion)

Gets a loan by ID

Retrieves the details of a loan using its unique ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val loanId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LoanDtoEnvelope = apiInstance.getLoanDetailsAsync(loanId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#getLoanDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#getLoanDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **loanId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**LoanDtoEnvelope**](LoanDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLoansAsync"></a>
# **getLoansAsync**
> LoanDtoIReadOnlyListEnvelope getLoansAsync(tenantId, apiVersion, xApiVersion)

Gets all loans

Retrieves all loans for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LoanDtoIReadOnlyListEnvelope = apiInstance.getLoansAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#getLoansAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#getLoansAsync")
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

[**LoanDtoIReadOnlyListEnvelope**](LoanDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLoansCountAsync"></a>
# **getLoansCountAsync**
> Int32Envelope getLoansCountAsync(tenantId, apiVersion, xApiVersion)

Counts loans

Gets the count of loans for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getLoansCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#getLoansCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#getLoansCountAsync")
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

<a id="updateLoanApplicationAsync"></a>
# **updateLoanApplicationAsync**
> EmptyEnvelope updateLoanApplicationAsync(applicationId, tenantId, body, apiVersion, xApiVersion)

Updates a loan application

Updates the specified loan application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val applicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val body : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateLoanApplicationAsync(applicationId, tenantId, body, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#updateLoanApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#updateLoanApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **body** | **kotlin.Any**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateLoanAsync"></a>
# **updateLoanAsync**
> EmptyEnvelope updateLoanAsync(loanId, tenantId, loanUpdateDto, apiVersion, xApiVersion)

Updates a loan

Updates the specified loan.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoansApi()
val loanId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val loanUpdateDto : LoanUpdateDto =  // LoanUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateLoanAsync(loanId, tenantId, loanUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoansApi#updateLoanAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoansApi#updateLoanAsync")
    e.printStackTrace()
}
```

### Parameters
| **loanId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **loanUpdateDto** | [**LoanUpdateDto**](LoanUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

