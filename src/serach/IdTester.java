package serach;

class Id {
	private static int counter = 0; // 아이디 몇개 부여했는지 저장
	private int id;

	public Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Id other = (Id) obj;
		if (id != other.id)
			return false;
		return true;
	}

}

public class IdTester {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a의 아이디: " +a.getId());
		System.out.println("b의 아이디: " +b.getId());
		
		System.out.println("부여한 아이디의 개수 : "+Id.getCounter());
		
		System.out.println(a.equals(b));
	}
	
}
