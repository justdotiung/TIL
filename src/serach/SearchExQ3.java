package serach;

import java.util.Scanner;

public class SearchExQ3 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0; // key�� ���� ��ڼ�
		for (int i = 0; i < n; i++)
			if (a[i] == key)
				idx[count++] = i;
		return count;
	}
	public static void main(String[] args) {


		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // ��ڼ� num�� �迭
		int[] y = new int[num]; // ��ڼ� num�� �迭

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}
		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int ky = stdIn.nextInt();

		int count = searchIdx(x, num, ky, y);

		if (count == 0)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			for (int i = 0; i < count; i++)
				System.out.println("�� ���� " + "x[" + y[i] + "]�� �ֽ��ϴ�.");
	}

}
