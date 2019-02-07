package data.structure.algorithm.study;
/* 무한루프에 빠지지않으려면 2조건을 충족해야한다.
 *  Base case : (if 해당)적어도 하나의 recursion에 빠지지 않는 경우가 존재해야한다.
 * Recursive case  :(else 해당) recursion을 반복하다보면 결국 basecase로 수렴해야한다.
 * */
public class Recursion2 {
	public static void main(String[] args) {
		func(2);									//hello 2번출력
	}
													// 1.)				2.)					3.)
	public static void func(int k) {				// k=2  			-> k=1	 			->       k=0
		if (k <= 0) {								// 2<=0 			-> 1<=0 			->     0<=0
			return;									//										(if) 조건성립으로  return; 
		} else {									
			System.out.println("hello");			// hello 1번출력  		-> 1번출력
			func(k-1);								//func(1) 자신을 부름. -> func(0) 자신을부름
		}
	}
}
