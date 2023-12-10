package unterkapitel_05_04;

public class Address {
	 private String street;
	 private int housenumber;
	 private String city;
	 
	 public Address(String s, int h, String c) {
		 street = s;
		 housenumber = h;
		 city = c;
	 }
	 
	 public String toString() {
			
			String text = street+ " "+ housenumber + " "+ city;
			return text;
		}
}
