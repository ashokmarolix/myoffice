package module_4;

public class AdithyaL1 {

	public void finalize() {
		System.out.println("ashok");
	}

	public static void main(String[] args) {

		AdithyaL1 ad = new AdithyaL1();
		ad = null;
		System.gc();
	}

}
