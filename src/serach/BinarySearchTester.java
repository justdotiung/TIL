package serach;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num= sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.println("x[0]: ");
		x[0] = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i]= sc.nextInt();
			}while(x[i]<x[i-1]);
		}
		System.out.println("검색할 값 : ");
		int key=sc.nextInt();
		int idx = Arrays.binarySearch(x, key);
		
		if (idx == -1)
			System.out.println("그값의 요소가 없습니다.");
		else
			System.out.println(key+"는 x["+idx+"]에 있습니다.");
		sc.close();
	}
}
