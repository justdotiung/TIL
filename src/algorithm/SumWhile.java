package algorithm;

import java.util.Scanner;

//1부터 n 까지의 합.
public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값: ");
		int n = sc.nextInt();

		int sum = 0; // 합
		int i = 1;

		while (i <= n) {
			sum += i;
			++i;
			
		}
		System.out.println("i : "+i); //i의 최종값.
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다.");
	}
}
