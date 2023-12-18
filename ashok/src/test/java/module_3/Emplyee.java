package module_3;

 interface Wroker {

 void joiningProcess();//public abstract void joiningProcess(); 
 void pF(); 
 void allocateWork(); 
} 
abstract class Infosys implements Wroker { 
@Override
public void joiningProcess() { 
 System.out.println("1.Selection \n2.Document Verification\n3.Send Offer Letter"); 
} 
@Override
public void pF() { 
 System.out.println("As per the standard norm of EP"); 
 } 
abstract public void location(); 
} 
class HrDeptInf extends Infosys 
{ 
@Override
public void allocateWork() { 
 System.out.println("Cycle-1 is for Development\nCycle-2 is for QA"); 
 } 
@Override
public void location() { 
 System.out.println("For training-Bangalore Deployment-Hyderabad"); 
 } 
}


public class Emplyee {

	public static void main(String[] args) {
	
		 HrDeptInf i1=new HrDeptInf(); 
		 i1.joiningProcess(); 
		 i1.allocateWork(); 
		 i1.pF(); 
		 i1.location(); 
		 } 
		} 
	

