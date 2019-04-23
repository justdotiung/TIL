package sorting;

import java.util.Scanner;

public class SelectionSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void selectionSort(int[] a,int n) { //�������� ��Һ��� �����ؼ� ����
//		for(int i = 0; i< n- 1; i++) { Ʋ��
//			int min = i;
//			for (int j = i+ 1; j < n; j++) {
//				if(a[j]<a[min]) {
//					min = j;
//					swap(a, i, min);
//				}
//			}
//		}
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++)
				if (a[j] < a[min])
					min = j;
			swap(a, i, min);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ܼ���������");
		System.out.print("��Ҽ�:");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		selectionSort(x, nx);
		
		System.out.println("�������� ����");
		for (int i = 0; i < nx; i++) {
			System.out.println("x["+i+"]:="+ x[i]);
		}
	}
}
