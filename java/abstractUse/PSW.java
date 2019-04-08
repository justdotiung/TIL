package abstractUse;

public abstract class PSW {
	public void machine() {
		Printer printer = newPrinter();
		printer.print();
	}

	protected abstract Printer newPrinter(); //상속받는쪽에서 생성자를 만들어 구현하여 메소드 호출  
}
