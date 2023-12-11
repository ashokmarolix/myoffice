package module_4;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
		
		ArrayList<String> ar =	new ArrayList<String> ();
		
		ar.add("ashok");
		ar.add("  kowsi  ");
		ar.add("lashana");
		ar.add("ashok");
		
		System.out.println(ar);
		System.out.println(ar.get(2));
		System.out.println(ar.get(1).trim());
		System.out.println(ar.size());
		
				

	}

}
