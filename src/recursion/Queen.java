package recursion;

//각 열에 1개의퀸을 배치하는 조합을 재귀적으로 나열합니다.
public class Queen {
	static boolean[] flag_a = new boolean[8];// 각행에 퀸을 배치했느지 체크
	static boolean[] flag_b = new boolean[15];//  /대각선 방향으로 퀸을 배치했는지 체크
	static boolean[] flag_C = new boolean[15];//  \대각선 방향으로 퀸을 배치했는지 체크
	static int[] pos = new int[8];// 각 열의 퀸의 위치

	// 각열의 귄의 위치를 출력합니다.
	static void print() {
		for (int i = 0; i < 8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}

	// i열에 퀸을 놓습니다.
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag_a[j] == false&&	// j행에는 퀸을 아직 배치하지 않았다면
				flag_b[i+j]==false&&	//대각선 /에 아직 배치하지 않았습니다.
				flag_C[i-j+7]==false) {	//대각선 \에 아직 배치하지 않았습니다.
				pos[i] = j; // 퀸을 j행에 배치
				if (i == 7) {
					print();// 모든열 배치
				}else {
					flag_a[j] = flag_b[i+j] = flag_C[i-j+7] = true;
					set(i + 1);// 다음열에 퀸배치
					flag_a[j] = flag_b[i+j] = flag_C[i-j+7] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		set(0);
	}
}
