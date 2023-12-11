package module_3;

class A // Ex‐1: call to super explicit
{
	public A(int i) {
		System.out.println("A class default constructor" + " " + i);
	}
}

class B extends A {
	public B() {
		super(100);// Explictly we added
		System.out.println("B class Default Constructor");
	}
}

public class Check {

	public static void main(String[] args) {
		B s = new B();

	}

}
