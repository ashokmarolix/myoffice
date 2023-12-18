                                                                                                                                                                                 package corejava;

public class C_overloading {
	String name ,fathername;
	float parcentage,marks;



	public C_overloading(String sname, String sfathername, float sparcentage) {
	this.name = sname;
	this.fathername = sfathername;
	this.parcentage = sparcentage;

	}

	public C_overloading(float sparcentage,float smarks) {
	this.parcentage = sparcentage;
	this.marks= smarks;

	}

	public static void main(String[] args) {
		C_overloading c1 = new C_overloading("balu","adi", 78.5f);
		C_overloading c2 = new C_overloading(97.5f,99.5f);
		System.out.println(c1.name + " " + c1.parcentage+" "+c1.fathername);
		System.out.println(c2.parcentage+" "+c2.marks);
		
		}

	}


