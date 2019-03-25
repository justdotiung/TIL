package serach;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
	static class PhyscData {
		private String name;
		private int height;
		private double vison;

		public PhyscData(String name, int height, double vison) {
			super();
			this.name = name;
			this.height = height;
			this.vison = vison;
		}

		@Override
		public String toString() {
			return "PhyscData [name=" + name + ", height=" + height + ", vison=" + vison + "]";
		}

		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = {
				new PhyscData("dl", 162, 3.4),
				new PhyscData("dbsl",169,0.4),
				new PhyscData("dbs",170,0.3),
				new PhyscData("ds",172,0.1),
				new PhyscData("bd",189,0.6)
		};
		System.out.println("몇 cm인사람을 찾고 있나요?");
		int height = sc.nextInt();
		int idx = Arrays.binarySearch(x,new PhyscData("", height,0.0),PhyscData.HEIGHT_ORDER);
		if(idx < 0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾은데이터:"+x[idx]);
		}
			
	}
}
