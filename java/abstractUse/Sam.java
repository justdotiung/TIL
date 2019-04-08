package abstractUse;

public class Sam extends PSW{

	@Override
	protected Printer newPrinter() {
		System.out.println("삼만 쓸수있는 프린터");
		return new SamPrinter();
	}

}
