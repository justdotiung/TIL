package generic.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generics6{
	//Ÿ���߷�
	static <T> void method(T t,List<T> list) {
		
	}
	public static void main(String[] args) {
		Generics6.method(1, Arrays.asList(1,2,3)); // �˾Ƽ� Integer  �� Ÿ���߷��� �ϰԵȴ�.
		Generics6.<Integer>method(1, Arrays.asList(1,2,3)); // ������������ ����� ���׸�Ÿ�� �˷��ش�.
		List<String> list = new ArrayList<>(); //�⺻�� Ÿ�� �߷�
		List<String> c = Collections.emptyList();//���Ұ� ���� �� collection. Ÿ���߷�
		List<String> d = Collections.<String>emptyList();
		
	}
}
