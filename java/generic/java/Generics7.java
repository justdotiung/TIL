package generic.java;

import java.util.Arrays;
import java.util.List;

public class Generics7{
	static boolean isEmpty(List<?> list){
		return list.size()==0;
	}
	//type parameter로 정의
	static <T> long frequency(List<T> list, T elem) {
		//s=list 속성값. 
		return list.stream().filter(s -> s.equals(elem)).count();
	}
	//wild card 로 정의
	static long frequency1(List<?> list, Object elem) {
		return list.stream().filter(s -> s==elem).count();
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,3);
		System.out.println(isEmpty(list));
		//와일드 카드로 사용하는것이 더 적합하다.
		//generic으로 하게되면 내부 구현에서 T타입을 노출, api 의도가 바르지않다고 함 
		System.out.println(frequency1(list,3));
		System.out.println(frequency(list,3));
	}
}