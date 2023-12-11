package corejava;

public class Constructors {
	String name;
	int marks;
	int no;
	long ph;
	String father = "bala";

	public static void main(String[] args) {
		// Constructors s1 = new Constructors();
		// s1.name = "akl";
		// System.out.println(s1.name);
		// Constructors s2 = new Constructors();
		// s2.name = "hrr";
		// System.out.println(s2.name);
		// Constructors s3 = new Constructors();
//		s3.name = "hs";
		// System.out.println(s3.name);

		// }

//}

		Constructors s1 = new Constructors();
		s1.name = "akl";
		System.out.println(s1.name);
		Constructors s2 = new Constructors();
		s2.marks = 97;
		System.out.println(s2.marks);
		Constructors s3 = new Constructors();
		s3.no = 25;
		System.out.println(s3.no);
		Constructors s4 = new Constructors();
		s4.ph = 9160483498l;
		System.out.println(s4.ph);
		Constructors s5 = new Constructors();
		s5.father = "bala";
		System.out.println(s5.father);

	}

}
