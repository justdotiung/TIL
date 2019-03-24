package coding;

interface A {
	void a() ;
}

class C implements A {

	void c() {
		System.out.println("c");
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
}

public class SpringTypeReference {
public static void main(String[] args) {
	A a = new C();
	a.a();
	
}
}
