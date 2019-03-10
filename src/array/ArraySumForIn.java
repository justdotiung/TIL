package array;

public class ArraySumForIn {
	public static void main(String[] args) {
		double[] a = { 1.0, 2.0, 2.0, 2.0, 2.0 };

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] =" + a[i]);
		}
		double sum = 0;
		for (double i : a)
			sum += i;

		System.out.println("sum :" + sum);
	}
}
