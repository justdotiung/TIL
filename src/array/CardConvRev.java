package array;

import java.util.Scanner;

public class CardConvRev {
	static int cardCinvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
			System.out.printf("%d| %d\n",r,x);
		for (int i = 0; i < d.length; i++) {
			System.out.printf("%d| %d ... %d\n",r,x/r,x%r);
			System.out.println("+-------------------");
		}
		return digits;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		System.out.println("10진수를 반환합니다");
		do {
			do {
				System.out.println("변화하는 음이 아닌 정수  : ");
				no= sc.nextInt();
			}while(no<0);
			
			do {
				System.out.println("어떤 진수로 변환할까요? (2~36): ");
				cd=sc.nextInt();
			}while(cd<2 || cd>36);
			dno=cardConvEx(no,cd,cno);
	//		dno=cardConv(no,cd,cno);
			
			System.out.println(cd+"진수로는 ");
			for (int i = dno-1; i >= 0; i--) {
				System.out.print(cno[i]);
			}System.out.println("입니다.");
			
			System.out.print("한번더 할까요? (1/0) :" );
			retry =sc.nextInt();
		}while (retry == 1 );
	}
	// 정수 x를 r진수로 변환하여 배열 d에 윗자리부터 저장하고 자릿수를 반환
		static int cardConv(int x, int r, char[] d) {
			int digits = 0;// 변환 뒤의 자릿수
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			do {
				d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
				x /= r;
			} while (x != 0);

			for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
				char temp = d[i];
				d[i] = d[digits - i - 1];
				d[digits - i - 1] = temp;
			}
			return digits;
		}
		// 정수 x를 r진수로 변환하여 배열 d에 아랫자리부터 저장하고 자릿수를 반환
		static int cardConvEx(int x, int r, char[] d) {
			int n = ((Integer) x).toString().length(); // 변환 전의 자릿수
			int digits = 0; // 변환 뒤의 자릿수
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
			do {
				System.out.printf("   +");
				for (int i = 0; i < n + 2; i++)
					System.out.print('-');
				System.out.println();

				if (x / r != 0)
					System.out.printf(String.format("%%2d | %%%dd    … %%d\n", n), r, x / r, x % r);
				else
					System.out.printf(String.format("     %%%dd    … %%d\n", n), x / r, x % r);
				d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
				x /= r;
			} while (x != 0);

			for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
				char temp = d[i]; // 를 역순으로 정렬
				d[i] = d[digits - i - 1];
				d[digits - i - 1] = temp;
			}
			return digits;
		}

}
