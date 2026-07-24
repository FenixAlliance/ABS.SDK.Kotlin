
# TrustSigningReadinessDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **canProceed** | **kotlin.Boolean** |  |  [optional] |
| **blockingReasons** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **warnings** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **resolvedDocumentTitle** | **kotlin.String** |  |  [optional] |
| **resolvedProfileDisplayName** | **kotlin.String** |  |  [optional] |
| **resolvedCertificateTitle** | **kotlin.String** |  |  [optional] |
| **expectedSignatureFormat** | [**inline**](#ExpectedSignatureFormat) |  |  [optional] |
| **expectedSignaturePurpose** | [**inline**](#ExpectedSignaturePurpose) |  |  [optional] |
| **expectedDigestAlgorithm** | **kotlin.String** |  |  [optional] |
| **expectedSignatureAlgorithm** | **kotlin.String** |  |  [optional] |
| **expectedCanonicalizationAlgorithm** | **kotlin.String** |  |  [optional] |
| **policyIdentifier** | **kotlin.String** |  |  [optional] |
| **authorityProfile** | **kotlin.String** |  |  [optional] |
| **requiresCustodyProvider** | **kotlin.Boolean** |  |  [optional] |
| **requiresSourceArtifact** | **kotlin.Boolean** |  |  [optional] |
| **requiresCertificate** | **kotlin.Boolean** |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |


<a id="ExpectedSignatureFormat"></a>
## Enum: expectedSignatureFormat
| Name | Value |
| ---- | ----- |
| expectedSignatureFormat | Unknown, XAdES, PAdES, CAdES, SMIME, DetachedXmlDSig, Enveloped, Other |


<a id="ExpectedSignaturePurpose"></a>
## Enum: expectedSignaturePurpose
| Name | Value |
| ---- | ----- |
| expectedSignaturePurpose | Unknown, RegulatorySubmission, ContractExecution, EmailSigning, InternalApproval, EvidenceSealing, AgentCredential, Other |



