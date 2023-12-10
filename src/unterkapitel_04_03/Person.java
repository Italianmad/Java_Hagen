package unterkapitel_04_03;

public class Person {
		private int age;
		private String name;
		public Person(String name) {
			this.name = name;
			age = 0;
		}
		
		public void setAge(int a) {
			if(a >= 0 && a <= 100) {
				age = a;
		} else throw new IllegalArgumentException("Ungültiges Alter "+a);
		}
			
		public void setName(String a) {
			name = a;
		} 
}


