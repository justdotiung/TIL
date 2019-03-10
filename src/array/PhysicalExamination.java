package array;

import java.util.Scanner;

public class PhysicalExamination {
	static final int VMAX = 21;

	static class PhyscData {
		String name;
		int height;
		double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		for (int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}
	
	static void disVision(PhyscData[] dat, int[] dist) {
		
		int i = 0;

		dist[i] = 0;
		
		for (i = 0; i < dat.length; i++) {
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int) (dat[i].vision * 10)]++;
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("qkrgusrn", 162, 0.3),
				new PhyscData("qkrgusrn", 173, 0.7),
				new PhyscData("qkrgusrn", 175, 2.0),
				new PhyscData("qkrgusrn", 181, 1.5)
		};
	int[] vdist = new int[VMAX];
		
		System.out.println("------");
		System.out.println("name---height---vision");
		System.out.println("------");
		
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n",x[i].name , x[i].height , x[i].vision);
		}
			
			System.out.printf("\n평균키:%5.1fcm\n",aveHeight(x));
			
			disVision(x, vdist);
			
			System.out.println("\n 시력분포");
			for (int i = 0; i < VMAX; i++) {
				System.out.printf("%3.1f~:%2dperson\n",i/10.0, vdist[i]);
		}
	}
}
