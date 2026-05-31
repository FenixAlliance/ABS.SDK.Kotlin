
# PropertyInfo

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** |  |  [optional] [readonly] |
| **declaringType** | [**Type**](Type.md) |  |  [optional] |
| **reflectedType** | [**Type**](Type.md) |  |  [optional] |
| **module** | [**Module**](Module.md) |  |  [optional] |
| **customAttributes** | [**kotlin.collections.List&lt;CustomAttributeData&gt;**](CustomAttributeData.md) |  |  [optional] [readonly] |
| **isCollectible** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **metadataToken** | **kotlin.Int** |  |  [optional] [readonly] |
| **memberType** | [**inline**](#MemberType) |  |  [optional] [readonly] |
| **propertyType** | [**Type**](Type.md) |  |  [optional] |
| **attributes** | [**inline**](#Attributes) |  |  [optional] [readonly] |
| **isSpecialName** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **canRead** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **canWrite** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **getMethod** | [**MethodInfo**](MethodInfo.md) |  |  [optional] |
| **setMethod** | [**MethodInfo**](MethodInfo.md) |  |  [optional] |


<a id="MemberType"></a>
## Enum: memberType
| Name | Value |
| ---- | ----- |
| memberType | Constructor, Event, Field, Method, Property, TypeInfo, Custom, NestedType, All |


<a id="Attributes"></a>
## Enum: attributes
| Name | Value |
| ---- | ----- |
| attributes | None, SpecialName, RTSpecialName, HasDefault, Reserved2, Reserved3, Reserved4, ReservedMask |



