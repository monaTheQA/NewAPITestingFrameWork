package APIFrameWorkTestCases;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class CreateCustomerTest {
	@Test
	public void createCustomer(){
		
		Response response = given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc", "").formParam("email", "apiTest@test.com").formParam("name", "mona")
		.post("https://api.stripe.com/v1/customers");
		//Add new comment
		response.prettyPrint();
		String customerId = response.jsonPath().get("id");
		String customerName = response.jsonPath().get("name");
		System.out.println(response.statusCode());
		System.out.println("New Customer Id is : "+ customerId);
		System.out.println("New Customer Name is : "+ customerName);

		
		

	}

}
