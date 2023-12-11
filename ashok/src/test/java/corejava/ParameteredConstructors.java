package corejava;

public class ParameteredConstructors {
	
	String name;
	int age;
	 
	public ParameteredConstructors( String sname, int sage) {
		name = sname;
		age = sage;
	}

	public static void main(String[] args) {
		ParameteredConstructors s1 = new ParameteredConstructors("ashok",27);
		System.out.println(s1.name+" "+s1.age);
		ParameteredConstructors s2 = new ParameteredConstructors("ravi",43);
		System.out.println(s2.name+" "+s2.age);
		
		

	}

}
