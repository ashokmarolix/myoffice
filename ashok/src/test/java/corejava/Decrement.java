package corejava;

public class Decrement {

	public static void main(String[] args) {
		int a= 6,b,c;
		//b = --a + --a;
		//c = --b;
		//--c;
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
      b = a-- +a--;
      c = b--;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
	}

}
