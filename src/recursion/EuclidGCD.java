package recursion;

import java.util.Scanner;

public class EuclidGCD {
	static int gcd(int x, int y) {
		if( y==0)
			return x;
		else
			return gcd(y,x%y);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� �ִ� �����");
		
		System.out.print("������ �Է��ϼ���.: ");
		int x = sc.nextInt();
		System.out.print("������ �Է��ϼ���.: ");
		int y = sc.nextInt();
		
		System.out.println("�ִ������� " +gcd(x,y)+"�Դϴ�.");
	}
}
