package authentication;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BasicAuth {
	
	
	
	
	
	
	@Test
	public void verifyBasicAuth() {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/";
		
		
		
		
		given().contentType(ContentType.JSON).
				auth().basic("ToolsQA", "TestPassword").
		when().	log().all().	
				get("/authentication/CheckForAuthentication").
		then().	log().all().	
				assertThat().
					statusCode(not(equalTo(401)));
		
		
	}


}
