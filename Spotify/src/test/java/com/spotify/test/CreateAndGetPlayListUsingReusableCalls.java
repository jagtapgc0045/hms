package com.spotify.test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.spotify.pojo.Playlist;

import Api.PlaylistAPI;
import io.restassured.response.Response;
import junit.framework.Assert;

public class CreateAndGetPlayListUsingReusableCalls {

	static String playlistid;
	@Test(priority=1)
	public void CreateSpotifyPlaylist()
	{
		Playlist reqplylist=new Playlist();
		reqplylist.setName("Happy Working Songs2");
		reqplylist.setDescription("Play to feel happy");
		reqplylist.setPublic(false);
		
	Response response=PlaylistAPI.post(reqplylist);
	Playlist responseplaylist=response.as(Playlist.class);

		String req_namevalue=reqplylist.getName();
		 String res_namevalue=responseplaylist.getName();
		 playlistid=responseplaylist.getId();
		 System.out.println(playlistid);
		 Assert.assertEquals(req_namevalue, res_namevalue);
		 
		
	}
	
	
	@Test(priority=2)
	public void GetAllPlaylist()
	{
		Playlist reqplylist=new Playlist();
		reqplylist.setName("Happy Working Songs2");
		reqplylist.setDescription("Play to feel happy");
		reqplylist.setPublic(false);
		Response response=PlaylistAPI.get(playlistid);
		Playlist responoseplaylist=response.as(Playlist.class);
		Assert.assertEquals(responoseplaylist.getName() , reqplylist.getName());
	}
}
