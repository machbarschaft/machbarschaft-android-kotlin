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

import io.swagger.client.model.CreateUserDto;
import io.swagger.client.model.MonoUserResource;
import io.swagger.client.model.FluxUserOrderAcceptedResponse;
import io.swagger.client.model.FluxUserOrderResponse;
import io.swagger.client.model.UpdateUserDto;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class UserrestserviceApi {
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
  * createUser
  * 
   * @param createUserDto createUserDto
   * @return MonoUserResource
  */
  public MonoUserResource createUserUsingPOST (CreateUserDto createUserDto) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = createUserDto;
  
      // verify the required parameter 'createUserDto' is set
      if (createUserDto == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createUserDto' when calling createUserUsingPOST",
      new ApiException(400, "Missing the required parameter 'createUserDto' when calling createUserUsingPOST"));
      }
  

  // create path and map variables
  String path = "/v1/user".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json"
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
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (MonoUserResource) ApiInvoker.deserialize(localVarResponse, "", MonoUserResource.class);
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
   * createUser
   * 
   * @param createUserDto createUserDto
  */
  public void createUserUsingPOST (CreateUserDto createUserDto, final Response.Listener<MonoUserResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = createUserDto;

  
    // verify the required parameter 'createUserDto' is set
    if (createUserDto == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'createUserDto' when calling createUserUsingPOST",
         new ApiException(400, "Missing the required parameter 'createUserDto' when calling createUserUsingPOST"));
    }
    

    // create path and map variables
    String path = "/v1/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
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
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((MonoUserResource) ApiInvoker.deserialize(localVarResponse,  "", MonoUserResource.class));
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
  /**
  * deleteOwnUser
  * 
   * @param authenticated 
   * @param authorities0Authority 
   * @param credentials 
   * @param details 
   * @param principal 
   * @return void
  */
  public void deleteOwnUserUsingDELETE (Boolean authenticated, String authorities0Authority, Map<String, String> credentials, Map<String, String> details, Map<String, String> principal) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/v1/user".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "authenticated", authenticated));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "authorities[0].authority", authorities0Authority));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "credentials", credentials));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "details", details));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "principal", principal));


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
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return ;
        } else {
           return ;
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
   * deleteOwnUser
   * 
   * @param authenticated    * @param authorities0Authority    * @param credentials    * @param details    * @param principal 
  */
  public void deleteOwnUserUsingDELETE (Boolean authenticated, String authorities0Authority, Map<String, String> credentials, Map<String, String> details, Map<String, String> principal, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/v1/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "authenticated", authenticated));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "authorities[0].authority", authorities0Authority));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "credentials", credentials));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "details", details));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "principal", principal));


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
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
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
  /**
  * getDriverOrders
  * 
   * @param authenticated 
   * @param authorities0Authority 
   * @param credentials 
   * @param details 
   * @param principal 
   * @return FluxUserOrderAcceptedResponse
  */
  public FluxUserOrderAcceptedResponse getDriverOrdersUsingGET (Boolean authenticated, String authorities0Authority, Map<String, String> credentials, Map<String, String> details, Map<String, String> principal) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/v1/user/orders-accepted".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "authenticated", authenticated));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "authorities[0].authority", authorities0Authority));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "credentials", credentials));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "details", details));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "principal", principal));


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
           return (FluxUserOrderAcceptedResponse) ApiInvoker.deserialize(localVarResponse, "", FluxUserOrderAcceptedResponse.class);
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
   * getDriverOrders
   * 
   * @param authenticated    * @param authorities0Authority    * @param credentials    * @param details    * @param principal 
  */
  public void getDriverOrdersUsingGET (Boolean authenticated, String authorities0Authority, Map<String, String> credentials, Map<String, String> details, Map<String, String> principal, final Response.Listener<FluxUserOrderAcceptedResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/v1/user/orders-accepted".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "authenticated", authenticated));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "authorities[0].authority", authorities0Authority));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "credentials", credentials));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "details", details));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "principal", principal));


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
              responseListener.onResponse((FluxUserOrderAcceptedResponse) ApiInvoker.deserialize(localVarResponse,  "", FluxUserOrderAcceptedResponse.class));
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
  /**
  * getOrdersForUser
  * 
   * @param authenticated 
   * @param authorities0Authority 
   * @param credentials 
   * @param details 
   * @param principal 
   * @return FluxUserOrderResponse
  */
  public FluxUserOrderResponse getOrdersForUserUsingGET (Boolean authenticated, String authorities0Authority, Map<String, String> credentials, Map<String, String> details, Map<String, String> principal) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/v1/user/orders".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "authenticated", authenticated));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "authorities[0].authority", authorities0Authority));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "credentials", credentials));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "details", details));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "principal", principal));


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
           return (FluxUserOrderResponse) ApiInvoker.deserialize(localVarResponse, "", FluxUserOrderResponse.class);
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
   * getOrdersForUser
   * 
   * @param authenticated    * @param authorities0Authority    * @param credentials    * @param details    * @param principal 
  */
  public void getOrdersForUserUsingGET (Boolean authenticated, String authorities0Authority, Map<String, String> credentials, Map<String, String> details, Map<String, String> principal, final Response.Listener<FluxUserOrderResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/v1/user/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "authenticated", authenticated));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "authorities[0].authority", authorities0Authority));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "credentials", credentials));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "details", details));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "principal", principal));


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
              responseListener.onResponse((FluxUserOrderResponse) ApiInvoker.deserialize(localVarResponse,  "", FluxUserOrderResponse.class));
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
  /**
  * getUser
  * 
   * @param authenticated 
   * @param authorities0Authority 
   * @param credentials 
   * @param details 
   * @param principal 
   * @return MonoUserResource
  */
  public MonoUserResource getUserUsingGET (Boolean authenticated, String authorities0Authority, Map<String, String> credentials, Map<String, String> details, Map<String, String> principal) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/v1/user".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "authenticated", authenticated));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "authorities[0].authority", authorities0Authority));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "credentials", credentials));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "details", details));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "principal", principal));


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
           return (MonoUserResource) ApiInvoker.deserialize(localVarResponse, "", MonoUserResource.class);
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
   * getUser
   * 
   * @param authenticated    * @param authorities0Authority    * @param credentials    * @param details    * @param principal 
  */
  public void getUserUsingGET (Boolean authenticated, String authorities0Authority, Map<String, String> credentials, Map<String, String> details, Map<String, String> principal, final Response.Listener<MonoUserResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/v1/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "authenticated", authenticated));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "authorities[0].authority", authorities0Authority));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "credentials", credentials));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "details", details));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "principal", principal));


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
              responseListener.onResponse((MonoUserResource) ApiInvoker.deserialize(localVarResponse,  "", MonoUserResource.class));
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
  /**
  * updateOwnUser
  * 
   * @param updateUserDto updateUserDto
   * @param authenticated 
   * @param authorities0Authority 
   * @param credentials 
   * @param details 
   * @param principal 
   * @return MonoUserResource
  */
  public MonoUserResource updateOwnUserUsingPUT (UpdateUserDto updateUserDto, Boolean authenticated, String authorities0Authority, Map<String, String> credentials, Map<String, String> details, Map<String, String> principal) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = updateUserDto;
  
      // verify the required parameter 'updateUserDto' is set
      if (updateUserDto == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'updateUserDto' when calling updateOwnUserUsingPUT",
      new ApiException(400, "Missing the required parameter 'updateUserDto' when calling updateOwnUserUsingPUT"));
      }
  

  // create path and map variables
  String path = "/v1/user".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "authenticated", authenticated));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "authorities[0].authority", authorities0Authority));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "credentials", credentials));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "details", details));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "principal", principal));


      String[] contentTypes = {
  "application/json"
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
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (MonoUserResource) ApiInvoker.deserialize(localVarResponse, "", MonoUserResource.class);
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
   * updateOwnUser
   * 
   * @param updateUserDto updateUserDto   * @param authenticated    * @param authorities0Authority    * @param credentials    * @param details    * @param principal 
  */
  public void updateOwnUserUsingPUT (UpdateUserDto updateUserDto, Boolean authenticated, String authorities0Authority, Map<String, String> credentials, Map<String, String> details, Map<String, String> principal, final Response.Listener<MonoUserResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = updateUserDto;

  
    // verify the required parameter 'updateUserDto' is set
    if (updateUserDto == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'updateUserDto' when calling updateOwnUserUsingPUT",
         new ApiException(400, "Missing the required parameter 'updateUserDto' when calling updateOwnUserUsingPUT"));
    }
    

    // create path and map variables
    String path = "/v1/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "authenticated", authenticated));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "authorities[0].authority", authorities0Authority));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "credentials", credentials));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "details", details));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "principal", principal));


    String[] contentTypes = {
      "application/json"
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
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((MonoUserResource) ApiInvoker.deserialize(localVarResponse,  "", MonoUserResource.class));
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
