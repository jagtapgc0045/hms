package authentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class xCreateGitRepo {
	
	@Test
	public void createGitRepository()
	{
		RestAssured.baseURI="https://api.github.com";
		Response resp=given()
		.log().all()
		.header("Accept","application/vnd.github+json")
		.header("Authorization","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")
		.header("X-GitHub-Api-Version","2022-11-28")
		.body("{\"name\":\"att sample creation\",\"description\":\"This is your first repo!\",\"homepage\":\"https://github.com\",\"private\":false,\"is_template\":true}")
		.when()
		.post("/user/repos")
		.then()
		.log().all()
		.extract()
		.response();
		
		String response=resp.asPrettyString();
		System.out.println(response);
		
	}

}
