package corejava;

public class Parameterised_c {
	
	String name;
	long mno;
	
	public  Parameterised_c(String n, long no) {
		name =n;
		mno =no;
		
		 
	}

	public static void main(String[] args) {
		 Parameterised_c al = new  Parameterised_c ("kowsi", 9234049404l);
		 System.out.println(al.name+" "+al.mno);
		 Parameterised_c al1 = new  Parameterised_c ("ashok", 9160483498l);
		 System.out.println(al1.name+" "+al1.mno);
		
		

	}

}
