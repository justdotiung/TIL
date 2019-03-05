package array;

import java.util.Scanner;

public class ReverceArray {
	private static int sum;

	// 배역 역순 자리바꿈
	static void reverce(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}

	// 배열요소 자리바꿈
	static void swap(int[] a, int idx1, int idx2) {

		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요소수 :");
		int num = sc.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}

		// reverce(x);

		System.out.println("요소를 역순으로 정렬했습니다.");
		for (int i = 0; i < x.length / 2; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(" " + x[j]);
			}
			System.out.print("\na[" + i + "]과(와)a[" + (x.length - i - 1) + "]를 교환합니다.\n");
			reverce(x);
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(" "+x[i]);
		}
		System.out.println("\n정렬했습니다.");
		
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
}
