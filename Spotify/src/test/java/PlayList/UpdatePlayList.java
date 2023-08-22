package PlayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class UpdatePlayList {
	
	@Test
	public void updatePlayList()
	{
		RestAssured.baseURI="https://api.spotify.com";
		given()
		.header("Authorization","Bearer BQAarrAwdCzaaYAR9hX50JnygOwTc3aCHuAp_tMQ353dwJ7Ay2HT_V1Dg-wC4iVCC06J0NHAmrMZRVxMuJ0UmGRNWpUQLCo7T4gceEi10BViMLevPZp71bMiwaJqJgqd4KNQLDZqDpJMuHiGn-vE5bKkN0DIcMkBDKykxYCgWrxdWOh6vNJ0tHH0ZK0VeoMoB_JMDfiMowS0BGwpgJwZIam0zUeCUGqObDjKhM0Wx6nyMWJbzcNQV_On8LcawqVM0WWmeZe9ralbMuQg")
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"name\": \"Morning Devotional songs\",\r\n"
				+ "    \"description\": \"Updated from The morning energetic songs2\",\r\n"
				+ "    \"public\": false\r\n"
				+ "}")
		.when()
		.put("/v1/playlists/5UgnftVTAeUWVloFxCX9i1")
		.then()
		.log().all()
		.extract().response();
		
		
		
	}

}
