package recursion;

import java.util.Scanner;

import recursion.IntStack.EmptyIntStackException;

public class Recur {
	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	static void recur2(int n) {
		while(n>0) {
			recur (n-1);
			System.out.println(n);
			n = n-2;
		}
	}
	static void recur3(int n) throws EmptyIntStackException {
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n>0) {
				s.push(n);
				n=n-1;
				continue;
			}
			if(s.isEmpty() != true) {
				n =s.pop();
				System.out.println(n);
				n=n-2;
				continue;
			}
			break;
		}
	}
	public static void main(String[] args) throws EmptyIntStackException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int x = sc.nextInt();
		recur2(x);
		System.out.println();
		recur(x);
		System.out.println();
		recur3(x);
	}
	
}
