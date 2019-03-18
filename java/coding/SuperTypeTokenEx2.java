package coding;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class SuperTypeTokenEx2 {
	static class Sup<T> {
		T value;
	}

//	static class Sub extends Sup<List<String>> { // 상속 시점에서 타입을 정의 이럴경우 타입을 가져올수 있다.
//
//	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
//		Sup<String> sup = new Sup<String>();

//		System.out.println(sup.getClass().getDeclaredField("value").getType());//value 타입은 object 임 
		
//		class Sub extends Sup<String> { //local class
//		}
//		Sub b = new Sub();

//		Sup	b = new Sup<List<String>>() {}; //익명 클래스
		Type t = new Sup<List<String>>() {}.getClass().getGenericSuperclass(); // 코드 단순화.
		ParameterizedType ptype = (ParameterizedType) t; // 상속받은 클래스의 타입.
		System.out.println(ptype.getActualTypeArguments()[0]); //array 반환 메소드. 

	}
}
