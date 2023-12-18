package corejava;

public class MEthod_overloading {
	public void m1(int a, long h) {
		System.out.println(a + " " + h);

	}

	public void m2(String s, String b) {
		System.out.println(s + " " + b);

	}

	public void m3(long k) {
		System.out.println(k);
	}

	public static void main(String[] args) {
		MEthod_overloading al = new MEthod_overloading();
        al.m1(1, 3);
		al.m2("ashok", "kowsi");
		al.m3(91483433);

	}

}
