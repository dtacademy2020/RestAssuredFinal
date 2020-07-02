package authentication;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Oauth20 {
	
	@Test
	public void verifyJIRABasicAuth() {
		
	
	
	RestAssured.baseURI = "http://coop.apps.symfonycasts.com";
	
	JsonPath jsonPath = given().
			param("client_id", "MyDuotech").
			param("client_secret", "8792143ea1f957c6e27c89a943634d97").
			param("grant_type", "client_credentials").
			
	
	
	when().	log().all().	
	post("/token").
	then().	log().all().	
		assertThat().
		statusCode(200).extract().response().jsonPath();
	
	String token = jsonPath.getString("access_token");
	
	
	System.out.println(token);
	
	
	given().
			auth().oauth2(token).
			
	when().	log().all().	
			post("/api/1013/eggs-count").
	then().	log().all().	
			assertThat().
				statusCode(200);
	
	}


}
