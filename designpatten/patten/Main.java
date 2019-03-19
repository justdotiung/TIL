package patten;
class A{
	static void doIt( ) {
		System.out.println("doIt A class method");
	}
	void doThat() {
		System.out.println("doThat A class method");
	}
}

class A1 extends A {

	static void doIt( ) {
		System.out.println("doIt A1 class method");
	}
	@Override
	void doThat() {
		super.doThat();
		System.out.println("doThat A1 class method");
	}

	
}
public class Main {
	public static void main(String[] args) {
		A a1 = new A1();
		A1 a2 = new A1();
		
		a1.doThat();
		a1.doIt();
		a2.doThat();
		a2.doIt();
	}

}
