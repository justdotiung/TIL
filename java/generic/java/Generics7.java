package generic.java;

import java.util.Arrays;
import java.util.List;

public class Generics7{
	static boolean isEmpty(List<?> list){
		return list.size()==0;
	}
	//type parameter�� ����
	static <T> long frequency(List<T> list, T elem) {
		//s=list �Ӽ���. 
		return list.stream().filter(s -> s.equals(elem)).count();
	}
	//wild card �� ����
	static long frequency1(List<?> list, Object elem) {
		return list.stream().filter(s -> s==elem).count();
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,3);
		System.out.println(isEmpty(list));
		//���ϵ� ī��� ����ϴ°��� �� �����ϴ�.
		//generic���� �ϰԵǸ� ���� �������� TŸ���� ����, api �ǵ��� �ٸ����ʴٰ� �� 
		System.out.println(frequency1(list,3));
		System.out.println(frequency(list,3));
	}
}