package Api;

import static io.restassured.RestAssured.given;

import com.spotify.pojo.Playlist;

import io.restassured.response.Response;

public class PlaylistAPI {

	public static Response post(Playlist requestPlaylist)
	{
		return given(SpecBuilder.ReqSpecBuilder())
		.body(requestPlaylist)
		.when()
		.post("/users/31holv3wuq3udgkkzskn3anu2ica/playlists")
		.then()
		.spec(SpecBuilder.ResSpecBuiler())
		.extract().response(); 
	}
	
	public static Response get(String playlistid)
	{
		return given(SpecBuilder.ReqSpecBuilder())
		.when()
		.get("/playlists/"+playlistid)
		.then()
		.spec(SpecBuilder.ResSpecBuiler())
		.extract()
		.response();
	}
}
