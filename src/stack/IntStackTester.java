package stack;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack is = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+is.size()+"/"+is.capacity());
			
			System.out.print("(1)푸시 (2)팝 (3)피크 "+"(4)덤프 (0)종료 :");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				x=sc.nextInt();
				try {
					is.push(x);
				} catch (IntStack.OverFlowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x = is.pop();
					System.out.println("팝한 데이터는 "+x+"입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");	
				}
				break;
			case 3:
				try {
					x = is.peek();
					System.out.println("peek한 데이터는 "+x+"입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 4:
				is.dump();
				break;
			}
		}
	}
}
