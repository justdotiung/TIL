package serach;

import java.util.Scanner;

public class BinSearchEx_03_5 {
	// �迭 a�� ���� n�� ��ҿ��� key�� ���� ��Ҹ� �����˻�
	static int binSearchX(int[] a, int n, int key) {
		int pl = 0; // �˻����� �� ���� index
		int pr = n - 1; // �˻����� �� ���� index

		do {
			int pc = (pl + pr) / 2; // �߾ӿ���� index
			if (a[pc] == key) {
				for (; pc > pl; pc--) // key�� ���� �� ���� ��Ҹ� ã���ϴ�
					if (a[pc - 1] < key)
						break;
				return pc; // �˻�����
			} else if (a[pc] < key)
				pl = pc + 1; // �˻������� ���� �������� ����
			else
				pr = pc - 1; // �˻������� ���� �������� ����
		} while (pl <= pr);

		return -1; // �˻�����
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // ��ڼ� num�� �迭

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0]��"); // �� �� ��Ҹ� �о� ����
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]��");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]); // �ϳ� ���� ��Һ��� ������ �ٽ� �Է�
		}

		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int ky = stdIn.nextInt();

		int idx = binSearchX(x, num, ky); // �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "�� x[" + idx + "]�� �ֽ��ϴ�.");
	}

}
