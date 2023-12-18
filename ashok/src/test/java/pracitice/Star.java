package pracitice;

public class Star {
	
	String name;
	int age;
	public Star(String sname, int sage) {
	    name=sname;
		age= sage;
		
		
	}

	public static void main(String[] args) {
		Star s = new Star("madhu",24);
		System.out.println(s.name+" "+s.age);
		Star s1 = new Star("adi",25);
		System.out.println(s1.name+" "+s1.age);
		
    
	}

}
