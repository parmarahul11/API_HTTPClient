package com.base.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class HttpClient {
//1. GET Call 	
	public CloseableHttpResponse getCall(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet getCall = new HttpGet(url);
		CloseableHttpResponse response = httpClient.execute(getCall);
		
		return response;
		
		/*
		 * // A. Executiong Response Code int statusCode =
		 * response.getStatusLine().getStatusCode();
		 * System.out.println("Status code is " + statusCode);
		 * 
		 * 
		 * // B. Getting Response JSON String responseString =
		 * EntityUtils.toString(response.getEntity(), "UTF-8"); JSONObject responseJson
		 * = new JSONObject(responseString); System.out.println("API Response JSON : " +
		 * responseJson);
		 * 
		 * 
		 * // C. Getting Response Headers Header[] responseHeaders =
		 * response.getAllHeaders(); HashMap<String, String> headerAll = new
		 * HashMap<String, String>();
		 * 
		 * for (Header header : responseHeaders) {
		 * 
		 * headerAll.put(header.getName(), header.getValue());
		 * 
		 * }
		 * 
		 * System.out.println("All Headers are : "+ headerAll);
		 */
		
	}
}
