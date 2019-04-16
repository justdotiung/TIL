package generic.java;

import java.util.Arrays;
import java.util.List;

//bounded Type Parameter 사용 <T extends ... >
public class Generics4{
	
	//크기비교 compare interface 구현
	static <T extends Comparable<T>>long countGreaterThan(T[] arr, T elem) {
		return Arrays.stream(arr).filter(s -> s.compareTo(elem) > 0).count();
	}

	public static void main(String[] args) {
		
		//이경우 generic 타입으로 메소드를 만든다.
		Integer[] arr = new Integer[] {1,2,3,4,5};
		String[] arr1 = new String[] {"a","b","c","d","e"};
		System.out.println(countGreaterThan(arr, 1));
		System.out.println(countGreaterThan(arr1, "b"));
		
	}
}
