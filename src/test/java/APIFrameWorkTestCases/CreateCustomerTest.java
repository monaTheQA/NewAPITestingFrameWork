package APIFrameWorkTestCases;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import APIFrameWorkAPIs.CreateCustomerAPI;
import APIFrameWorkSetUp.BaseTest;
import ApiFrameWorkUtilities.DataUtil;
import io.restassured.response.Response;


public class CreateCustomerTest extends BaseTest {
	@Test(dataProviderClass=DataUtil.class, dataProvider="getData")
	public void createCustomer(String name, String email, String description){
		
		//Response response = given().auth().basic(config.getProperty("validApiKey"), "").formParam("email", "apiTest@test.com").formParam("name", "mona")
		//.post("https://api.stripe.com/v1/customers");
		//Add new comment
		Response response = CreateCustomerAPI.createCustomerWithValidKey( name, email, description);
		response.prettyPrint();
		String customerId = response.jsonPath().get("id");
		String customerName = response.jsonPath().get("name");
		System.out.println(response.statusCode());
		System.out.println("New Customer Id is : "+ customerId);
		System.out.println("New Customer Name is : "+ customerName);

		
		

	}

}
