
# FieldInfo

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
| **attributes** | [**inline**](#Attributes) |  |  [optional] [readonly] |
| **fieldType** | [**Type**](Type.md) |  |  [optional] |
| **isInitOnly** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isLiteral** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isNotSerialized** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isPinvokeImpl** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSpecialName** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isStatic** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isAssembly** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isFamily** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isFamilyAndAssembly** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isFamilyOrAssembly** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isPrivate** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isPublic** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSecurityCritical** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSecuritySafeCritical** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSecurityTransparent** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **fieldHandle** | [**RuntimeFieldHandle**](RuntimeFieldHandle.md) |  |  [optional] |


<a id="MemberType"></a>
## Enum: memberType
| Name | Value |
| ---- | ----- |
| memberType | Constructor, Event, Field, Method, Property, TypeInfo, Custom, NestedType, All |


<a id="Attributes"></a>
## Enum: attributes
| Name | Value |
| ---- | ----- |
| attributes | PrivateScope, Private, FamANDAssem, Assembly, Family, FamORAssem, Public, FieldAccessMask, Static, InitOnly, Literal, NotSerialized, HasFieldRVA, SpecialName, RTSpecialName, HasFieldMarshal, PinvokeImpl, HasDefault, ReservedMask |



