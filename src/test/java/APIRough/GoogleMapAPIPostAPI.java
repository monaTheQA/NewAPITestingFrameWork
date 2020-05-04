package APIRough;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GoogleMapAPIPostAPI {
	/*@Test
	public void addPlaceAPI() {
		
	Response response =	given()
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Mona New API4 Test Java\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3777\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"")
		.post("https://rahulshettyacademy.com/maps/api/place/add/json");
	
		response.prettyPrint();
		System.out.println("New Create place Api is : " + response.jsonPath().get("id"));
	}*/
	@Test
	public void addData() {
		PojoGoogleMap pgm = new PojoGoogleMap(50,"Ganesh","(+91) 983 893 8888","101 A1","shoe Park","http://google.com","French-IN","-34.44","78.22");
		
		Response response = given().contentType(ContentType.JSON)
		.body(pgm)
		.post("https://rahulshettyacademy.com/maps/api/place/add/json");
		
		response.prettyPrint();
		System.out.println("New created status is " + response.statusCode());
		Assert.assertEquals(response.statusCode(), 200);
		//System.out.println(response.jsonPath().get("name"));
	//System.out.println("New Create place Api is : " + response.jsonPath().get("name"));
		
		
	}

}
