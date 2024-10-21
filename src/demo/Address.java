package demo;

public class Address {
   private String hno;
   private String streetName;
   private String locality;
   private String city;
   private int pin;
   private String state;
   
public Address(String hno, String streetName, String locality, String city, int pin, String state) {
	super();
	this.hno = hno;
	this.streetName = streetName;
	this.locality = locality;
	this.city = city;
	this.pin = pin;
	this.state = state;
}

@Override
public String toString() {
	return "Address [hno=" + hno + ", streetName=" + streetName + ", locality=" + locality + ", city=" + city + ", pin="
			+ pin + ", state=" + state + "]";
}
   

   

	
}
