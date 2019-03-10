package array;

import java.util.Scanner;

public class DayOfYear {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}// �����̸� 1 ����̸� 0;

	static int dayOfYear(int y, int m, int d) {
		int days = d; // �ϼ�
		for (int i = 1; i < m; i++) {
			days += mdays[isLeap(y)][i - 1];
		}
		return days;
	}

	static int dayOfYearVer2(int y, int m, int d) {
		while (--m != 0)
			d += mdays[isLeap(y)][m - 1];
		return (d);
	}

	static int leftDayOfYear(int y, int m, int d) {
		int days = 0; // �ϼ�
		for (int i = m; i < 13; i++) {
			days += mdays[isLeap(y)][i - 1];
		}
		days = days - d;
		return days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");

		do {
			System.out.print("�� : ");
			int year = sc.nextInt();
			System.out.print("�� : ");
			int month = sc.nextInt();
			System.out.print("�� : ");
			int day = sc.nextInt();

			System.out.printf("���� %d��° �Դϴ�.\n", dayOfYear(year, month, day));
			System.out.printf("���� %d��° �Դϴ�.\n", leftDayOfYear(year, month, day));

			System.out.println("�ѹ��� �ұ��? (1/0)");
			retry = sc.nextInt();
		} while (retry == 1);
	}
}
