package generic.java;

public class Generics2 {
	<T> void print(T t) { //인스턴스 메소드에서 사용
		System.out.println(t.toString());
	}

	static <T> void print1(T t) {//스태틱 메소드에서 사용
		System.out.println(t.toString());
	}

	public static void main(String[] args) {
		new Generics2().print("hello");
		new Generics2().print(1);
		//타입 파라매터 정보가 메소드 레벨에서 정리가 되서 스태틱을 해도 제네릭 사용 가능
		print1("go");
		print1(1);
		
	}
}
