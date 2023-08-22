package com.spotify.test;

import static io.restassured.RestAssured.given;
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
import junit.framework.Assert;

public class CreateAndGetPlaylist {
	RequestSpecification reqspec;
	ResponseSpecification resspec;
	String playlistid;
	
	
	@BeforeClass
	public void ReqResSpecBuilder()
	{
		RequestSpecBuilder req= new RequestSpecBuilder();
		req.setBaseUri("https://api.spotify.com");
		req.setBasePath("/v1");
		req.setContentType(ContentType.JSON);
		req.addHeader("Authorization", "Bearer BQDVnOpUCwobAlYlDj_cxEy_gX6MObgH0HO7o4jAUEsdp1Dg3tZpfVjk8kKUlhHfog4g2d8T2kRpPOItt7ipI-eblMEiPwm4F2IUxPfG-sBVNLYjBeGhc53QapZCONzRqza__EGFOn3SSwocGk2aJs-jE-yx3FLqZLspTLrINE0RuWXAUj65toq8mrSwgHDib6FVd1AnBex4A0bPF7G95mLX8BadeXw9s1ZW_f-opq3en08Wbr8SpxPEQy-d-z1d_bLYkGW0BjQiE5XG");
		req.log(LogDetail.ALL);
	    reqspec=req.build();
		
		ResponseSpecBuilder res= new ResponseSpecBuilder();
		res.expectContentType(ContentType.JSON);
		res.log(LogDetail.ALL);
		resspec=res.build();
	}
	
	
	@Test(priority=1)
	public void CreateSpotifyPlaylist()
	{
		Playlist reqplylist=new Playlist();
		reqplylist.setName("Happy Working Songs2");
		reqplylist.setDescription("Play to feel happy");
		reqplylist.setPublic(false);
		
		Playlist responseplaylist=given(reqspec)
		.body(reqplylist)
		.when()
		.post("/users/31holv3wuq3udgkkzskn3anu2ica/playlists")
		.then()
		.spec(resspec)
		.extract().response()
		.as(Playlist.class);

		String req_namevalue=reqplylist.getName();
		 String res_namevalue=responseplaylist.getName();
		 playlistid=responseplaylist.getId();
		 System.out.println(playlistid);
		 Assert.assertEquals(req_namevalue, res_namevalue);
		 
		
	}
	
	
	@Test(priority=2)
	public void GetAllPlaylist()
	{
		given(reqspec)
		.when()
		.get("/playlists/"+playlistid)
		.then()
		.spec(resspec)
		.extract()
		.response(); 
	}

}
