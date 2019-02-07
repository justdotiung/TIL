package data.structure.algorithm.study;

/**
 * fibonacci(4) = fibonacci(3) + fibonacci(2)
 * fibonacci(3) = fibonacci(2) + fibonacci(1)
 * fibonacci(2) = fibonacci(1) + fibonacci(0)
 * fibonacci(1) = 1
 * fibonacci(0) = 0
 * fibonacci(n) = fibonacci(n-1) + fibonacci(n-2) (n<2)
 */
public class Recursion6 {
	public static void main(String[] args) {
		int n = 6; 
			
		int result = fibonacci(n);
		System.out.println(result);
	}

	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}