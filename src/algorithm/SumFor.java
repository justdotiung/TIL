package algorithm;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다");
		System.out.println("n의 값 : ");
 		int n = sc.nextInt();

		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");  //개행이 안되게 print 
			else
				System.out.print(i);
			sum += i; 
		}
		System.out.println(" = " + sum);
		
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
		
		System.out.println(sum(3));
		
		
		System.out.println(sumof(3, 5));
		System.out.println(sumof(6, 4));
	}
	
	//대소관계 상관없이 사이의 합
	static int sumof(int a, int b) {
		int sum = 0;
		if (a > b) {
			for (int i = b; i < a + 1; i++) {
				sum += i;

			}
		} else if (a < b)
			for (int i = a; i < b + 1; i++) {
				sum += i;

			}
		else
			sum = a;
		return sum;
	}
	
	//가우스의덧셈
	static int sum(double n) {
		int sum = 0;
		sum=(int)((1+n)*(n/2));
		return (int)sum;
	}
}
