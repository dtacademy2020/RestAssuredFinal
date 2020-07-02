package placeAPIpojos;

public class Location {
	
	
	double lat;
	double lng;
	
	
	public Location(double lat, double lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	
	
	@Override
	public String toString() {
		return "Location [lat=" + lat + ", lng=" + lng + "]";
	}
	
	
	
	
	

}