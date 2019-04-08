package abstractUse;

public abstract class PSW {
	public void machine() {
		Printer printer = newPrinter();
		printer.print();
	}

	protected abstract Printer newPrinter();
}
