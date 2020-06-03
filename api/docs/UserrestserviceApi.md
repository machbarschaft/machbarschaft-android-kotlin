# UserrestserviceApi

All URIs are relative to *https://service-api-ng.nightly.staging.colivery.app/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserUsingPOST**](UserrestserviceApi.md#createUserUsingPOST) | **POST** /v1/user | createUser
[**deleteOwnUserUsingDELETE**](UserrestserviceApi.md#deleteOwnUserUsingDELETE) | **DELETE** /v1/user | deleteOwnUser
[**getDriverOrdersUsingGET**](UserrestserviceApi.md#getDriverOrdersUsingGET) | **GET** /v1/user/orders-accepted | getDriverOrders
[**getOrdersForUserUsingGET**](UserrestserviceApi.md#getOrdersForUserUsingGET) | **GET** /v1/user/orders | getOrdersForUser
[**getUserUsingGET**](UserrestserviceApi.md#getUserUsingGET) | **GET** /v1/user | getUser
[**updateOwnUserUsingPUT**](UserrestserviceApi.md#updateOwnUserUsingPUT) | **PUT** /v1/user | updateOwnUser


<a name="createUserUsingPOST"></a>
# **createUserUsingPOST**
> MonoUserResource createUserUsingPOST(createUserDto)

createUser

### Example
```java
// Import classes:
//import io.swagger.client.api.UserrestserviceApi;

UserrestserviceApi apiInstance = new UserrestserviceApi();
CreateUserDto createUserDto = new CreateUserDto(); // CreateUserDto | createUserDto
try {
    MonoUserResource result = apiInstance.createUserUsingPOST(createUserDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserrestserviceApi#createUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUserDto** | [**CreateUserDto**](CreateUserDto.md)| createUserDto |

### Return type

[**MonoUserResource**](MonoUserResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOwnUserUsingDELETE"></a>
# **deleteOwnUserUsingDELETE**
> deleteOwnUserUsingDELETE(authenticated, authorities0Authority, credentials, details, principal)

deleteOwnUser

### Example
```java
// Import classes:
//import io.swagger.client.api.UserrestserviceApi;

UserrestserviceApi apiInstance = new UserrestserviceApi();
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    apiInstance.deleteOwnUserUsingDELETE(authenticated, authorities0Authority, credentials, details, principal);
} catch (ApiException e) {
    System.err.println("Exception when calling UserrestserviceApi#deleteOwnUserUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDriverOrdersUsingGET"></a>
# **getDriverOrdersUsingGET**
> FluxUserOrderAcceptedResponse getDriverOrdersUsingGET(authenticated, authorities0Authority, credentials, details, principal)

getDriverOrders

### Example
```java
// Import classes:
//import io.swagger.client.api.UserrestserviceApi;

UserrestserviceApi apiInstance = new UserrestserviceApi();
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    FluxUserOrderAcceptedResponse result = apiInstance.getDriverOrdersUsingGET(authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserrestserviceApi#getDriverOrdersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

[**FluxUserOrderAcceptedResponse**](FluxUserOrderAcceptedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrdersForUserUsingGET"></a>
# **getOrdersForUserUsingGET**
> FluxUserOrderResponse getOrdersForUserUsingGET(authenticated, authorities0Authority, credentials, details, principal)

getOrdersForUser

### Example
```java
// Import classes:
//import io.swagger.client.api.UserrestserviceApi;

UserrestserviceApi apiInstance = new UserrestserviceApi();
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    FluxUserOrderResponse result = apiInstance.getOrdersForUserUsingGET(authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserrestserviceApi#getOrdersForUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

[**FluxUserOrderResponse**](FluxUserOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> MonoUserResource getUserUsingGET(authenticated, authorities0Authority, credentials, details, principal)

getUser

### Example
```java
// Import classes:
//import io.swagger.client.api.UserrestserviceApi;

UserrestserviceApi apiInstance = new UserrestserviceApi();
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    MonoUserResource result = apiInstance.getUserUsingGET(authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserrestserviceApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

[**MonoUserResource**](MonoUserResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOwnUserUsingPUT"></a>
# **updateOwnUserUsingPUT**
> MonoUserResource updateOwnUserUsingPUT(updateUserDto, authenticated, authorities0Authority, credentials, details, principal)

updateOwnUser

### Example
```java
// Import classes:
//import io.swagger.client.api.UserrestserviceApi;

UserrestserviceApi apiInstance = new UserrestserviceApi();
UpdateUserDto updateUserDto = new UpdateUserDto(); // UpdateUserDto | updateUserDto
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    MonoUserResource result = apiInstance.updateOwnUserUsingPUT(updateUserDto, authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserrestserviceApi#updateOwnUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserDto** | [**UpdateUserDto**](UpdateUserDto.md)| updateUserDto |
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

[**MonoUserResource**](MonoUserResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

