package algorithm;

import java.util.Scanner;

// �Է��� �������� ���,����,0���� �Ǵ�
public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� :");
		int n = sc.nextInt();
	
		if(n>0)
			System.out.println("�̼��� ����Դϴ�.");
		else if(n<0)
			System.out.println("�̼��� �����Դϴ�.");
		else
			System.out.println("�̼��� 0�Դϴ�.");
		
		sc.close();
		int c =0;
		System.err.println((c==0)?"c==0":"c!=0"); 
		
	}
}
