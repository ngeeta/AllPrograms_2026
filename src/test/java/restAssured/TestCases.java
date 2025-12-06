package restAssured;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import utilities.ReportsListeners;

@Listeners({ ReportsListeners.class })
public class TestCases extends RABaseClass {
	EndpointsMethod ep = new EndpointsMethod();

	@Test
	public void TC_getListOfUsers() {
		res = ep.getListOfUser();
		Assert.assertEquals(res.getStatusCode(), 200);
		extentTest.info("Status code is " + res.getStatusCode());
	}

	@Test
	public void TC_getSingleUser() {
		res = ep.getSingleUser();
		Assert.assertEquals(res.getStatusCode(), 200);
		extentTest.info("Status code is " + res.getStatusCode());

	}

	@Test
	public void TC_postUser() {
		res = ep.postUser();
		Assert.assertEquals(res.statusCode(), 201);
		extentTest.info("Status code is " + res.getStatusCode());
		extentTest.pass("Status code is 201 as expected");

		// Log response body
		extentTest.info("Response Body: " + res.getBody().asString());

		JsonPath j = res.jsonPath();
		// Check Geeta in body in expected path
		String FName = j.get("name");
		Assert.assertEquals(FName, "Geeta", "Check for presence of Geeta");
		extentTest.pass("Validated 'name' field: " + FName);

		String job = j.get("job");
		Assert.assertEquals(job, "QA Manager", "Check for presence of QA Manager");
		extentTest.pass("Validated 'job' field: " + job);

		// Geeta in body with any path
		boolean containsData = res.getBody().asString().contains("Geeta");
		Assert.assertEquals(containsData, true, "Check for presence of Geeta");
		extentTest.pass("Response body contains 'Geeta'");

	}
}
