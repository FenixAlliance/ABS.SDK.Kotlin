
# SuiteModule

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enable** | **kotlin.Boolean** |  |  [optional] |
| **markedForDeletion** | **kotlin.Boolean** |  |  [optional] |
| **active** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **order** | **kotlin.Int** |  |  [optional] |
| **id** | **kotlin.String** |  |  [optional] |
| **name** | **kotlin.String** |  |  [optional] |
| **fullName** | **kotlin.String** |  |  [optional] [readonly] |
| **description** | **kotlin.String** |  |  [optional] |
| **type** | [**inline**](#Type) |  |  [optional] |
| **category** | [**inline**](#Category) |  |  [optional] |
| **configuration** | **kotlin.String** |  |  [optional] |
| **author** | **kotlin.String** |  |  [optional] |
| **authorUrl** | **kotlin.String** |  |  [optional] |
| **license** | **kotlin.String** |  |  [optional] |
| **requireLicenseAcceptance** | **kotlin.Boolean** |  |  [optional] |
| **repository** | **kotlin.String** |  |  [optional] |
| **icon** | **kotlin.String** |  |  [optional] |
| **image** | **kotlin.String** |  |  [optional] |
| **nuSpecPath** | **kotlin.String** |  |  [optional] |
| **manifest** | **kotlin.String** |  |  [optional] |
| **logo** | **kotlin.String** |  |  [optional] |
| **website** | **kotlin.String** |  |  [optional] |
| **documentation** | **kotlin.String** |  |  [optional] |
| **url** | **kotlin.String** |  |  [optional] |
| **path** | **kotlin.String** |  |  [optional] |
| **openApiDefinitionSpec** | [**IOpenApiDefinitionSpec**](IOpenApiDefinitionSpec.md) |  |  [optional] |
| **swaggerSpecs** | [**kotlin.collections.List&lt;IOpenApiDefinitionSpec&gt;**](IOpenApiDefinitionSpec.md) |  |  [optional] |
| **assemblyPaths** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **requiredPermissions** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] [readonly] |
| **version** | **kotlin.String** |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | Module, Integration, StudioModule, StudioIntegration, WasmModule, WasmIntegration |


<a id="Category"></a>
## Enum: category
| Name | Value |
| ---- | ----- |
| category | Other, FinanceAndAccounting, SalesAndCommerce, MarketingAndEngagement, CustomerRelations, OperationsAndSupplyChain, ProjectsAndProductivity, PeopleAndWorkforce, LearningAndEducation, ContentAndWeb, DataAndAnalytics, ArtificialIntelligence, SecurityAndIdentity, TrustAndCompliance, Communication, DeveloperAndPlatform, IndustrySolutions |



