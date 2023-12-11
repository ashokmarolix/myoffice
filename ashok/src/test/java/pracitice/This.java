package pracitice;

public class This {

	public This() {
		this(100, 200);

		System.out.println("Default add constructor");
	}

	public This(int i, int j) {
		this(223.5, 10);

		System.out.println("Result of int+int is : " + (i + j));
	}

	public This(double d, int i) {
		System.out.println("Result of double+int is : " + (d + i));
	}

	public static void main(String[] args) {
		
		This a1 = new This ();
		

	}

}
