package data.structure.algorithm.study;

/**
 * 출처: youtube [알고리즘] 권오흠 교수님.
 * Counting Cells in blob 
 *상하좌우 및 대각도 연결된것으로 간주.
 *
 */
public class Recursion14 {
	private static int BACKGROUND_COLOR = 0;
	private static int IMAGE_COLOR = 1;
	private static int ALREADY_COLOR = 2;
	private static int n =3;
	private static int grid[][] = { { 1, 0, 0 }, 
									{ 0, 1, 1 }, 
									{ 1, 1, 0 } };

	public static void main(String[] args) {
		
		printGrid(n, grid);
		System.out.println(countCells(1, 1));
	}

	public static int countCells(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return 0;
		else if (grid[x][y] != IMAGE_COLOR) 
			return 0;
		else {
			grid[x][y] = ALREADY_COLOR;
			return 1 + countCells(x - 1, y + 1) + countCells(x, y + 1) + countCells(x + 1, y + 1) + countCells(x + 1, y)
					+ countCells(x + 1, y - 1) + countCells(x, y - 1) + countCells(x - 1, y - 1) + countCells(x - 1, y);
		}
	}
	public static void printGrid(int a,int[][] grid) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(grid[i][j]);
			}System.out.println("");
		}
	}
}
