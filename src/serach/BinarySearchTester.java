package serach;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��Ҽ�: ");
		int num= sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.println("x[0]: ");
		x[0] = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i]= sc.nextInt();
			}while(x[i]<x[i-1]);
		}
		System.out.println("�˻��� �� : ");
		int key=sc.nextInt();
		int idx = Arrays.binarySearch(x, key);
		
		if (idx == -1)
			System.out.println("�װ��� ��Ұ� �����ϴ�.");
		else
			System.out.println(key+"�� x["+idx+"]�� �ֽ��ϴ�.");
		sc.close();
	}
}
