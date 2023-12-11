package module_4;

public class Chandrayan {

	public void m1() {
		m2();
		System.out.println("ak");

	}

	public void m2() {
		try {
			int a = 7 / 0;
			System.out.println(a);

		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {
		Chandrayan ch = new Chandrayan();
		ch.m2();

	}

}
