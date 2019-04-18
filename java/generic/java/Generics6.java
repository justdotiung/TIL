package generic.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generics6{
	//타입추론
	static <T> void method(T t,List<T> list) {
		
	}
	public static void main(String[] args) {
		Generics6.method(1, Arrays.asList(1,2,3)); // 알아서 Integer  로 타입추론을 하게된다.
		Generics6.<Integer>method(1, Arrays.asList(1,2,3)); // 낮은버전에서 명시적 제네릭타입 알려준다.
		List<String> list = new ArrayList<>(); //기본적 타입 추론
		List<String> c = Collections.emptyList();//원소가 없는 빈 collection. 타입추론
		List<String> d = Collections.<String>emptyList();
		
	}
}
