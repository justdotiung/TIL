package generic.java;

import java.util.Arrays;
import java.util.List;

public class Generics8{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","2","3","4","5","3");
		System.out.println(max(list));
		System.out.println(max1(list));
	}

	private static <T extends Comparable<T>> T max(List<T> list) {
		return list.stream().reduce((a,b)-> a.compareTo(b) > 0 ? a : b).get();
	}
	private static <T extends Comparable<? super T>> T max1(List<? extends T> list) {
		return list.stream().reduce((a,b)-> a.compareTo(b) > 0 ? a : b).get();
	}
}