package PlayList;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetPlayList {
	
	@Test
	public void getCurrentUsersPlayList()
	{
		RestAssured.baseURI="https://api.spotify.com";
		Response res=given()
		.header("Authorization","Bearer BQCzPtvzciYxBkWB-D-X8KUiuFExtXDJZWLZDukt7hZfJiQacp1LS20OOIKYaS8H4NfMZT0BzD6Gt2mRsyEsicyIewRR_LHUDa1vKIxZ_veKnrpvUpyLVWblH76KkQp_-Tu9iTCkuUpGywfFEZZdEFlUGiCFiLlQ5FzzNDcoSr4E41-1Y7d6MNyeDl3C0-uXJNFfCA4VAOr3koxhr4_W-g7_BNE-s3tZ6JCEBQSXO8AZs8wJjFKcWRDDA4fusvq39oqJyJVjlt4xTPAb")
		.log().all()
		.when()
		.get("/v1/me/playlists")
		.then()
		.extract().response();
		String a=res.asString();
		
		System.out.println(a);
	}

}
