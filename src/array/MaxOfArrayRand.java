package array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
static int maxOf(int[] a) {
	int max = a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i] > max)
			max = a[i];
	}
	return max;
}
	public static void main(String[] args) {
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ű�� �ִ밪�� ���մϴ�.");
	System.out.println("�����:");
	int num =1+rand.nextInt(10);
	
	int[] height = new int[num];
	
	System.err.println("Ű ���� �Ʒ��� �����ϴ�.");
	for (int i = 0; i < height.length; i++) {
		height[i] = 100+rand.nextInt(90);
		System.out.println(" "+height[i]);
	}
	System.out.println("max : " +maxOf(height));
}
}
