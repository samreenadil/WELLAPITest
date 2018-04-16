package testapiautomation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.springframework.util.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class testcase001 {
	@Test
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void basicAuthentication()
	{		
		//RestAssured.baseURI ="https://v2-standard.wellcertified.com/api";
		RequestSpecification request = RestAssured.given();
	 
		JSONObject requestParams = new JSONObject();
		requestParams.put("email", "schikara@usgbc.org");
		requestParams.put("password","shekhar1");
		request.contentType("application/json");
		request.body(requestParams.toJSONString());
		Response response = request.post("http://dev-v2-standard.wellcertified.com/api/authenticate");
		int statusCode = response.getStatusCode();
		
		//System.out.println(resBody);
		System.out.println(statusCode);
		System.out.println(response.asString());
		assertEquals(statusCode,200, "Correct status code returned");
		assertNotNull(response.asString());
		
	}
	}
	
		
	


