package algorithm;

import java.util.Scanner;

public class SumForPos {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		System.out.println("1����n������ ���� ���մϴ�.");

		do {
			System.out.println("n�� �� : ");
			n = sc.nextInt();
		} while (n <= 0); // n>0��� ������ �������´�.

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1����" + n + "������ ����" + sum + "�Դϴ�.");
		sum();
		sum1();
	}

	static void sum() {
		int a;
		int b;
		System.out.println("a�� ���Է�");
		a = sc.nextInt();
		do {
			System.out.println("b�� ���Է�");
			b = sc.nextInt();
			if (a >= b)
				System.out.println("a���� ū���� �Է��ϼ���.");
		} while (a >= b);
		System.out.println("b-a :" + (b - a));

	}

	static void sum1() {
		int n;
		do {
			System.out.println("n�� �� : ");
			n = sc.nextInt();
		} while (n <= 0); // n>0��� ������ �������´�.

		int no = 0; // �ڸ���
		while (n > 0) {
			n /= 10; // n�� 10���� ����
			no++;
		}

		System.out.println("�� ���� " + no + "�ڸ��Դϴ�.");
	}
}
