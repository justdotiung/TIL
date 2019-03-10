package serach;

import java.util.Scanner;

public class SeqsearchSen {
//선형검색 보초법
	static int seqseacrhSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key; //보초를 추가
		
		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i == n ? -1 :i ; // 원래 배열값인지 보초값인지 판단.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num+1]; //요소수 1 추가.
		for (int i = 0; i <num; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할값 :");
		int ky = sc.nextInt();
		
		int idx = seqseacrhSen(x, num, ky);
		
		if(idx == -1)
			System.out.println("그값의 요소가 없습니다.");
		else
			System.out.println(ky+"는 ㅌ["+idx+"]에 있습니다.");
	}
}
