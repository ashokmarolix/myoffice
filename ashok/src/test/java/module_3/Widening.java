package module_3;

public class Widening {

	public static void main(String[] args) {
		double d = 163.99;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);

//		byte b=45; 
//		 //widening 
//		 short s=b; 
//		 int i=s; 
//		 long l=i; 
//		 float f=l; 
//		 double d=f; 
//		 System.out.println(s); 
//		 System.out.println(i); 
//		 System.out.println(l); 
//		 System.out.println(f); 
//		 System.out.println(d); 

	}

}
