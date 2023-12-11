

package corejava;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ak = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = ak.nextLine();
		System.out.println(name);
		float marks = ak.nextFloat();
		System.out.println(marks);
		long mno = ak.nextLong();
		System.out.println(mno);
		short roll = ak.nextShort();
		System.out.println(roll);
		double hno = ak.nextDouble();
		System.out.println(hno);
		

	}

	
}
