package PlayList;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotify.pojo.Playlist;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreatePlaylist {
	RequestSpecification reqspec;
	ResponseSpecification resspec;
	
	@BeforeClass
	public void ReqResSpecBuilder()
	{
		RequestSpecBuilder req= new RequestSpecBuilder();
		req.setBaseUri("https://api.spotify.com");
		req.setBasePath("/v1/users");
		req.setContentType(ContentType.JSON);
		req.addHeader("Authorization", "Bearer BQBFBafwqaMXA8WGq_ZkKuwDRanHjvTpwR8zdGxjf0y8i2Ifpk33booK1gV7m5N-E5Z7ZTBVOmmY8ORrU_HEFufHcAd0iMi1pKVAwNdqckUll_2sJA3qbcqC9M0-ObPn03uNgIGB8zRA6IAUJZWiJMcBmsuaJyAsGXLYbjja8KWyUYbxc-JQFLx0CN7Js7s04lYnf4lzUrhdq5Q8sos-VhU46zbgzg2ELhHIdGMR1kzWnPi4ZIoHkwV9Uro2GwVBEqo_LDMwVoCY2QK8");
		req.log(LogDetail.ALL);
	    reqspec=req.build();
		
		ResponseSpecBuilder res= new ResponseSpecBuilder();
		res.expectContentType(ContentType.JSON);
		res.log(LogDetail.ALL);
		resspec=res.build();
	}
	
	
	@Test
	public void CreateSpotifyPlaylist()
	{
		Playlist plylist=new Playlist();
		plylist.setName("Happy Songs");
		plylist.setDescription("Play to feel happy");
		plylist.setPublic(false);
		given(reqspec)
		
		.when()
		.post("/31holv3wuq3udgkkzskn3anu2ica/playlists")
		.then()
		.assertThat()
		.body("name", equalTo("New Playlist for Classic Old songs1"))
		.spec(resspec)
		.extract().response();

		
	}

}
