package com.rest.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.json.JSONObject;
import com.base.client.HttpClient;
import com.rest.base.TestBase;
import com.rest.utils.TestUtils;

public class TestGetCall extends TestBase {
	TestBase testBase;
	HttpClient driverClass;
	String APIURI;
	CloseableHttpResponse apiResponse;

	@BeforeTest
	public void setUp() {
		testBase = new TestBase();
		String URL = prop.getProperty("URI");
		String pathparam = prop.getProperty("ServiceURI");

		APIURI = URL + pathparam;

	}

	@Test
	public void testGetCall() throws ClientProtocolException, IOException {
		driverClass = new HttpClient();
		apiResponse = driverClass.getCall(APIURI);
		Assert.assertEquals(apiResponse.getStatusLine().getStatusCode(), RESPONSE_CODE_200);
	}

	@Test
	public void testGetCallResponse() throws ClientProtocolException, IOException {
		driverClass = new HttpClient();
		apiResponse = driverClass.getCall(APIURI);
		String responseString = EntityUtils.toString(apiResponse.getEntity(), "UTF-8");
		JSONObject responseJson = new JSONObject(responseString);
		
		
		
		String responseValue = TestUtils.getValueByJPath(responseJson, "/per_page");
		Assert.assertEquals(responseValue, "6");
		
	}
}
