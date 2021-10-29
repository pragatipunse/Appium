package API_Package;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_java {
	
	@Test
	void put() 
	{
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request=RestAssured.given();
		
		JSONObject json=new JSONObject();

		json.put("name", "Ppunse");
		json.put("email", "pragatipunse95@gmail.com");
		json.put("gender", "Female");
		json.put("status", "Inactive");
		
		
		request.header("Content-Type","application/json");
		request.body(json.toJSONString());
		Response response=request.put("public/v1/users/1773?access-token=d0e36bae5a06baa6ee8c1065608f74249b328582c3256f9ba7f470a5356a2be0");
		System.out.println(response.getBody().asString());

		int statusCode=response.statusCode();
		System.out.println(statusCode);
	}

		
		
	}
	
	


