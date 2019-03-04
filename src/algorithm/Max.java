package algorithm;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("세 정수의 최대값을 구합니다.");
//		System.out.print("a:의  값 :" ); int a = sc.nextInt();
//		System.out.print("b:의  값 :" ); int b = sc.nextInt();
//		System.out.print("c:의  값 :" ); int c = sc.nextInt();
//		int max = a;
//		if(b> max) max=b;
//		if(c>max) max=c;
//		System.out.println("최대값은 "+max+"입니다.");
		System.out.println(max3(1, 2, 3));
		System.out.println(max4(4, 2, 3, 6));
		System.out.println(min3(4, 2, 3));
		System.out.println(med(1, 3,2));
	}

	// 최대값
	static int max3(int z, int x, int y) {
		int max = z;
		if (x > max)
			max = x;
		if (y > max)
			max = y;
		return max;
	}

	// 최대값
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		return max;
	}

	// 최소값
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min;
	}

	// 중간값
	static int med(int a, int b, int c) {
		if(a>=b)                                                                          
			if(b>=c)
				return b;
			else if (a<=c)
				return a;
			else
				return c;
		else if (a>c)
			return a;
		else if (b>c)
			return c;
		else
			return b;
	}
//	가장 처음의 if문의 판단
//	if ((b >= a && c<= a) || (b <= a && c >= a))
//	에 주목합니다. 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의 
//	else if ((a > b && c < b) || (b <= a && c > b))
//	으로 수행합니다. 결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.

}
