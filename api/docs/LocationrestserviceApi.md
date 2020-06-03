# LocationrestserviceApi

All URIs are relative to *https://service-api-ng.nightly.staging.colivery.app/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**geoCodeAddressUsingGET**](LocationrestserviceApi.md#geoCodeAddressUsingGET) | **GET** /v1/location | geoCodeAddress


<a name="geoCodeAddressUsingGET"></a>
# **geoCodeAddressUsingGET**
> MonoLocationResource geoCodeAddressUsingGET(countryCode, zipCode)

geoCodeAddress

### Example
```java
// Import classes:
//import io.swagger.client.api.LocationrestserviceApi;

LocationrestserviceApi apiInstance = new LocationrestserviceApi();
String countryCode = "countryCode_example"; // String | countryCode
String zipCode = "zipCode_example"; // String | zipCode
try {
    MonoLocationResource result = apiInstance.geoCodeAddressUsingGET(countryCode, zipCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationrestserviceApi#geoCodeAddressUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| countryCode | [enum: UNDEFINED, AC, AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS, AT, AU, AW, AX, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BQ, BR, BS, BT, BU, BV, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CP, CR, CS, CU, CV, CW, CX, CY, CZ, DE, DG, DJ, DK, DM, DO, DZ, EA, EC, EE, EG, EH, ER, ES, ET, EU, EZ, FI, FJ, FK, FM, FO, FR, FX, GA, GB, GD, GE, GF, GG, GH, GI, GL, GM, GN, GP, GQ, GR, GS, GT, GU, GW, GY, HK, HM, HN, HR, HT, HU, IC, ID, IE, IL, IM, IN, IO, IQ, IR, IS, IT, JE, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MQ, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NF, NG, NI, NL, NO, NP, NR, NT, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PS, PT, PW, PY, QA, RE, RO, RS, RU, RW, SA, SB, SC, SD, SE, SF, SG, SH, SI, SJ, SK, SL, SM, SN, SO, SR, SS, ST, SU, SV, SX, SY, SZ, TA, TC, TD, TF, TG, TH, TJ, TK, TL, TM, TN, TO, TP, TR, TT, TV, TW, TZ, UA, UG, UK, UM, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, XK, YE, YT, YU, ZA, ZM, ZR, ZW]
 **zipCode** | **String**| zipCode |

### Return type

[**MonoLocationResource**](MonoLocationResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

