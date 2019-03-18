package coding;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class SuperTypeTokenEx2 {
	static class Sup<T> {
		T value;
	}

//	static class Sub extends Sup<List<String>> { // ��� �������� Ÿ���� ���� �̷���� Ÿ���� �����ü� �ִ�.
//
//	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
//		Sup<String> sup = new Sup<String>();

//		System.out.println(sup.getClass().getDeclaredField("value").getType());//value Ÿ���� object �� 
		
//		class Sub extends Sup<String> { //local class
//		}
//		Sub b = new Sub();

//		Sup	b = new Sup<List<String>>() {}; //�͸� Ŭ����
		Type t = new Sup<List<String>>() {}.getClass().getGenericSuperclass(); // �ڵ� �ܼ�ȭ.
		ParameterizedType ptype = (ParameterizedType) t; // ��ӹ��� Ŭ������ Ÿ��.
		System.out.println(ptype.getActualTypeArguments()[0]); //array ��ȯ �޼ҵ�. 

	}
}
