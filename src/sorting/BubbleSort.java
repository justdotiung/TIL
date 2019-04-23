package sorting;

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void bubbleSortVer1(int[] a,int n) {//ó������ ������ ����
		for(int i = 0; i<n-1;i++)
			for(int j = n-1; j>i; j--)
				if(a[j -1]>a[j])
					swap(a,j-1,j);
	}
	static void bubbleSortVer2(int[] a,int n) {//���������� �迭�̶�� ���� ����
		for(int i = 0; i<n-1;i++) {
			int exchg =0;
			for(int j = n-1; j>i; j--)
				if(a[j -1]>a[j]) { 
					swap(a,j-1,j);
					exchg++;
				}
			if(exchg==0) {
				System.out.println(exchg);
				break;
			}
		}
					
	}
	static void bubbleSortVer3(int[] a,int n) {//������ �����迭�� ���� index���� ����
		int k =0;
		int c = 0;
		while(k<n-1) {
			int last = n-1;
			for(int j = n-1; j>k; j--)
				if(a[j -1]>a[j]) { 
					swap(a,j-1,j);
					last =j;
			}
			k=last;
			c++;
		}
		System.out.println(c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� ���� 1");
		System.out.print("��Ҽ�:");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		bubbleSortVer3(x, nx);
		
		System.out.println("�������� ����");
		for (int i = 0; i < nx; i++) {
			System.out.println("x["+i+"]:="+ x[i]);
		}
	}
}
