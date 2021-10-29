package API_Package;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_java {
	
	
	@Test
	void Delet()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		RequestSpecification request=RestAssured.given();
		Response response = request.delete("/public/?id=1773");
		
		JsonPath jpath=response.getBody().jsonPath();
		System.out.println(jpath);
		
		System.out.println(response.statusCode());
	}
}


