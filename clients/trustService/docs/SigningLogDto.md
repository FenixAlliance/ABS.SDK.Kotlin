
# SigningLogDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **type** | **kotlin.String** |  |  [optional] |
| **message** | **kotlin.String** |  |  [optional] |
| **logType** | [**inline**](#LogType) |  |  [optional] |
| **securityEvent** | **kotlin.String** |  |  [optional] |
| **requiresAttention** | **kotlin.Boolean** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **signingProfileId** | **kotlin.String** |  |  [optional] |
| **signingCertificateId** | **kotlin.String** |  |  [optional] |
| **signedDocumentId** | **kotlin.String** |  |  [optional] |
| **operationType** | [**inline**](#OperationType) |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **inputHash** | **kotlin.String** |  |  [optional] |
| **outputHash** | **kotlin.String** |  |  [optional] |
| **providerName** | **kotlin.String** |  |  [optional] |
| **resultCode** | **kotlin.String** |  |  [optional] |
| **signingProfileDisplayName** | **kotlin.String** |  |  [optional] |
| **signingCertificateTitle** | **kotlin.String** |  |  [optional] |
| **signedDocumentTitle** | **kotlin.String** |  |  [optional] |


<a id="LogType"></a>
## Enum: logType
| Name | Value |
| ---- | ----- |
| logType | Continue, SwitchingProtocols, Processing, EarlyHints, OK, Created, Accepted, NonAuthoritativeInformation, NoContent, ResetContent, PartialContent, MultiStatus, AlreadyReported, IMUsed, MultipleChoices, MovedPermanently, Found, SeeOther, NotModified, UseProxy, Unused, TemporaryRedirect, PermanentRedirect, BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound, MethodNotAllowed, NotAcceptable, ProxyAuthenticationRequired, RequestTimeout, Conflict, Gone, LengthRequired, PreconditionFailed, RequestEntityTooLarge, RequestUriTooLong, UnsupportedMediaType, RequestedRangeNotSatisfiable, ExpectationFailed, MisdirectedRequest, UnprocessableEntity, Locked, FailedDependency, UpgradeRequired, PreconditionRequired, TooManyRequests, RequestHeaderFieldsTooLarge, UnavailableForLegalReasons, InternalServerError, NotImplemented, BadGateway, ServiceUnavailable, GatewayTimeout, HttpVersionNotSupported, VariantAlsoNegotiates, InsufficientStorage, LoopDetected, NotExtended, NetworkAuthenticationRequired |


<a id="OperationType"></a>
## Enum: operationType
| Name | Value |
| ---- | ----- |
| operationType | Unknown, Sign, Verify, Seal, RotateCredential, ResolveCredential, SubmitToAuthority, ReceiveAuthorityResponse, Freeze |



