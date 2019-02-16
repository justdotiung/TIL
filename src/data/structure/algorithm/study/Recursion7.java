package data.structure.algorithm.study;

/**
 * 출처: youtube [알고리즘] 권오흠 교수님.
 * func(12,40) = func(40 ,12)
 * func(40,12) = func(12, 6)
 * func(12, 6) = func( 6, 0)
 * func( 6, 0) = 6
 * Euclid Method
 */
public class Recursion7 {
	public static void main(String[] args) {
		int x = 12;
		int y = 40;
		int result = func(x, y);
		System.out.println(result);
	}

//	public static int func(int x, int y) {
//		if (x<y) {
//			int temp =y; y=x; x=temp;
//		}	
//		if (x%y==0) 
//			return y;
//		else
//			return func(y ,x%y);		

	public static int func(int x, int y) {
		if(y==0)
			return x;
		else
			return func(y ,x%y);
		
	}
}