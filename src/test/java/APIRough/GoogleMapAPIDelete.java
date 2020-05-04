package APIRough;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
public class GoogleMapAPIDelete {
	@Test
	public void deletePlaceApi() {
		Response response = given().formParams("key", "qaclick123").formParams("place_id", "1904201b6bdca77b96ddeb275640b9cf")
		.delete("https://rahulshettyacademy.com/maps/api/place/delete/json");
		
		response.prettyPrint();
		String name = response.jsonPath().get("name");
		
	}

}
