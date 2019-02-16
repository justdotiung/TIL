package data.structure.algorithm.study;

/**
 * 출처: youtube [알고리즘] 권오흠 교수님.
 * 알고싶다 알고리즘 ㅠ
 * 다시복습할것.
 *
 */
public class Recursion13 {
	int[] cols;
	int n;

	public Recursion13(int n) {
		this.cols = new int[n+1];
		this.n=n;
	}

	public static void main(String[] args) {
		Recursion13 re = new Recursion13(5);
		
		re.queens(5);

	}


	boolean queens(int level) {
		if (!promising(level)) {
			System.out.println("1");
			return false;
		} else if (level == n) {
			for (int i = 1; i <= n; ++i)
				System.out.println("(" + i + "," + cols[i] + ")");
			return true;
		}
		for (int i = 1; i <= n; i++) {
			cols[level + 1] = i;
			if (queens(level + 1)) {
				System.out.println("2");
				return true;
			}
		}
		return false;
	}
	boolean promising(int level) {
		for (int z = 1; z < level; z++) {
			if (z == level) {
				System.out.println("1-1");
				return false;
			}	
			else if (level - z == Math.abs(cols[level] - cols[z])) {
				System.out.println("2-1");
				return false;
			}		
		}
		return true;
	}
}
