package APIRough;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class GoogleMapAPIGet {
	
	@Test
	public void getPlaceApi() {
		
		Response response =given().formParams("key", "qaclick123").formParams("place_id", "1904201b6bdca77b96ddeb275640b9cf")
		.get("https://rahulshettyacademy.com/maps/api/place/get/json");
		
		response.prettyPrint();
		String name = response.jsonPath().get("name");
		System.out.println("Get name is : " + name);
	}

}
