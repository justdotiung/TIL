package stack;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack is = new IntStack(64);
		
		while(true) {
			System.out.println("���� ������ �� : "+is.size()+"/"+is.capacity());
			
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ "+"(4)���� (0)���� :");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("������: ");
				x=sc.nextInt();
				try {
					is.push(x);
				} catch (IntStack.OverFlowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = is.pop();
					System.out.println("���� �����ʹ� "+x+"�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");	
				}
				break;
			case 3:
				try {
					x = is.peek();
					System.out.println("peek�� �����ʹ� "+x+"�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
				
			case 4:
				is.dump();
				break;
			}
		}
	}
}
