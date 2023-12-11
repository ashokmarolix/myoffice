package module_3;

class Apple {
	public void m1(int i) {
		System.out.println("m1 method");

	}

	public void m1(String s) {
		System.out.println("m2 method" + " " + s);

	}
}

class Banana extends Apple {
	public void m1(int a) {
		System.out.println("m3 method" + " " + a);
	}

	public void m1(String k) {
		System.out.println("m4 method" + " " + k);
	}
}

public class Overiding {

	public static void main(String[] args) {

		Apple app = new Banana();
		app.m1(10);
		app.m1("ashok");
		Apple a = new Apple();
		a.m1(0);

	}

}
