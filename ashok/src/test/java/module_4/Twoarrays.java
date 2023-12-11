package module_4;

public class Twoarrays {

	public static void main(String[] args) {

		int[][] a = new int[1][3];

		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
	

		for (int r = 0; r < a.length; r++) {

			for (int k = 0; k < a.length; k++) {

				System.out.println(a[r][k]);
			}

		}
	}
}
