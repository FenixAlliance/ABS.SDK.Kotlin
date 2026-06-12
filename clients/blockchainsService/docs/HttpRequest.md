
# HttpRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **httpContext** | [**HttpContext**](HttpContext.md) |  |  [optional] |
| **method** | **kotlin.String** |  |  [optional] |
| **scheme** | **kotlin.String** |  |  [optional] |
| **isHttps** | **kotlin.Boolean** |  |  [optional] |
| **host** | [**HostString**](HostString.md) |  |  [optional] |
| **pathBase** | [**PathString**](PathString.md) |  |  [optional] |
| **path** | [**PathString**](PathString.md) |  |  [optional] |
| **queryString** | [**QueryString**](QueryString.md) |  |  [optional] |
| **query** | [**kotlin.collections.List&lt;StringStringValuesKeyValuePair&gt;**](StringStringValuesKeyValuePair.md) |  |  [optional] |
| **protocol** | **kotlin.String** |  |  [optional] |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;kotlin.String&gt;&gt;** |  |  [optional] [readonly] |
| **cookies** | [**kotlin.collections.List&lt;StringStringKeyValuePair&gt;**](StringStringKeyValuePair.md) |  |  [optional] |
| **contentLength** | **kotlin.Long** |  |  [optional] |
| **contentType** | **kotlin.String** |  |  [optional] |
| **body** | [**java.io.File**](java.io.File.md) |  |  [optional] |
| **bodyReader** | [**java.io.File**](java.io.File.md) |  |  [optional] [readonly] |
| **hasFormContentType** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **form** | [**kotlin.collections.List&lt;StringStringValuesKeyValuePair&gt;**](StringStringValuesKeyValuePair.md) |  |  [optional] |
| **routeValues** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |



