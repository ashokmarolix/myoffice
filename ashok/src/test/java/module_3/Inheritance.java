package module_3;

class Megastar {
	public void m1() {

		System.out.println("m1 method");
	}

	public void m2() {
		System.out.println("m2 method");
	}

}

class Ramcharan extends Megastar {
	public void m3() {

		System.out.println("m3 method");
	}

	public void m4() {
		System.out.println("m4 method");
	}
}

class Varuntaj extends Ramcharan {
	public void m5() {

		System.out.println("m5 method");
	}

	public void m6() {
		System.out.println("m6 method");
	}

}

public class Inheritance {

	public static void main(String[] args) {
		Varuntaj a = new Varuntaj();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m5();
		a.m6();

	}

}
