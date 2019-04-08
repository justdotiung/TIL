package generic.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

	static class Hello<T> {//  ���� ���ȴ�.  T->Type parameter
		T t; // T �ʵ��� 

		T print(T t) { //T �޼ҵ� ��� 
			return t;
		}
	}

	public static void main(String[] args) {
		System.out.println(new Hello<String>().print("����")); //type argument
		//Raw Type
		List list = new ArrayList<Integer>(); //����� ���� ���۰��� 
		List<Integer> ints = Arrays.asList(1,2,3);
		List rawInts =ints;	//��Ҹ� �˼����⶧���� Raw Type �� ���� �� ���ִ�.
		List<Integer> ints2 = rawInts;
		List<String> ints3 = rawInts;	//element�� �˼����� �����Ͻ� ������ �ȳ����� �ǻ��� ���� ����
		String str =  ints3.get(1);		// ����.
	}
}
