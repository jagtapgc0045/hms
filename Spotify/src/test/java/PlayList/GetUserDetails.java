package PlayList;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetUserDetails {
	
	@Test
	public void getUserDetails()
	{
		RestAssured.baseURI="https://api.spotify.com";
		Response res=given()
		.log().all()
		.header("Authorization","Bearer BQCjMJ8hmb-4JzlYmm9DqzHAVddWTdVXXVt-bxQENHqVsfmeFnYAfEm0Eh4I3RLNkXS48A_OnClVxuX96cpmMp42F-ePaOBmfcpKj10wqRrrkAzMVPDu_PkmijLebUEruEW0WtHKCmOB3TVKKXuGvTUtSitLawvu9rPl9TH2m029H3jVzpn7jMLtfNlWu2yI1ZL6AwJt2oByTv7DXnZjc2Py1NRgbesBDBGlOvzrHx71tin15SOqcyxRGpd4KVH8vXJaiebn70E8h9LH")
		.log().all()
		.when()
		.get("/v1/me")
		.then().log().all()
		.extract().response();
	}

}
