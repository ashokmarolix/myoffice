package pracitice;

    class arjun{
	public void m1(int i) {
		System.out.println("1St method");
	}
	
	public void m1(String s) {
		System.out.println("2St method"); 
	}
	
	}
	class ram extends arjun {
		public void m1(int a) {
			System.out.println("3st method"+" "+a);
		}
	public void m1(String l) {
		System.out.println("4st method"+" "+l); 
	}
		
	}
	public class Methodoverriding {
	public static void main(String[] args) {
   arjun aa = new ram();
   aa.m1(10);
   aa.m1("hari");
	}
}

	
