package generic.java;

public class Generics3<T> {
//	static  void print(T t) { //TŸ���� object�� �Ǳ����� �˼����⶧���� ��� �Ұ�.
//		System.out.println(t.toString());
//	}
	static <S> void print(S t) { // �޼ҵ� ������ Ÿ�� parameter �� ����������Ѵ�
		System.out.println(t.toString());
	}
	 <S, T> T print1(S t) { //Ŭ���� Ÿ�� T �޼ҵ� ���� S �ΰ��� ������ �ִ�.
		System.out.println(t.toString());
		return null;
	}
	

	public static void main(String[] args) {
		
		
	}
}
