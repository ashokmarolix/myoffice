package pracitice;

public class Constructors1 {
	String name;
	int rollno;
	int marks;
	long phno;
	String father;

	public static void main(String[] args) {

		Constructors1 c1 = new Constructors1();
		c1.name = "ashok";
		System.out.println(c1.name);
		Constructors1 c2 = new Constructors1();
		c2.rollno = 1454;
		System.out.println(c2.rollno);
		Constructors1 c3 = new Constructors1();
		c3.marks = 95;
		System.out.println(c3.marks);
		Constructors1 c4 = new Constructors1();
		c4.phno = 914589876;
		System.out.println(c4.phno);
		Constructors1 c5 = new Constructors1();
		c5.father = "raju";
		System.out.println(c5.father);
	}

}
