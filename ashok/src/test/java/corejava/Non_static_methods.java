package corejava;


public class Non_static_methods {
	int j = 16;
	static int h = 15;
	public void m1() {
		int  a = 10;
		System.out.println("ashok"+" "+a+" "+j);
		
	}

	public void m2() {
		String b = "lakki";
		System.out.println("kowsi"+" "+b+" "+h);
	}

	public void m3() {
		System.out.println("lakshana");
		m1();
	}

	public static void main(String[] args) {
		Non_static_methods ak = new Non_static_methods ();
		ak.m1();
		ak.m2();
		ak.m3();
		
		
		

	}

}
