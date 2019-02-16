package data;

import java.util.Scanner;

/**
 * 자료구조 기초 
 * 출처 권오흠 교수님의 java로 배우는 자료구조
 */
public class Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] c = new int[a];
		for (int i = 0; i < a; i++) {
			c[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		for (int j = 0; j < c.length; j++) {
			for (int i = j + 1; i < c.length; i++) {
				if (c[j] == c[i]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
