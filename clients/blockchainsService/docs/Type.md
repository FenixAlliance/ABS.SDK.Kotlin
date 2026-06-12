
# Type

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** |  |  [optional] [readonly] |
| **customAttributes** | [**kotlin.collections.List&lt;CustomAttributeData&gt;**](CustomAttributeData.md) |  |  [optional] [readonly] |
| **isCollectible** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **metadataToken** | **kotlin.Int** |  |  [optional] [readonly] |
| **memberType** | [**inline**](#MemberType) |  |  [optional] [readonly] |
| **namespace** | **kotlin.String** |  |  [optional] [readonly] |
| **assemblyQualifiedName** | **kotlin.String** |  |  [optional] [readonly] |
| **fullName** | **kotlin.String** |  |  [optional] [readonly] |
| **assembly** | [**Assembly**](Assembly.md) |  |  [optional] |
| **module** | [**Module**](Module.md) |  |  [optional] |
| **isInterface** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isNested** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **declaringType** | [**Type**](Type.md) |  |  [optional] |
| **declaringMethod** | [**MethodBase**](MethodBase.md) |  |  [optional] |
| **reflectedType** | [**Type**](Type.md) |  |  [optional] |
| **underlyingSystemType** | [**Type**](Type.md) |  |  [optional] |
| **isTypeDefinition** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isArray** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isByRef** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isPointer** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isConstructedGenericType** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isGenericParameter** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isGenericTypeParameter** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isGenericMethodParameter** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isGenericType** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isGenericTypeDefinition** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSZArray** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isVariableBoundArray** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isByRefLike** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isFunctionPointer** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isUnmanagedFunctionPointer** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **hasElementType** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **genericTypeArguments** | [**kotlin.collections.List&lt;Type&gt;**](Type.md) |  |  [optional] [readonly] |
| **genericParameterPosition** | **kotlin.Int** |  |  [optional] [readonly] |
| **genericParameterAttributes** | [**inline**](#GenericParameterAttributes) |  |  [optional] [readonly] |
| **attributes** | [**inline**](#Attributes) |  |  [optional] [readonly] |
| **isAbstract** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isImport** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSealed** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSpecialName** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isClass** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isNestedAssembly** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isNestedFamANDAssem** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isNestedFamily** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isNestedFamORAssem** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isNestedPrivate** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isNestedPublic** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isNotPublic** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isPublic** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isAutoLayout** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isExplicitLayout** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isLayoutSequential** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isAnsiClass** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isAutoClass** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isUnicodeClass** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isCOMObject** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isContextful** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isEnum** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isMarshalByRef** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isPrimitive** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isValueType** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSignatureType** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSecurityCritical** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSecuritySafeCritical** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isSecurityTransparent** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **structLayoutAttribute** | [**StructLayoutAttribute**](StructLayoutAttribute.md) |  |  [optional] |
| **typeInitializer** | [**ConstructorInfo**](ConstructorInfo.md) |  |  [optional] |
| **typeHandle** | [**RuntimeTypeHandle**](RuntimeTypeHandle.md) |  |  [optional] |
| **guid** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly] |
| **baseType** | [**Type**](Type.md) |  |  [optional] |
| **isSerializable** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **containsGenericParameters** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isVisible** | **kotlin.Boolean** |  |  [optional] [readonly] |


<a id="MemberType"></a>
## Enum: memberType
| Name | Value |
| ---- | ----- |
| memberType | Constructor, Event, Field, Method, Property, TypeInfo, Custom, NestedType, All |


<a id="GenericParameterAttributes"></a>
## Enum: genericParameterAttributes
| Name | Value |
| ---- | ----- |
| genericParameterAttributes | None, Covariant, Contravariant, VarianceMask, ReferenceTypeConstraint, NotNullableValueTypeConstraint, DefaultConstructorConstraint, SpecialConstraintMask, AllowByRefLike |


<a id="Attributes"></a>
## Enum: attributes
| Name | Value |
| ---- | ----- |
| attributes | NotPublic, Public, NestedPublic, NestedPrivate, NestedFamily, NestedAssembly, NestedFamANDAssem, VisibilityMask, SequentialLayout, ExplicitLayout, LayoutMask, Interface, Abstract, Sealed, SpecialName, RTSpecialName, Import, Serializable, WindowsRuntime, UnicodeClass, AutoClass, StringFormatMask, HasSecurity, ReservedMask, BeforeFieldInit, CustomFormatMask |



