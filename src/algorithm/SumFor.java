package algorithm;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���մϴ�");
		System.out.println("n�� �� : ");
 		int n = sc.nextInt();

		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");  //������ �ȵǰ� print 
			else
				System.out.print(i);
			sum += i; 
		}
		System.out.println(" = " + sum);
		
		System.out.println("1����" + n + "������ ����" + sum + "�Դϴ�.");
		
		System.out.println(sum(3));
		
		
		System.out.println(sumof(3, 5));
		System.out.println(sumof(6, 4));
	}
	
	//��Ұ��� ������� ������ ��
	static int sumof(int a, int b) {
		int sum = 0;
		if (a > b) {
			for (int i = b; i < a + 1; i++) {
				sum += i;

			}
		} else if (a < b)
			for (int i = a; i < b + 1; i++) {
				sum += i;

			}
		else
			sum = a;
		return sum;
	}
	
	//���콺�ǵ���
	static int sum(double n) {
		int sum = 0;
		sum=(int)((1+n)*(n/2));
		return (int)sum;
	}
}
