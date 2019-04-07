package recursion;

//�� ���� 1�������� ��ġ�ϴ� ������ ��������� �����մϴ�.
public class Queen {
	static boolean[] flag_a = new boolean[8];// ���࿡ ���� ��ġ�ߴ��� üũ
	static boolean[] flag_b = new boolean[15];//  /�밢�� �������� ���� ��ġ�ߴ��� üũ
	static boolean[] flag_C = new boolean[15];//  \�밢�� �������� ���� ��ġ�ߴ��� üũ
	static int[] pos = new int[8];// �� ���� ���� ��ġ

	// ������ ���� ��ġ�� ����մϴ�.
	static void print() {
		for (int i = 0; i < 8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}

	// i���� ���� �����ϴ�.
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag_a[j] == false&&	// j�࿡�� ���� ���� ��ġ���� �ʾҴٸ�
				flag_b[i+j]==false&&	//�밢�� /�� ���� ��ġ���� �ʾҽ��ϴ�.
				flag_C[i-j+7]==false) {	//�밢�� \�� ���� ��ġ���� �ʾҽ��ϴ�.
				pos[i] = j; // ���� j�࿡ ��ġ
				if (i == 7) {
					print();// ��翭 ��ġ
				}else {
					flag_a[j] = flag_b[i+j] = flag_C[i-j+7] = true;
					set(i + 1);// �������� ����ġ
					flag_a[j] = flag_b[i+j] = flag_C[i-j+7] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		set(0);
	}
}
