package corejava;

public class FibonacciNumber {

	public static void main(String[] args) {
		int a =1;
		int b =2;
		int c;
		System.out.println(a+" "+b);
		for(int k =1; k<=15; k++) {
			c=a+b;
			System.out.println(c+" ");
			a = b;
			b = c ;
		}
		

	}

}
