package corejava;

public class Method_with_returntype {
	public static String m1() {

		return "ashok";
	}

	public  int m2() {
		return 123;
	}
	public static double m3() {
		return 34.65;
	}

	public static void main(String[] args) {
		System.out.println(m1());
		Method_with_returntype as = new Method_with_returntype ();
		
		System.out.println(as.m2());
		System.out.println(m3());

	}

}
