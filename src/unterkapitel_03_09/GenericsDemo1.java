package unterkapitel_03_09;
import unterkapitel_03_08.figures.*;
import java.util.ArrayList;

public class GenericsDemo1 {
	
	public static void main (String args []) {
	ArrayList<Person> persons = new ArrayList<Person>();
	ArrayList<Circle> circle = new ArrayList<Circle>();
	ArrayList<Rectangle> rectangle = new ArrayList<Rectangle>();
	
	
	// Without T
	Person p1 = new Person("Ale", 43);
	Person p2 = new Person("Ciulby",23);
	Pair o = new Pair(p1,p2);
	Person a = (Person)o.getOne();
	Person b = (Person)o.getTheother();
	System.out.println("Name got after trial: "+a.getName());
	System.out.println("Age got after trials: "+a.getAge());
	System.out.println("Name got after trials: "+b.getName());
	System.out.println("Age got after trials: "+b.getAge());
	
	Pair ps = new Pair ( new Person ("Paul",20), "Peter" ); // no mistake Object is nice!!! 
	
	

	
	persons.add(new Person("Ale",43));
	persons.add(new Person("Ciulby",23));
	persons.add(new Person("Katze", 26));
	//persons.add(new String "Katze"); //it would not accept the type 
	
	circle.add(new Circle(10));
	circle.add(new Circle(11));
	circle.add(new Circle(5));
	
	rectangle.add(new Rectangle(10,8));
	rectangle.add(new Rectangle(11,5));
	rectangle.add(new Rectangle(5,3));
	

	
	for(int i=0; i<= persons.size()-1; i++) {
		Person somebody = persons.get(i);// get an object in the cycle
		Circle c1 = circle.get(i);
		Rectangle r1 = rectangle.get(i);
		
		System.out.println("Name: "+ somebody.getName());
		System.out.println("Age: "+ somebody.getAge());
		System.out.println("*************************************************************************");
		System.out.println("Circle area for "+somebody.getName()+ " is: "+ c1.getArea());
		System.out.println("Rectangle area for "+somebody.getName()+ " is: "+ r1.getArea());
		System.out.println("*************************************************************************");
		System.out.println("Name "+somebody.getName()+ " is: "+ c1.getArea());
		System.out.println("Age "+somebody.getName()+ " is: "+ r1.getArea());
		System.out.println("*************************************************************************");
		
	}

	}

}
