package serach;

import java.util.Scanner;

public class SeqsearchSen {
//�����˻� ���ʹ�
	static int seqseacrhSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key; //���ʸ� �߰�
		
		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i == n ? -1 :i ; // ���� �迭������ ���ʰ����� �Ǵ�.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��Ҽ� : ");
		int num = sc.nextInt();
		int[] x = new int[num+1]; //��Ҽ� 1 �߰�.
		for (int i = 0; i <num; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��Ұ� :");
		int ky = sc.nextInt();
		
		int idx = seqseacrhSen(x, num, ky);
		
		if(idx == -1)
			System.out.println("�װ��� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"�� ��["+idx+"]�� �ֽ��ϴ�.");
	}
}
