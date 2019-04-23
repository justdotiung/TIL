package sorting;

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void bubbleSortVer1(int[] a,int n) {//처음부터 끝까지 정렬
		for(int i = 0; i<n-1;i++)
			for(int j = n-1; j>i; j--)
				if(a[j -1]>a[j])
					swap(a,j-1,j);
	}
	static void bubbleSortVer2(int[] a,int n) {//오름차순의 배열이라면 정렬 안함
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
	static void bubbleSortVer3(int[] a,int n) {//정렬이 끝난배열의 다음 index부터 정렬
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
		
		System.out.println("버블정렬 버전 1");
		System.out.print("요소수:");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		bubbleSortVer3(x, nx);
		
		System.out.println("오름차순 정렬");
		for (int i = 0; i < nx; i++) {
			System.out.println("x["+i+"]:="+ x[i]);
		}
	}
}
