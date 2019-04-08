package generic.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

	static class Hello<T> {//  매핑 사용된다.  T->Type parameter
		T t; // T 필드사용 

		T print(T t) { //T 메소드 사용 
			return t;
		}
	}

	public static void main(String[] args) {
		System.out.println(new Hello<String>().print("하이")); //type argument
		//Raw Type
		List list = new ArrayList<Integer>(); //선언부 생략 동작가능 
		List<Integer> ints = Arrays.asList(1,2,3);
		List rawInts =ints;	//요소를 알수없기때문에 Raw Type 은 위험 할 수있다.
		List<Integer> ints2 = rawInts;
		List<String> ints3 = rawInts;	//element를 알수없다 컴파일시 에러는 안나지만 실사용시 에러 나옴
		String str =  ints3.get(1);		// 에러.
	}
}
