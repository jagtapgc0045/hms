package PathAndQueryParam;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class pathParam {
					@Test
					public void getAUser()
					{
									RestAssured.baseURI="https://reqres.in";
									given()
									.log().all()
									.pathParam("pagevalue", "2")
									.when()
									.get("/api/users/{pagevalue}")
									.then()
									.log().all()
									.extract()
									.response();
					}
}
