package study;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("�� ������ �ִ밪�� ���մϴ�.");
//		System.out.print("a:��  �� :" ); int a = sc.nextInt();
//		System.out.print("b:��  �� :" ); int b = sc.nextInt();
//		System.out.print("c:��  �� :" ); int c = sc.nextInt();
//		int max = a;
//		if(b> max) max=b;
//		if(c>max) max=c;
//		System.out.println("�ִ밪�� "+max+"�Դϴ�.");
		System.out.println(max3(1,2,3));
		System.out.println(max4(4,2,3,6));
		System.out.println(min3(4,2,3));
	}
	//�ִ밪
	static int max3(int z, int x, int y) {
		int max = z;
		if(x>max)max=x;
		if(y>max)max=y;
		return max;
	}
	//�ִ밪
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b>max)max=b;
		if(c>max)max=c;
		if(d>max)max=d;
		return max;
	}
	//�ּҰ�
	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min)min=b;
		if(c< min)min=c;
		return min;
	}
		
}
