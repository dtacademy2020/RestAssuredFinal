package authentication;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BasicAuthJiraAPI {
	
	@Test
	public void verifyJIRABasicAuth() {
		
	
	
	RestAssured.baseURI = "https://duovienna11.atlassian.net";
	
	
	
	
	given().
			header("Authorization","Basic ZHVvdmllbm5hMTFAZ21haWwuY29tOnZHTWNaMmVCOVVXYlBnS0dtcTJ5NDhFQg==").
			queryParam("accountId", "5e865105db49780c14a5ca0a").
	when().	log().all().	
			get("rest/api/3/user").
	then().	log().all().	
			assertThat().
				statusCode(not(equalTo(401)));
	
	}

}
