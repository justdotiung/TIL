package patten3;

public class Printer {
//	private static Printer printer = new Printer();//���߽����� ���� �ذ���.
	private static Printer printer =null;
	private int counter = 0;
	private Printer() {
	};// ������ �ܺ�ȣ�� �Ҽ�����.

//	public static Printer getprinter() { // �ν��Ͻ� ��������.
////		if (printer == null) {
////			try {
////				Thread.sleep(1);
////			} catch (Exception e) {
////			}
////			printer = new Printer();
////		}
//		return printer;
//	}
	public synchronized static Printer getprinter() { // �޼��� ����ȭ.
		if (printer == null) {
//			try {
//				Thread.sleep(1);
//			} catch (Exception e) {
//			}
			printer = new Printer();
		}
		return printer;
	}

	public  void print(String str) {
		synchronized (this) {// ���� �ϳ��� �����常 ������ ���
			counter++;
			System.out.println(str+counter);
		}
	}
}
