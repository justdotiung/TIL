package abstractUse;

public class Sam extends PSW{

	@Override
	protected Printer newPrinter() {
		System.out.println("�︸ �����ִ� ������");
		return new SamPrinter();
	}

}
