/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.MonoLocationResource;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class LocationrestserviceApi {
  String basePath = "https://service-api-ng.nightly.staging.colivery.app/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * geoCodeAddress
  * 
   * @param countryCode countryCode
   * @param zipCode zipCode
   * @return MonoLocationResource
  */
  public MonoLocationResource geoCodeAddressUsingGET (String countryCode, String zipCode) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'countryCode' is set
      if (countryCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'countryCode' when calling geoCodeAddressUsingGET",
      new ApiException(400, "Missing the required parameter 'countryCode' when calling geoCodeAddressUsingGET"));
      }
  
      // verify the required parameter 'zipCode' is set
      if (zipCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'zipCode' when calling geoCodeAddressUsingGET",
      new ApiException(400, "Missing the required parameter 'zipCode' when calling geoCodeAddressUsingGET"));
      }
  

  // create path and map variables
  String path = "/v1/location".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "zipCode", zipCode));


      String[] contentTypes = {
  
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (MonoLocationResource) ApiInvoker.deserialize(localVarResponse, "", MonoLocationResource.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * geoCodeAddress
   * 
   * @param countryCode countryCode   * @param zipCode zipCode
  */
  public void geoCodeAddressUsingGET (String countryCode, String zipCode, final Response.Listener<MonoLocationResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'countryCode' when calling geoCodeAddressUsingGET",
         new ApiException(400, "Missing the required parameter 'countryCode' when calling geoCodeAddressUsingGET"));
    }
    
    // verify the required parameter 'zipCode' is set
    if (zipCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'zipCode' when calling geoCodeAddressUsingGET",
         new ApiException(400, "Missing the required parameter 'zipCode' when calling geoCodeAddressUsingGET"));
    }
    

    // create path and map variables
    String path = "/v1/location".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "zipCode", zipCode));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((MonoLocationResource) ApiInvoker.deserialize(localVarResponse,  "", MonoLocationResource.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
