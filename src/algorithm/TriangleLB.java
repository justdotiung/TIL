package algorithm;

import java.util.Scanner;

public class TriangleLB {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		do {
			System.out.println("n의값 :");
			n = sc.nextInt();
		} while (n <= 0);
		//triangleLB(n);
		//triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		spira(n);
		npira(n);
	}

	static void triangleLB(int n) {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleLU(int n) {
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");

		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	static void triangleRB(int n) {
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	static void spira(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i-1)*2+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i-1)*2+1; j++) {
				System.out.printf("%d",i);
			}System.out.println();
			
		}
	}
}
