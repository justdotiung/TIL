package data.structure.algorithm.study;

/**
 * func(4) return 4 * func(3) 
 * func(3) return 3 * func(2)
 * ...
 * func(0) return 1
 * result n!
 */
public class Recursion4 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}

	public static int func(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * func(n - 1);
		}
	}
}