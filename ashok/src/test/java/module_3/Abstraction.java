package module_3;

abstract class bike{
	abstract void run();
	  
}
class hero extends bike{
 public void run() {
	 System.out.println(" hero bike is runnig");
 }
}

public class Abstraction {

	public static void main(String[] args) {
		hero h = new hero();
		h.run();
    }

}
