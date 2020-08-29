package placeAPIpojos;

import java.io.Serializable;
import java.util.List;

public class City {
	
	
	Location location;
	int accuracy;
	String name;
	String phone_number;
	String address;
	List<String> types;
	String website;
	String language;
	
	
	public City() {
		
	}
	
	
	public City(Location location, int accuracy, String name, String phone_number, String address, List<String> types,
			String website, String language) {
		super();
		this.location = location;
		this.accuracy = accuracy;
		this.name = name;
		this.phone_number = phone_number;
		this.address = address;
		this.types = types;
		this.website = website;
		this.language = language;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public int getAccuracy() {
		return accuracy;
	}


	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<String> getTypes() {
		return types;
	}


	public void setTypes(List<String> types) {
		this.types = types;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	@Override
	public String toString() {
		return "Place [location=" + location + ", accuracy=" + accuracy + ", name=" + name + ", phone_number="
				+ phone_number + ", address=" + address + ", types=" + types + ", website=" + website + ", language="
				+ language + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
