package generic.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics9 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		reverse(list);
		System.out.println(list);
		reverse1(list);
		System.out.println(list);
		reverse2(list);
		System.out.println(list);
	}

	static <T> void reverse(List<T> list) {
		List<T> temp = new ArrayList<>(list);
		for (int i = 0; i < list.size(); i++)
			list.set(i, temp.get(list.size() - i - 1));
	}
	//reverse�� generic�� wildCard �ιٲٸ� capture �����Ͽ��� �߻� 
	static void reverse1(List<?> list) {
		recerseHelper(list);
	}
	//capture�� �ذ��ϱ����� helper�޼ҵ� ����.
	private static <T> void recerseHelper(List<T> list) {
		List<T> temp = new ArrayList<>(list);
		for (int i = 0; i < list.size(); i++)
			list.set(i, temp.get(list.size() - i - 1));
	}
	//helper�޼ҵ带 ������ �ʴ� ��� rawŸ������ ����� 
	static void reverse2(List<?> list) {
		List temp = new ArrayList<>(list);//temp list�� ���� �ű������ �ӽ������
		List list2=list;
		System.out.println(list2.toString());
		for (int i = 0; i < list2.size(); i++) {
			list2.set(i, temp.get(list2.size() - i - 1));
//			System.out.print(list2.get(list2.size() - i - 1));
//			System.out.print(list2.size() - i - 1);
			System.out.print(list2.get(i));
		}
	}
	
}