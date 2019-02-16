package data.structure.algorithm.study;

/**
 * ��ó: youtube [�˰���] �ǿ��� ������.
 * func(4) ��ȯ���� 4 + func(3) 
 * func(3) ��ȯ�� 3 + func(2)
 * ...
 * func(0) ��ȯ�� 0
 * �ᱹ 4 + 3 + 2 + 1 �̵ȴ�. 1-n ������ ���� ���Ѵ�.
 */
public class Recursion3 {
	public static void main(String[] args) {
		int result = func(3);
		System.out.println(result);
	}

	public static int func(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + func(n - 1);
		}
	}
}