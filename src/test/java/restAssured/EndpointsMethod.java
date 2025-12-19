package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EndpointsMethod extends RABaseClass {
	
	public Response getListOfUser() {
		// Set base URI once
        RestAssured.baseURI = conf.get("baseURL");   // https://reqres.in/
        RestAssured.basePath = conf.get("listUser"); // api/users?page=2

		req=RestAssured.given().header("x-api-key","reqres_cf26b5890d5b4c6aa4fcab42d11df135").queryParam("page", 2);
		//res=req.when().get("https://reqres.in/api/users?page=2");
		//res=req.when().get(conf.get("listUser"));
		res=req.when().get();
		System.out.println("getListOfUser : "+res.asString());
		return res;
	}
	
	public Response getSingleUser() {
		 RestAssured.baseURI = conf.get("baseURL");   // https://reqres.in/
	        RestAssured.basePath = conf.get("listSingleUser"); // api/users/2

	        req=RestAssured.given().header("x-api-key","reqres_cf26b5890d5b4c6aa4fcab42d11df135");
	        res=req.when().get();
			System.out.println("getSingleUser : "+res.asString());

	        return res;
	}

	public Response postUser() {
		

	        req=RestAssured.given().header("x-api-key","reqres_cf26b5890d5b4c6aa4fcab42d11df135")
	        					   .contentType("application/json")
	        					   .body(conf.get("body"))
	        					   .baseUri(conf.get("baseURL"))
	        					   .basePath(conf.get("postUser"));
	        res=req.when().post();
			System.out.println("postUser : "+res.asString());
			
	        return res;
	}
	
	public Response getCookiesFromGoogle() {
		

        req=RestAssured.given().baseUri("https://www.google.com/");
        					  // .basePath(conf.get("postUser"));
        res=req.when().get();
		System.out.println("postUser : "+res.asString());
		
        return res;
}
}


