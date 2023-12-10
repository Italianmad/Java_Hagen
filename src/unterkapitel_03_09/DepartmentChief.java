package unterkapitel_03_09;

public abstract class DepartmentChief extends Employee {
	
	public DepartmentChief (String name) {
		super (name); 
		}

		public float getSalary(){
			return 2200.0f;
		}
		
		public abstract String getDepartment ();

}
