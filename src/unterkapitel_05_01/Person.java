package unterkapitel_05_01;

import java.util.Objects;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	

	
	public String getName() {
		return name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		
		String text = "Hallo! Mein Name ist "+ getName() + " und ich bin "+ getAge()+ " Jahre alt!";
		return text;
	}
	
   public static void main(String args[]) {
	Person p = new Person("Ale",96);
	Person per1 = new Person("Ale",45);
	
	
	if(per1.getName().equals(p.getName()))
	{ System.out.println("HEUREKA!");}
   }
   
   // TOMORROW
   

   
   public boolean equalsObject(Object obj) {
	   if (obj == null) {
		   
		   return false;
	   }
	   if (!(obj instanceof Person)) { 
		   return false;
	   }
	   
	   Person p = (Person) obj; // I give the instance person
	   
	  return p.getName().equals(getName()) && p.getAge() == getAge(); 
   }

   
   @Override
   public boolean equals(Object obj) {
       if (this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) return false;

       Person other = (Person) obj;
       return Objects.equals(name, other.name) && age == other.age;
   }

   @Override
   public int hashCode() {
	   int prime = 31;
	   int result = 1;
	   result = prime * result + age;
	   result = prime * result + ((name == null) ? 0 : name.hashCode());
	   return result; //?
   }

//	   public int compareTo(Person p) {
//		   if (getAge() > p.getAge()) return -1;
//		   else if (getAge() < p.getAge()) return +1;
//		   else return 0;
//	   }
	   
	  // Ale, Ciulby, Maria
//	  public int compareTo(Person p) {
//	  return getName().compareTo(p.getName());
//	   
//	   }
	// Maria, Ciulby,Ale 
	  
	  public int compareTo(Person p) {
		  return p.getName().compareTo(getName());
	   }

	   
   
}

//public boolean equalsObject(Object o) {
//    if (this == o) {
//        return true;
//    }
//    if (o == null || getClass() != o.getClass()) {
//        return false;
//    }
//    Person p = (Person) o; // Ottieni l'istanza di Person
//    return p.getName().equals(getName()) && p.getAge() == getAge();
//}

