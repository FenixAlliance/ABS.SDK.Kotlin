
# MethodBase

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **memberType** | [**inline**](#MemberType) |  |  [optional] [readonly] |
| **name** | **kotlin.String** |  |  [optional] [readonly] |
| **declaringType** | [**Type**](Type.md) |  |  [optional] |
| **reflectedType** | [**Type**](Type.md) |  |  [optional] |
| **module** | [**Module**](Module.md) |  |  [optional] |
| **customAttributes** | [**kotlin.collections.List&lt;CustomAttributeData&gt;**](CustomAttributeData.md) |  |  [optional] [readonly] |
| **isCollectible** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **metadataToken** | **kotlin.Int** |  |  [optional] [readonly] |
| **attributes** | [**inline**](#Attributes) |  |  [optional] [readonly] |
| **methodImplementationFlags** | [**inline**](#MethodImplementationFlags) |  |  [optional] [readonly] |
| **callingConvention** | [**inline**](#CallingConvention) |  |  [optional] [readonly] |
| **isAbstract** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isConstructor** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isFinal** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isHideBySig** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSpecialName** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isStatic** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isVirtual** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isAssembly** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isFamily** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isFamilyAndAssembly** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isFamilyOrAssembly** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isPrivate** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isPublic** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isConstructedGenericMethod** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isGenericMethod** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isGenericMethodDefinition** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **containsGenericParameters** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **methodHandle** | [**RuntimeMethodHandle**](RuntimeMethodHandle.md) |  |  [optional] |
| **isSecurityCritical** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSecuritySafeCritical** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSecurityTransparent** | **kotlin.Boolean** |  |  [optional] [readonly] |


<a id="MemberType"></a>
## Enum: memberType
| Name | Value |
| ---- | ----- |
| memberType | Constructor, Event, Field, Method, Property, TypeInfo, Custom, NestedType, All |


<a id="Attributes"></a>
## Enum: attributes
| Name | Value |
| ---- | ----- |
| attributes | PrivateScope, Private, FamANDAssem, Assembly, Family, FamORAssem, Public, MemberAccessMask, UnmanagedExport, Static, Final, Virtual, HideBySig, NewSlot, CheckAccessOnOverride, Abstract, SpecialName, RTSpecialName, PinvokeImpl, HasSecurity, RequireSecObject, ReservedMask |


<a id="MethodImplementationFlags"></a>
## Enum: methodImplementationFlags
| Name | Value |
| ---- | ----- |
| methodImplementationFlags | IL, Native, OPTIL, CodeTypeMask, ManagedMask, NoInlining, ForwardRef, Synchronized, NoOptimization, PreserveSig, AggressiveInlining, AggressiveOptimization, InternalCall, Async, MaxMethodImplVal |


<a id="CallingConvention"></a>
## Enum: callingConvention
| Name | Value |
| ---- | ----- |
| callingConvention | Standard, VarArgs, Any, HasThis, ExplicitThis |



