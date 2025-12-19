package restAssured;

import java.io.File;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

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
	public void TC_getCookiesFromGoogle() {
		res = ep.getCookiesFromGoogle();
		Map<String, String> cookies=res.getCookies();
		System.out.println(cookies);
		
		for(Map.Entry<String, String> entry:cookies.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		//Assert.assertEquals(res.getStatusCode(), 200);
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
		
		//Schema validator
		res.then().assertThat().body(matchesJsonSchema(new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\reqresPostSchema.json")));

	}
}
