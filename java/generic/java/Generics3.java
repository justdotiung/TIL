package generic.java;

public class Generics3<T> {
//	static  void print(T t) { //T타입이 object가 되기전에 알수없기때문에 사용 불가.
//		System.out.println(t.toString());
//	}
	static <S> void print(S t) { // 메소드 레벨의 타입 parameter 를 적용해줘야한다
		System.out.println(t.toString());
	}
	 <S, T> T print1(S t) { //클래스 타입 T 메소드 레벨 S 두개를 받을수 있다.
		System.out.println(t.toString());
		return null;
	}
	

	public static void main(String[] args) {
		
		
	}
}
