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
		System.out.println("10������ ��ȯ�մϴ�");
		do {
			do {
				System.out.println("��ȭ�ϴ� ���� �ƴ� ����  : ");
				no= sc.nextInt();
			}while(no<0);
			
			do {
				System.out.println("� ������ ��ȯ�ұ��? (2~36): ");
				cd=sc.nextInt();
			}while(cd<2 || cd>36);
			dno=cardConvEx(no,cd,cno);
	//		dno=cardConv(no,cd,cno);
			
			System.out.println(cd+"�����δ� ");
			for (int i = dno-1; i >= 0; i--) {
				System.out.print(cno[i]);
			}System.out.println("�Դϴ�.");
			
			System.out.print("�ѹ��� �ұ��? (1/0) :" );
			retry =sc.nextInt();
		}while (retry == 1 );
	}
	// ���� x�� r������ ��ȯ�Ͽ� �迭 d�� ���ڸ����� �����ϰ� �ڸ����� ��ȯ
		static int cardConv(int x, int r, char[] d) {
			int digits = 0;// ��ȯ ���� �ڸ���
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			do {
				d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
				x /= r;
			} while (x != 0);

			for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
				char temp = d[i];
				d[i] = d[digits - i - 1];
				d[digits - i - 1] = temp;
			}
			return digits;
		}
		// ���� x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �����ϰ� �ڸ����� ��ȯ
		static int cardConvEx(int x, int r, char[] d) {
			int n = ((Integer) x).toString().length(); // ��ȯ ���� �ڸ���
			int digits = 0; // ��ȯ ���� �ڸ���
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
			do {
				System.out.printf("   +");
				for (int i = 0; i < n + 2; i++)
					System.out.print('-');
				System.out.println();

				if (x / r != 0)
					System.out.printf(String.format("%%2d | %%%dd    �� %%d\n", n), r, x / r, x % r);
				else
					System.out.printf(String.format("     %%%dd    �� %%d\n", n), x / r, x % r);
				d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
				x /= r;
			} while (x != 0);

			for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
				char temp = d[i]; // �� �������� ����
				d[i] = d[digits - i - 1];
				d[digits - i - 1] = temp;
			}
			return digits;
		}

}
