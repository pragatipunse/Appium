package API_Package;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET2 {
	
	@Test
	void Get1() 
	{

		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request  = RestAssured.given();
		Response response = request.get("\"/public/v1/users/1678\"");
		
		response.getBody().prettyPrint();
		
	}
	
}


