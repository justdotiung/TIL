package data;

import java.util.Scanner;

/**
 * �ڷᱸ�� ���� ��ó �ǿ��� �������� java�� ���� �ڷᱸ�� 0���̻��� ���ӵ� ������ ���Ͽ� �������մ� �ִ밪.
 */
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];

		for (int i = 0; i < arr.length; i++) {

			a = sc.nextInt();
			arr[i] = a;
		}
		sc.close();

//�� ������ ���� ���� ����		
		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length; j++) {
//				int sum = 0;
//				for (int k = i; k <= j; k++) {
//					sum += arr[k];
//				}
//				if (sum > max)
//					max = sum;
//			}
//		}
// ���ʿ��� ������ ���� 	
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
				sum+=arr[j];
			if(sum> max)
				max =sum;
			}
		}
		System.out.println(max);
	}
}
