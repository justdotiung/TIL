package data.structure.algorithm.study;

/**
 * ��ó: youtube [�˰���] �ǿ��� ������.
 * Recursive Thinking 1-2
 * 
 */
public class Recursion9 {

	public static void main(String[] args) {
		binary(10);
//		System.out.println(binaryEx(15));
		int [] c=new int[] {1,2,3,4,5};
		System.out.println(c.length);
		System.out.println(sum(3,c));
	}
	public static void binary(int a) {		
		if(a<2) {		
			System.out.println(a);		
		}
		else {
			 binary(a/2);		
			System.out.println(a%2);
		}
	}
	//���ڿ��� ���
	public static String binaryEx(int a) {		
		String b="";
		if(a<2) {		
			b=""+a;		
		}
		else {
			b = binaryEx(a/2);	//��ü b�� binary�޼ҵ� �� ����.		
			b +=","+a%2;
		}return b;
	}
	//���� ����: n==arr.length .
	public static int sum(int n, int[] arr) {
		if(n<=0)
			return 0;
		else
			return sum(n-1, arr)+arr[n-1];
	}
}