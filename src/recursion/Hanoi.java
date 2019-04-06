package recursion;

import java.util.Scanner;

public class Hanoi {
	// no���� ������ ���� ��տ��� y�� ������� �ű�
	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);
		System.out.println("����[" + no + "]��" + x + "��տ���" + y + "������� �ű�");
		
		if(no>1)
			move(no-1,6-x-y,y);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.print("���� ���� : ");
		int n = sc.nextInt();
		//1�� ����� n���� ������ 3�� ������� �ű�.
		move(n,1,3);
	}
}
