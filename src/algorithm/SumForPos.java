package algorithm;

import java.util.Scanner;

public class SumForPos {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		System.out.println("1부터n까지의 합을 구합니다.");

		do {
			System.out.println("n의 값 : ");
			n = sc.nextInt();
		} while (n <= 0); // n>0경우 루프문 빠져나온다.

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
		sum();
		sum1();
	}

	static void sum() {
		int a;
		int b;
		System.out.println("a의 값입력");
		a = sc.nextInt();
		do {
			System.out.println("b의 값입력");
			b = sc.nextInt();
			if (a >= b)
				System.out.println("a보다 큰값을 입력하세요.");
		} while (a >= b);
		System.out.println("b-a :" + (b - a));

	}

	static void sum1() {
		int n;
		do {
			System.out.println("n의 값 : ");
			n = sc.nextInt();
		} while (n <= 0); // n>0경우 루프문 빠져나온다.

		int no = 0; // 자릿수
		while (n > 0) {
			n /= 10; // n을 10으로 나눔
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");
	}
}
