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
	//	System.out.println(new Hello<String>().print("하이")); //type argument
		//Raw Type
	//	List list = new ArrayList<Integer>(); //선언부 생략 동작가능 
		List<Integer> ints = Arrays.asList(1,2,3);
		List rawInts =ints;
		List<Integer> ints2 = rawInts;
		List<String> ints3 = rawInts;
		String str =  ints3.get(1);
	}
}
