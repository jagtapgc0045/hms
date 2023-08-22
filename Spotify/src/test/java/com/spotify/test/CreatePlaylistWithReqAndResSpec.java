package com.spotify.test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.spotify.pojo.Playlist;

import Api.SpecBuilder;
import junit.framework.Assert;

public class CreatePlaylistWithReqAndResSpec {

	String playlistid;
	//creating playlist using spec builder from another class
	@Test
	public void creatPlaylist()
	{
		Playlist reqplylist=new Playlist();
		
		reqplylist.setName("Happy Working Songs3");
		reqplylist.setDescription("Play to feel happy");
		reqplylist.setPublic(false);
		
		Playlist responseplaylist=given(SpecBuilder.ReqSpecBuilder())
		.body(reqplylist)
		.when()
		.post("/users/31holv3wuq3udgkkzskn3anu2ica/playlists")
		.then()
		.spec(SpecBuilder.ResSpecBuiler())
		.extract().response()
		.as(Playlist.class);

		String req_namevalue=reqplylist.getName();
		 String res_namevalue=responseplaylist.getName();
		 playlistid=responseplaylist.getId();
		 System.out.println(playlistid);
		 Assert.assertEquals(req_namevalue, res_namevalue);
		 
	}
}
