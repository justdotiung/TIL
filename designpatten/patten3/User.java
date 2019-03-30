package patten3;

public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void print() {
		Printer printer = Printer.getprinter();
		printer.print(this.name+"print using "+printer.toString()+".");
	}
}

