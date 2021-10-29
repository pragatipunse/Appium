package API_Package;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_1 {
	
	@Test
	void post() 
	{
	
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request=RestAssured.given();
		
		JSONObject json=new JSONObject();
		json.put("name", "pragati");
		json.put("email", "pragatipun1995@gmail.com");
		json.put("gender", "Female");
		json.put("status", "active");
		
		System.out.println(json.toJSONString());
		
		request.header("Content-Type","application/json");
		request.body(json.toJSONString());
		Response response=request.post("public/v1/users?access-token=0b905c8b9f5733c53fe1614972fe7d2a3a3ca6aab6e226b77eab85f492808e12");
		System.out.println(response.getBody().asString());

		int statusCode=response.statusCode();
        System.out.println(statusCode);
	}

}


