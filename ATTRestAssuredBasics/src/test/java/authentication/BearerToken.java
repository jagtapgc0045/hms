package authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;


public class BearerToken {
	
	
		@Test
		public void getAllRepositories()
		{
			RestAssured.baseURI="https://api.github.com";
			given()
			.log().all()
			.header("Accept","application/vnd.github+json")
			.header("Authorization","")
			.header("X-GitHub-Api-Version" ,"2022-11-28")
			.when()
			.get("/users/jagtapgc0045/repos")
			.then()
			.log().all()
			.extract()
			.response();
			
		}

}
