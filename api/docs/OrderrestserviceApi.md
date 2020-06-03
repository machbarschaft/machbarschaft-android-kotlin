# OrderrestserviceApi

All URIs are relative to *https://service-api-ng.nightly.staging.colivery.app/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abortOrderDeliveryUsingPATCH**](OrderrestserviceApi.md#abortOrderDeliveryUsingPATCH) | **PATCH** /v1/order/{orderId}/abort | abortOrderDelivery
[**acceptOrderUsingPATCH**](OrderrestserviceApi.md#acceptOrderUsingPATCH) | **PATCH** /v1/order/{orderId}/accept | acceptOrder
[**cancelOrderUsingPATCH**](OrderrestserviceApi.md#cancelOrderUsingPATCH) | **PATCH** /v1/order/{orderId}/cancel | cancelOrder
[**createOrderUsingPOST**](OrderrestserviceApi.md#createOrderUsingPOST) | **POST** /v1/order | createOrder
[**deliverOrderUsingPATCH**](OrderrestserviceApi.md#deliverOrderUsingPATCH) | **PATCH** /v1/order/{orderId}/deliver | deliverOrder
[**searchOrdersInRangeUsingGET**](OrderrestserviceApi.md#searchOrdersInRangeUsingGET) | **GET** /v1/order | searchOrdersInRange


<a name="abortOrderDeliveryUsingPATCH"></a>
# **abortOrderDeliveryUsingPATCH**
> MonoOrderResource abortOrderDeliveryUsingPATCH(orderId, authenticated, authorities0Authority, credentials, details, principal)

abortOrderDelivery

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderrestserviceApi;

OrderrestserviceApi apiInstance = new OrderrestserviceApi();
UUID orderId = new UUID(); // UUID | orderId
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    MonoOrderResource result = apiInstance.abortOrderDeliveryUsingPATCH(orderId, authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderrestserviceApi#abortOrderDeliveryUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **UUID**| orderId |
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

[**MonoOrderResource**](MonoOrderResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="acceptOrderUsingPATCH"></a>
# **acceptOrderUsingPATCH**
> MonoOrderResource acceptOrderUsingPATCH(orderId, authenticated, authorities0Authority, credentials, details, principal)

acceptOrder

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderrestserviceApi;

OrderrestserviceApi apiInstance = new OrderrestserviceApi();
UUID orderId = new UUID(); // UUID | orderId
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    MonoOrderResource result = apiInstance.acceptOrderUsingPATCH(orderId, authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderrestserviceApi#acceptOrderUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **UUID**| orderId |
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

[**MonoOrderResource**](MonoOrderResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelOrderUsingPATCH"></a>
# **cancelOrderUsingPATCH**
> MonoOrderResource cancelOrderUsingPATCH(orderId, authenticated, authorities0Authority, credentials, details, principal)

cancelOrder

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderrestserviceApi;

OrderrestserviceApi apiInstance = new OrderrestserviceApi();
UUID orderId = new UUID(); // UUID | orderId
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    MonoOrderResource result = apiInstance.cancelOrderUsingPATCH(orderId, authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderrestserviceApi#cancelOrderUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **UUID**| orderId |
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

[**MonoOrderResource**](MonoOrderResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrderUsingPOST"></a>
# **createOrderUsingPOST**
> MonoOrderResource createOrderUsingPOST(order, authenticated, authorities0Authority, credentials, details, principal)

createOrder

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderrestserviceApi;

OrderrestserviceApi apiInstance = new OrderrestserviceApi();
CreateOrderDto order = new CreateOrderDto(); // CreateOrderDto | order
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    MonoOrderResource result = apiInstance.createOrderUsingPOST(order, authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderrestserviceApi#createOrderUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**CreateOrderDto**](CreateOrderDto.md)| order |
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

[**MonoOrderResource**](MonoOrderResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deliverOrderUsingPATCH"></a>
# **deliverOrderUsingPATCH**
> MonoOrderResource deliverOrderUsingPATCH(orderId, authenticated, authorities0Authority, credentials, details, principal)

deliverOrder

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderrestserviceApi;

OrderrestserviceApi apiInstance = new OrderrestserviceApi();
UUID orderId = new UUID(); // UUID | orderId
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    MonoOrderResource result = apiInstance.deliverOrderUsingPATCH(orderId, authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderrestserviceApi#deliverOrderUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **UUID**| orderId |
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

[**MonoOrderResource**](MonoOrderResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchOrdersInRangeUsingGET"></a>
# **searchOrdersInRangeUsingGET**
> FluxUserOrderSearchResponse searchOrdersInRangeUsingGET(latitude, longitude, range)

searchOrdersInRange

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderrestserviceApi;

OrderrestserviceApi apiInstance = new OrderrestserviceApi();
Double latitude = 3.4D; // Double | latitude
Double longitude = 3.4D; // Double | longitude
Integer range = 56; // Integer | range
try {
    FluxUserOrderSearchResponse result = apiInstance.searchOrdersInRangeUsingGET(latitude, longitude, range);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderrestserviceApi#searchOrdersInRangeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **Double**| latitude |
 **longitude** | **Double**| longitude |
 **range** | **Integer**| range |

### Return type

[**FluxUserOrderSearchResponse**](FluxUserOrderSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

