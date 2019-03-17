package coding;

public class SuperTypeTokenEx {
	static class Sup<T> {
		T value;
	}

	static class Sub extends Sup<String> {
		
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Sup<String> sup = new Sup<String>();
		
		System.out.println(sup.getClass().getDeclaredField("value").getType());//value 타입은 object 임 
	
		
	}
}
