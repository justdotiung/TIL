package data;

import java.util.Scanner;

/**
 * 자료구조 기초 출처 권오흠 교수님의 java로 배우는 자료구조 0개이상의 연속된 정수를 더하여 얻을수잇는 최대값.
 */
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];

		for (int i = 0; i < arr.length; i++) {

			a = sc.nextInt();
			arr[i] = a;
		}
		sc.close();

//이 로직은 좋지 못한 로직		
		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length; j++) {
//				int sum = 0;
//				for (int k = i; k <= j; k++) {
//					sum += arr[k];
//				}
//				if (sum > max)
//					max = sum;
//			}
//		}
// 불필요한 로직을 제거 	
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
				sum+=arr[j];
			if(sum> max)
				max =sum;
			}
		}
		System.out.println(max);
	}
}
