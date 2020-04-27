package APIFrameWorkAPIs;

import APIFrameWorkSetUp.BaseTest;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;


public class DeleteCustomerAPI extends BaseTest{
	
	public static Response deleteCustomer() {
		Response response = given().auth().basic(config.getProperty("validApiKey"), "")
		.delete(config.getProperty("customerAPIEndPoint") +"/" + config.getProperty("id"));
		
		return response;
	}

}
