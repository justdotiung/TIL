package patten;

abstract class animal {
	abstract void printName();
	void as() {
		System.out.println("dd");
	}
}

class Cat extends animal {

	@Override
	void printName() {
		System.out.println("�����");
	}

	@Override
	void as() {
	System.out.println("dew");
	}
	
}

class Dog extends animal {

	@Override
	void printName() {
		System.out.println("������");
	}
}

class Lion extends animal {

	@Override
	void printName() {
		System.out.println("��¥");
	}

	void ride() {
		System.out.println("���� Ÿ�ô�?");
	}
}

public class Main2 {
	public static void main(String[] args) {
		animal[] ani = {new Cat(), new Dog(), new Lion()};
				((Cat)ani[0]).as();
				((Dog)ani[1]).printName();
				((Lion)ani[2]).ride();
				ani[0].printName();
				ani[4].printName();
				//ani[2].ride();
				Cat cat = new Cat();
				cat.as();
	}
}
