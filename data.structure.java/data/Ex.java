package data;

import java.util.Scanner;

/**
 * �ڷᱸ�� ���� 
 * ��ó �ǿ��� �������� java�� ���� �ڷᱸ��
 */
public class Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] c = new int[a];
		for (int i = 0; i < a; i++) {
			c[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		for (int j = 0; j < c.length; j++) {
			for (int i = j + 1; i < c.length; i++) {
				if (c[j] == c[i]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
