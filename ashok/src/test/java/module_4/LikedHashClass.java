package module_4;

import java.util.LinkedHashSet;

public class LikedHashClass {

	public static void main(String[] args) {

		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("ashok");
		lh.add("  kowsi  ");
		lh.add("lashana");
		lh.add("ashok");

		System.out.println(lh);

		System.out.println(lh.size());

	}

}
