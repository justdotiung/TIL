package queue;

import java.util.Scanner;

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue iq = new IntQueue(64);
		
		while(true) {
			System.out.println("���� ������ �� : "+iq.size()+"/"+iq.capacity());
			System.out.print("1.��ť 2.��ť 3.��ũ 4.���� 0.����");
			
			int menu = sc.nextInt();
			if(menu ==0)
				break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x = sc.nextInt();
				try {
					iq.enque(x);
				}catch(IntQueue.OverflowIntException e) {
					System.out.println("que full");
			}break;
			
			case 2:
				try {
					x= iq.deque();
					System.out.println("��ť�� �����ʹ� "+x+"�Դϴ�.");
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("que empty");
				}break;
				
			case 3:
				try {
					x=iq.peek();
					System.out.println("peek data"+x+".");
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("que empty");
				}break;
				
			case 4:
				iq.dump();
				break;
			}
		}
	}
}
