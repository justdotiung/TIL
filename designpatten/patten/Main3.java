package patten;

abstract class Role {
	abstract void work();
}

class Worker extends Role {

	@Override
	void work() {
		System.out.println("일");
	}

}

class Driver extends Role {

	@Override
	void work() {
		System.out.println("운전중");
	}

}

class Person {
	private Role r;

	public Role getR() {
		return r;
	}

	public void setR(Role r) {
		this.r = r;
	}

	void work() {
		r.work();
	}
}
public class Main3{
	public static void main(String[] args) {
		Person person = new Person();
		person.setR(new Worker());
		person.work();
		Person person1 = new Person();
		person1.setR(new Driver());
		person1.work();
	}
}