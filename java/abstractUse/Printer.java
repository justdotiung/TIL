package abstractUse;

public abstract class Printer {
	protected void code() {//코드의 직접적 사용 제한
		System.out.println("이것은 정품입니다.");
	}
	public abstract void print();
	
}
