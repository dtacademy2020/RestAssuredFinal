package serializeDeserialize;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import placeAPIpojos.Location;
import placeAPIpojos.Place;
import placeAPIpojos.PlaceResponse;

public class CreateCustomPojos {
 
	@Test
	public  void main(Location location, int accuracy, String name, String phone_number, String address, List<String> types,
			String website, String language ) {
		
		
		RestAssured.baseURI = "http://3.6.24.244";
		
		
		Place tower = new Place(new Location(48.8583701,2.2922926), 
				100, "Eiffel Tower", "+33 892 70 12 39", 
				"Champ de Mars, 5 Avenue Anatole France, 75007 Paris, France", Arrays.asList("tower", "historical") , "toureiffel.paris", "FR");
			
		PlaceResponse response = given(). log().all().
		
				queryParam("key", "qaclick123").
				contentType(ContentType.JSON).
				body(tower).
		when().	log().all().	
				post("/maps/api/place/add/json").
		then(). log().all().
				assertThat().
							statusCode(200).extract().response().as(PlaceResponse.class);
		
		
		
		assertEquals(response.getScope(), "APR");
		assertEquals(response.getStatus(), "OK");
		
		String place_id = response.getPlace_id();
		
		
		
		
		
		
		
		

		

	}

}
