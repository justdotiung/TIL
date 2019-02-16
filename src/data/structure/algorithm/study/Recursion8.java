package data.structure.algorithm.study;

import java.util.ArrayList;

/**
 * ��ó: youtube [�˰���] �ǿ��� ������.
 */
public class Recursion8 {

	public static void main(String[] args) {

		String str = "12 3qwe 1";
		System.out.println(func(str));
		print(str);
		reversePrint(str);
		reversePrint(10);
	}

// ���ڿ� ����
	public static int func(String a) {
		if (a.equals("")) {
			return 0;
		} else
			return 1 + func(a.substring(1));
	}

// ���ڿ� ����Ʈ
	public static void print(String a) {
		if (0 == a.length())
			return;
		else {
			System.out.println(a.charAt(0));
			print(a.substring(1));
		}
	}

	/**
	 * ���ڿ� �ݴ�� ����Ʈ ���� ����Լ��� �ڽ��� ȣ���Ͽ��� �� ���������� �Ҹ� method���� return ���� ��ȯ �Ѵ�.
	 */
	public static void reversePrint(String a) {
		if (a.length() == 0)
			return;
		else {
			reversePrint(a.substring(1));
			System.out.println(a.charAt(0));
		}
	}

//1���� 10���� ��� 
	public static void reversePrint(int b) {
		if (b == 0)
			return;
		else {
			reversePrint(b - 1);
			System.out.println(b);
		}
	}
}