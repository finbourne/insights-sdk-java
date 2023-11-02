/*
 * FINBOURNE Insights API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.insights.api;

import com.finbourne.insights.ApiCallback;
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.ApiResponse;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.Pair;
import com.finbourne.insights.ProgressRequestBody;
import com.finbourne.insights.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.insights.model.LusidProblemDetails;
import com.finbourne.insights.model.LusidValidationProblemDetails;
import com.finbourne.insights.model.ResourceListWithHistogramOfVendorLog;
import com.finbourne.insights.model.VendorLog;
import com.finbourne.insights.model.VendorRequest;
import com.finbourne.insights.model.VendorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendorLogsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VendorLogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VendorLogsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getVendorLogCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/vendor/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVendorLogValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVendorLog(Async)");
        }

        return getVendorLogCall(id, _callback);

    }


    private ApiResponse<VendorLog> getVendorLogWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getVendorLogValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<VendorLog>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getVendorLogAsync(String id, final ApiCallback<VendorLog> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVendorLogValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<VendorLog>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetVendorLogRequest {
        private final String id;

        private APIgetVendorLogRequest(String id) {
            this.id = id;
        }

        /**
         * Build call for getVendorLog
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getVendorLogCall(id, _callback);
        }

        /**
         * Execute getVendorLog request
         * @return VendorLog
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public VendorLog execute() throws ApiException {
            ApiResponse<VendorLog> localVarResp = getVendorLogWithHttpInfo(id);
            return localVarResp.getData();
        }

        /**
         * Execute getVendorLog request with HTTP info returned
         * @return ApiResponse&lt;VendorLog&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<VendorLog> executeWithHttpInfo() throws ApiException {
            return getVendorLogWithHttpInfo(id);
        }

        /**
         * Execute getVendorLog request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<VendorLog> _callback) throws ApiException {
            return getVendorLogAsync(id, _callback);
        }
    }

    /**
     * [EXPERIMENTAL] GetVendorLog: Get the log for a specific vendor request.
     * 
     * @param id The identifier of the request to obtain the log for. (required)
     * @return APIgetVendorLogRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIgetVendorLogRequest getVendorLog(String id) {
        return new APIgetVendorLogRequest(id);
    }
    private okhttp3.Call getVendorRequestCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/vendor/{id}/request"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVendorRequestValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVendorRequest(Async)");
        }

        return getVendorRequestCall(id, _callback);

    }


    private ApiResponse<VendorRequest> getVendorRequestWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getVendorRequestValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<VendorRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getVendorRequestAsync(String id, final ApiCallback<VendorRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVendorRequestValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<VendorRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetVendorRequestRequest {
        private final String id;

        private APIgetVendorRequestRequest(String id) {
            this.id = id;
        }

        /**
         * Build call for getVendorRequest
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getVendorRequestCall(id, _callback);
        }

        /**
         * Execute getVendorRequest request
         * @return VendorRequest
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public VendorRequest execute() throws ApiException {
            ApiResponse<VendorRequest> localVarResp = getVendorRequestWithHttpInfo(id);
            return localVarResp.getData();
        }

        /**
         * Execute getVendorRequest request with HTTP info returned
         * @return ApiResponse&lt;VendorRequest&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<VendorRequest> executeWithHttpInfo() throws ApiException {
            return getVendorRequestWithHttpInfo(id);
        }

        /**
         * Execute getVendorRequest request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<VendorRequest> _callback) throws ApiException {
            return getVendorRequestAsync(id, _callback);
        }
    }

    /**
     * [EXPERIMENTAL] GetVendorRequest: Get the request body for a vendor request.
     * 
     * @param id The identifier of the request to obtain the content for. (required)
     * @return APIgetVendorRequestRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIgetVendorRequestRequest getVendorRequest(String id) {
        return new APIgetVendorRequestRequest(id);
    }
    private okhttp3.Call getVendorResponseCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/vendor/{id}/response"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVendorResponseValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVendorResponse(Async)");
        }

        return getVendorResponseCall(id, _callback);

    }


    private ApiResponse<VendorResponse> getVendorResponseWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getVendorResponseValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<VendorResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getVendorResponseAsync(String id, final ApiCallback<VendorResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVendorResponseValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<VendorResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetVendorResponseRequest {
        private final String id;

        private APIgetVendorResponseRequest(String id) {
            this.id = id;
        }

        /**
         * Build call for getVendorResponse
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getVendorResponseCall(id, _callback);
        }

        /**
         * Execute getVendorResponse request
         * @return VendorResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public VendorResponse execute() throws ApiException {
            ApiResponse<VendorResponse> localVarResp = getVendorResponseWithHttpInfo(id);
            return localVarResp.getData();
        }

        /**
         * Execute getVendorResponse request with HTTP info returned
         * @return ApiResponse&lt;VendorResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<VendorResponse> executeWithHttpInfo() throws ApiException {
            return getVendorResponseWithHttpInfo(id);
        }

        /**
         * Execute getVendorResponse request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<VendorResponse> _callback) throws ApiException {
            return getVendorResponseAsync(id, _callback);
        }
    }

    /**
     * [EXPERIMENTAL] GetVendorResponse: Get the response from a vendor request.
     * 
     * @param id The identifier of the request to obtain the response for. (required)
     * @return APIgetVendorResponseRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIgetVendorResponseRequest getVendorResponse(String id) {
        return new APIgetVendorResponseRequest(id);
    }
    private okhttp3.Call listVendorLogsCall(String filter, String sortBy, Integer limit, String page, String histogramInterval, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/vendor";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (histogramInterval != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("histogramInterval", histogramInterval));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listVendorLogsValidateBeforeCall(String filter, String sortBy, Integer limit, String page, String histogramInterval, final ApiCallback _callback) throws ApiException {
        return listVendorLogsCall(filter, sortBy, limit, page, histogramInterval, _callback);

    }


    private ApiResponse<ResourceListWithHistogramOfVendorLog> listVendorLogsWithHttpInfo(String filter, String sortBy, Integer limit, String page, String histogramInterval) throws ApiException {
        okhttp3.Call localVarCall = listVendorLogsValidateBeforeCall(filter, sortBy, limit, page, histogramInterval, null);
        Type localVarReturnType = new TypeToken<ResourceListWithHistogramOfVendorLog>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listVendorLogsAsync(String filter, String sortBy, Integer limit, String page, String histogramInterval, final ApiCallback<ResourceListWithHistogramOfVendorLog> _callback) throws ApiException {

        okhttp3.Call localVarCall = listVendorLogsValidateBeforeCall(filter, sortBy, limit, page, histogramInterval, _callback);
        Type localVarReturnType = new TypeToken<ResourceListWithHistogramOfVendorLog>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistVendorLogsRequest {
        private String filter;
        private String sortBy;
        private Integer limit;
        private String page;
        private String histogramInterval;

        private APIlistVendorLogsRequest() {
        }

        /**
         * Set filter
         * @param filter Expression to filter the result set. Read more about &lt;see href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot;&gt; filtering results from LUSID&lt;/see&gt;. (optional)
         * @return APIlistVendorLogsRequest
         */
        public APIlistVendorLogsRequest filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Set sortBy
         * @param sortBy Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName (optional)
         * @return APIlistVendorLogsRequest
         */
        public APIlistVendorLogsRequest sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Set limit
         * @param limit When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000. (optional)
         * @return APIlistVendorLogsRequest
         */
        public APIlistVendorLogsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set page
         * @param page Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied. (optional)
         * @return APIlistVendorLogsRequest
         */
        public APIlistVendorLogsRequest page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Set histogramInterval
         * @param histogramInterval Optional interval to use in a histogram of the returned values. If not provided, no histogram will be generated. (optional)
         * @return APIlistVendorLogsRequest
         */
        public APIlistVendorLogsRequest histogramInterval(String histogramInterval) {
            this.histogramInterval = histogramInterval;
            return this;
        }

        /**
         * Build call for listVendorLogs
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listVendorLogsCall(filter, sortBy, limit, page, histogramInterval, _callback);
        }

        /**
         * Execute listVendorLogs request
         * @return ResourceListWithHistogramOfVendorLog
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ResourceListWithHistogramOfVendorLog execute() throws ApiException {
            ApiResponse<ResourceListWithHistogramOfVendorLog> localVarResp = listVendorLogsWithHttpInfo(filter, sortBy, limit, page, histogramInterval);
            return localVarResp.getData();
        }

        /**
         * Execute listVendorLogs request with HTTP info returned
         * @return ApiResponse&lt;ResourceListWithHistogramOfVendorLog&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResourceListWithHistogramOfVendorLog> executeWithHttpInfo() throws ApiException {
            return listVendorLogsWithHttpInfo(filter, sortBy, limit, page, histogramInterval);
        }

        /**
         * Execute listVendorLogs request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResourceListWithHistogramOfVendorLog> _callback) throws ApiException {
            return listVendorLogsAsync(filter, sortBy, limit, page, histogramInterval, _callback);
        }
    }

    /**
     * [EXPERIMENTAL] ListVendorLogs: List the logs for vendor requests.
     * 
     * @return APIlistVendorLogsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIlistVendorLogsRequest listVendorLogs() {
        return new APIlistVendorLogsRequest();
    }
}
