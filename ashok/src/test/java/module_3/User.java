package module_3;

interface ATM { 
void deposit(); 
void withdrawl(); 
} 
class Cust implements ATM { 
@Override
public void deposit() { 
 System.out.println("Please deposit ur amount"); 
 } 
@Override
public void withdrawl() { 
 System.out.println("Collect ur amount"); 
 } 
public void balance() {
	System.out.println("the balance is zero");
}

}

    public class User {
    	
      public static void main(String[] args) {
    	  ATM   s1=new Cust (); 
    	  Cust c1=(Cust)s1;
		 s1.deposit(); 
		 s1.withdrawl(); 
		 c1.balance();
		 } 
		
}


