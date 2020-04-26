package APIFrameWorkAPIs;

import static io.restassured.RestAssured.given;

import APIFrameWorkSetUp.BaseTest;
import io.restassured.response.Response;

public class CreateCustomerAPI extends BaseTest {
	public static Response createCustomerWithValidKey(String name, String email, String description) {
		Response response =given().auth().basic(config.getProperty("validApiKey"), "").formParam("email",email)
		.formParam("name", name).formParam("description", description)
		.post(config.getProperty("customerAPIEndPoint"));
		
		return response;

	}


}
