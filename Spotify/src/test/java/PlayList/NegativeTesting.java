package PlayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.*;

public class NegativeTesting {
	RequestSpecification reqspec;
	ResponseSpecification resspec;
	@BeforeClass
	public void ReqResSpecBuilder()
	{
		RequestSpecBuilder req= new RequestSpecBuilder();
		req.setBaseUri("https://api.spotify.com");
		req.setContentType(ContentType.JSON);
		req.addHeader("Authorization", "Bearer BQCqSzACF2OEtAd47N54QdYKoveOpVVrY2AtMM15EvUSckrSbzF_uwQ5tJKCSpl-KLSR4oSH8pKBdLUxLNzbrEfeDppkur7TCpnyp7z6jA63vsRrV2qZDr6aYVTOU3JlNbVT3sAn2RPBNeDJQtXiB8n2sco1BmH619QSGsbcE6GRqkLPo7tqDLvFNMDx-YcatiquEEr2smdC5hq8vZjEZXm5HDslITLdbSKXGhr-YkRSz38W6nykRbr0ZFFeu_yVBIafsLdCH08AvwB4");
		req.log(LogDetail.ALL);
	    reqspec=req.build();
		
		ResponseSpecBuilder res= new ResponseSpecBuilder();
		res.expectContentType(ContentType.JSON);
		res.log(LogDetail.ALL);
		resspec=res.build();
	}
	
	@Test
	public void shouldNotAbleToCreatePlaylist()
	{
		//when we passing the post request without the name of playlist in body
		//then playlist should not be created
		given(reqspec)
		.when()
		.body("{\r\n"
				+ "    \"name\": \"\",\r\n"
				+ "    \"description\": \"New playlist description\",\r\n"
				+ "    \"public\": false\r\n"
				+ "}")
		.post("/v1/users/31holv3wuq3udgkkzskn3anu2ica/playlists")
		.then()
		.spec(resspec)
		.log().all()
		.assertThat()
		.statusCode(401);
		
		
	}

}
