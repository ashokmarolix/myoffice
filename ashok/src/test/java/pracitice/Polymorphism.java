package pracitice;

public class Polymorphism {   
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
     public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

     public static void main(String[] args) {
		Polymorphism pm = new Polymorphism();
        System.out.println("Sum of two integers: " + pm.add(5, 10));
        System.out.println("Sum of three integers: " + pm.add(5, 10, 15));
        System.out.println("Concatenation of two strings: " + pm.concatenate("Hello, ", "World!"));
    

	}

}
