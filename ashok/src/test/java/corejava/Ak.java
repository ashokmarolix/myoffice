package corejava;

class Megastar {
	public void h1() {
		
		System.out.println("h1 method");
	}

	public void h2() {

		System.out.println("h2 method");

	}
}


class Ramcharan extends Megastar {
	public void h3() {

		System.out.println("h3 method");
	}

	public void h4() {

		System.out.println("h4 method");

	}
}

class Varuntaj extends Ramcharan {
	public void h5() {

		System.out.println("h5 method");
	}

	public void h6() {

		System.out.println("h6 method");

	}

}

public class Ak {

	public static void main(String[] args) {
		
		
		
		
		Megastar mk = new Ramcharan();
		Ramcharan rc3 = (Ramcharan) mk;
		
		rc3.h1();
		rc3.h2();
		rc3.h3();
		rc3.h4();
		
		
//
//		Varuntaj k = new Varuntaj ();
//		k.h1();
//		k.h2();
//		k.h5();
//		k.h6();
//k.h3();
k.h4();
	}

}


