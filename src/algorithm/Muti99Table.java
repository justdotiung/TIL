package algorithm;

public class Muti99Table {

	public static void main(String[] args) {
		mult();
		System.out.println();
		mult1();
		System.out.println();
		mult2();
		System.out.println();
		mult3(5);
	}
	static void mult() {
		System.out.println("--°ö¼ÀÇ¥--");
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}
	static void mult1() {
		for (int i = 0; i < 10; i++) {
			if(i==0)
			System.out.printf("  :");
			else
				System.out.printf("%d :",i);
			for (int j = 1; j <10; j++) {
				if(i==0)
					System.out.printf("%3d ",j );
				else 
					System.out.printf("%3d ",i*j );
				}
			System.out.println();
		}
	}
	static void mult2() {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d :",i);
			for (int j = 1; j <10; j++) {
				System.out.printf("%3d ",i+j );
			}
			System.out.println();
		}
	}
	static void mult3(int n) {
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
