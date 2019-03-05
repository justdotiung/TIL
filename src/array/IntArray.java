package array;

public class IntArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 0;
		a[1] = 37;
		a[2] = 51;
		a[3] = 0;
		

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]" + a[i]);
		}
		;
	}
}
