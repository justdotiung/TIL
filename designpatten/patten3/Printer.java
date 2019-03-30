package patten3;

public class Printer {
//	private static Printer printer = new Printer();//다중스레드 사용시 해결방법.
	private static Printer printer =null;
	private int counter = 0;
	private Printer() {
	};// 생성자 외부호출 할수없음.

//	public static Printer getprinter() { // 인스턴스 생성여부.
////		if (printer == null) {
////			try {
////				Thread.sleep(1);
////			} catch (Exception e) {
////			}
////			printer = new Printer();
////		}
//		return printer;
//	}
	public synchronized static Printer getprinter() { // 메서드 동기화.
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
		synchronized (this) {// 오직 하나의 스레드만 접근을 허용
			counter++;
			System.out.println(str+counter);
		}
	}
}
