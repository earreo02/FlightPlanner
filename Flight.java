/*
 * File: Flight.java
 * Will eventually represent a particular flight between 
 * two locations.
 */
public class Flight {
	//TODO: Implement me!
	private String location, destination, time;
	
	public Flight(String location, String destination, String time) {
		this.location = location;
		this.destination = destination;
		this.time  = time; 
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public String getTime() {
		return this.time;
	}
	
	public String toString() {
		return this.location + "->" + this.destination + ":" + this.time;
	}
}
