package data.structure.algorithm.study;

/**
 * 출처: youtube [알고리즘] 권오흠 교수님.
 * func(3 , 3) return 3 * func(3 , 2) 
 * func(3 , 2) return 3 * func(3 , 1)
 * func(3 , 1) return 3 * func(3 , 0)
 * func(3 , 0) return 1
 * result x*x^(n-1)
 */
public class Recursion5 {
	public static void main(String[] args) {
		int n = 3; 
		int x =3;		
		int result = func(x,n);
		System.out.println(result);
	}

	public static int func(int x,int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * func(x,n-1);
		}
	}
}