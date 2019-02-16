package data.structure.algorithm.study;

/**
 * 출처: youtube [알고리즘] 권오흠 교수님.
 * func(4) 반환값은 4 + func(3) 
 * func(3) 반환값 3 + func(2)
 * ...
 * func(0) 반환값 0
 * 결국 4 + 3 + 2 + 1 이된다. 1-n 까지의 합을 구한다.
 */
public class Recursion3 {
	public static void main(String[] args) {
		int result = func(3);
		System.out.println(result);
	}

	public static int func(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + func(n - 1);
		}
	}
}