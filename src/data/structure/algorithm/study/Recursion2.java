package data.structure.algorithm.study;

public class Recursion2 {
	public static void main(String[] args) {
		func(2);									//hello 2�����
	}
													// 1.)				2.)					3.)
	public static void func(int k) {				// k=2  			-> k=1	 			->       k=0
		if (k <= 0) {								// 2<=0 			-> 1<=0 			->     0<=0
			return;									//										(if) ���Ǽ�������  return; 
		} else {									
			System.out.println("hello");			// hello 1�����  		-> 1�����
			func(k-1);								//func(1) �ڽ��� �θ�. -> func(0) �ڽ����θ�
		}
	}
}
