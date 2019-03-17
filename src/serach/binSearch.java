package serach;

import java.util.Scanner;

public class binSearch {
	static int binsearch(int[] a, int n, int key) {
		int pl = 0; // �˻������� ù �ε���
		int pr = n - 1;// �˻� ������ �� �ε���.

		do {
			int pc = (pl + pr) / 2; // �߾� ����� �ε���
			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				pl = pc + 1; // �˻� ������ ���� �������� ����
			else
				pr = pc - 1; // �˻������� ���� �������� ����
		} while (pl <= pr);
		return -1; // �˻� ����
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��Ҽ� :");
		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0] :");
		x[0] = sc.nextInt();

		for (int i = 1; i < x.length; i++) {
			do {
				System.out.print("x[" + i + "] :");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("�˻��� �� :");
		int ky = sc.nextInt();

		int idx = binsearch(x, num, ky);

		if (idx == -1)
			System.out.println("�װ��� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "�� [" + idx + "]�� �ֽ��ϴ�.");
	}

}
