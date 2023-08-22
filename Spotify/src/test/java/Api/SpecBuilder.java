package Api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder {

	
	public static RequestSpecification ReqSpecBuilder()
	{
		return new RequestSpecBuilder()
		.setBaseUri("https://api.spotify.com")
		.setBasePath("/v1")
		.setContentType(ContentType.JSON)
		.addHeader("Authorization", "Bearer BQA-7BcP-ox1tV3XqoKK7CPBSWgcfTvnNALOre1HXuxyJX8fl7CR5LFJ1PcywqbHAqwpuNSXqCNN-UOHvwn7W-MyJUo-bOBRV52sC2wujx9fbd86Wne0K0eqRMtKVAW73BTBSlNWuq7-YvHVUpOvEGvwKGaeFjhGdYxcepBsO1WTqJUYf4xlQlYElwNXWGG5GQ1WEAfIj9iaz1hPeNcOWnwl6rPembMmb6qcU6QIDkrTbfZg-5eoAQRsjbI_alEmtSlpCL5ilAiMvIoL")
		.log(LogDetail.ALL)
	    .build();
	}
	public static ResponseSpecification ResSpecBuiler()
	{
		return new ResponseSpecBuilder()
		.expectContentType(ContentType.JSON)
		.log(LogDetail.ALL)
		.build();
	}

}
