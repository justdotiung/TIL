package generic.java;

public class Generics2 {
	<T> void print(T t) { //�ν��Ͻ� �޼ҵ忡�� ���
		System.out.println(t.toString());
	}

	static <T> void print1(T t) {//����ƽ �޼ҵ忡�� ���
		System.out.println(t.toString());
	}

	public static void main(String[] args) {
		new Generics2().print("hello");
		new Generics2().print(1);
		//Ÿ�� �Ķ���� ������ �޼ҵ� �������� ������ �Ǽ� ����ƽ�� �ص� ���׸� ��� ����
		print1("go");
		print1(1);
		
	}
}
