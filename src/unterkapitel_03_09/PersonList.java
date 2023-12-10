package unterkapitel_03_09;

public class PersonList {

		 private String name;
		 private int age;
		 
		 public PersonList(String name, int age) { 
		  this.name = name;
		  this.age = age;
		 }
		 
		 public int getAge(){
			 return age;
		 }
		 
		 public String getName(){
			 return name;
		 }
}