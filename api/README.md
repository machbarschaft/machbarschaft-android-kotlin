# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AdminrestserviceApi;

public class AdminrestserviceApiExample {

    public static void main(String[] args) {
        AdminrestserviceApi apiInstance = new AdminrestserviceApi();
        String userId = "userId_example"; // String | userId
        PatchUserAdminDto userPatch = new PatchUserAdminDto(); // PatchUserAdminDto | userPatch
        Integer rawStatusCode = 56; // Integer | 
        String statusCode = "statusCode_example"; // String | 
        try {
            MonoUserResource result = apiInstance.updateUserAdminUsingPATCH(userId, userPatch, rawStatusCode, statusCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminrestserviceApi#updateUserAdminUsingPATCH");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://service-api-ng.nightly.staging.colivery.app/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminrestserviceApi* | [**updateUserAdminUsingPATCH**](docs/AdminrestserviceApi.md#updateUserAdminUsingPATCH) | **PATCH** /v1/admin/users/{userId} | updateUserAdmin
*LocationrestserviceApi* | [**geoCodeAddressUsingGET**](docs/LocationrestserviceApi.md#geoCodeAddressUsingGET) | **GET** /v1/location | geoCodeAddress
*OrderrestserviceApi* | [**abortOrderDeliveryUsingPATCH**](docs/OrderrestserviceApi.md#abortOrderDeliveryUsingPATCH) | **PATCH** /v1/order/{orderId}/abort | abortOrderDelivery
*OrderrestserviceApi* | [**acceptOrderUsingPATCH**](docs/OrderrestserviceApi.md#acceptOrderUsingPATCH) | **PATCH** /v1/order/{orderId}/accept | acceptOrder
*OrderrestserviceApi* | [**cancelOrderUsingPATCH**](docs/OrderrestserviceApi.md#cancelOrderUsingPATCH) | **PATCH** /v1/order/{orderId}/cancel | cancelOrder
*OrderrestserviceApi* | [**createOrderUsingPOST**](docs/OrderrestserviceApi.md#createOrderUsingPOST) | **POST** /v1/order | createOrder
*OrderrestserviceApi* | [**deliverOrderUsingPATCH**](docs/OrderrestserviceApi.md#deliverOrderUsingPATCH) | **PATCH** /v1/order/{orderId}/deliver | deliverOrder
*OrderrestserviceApi* | [**searchOrdersInRangeUsingGET**](docs/OrderrestserviceApi.md#searchOrdersInRangeUsingGET) | **GET** /v1/order | searchOrdersInRange
*UserrestserviceApi* | [**createUserUsingPOST**](docs/UserrestserviceApi.md#createUserUsingPOST) | **POST** /v1/user | createUser
*UserrestserviceApi* | [**deleteOwnUserUsingDELETE**](docs/UserrestserviceApi.md#deleteOwnUserUsingDELETE) | **DELETE** /v1/user | deleteOwnUser
*UserrestserviceApi* | [**getDriverOrdersUsingGET**](docs/UserrestserviceApi.md#getDriverOrdersUsingGET) | **GET** /v1/user/orders-accepted | getDriverOrders
*UserrestserviceApi* | [**getOrdersForUserUsingGET**](docs/UserrestserviceApi.md#getOrdersForUserUsingGET) | **GET** /v1/user/orders | getOrdersForUser
*UserrestserviceApi* | [**getUserUsingGET**](docs/UserrestserviceApi.md#getUserUsingGET) | **GET** /v1/user | getUser
*UserrestserviceApi* | [**updateOwnUserUsingPUT**](docs/UserrestserviceApi.md#updateOwnUserUsingPUT) | **PUT** /v1/user | updateOwnUser


## Documentation for Models

 - [AnonymizedUserResource](docs/AnonymizedUserResource.md)
 - [CreateOrderDto](docs/CreateOrderDto.md)
 - [CreateOrderItemDto](docs/CreateOrderItemDto.md)
 - [CreateUserDto](docs/CreateUserDto.md)
 - [FluxUserOrderAcceptedResponse](docs/FluxUserOrderAcceptedResponse.md)
 - [FluxUserOrderResponse](docs/FluxUserOrderResponse.md)
 - [FluxUserOrderSearchResponse](docs/FluxUserOrderSearchResponse.md)
 - [GeoPointResource](docs/GeoPointResource.md)
 - [GeoPointResource1](docs/GeoPointResource1.md)
 - [LocationResource](docs/LocationResource.md)
 - [MonoLocationResource](docs/MonoLocationResource.md)
 - [MonoOrderResource](docs/MonoOrderResource.md)
 - [MonoUserResource](docs/MonoUserResource.md)
 - [OrderItemResource](docs/OrderItemResource.md)
 - [OrderResource](docs/OrderResource.md)
 - [PatchUserAdminDto](docs/PatchUserAdminDto.md)
 - [UpdateUserDto](docs/UpdateUserDto.md)
 - [UserOrderAcceptedResponse](docs/UserOrderAcceptedResponse.md)
 - [UserOrderResponse](docs/UserOrderResponse.md)
 - [UserOrderSearchResponse](docs/UserOrderSearchResponse.md)
 - [UserResource](docs/UserResource.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



