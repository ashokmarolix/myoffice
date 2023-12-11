package pracitice;

class surya {
	public void m1() {
	System.out.println("m1 method");
}
}
class charan extends surya{
	public void m2() {
		System.out.println("m2 method");
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		charan c = new charan();
		c.m1();
		c.m2();

	}

}
