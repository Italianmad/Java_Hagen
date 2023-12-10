package unterkapitel_03_04;


public class Person {
 public String name;
 private int pin;
 
 public Person(String name){
	 this.name = name;
	 
 }
 public int hebeGeldAb(Geldautomat gm){
	 gm.nimmPIN (pin);
	 int result= gm.gibGeld (150);
	 return result;
	 }

}
 


 


