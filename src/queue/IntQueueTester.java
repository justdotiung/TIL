package queue;

import java.util.Scanner;

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue iq = new IntQueue(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+iq.size()+"/"+iq.capacity());
			System.out.print("1.인큐 2.디큐 3.피크 4.덤프 0.종료");
			
			int menu = sc.nextInt();
			if(menu ==0)
				break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					iq.enque(x);
				}catch(IntQueue.OverflowIntException e) {
					System.out.println("que full");
			}break;
			
			case 2:
				try {
					x= iq.deque();
					System.out.println("디큐한 데이터는 "+x+"입니다.");
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
