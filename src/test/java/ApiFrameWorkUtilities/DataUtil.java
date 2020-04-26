package ApiFrameWorkUtilities;

import org.testng.annotations.DataProvider;

import APIFrameWorkSetUp.BaseTest;

public class DataUtil extends BaseTest{
	
	@DataProvider(name="getData")
	public Object[][] getData() {
		
		Object[][] data = new Object[1][3];
		
		data[0][0] = "newApiTest";
		data[0][1] = "NewAPI.test@gmail.com";
		data[0][2] = "APITest";
		
		return data;
		
	}


}
