# UserRestServiceApi

All URIs are relative to *http://service-api-ng.nightly.staging.colivery.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserUsingPOST**](UserRestServiceApi.md#createUserUsingPOST) | **POST** /v1/user | createUser
[**deleteOwnUserUsingDELETE**](UserRestServiceApi.md#deleteOwnUserUsingDELETE) | **DELETE** /v1/user | deleteOwnUser
[**getDriverOrdersUsingGET**](UserRestServiceApi.md#getDriverOrdersUsingGET) | **GET** /v1/user/orders-accepted | getDriverOrders
[**getOrdersForUserUsingGET**](UserRestServiceApi.md#getOrdersForUserUsingGET) | **GET** /v1/user/orders | getOrdersForUser
[**getUserUsingGET**](UserRestServiceApi.md#getUserUsingGET) | **GET** /v1/user | getUser
[**updateOwnUserUsingPUT**](UserRestServiceApi.md#updateOwnUserUsingPUT) | **PUT** /v1/user | updateOwnUser


<a name="createUserUsingPOST"></a>
# **createUserUsingPOST**
> kotlin.Any createUserUsingPOST(createUserDto)

createUser

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = UserRestServiceApi()
val createUserDto : CreateUserDtoModel =  // CreateUserDtoModel | createUserDto
try {
    val result : kotlin.Any = apiInstance.createUserUsingPOST(createUserDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserRestServiceApi#createUserUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserRestServiceApi#createUserUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUserDto** | [**CreateUserDtoModel**](CreateUserDtoModel.md)| createUserDto |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOwnUserUsingDELETE"></a>
# **deleteOwnUserUsingDELETE**
> deleteOwnUserUsingDELETE(authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)

deleteOwnUser

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = UserRestServiceApi()
val authenticated : kotlin.Boolean = true // kotlin.Boolean | 
val authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority : kotlin.String = authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority_example // kotlin.String | 
val credentials : kotlin.Any = Object // kotlin.Any | 
val details : kotlin.Any = Object // kotlin.Any | 
val principal : kotlin.Any = Object // kotlin.Any | 
try {
    apiInstance.deleteOwnUserUsingDELETE(authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)
} catch (e: ClientException) {
    println("4xx response calling UserRestServiceApi#deleteOwnUserUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserRestServiceApi#deleteOwnUserUsingDELETE")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **kotlin.Boolean**|  | [optional]
 **authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority** | **kotlin.String**|  | [optional]
 **credentials** | [**kotlin.Any**](.md)|  | [optional]
 **details** | [**kotlin.Any**](.md)|  | [optional]
 **principal** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDriverOrdersUsingGET"></a>
# **getDriverOrdersUsingGET**
> FluxUserOrderAcceptedResponseModel getDriverOrdersUsingGET(authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)

getDriverOrders

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = UserRestServiceApi()
val authenticated : kotlin.Boolean = true // kotlin.Boolean | 
val authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority : kotlin.String = authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority_example // kotlin.String | 
val credentials : kotlin.Any = Object // kotlin.Any | 
val details : kotlin.Any = Object // kotlin.Any | 
val principal : kotlin.Any = Object // kotlin.Any | 
try {
    val result : FluxUserOrderAcceptedResponseModel = apiInstance.getDriverOrdersUsingGET(authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserRestServiceApi#getDriverOrdersUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserRestServiceApi#getDriverOrdersUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **kotlin.Boolean**|  | [optional]
 **authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority** | **kotlin.String**|  | [optional]
 **credentials** | [**kotlin.Any**](.md)|  | [optional]
 **details** | [**kotlin.Any**](.md)|  | [optional]
 **principal** | [**kotlin.Any**](.md)|  | [optional]

### Return type

[**FluxUserOrderAcceptedResponseModel**](FluxUserOrderAcceptedResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrdersForUserUsingGET"></a>
# **getOrdersForUserUsingGET**
> FluxUserOrderResponseModel getOrdersForUserUsingGET(authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)

getOrdersForUser

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = UserRestServiceApi()
val authenticated : kotlin.Boolean = true // kotlin.Boolean | 
val authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority : kotlin.String = authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority_example // kotlin.String | 
val credentials : kotlin.Any = Object // kotlin.Any | 
val details : kotlin.Any = Object // kotlin.Any | 
val principal : kotlin.Any = Object // kotlin.Any | 
try {
    val result : FluxUserOrderResponseModel = apiInstance.getOrdersForUserUsingGET(authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserRestServiceApi#getOrdersForUserUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserRestServiceApi#getOrdersForUserUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **kotlin.Boolean**|  | [optional]
 **authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority** | **kotlin.String**|  | [optional]
 **credentials** | [**kotlin.Any**](.md)|  | [optional]
 **details** | [**kotlin.Any**](.md)|  | [optional]
 **principal** | [**kotlin.Any**](.md)|  | [optional]

### Return type

[**FluxUserOrderResponseModel**](FluxUserOrderResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> kotlin.Any getUserUsingGET(authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)

getUser

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = UserRestServiceApi()
val authenticated : kotlin.Boolean = true // kotlin.Boolean | 
val authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority : kotlin.String = authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority_example // kotlin.String | 
val credentials : kotlin.Any = Object // kotlin.Any | 
val details : kotlin.Any = Object // kotlin.Any | 
val principal : kotlin.Any = Object // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.getUserUsingGET(authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserRestServiceApi#getUserUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserRestServiceApi#getUserUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **kotlin.Boolean**|  | [optional]
 **authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority** | **kotlin.String**|  | [optional]
 **credentials** | [**kotlin.Any**](.md)|  | [optional]
 **details** | [**kotlin.Any**](.md)|  | [optional]
 **principal** | [**kotlin.Any**](.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOwnUserUsingPUT"></a>
# **updateOwnUserUsingPUT**
> kotlin.Any updateOwnUserUsingPUT(updateUserDto, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)

updateOwnUser

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = UserRestServiceApi()
val updateUserDto : UpdateUserDtoModel =  // UpdateUserDtoModel | updateUserDto
val authenticated : kotlin.Boolean = true // kotlin.Boolean | 
val authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority : kotlin.String = authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority_example // kotlin.String | 
val credentials : kotlin.Any = Object // kotlin.Any | 
val details : kotlin.Any = Object // kotlin.Any | 
val principal : kotlin.Any = Object // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.updateOwnUserUsingPUT(updateUserDto, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserRestServiceApi#updateOwnUserUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserRestServiceApi#updateOwnUserUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserDto** | [**UpdateUserDtoModel**](UpdateUserDtoModel.md)| updateUserDto |
 **authenticated** | **kotlin.Boolean**|  | [optional]
 **authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority** | **kotlin.String**|  | [optional]
 **credentials** | [**kotlin.Any**](.md)|  | [optional]
 **details** | [**kotlin.Any**](.md)|  | [optional]
 **principal** | [**kotlin.Any**](.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

