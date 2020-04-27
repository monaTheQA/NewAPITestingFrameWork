package APIFrameWorkTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import APIFrameWorkAPIs.DeleteCustomerAPI;
import APIFrameWorkSetUp.BaseTest;
import io.restassured.response.Response;

public class DeleteCustomerTest extends BaseTest{
	@Test
	public void deleteCustomerviaKey() {
		Response response = DeleteCustomerAPI.deleteCustomer();
		response.prettyPrint();
		String customerID = response.jsonPath().get("id");
		System.out.println("Deleted Customer id is :" + customerID);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(customerID, config.getProperty("cus_HAoD4fQBPBjRFN"));
	}
}
