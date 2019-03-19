package array;

import java.util.Scanner;

public class ArrayEqual {

	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)
			return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�迭 a�� ��Ҽ� :");
		int y = sc.nextInt();

		int[] a = new int[y];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("�迭 b�� ��Ҽ� :");
		int x = sc.nextInt();

		int[] b = new int[x];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("a��b�� " + (equals(a, b) ? "����" : "�����ʴ�"));
	
		copy(a,b);
		for (int i = 0; i < a.length; i++) {
			System.out.print(""+a[i]);
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		rcopy(a,b);
		for (int i = 0; i < a.length; i++) {
			System.out.print(""+a[i]);
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	
	}

	static void copy(int[] a, int[] b) {
		int num = a.length>=b.length? b.length:a.length;
		for (int i = 0; i < num; i++) {
			a[i] = b[i];
		}
	}
	static void rcopy(int[]a ,int[] b) {
		int num = a.length>=b.length? b.length:a.length;

		for (int i = 0; i < num; i++) {
		
			a[i]=b[b.length-1-i];
			
		}//
	}
}
