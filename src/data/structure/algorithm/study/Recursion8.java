package data.structure.algorithm.study;

/**
 * 문자열 길이 계산.
 * substring(index) > string[index] 값부터 시작해 문자열을 보여준다.
 */
public class Recursion8 {

	public static void main(String[] args) {
		String str = "12 3qwe 1";
		System.out.println(func(str));
		print(str);
		reversePrint(str);
		reversePrint(10);
	}

	// 문자열 길이
	public static int func(String a) {
		if (a.equals("")) {
			return 0;
		} else
			return 1 + func(a.substring(1));
	}

	// 문자열 프린트
	public static void print(String a) {
		if (0 == a.length())
			return;
		else {
			System.out.println(a.charAt(0));
			print(a.substring(1));
		}
	}

	
	/** 문자열 반대로 프린트
	 *  먼저 재귀함수로 자신을 호출하여서
	 *  맨 마지막으로 불린 method부터 return 값을 반환 한다.
	 */
	public static void reversePrint(String a) {
		if (a.length() == 0)
			return;
		else {
			reversePrint(a.substring(1));
			System.out.println(a.charAt(0));
		}
	}
	//1부터 10까지 출력 
	public static void reversePrint(int b) {
		if (b == 0)
			return;
		else {
			reversePrint(b-1);
			System.out.println(b);
		}
	}
}