package algorithm;

import java.util.Scanner;

//1���� n ������ ��.
public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� ��: ");
		int n = sc.nextInt();

		int sum = 0; // ��
		int i = 1;

		while (i <= n) {
			sum += i;
			++i;
			
		}
		System.out.println("i : "+i); //i�� ������.
		System.out.println("1����"+n+"������ ����"+sum+"�Դϴ�.");
	}
}
