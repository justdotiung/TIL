package data.structure.algorithm.study;

/**
 * 미로찾기 
 * 
 */
public class Recursion11 {
	private static int n = 8;
	private static int[][] maze = { 
			{ 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 0, 1, 1, 0, 1, 1, 0, 1 }, 
			{ 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 0, 0, 1, 1, 0, 0 }, 
			{ 0, 1, 1, 1, 0, 0, 1, 1 }, 
			{ 0, 1, 0, 0, 0, 1, 0, 1 },
			{ 0, 0, 0, 1, 0, 0, 0, 1 }, 
			{ 0, 1, 1, 1, 0, 1, 0, 0 } };
	private static final int PATHWAY_COLOR = 0;
	private static final int WALL_COLOR = 1;
	private static final int BLOCKED_COLOR = 2;
	private static final int PATH_COLOR = 3;

	public static void main(String[] args) {
		printMaze(n, maze);
		findMazePath(0, 0);
		printMaze(n, maze);
	}

	public static boolean findMazePath(int x,int y) {
		if(x<0 || y<0 || x>=n || y>=n)
			return false;
		else if (maze[x][y] !=PATHWAY_COLOR)
			return false;
		else if (x==n-1 && y==n-1) {
			maze[x][y] =PATH_COLOR;
			return true;
			
		}
		else {
			maze[x][y] = PATH_COLOR;
			if (findMazePath(x-1, y) || findMazePath(x, y+1)
				|| findMazePath(x+1, y) || findMazePath(x, y-1)	) {
				return true;
			}
			maze[x][y] = BLOCKED_COLOR;
			return false;
			}
	}
	public static void printMaze(int n,int[][] maze) {
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
	
}
