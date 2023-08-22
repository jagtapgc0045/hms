package POJOforComplexJson;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class getUsersFromResReq {

	@Test
	public void getUsers() {
		getUserRequestBody res = new getUserRequestBody();
		RestAssured.baseURI = "https://reqres.in";
		getUserRequestBody response = given().log().all()

				.when().get("/api/users?page=2").then().extract().response().as(getUserRequestBody.class);

		int page = response.getPage();
		int perpage = response.getPer_page();
		int total = response.getTotal();
		int totalPages = response.getTotal_pages();
		System.out.println(page + "\n" + perpage + "\n" + total + "\n" + totalPages + "\n"
				+ response.getData().get(1).getFirst_name());
		System.out.println("support text value from responseJson= " + response.getSupport().getText());
		System.out.println("support url value from responseJson= " + response.getSupport().getUrl());

	}
}
