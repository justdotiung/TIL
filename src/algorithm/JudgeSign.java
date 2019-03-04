package algorithm;

import java.util.Scanner;

// 입력한 정수값이 양수,음수,0인지 판단
public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 :");
		int n = sc.nextInt();
	
		if(n>0)
			System.out.println("이수는 양수입니다.");
		else if(n<0)
			System.out.println("이수는 음수입니다.");
		else
			System.out.println("이수는 0입니다.");
		
		sc.close();
		int c =0;
		System.err.println((c==0)?"c==0":"c!=0"); 
		
	}
}
