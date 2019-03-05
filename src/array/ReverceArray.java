package array;

import java.util.Scanner;

public class ReverceArray {
	private static int sum;

	// �迪 ���� �ڸ��ٲ�
	static void reverce(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}

	// �迭��� �ڸ��ٲ�
	static void swap(int[] a, int idx1, int idx2) {

		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��Ҽ� :");
		int num = sc.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}

		// reverce(x);

		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for (int i = 0; i < x.length / 2; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(" " + x[j]);
			}
			System.out.print("\na[" + i + "]��(��)a[" + (x.length - i - 1) + "]�� ��ȯ�մϴ�.\n");
			reverce(x);
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(" "+x[i]);
		}
		System.out.println("\n�����߽��ϴ�.");
		
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
}
