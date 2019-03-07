package array;

public class PrimeNumber3 {
	public static void main(String[] args) {
		int count = 0; // �������� Ƚ��
		int ptr = 0; // ã�� �Ҽ��� ����
		int[] prime = new int[500];// �Ҽ��� �����ϴ� �迭

		prime[ptr++] = 2; // 2�� �Ҽ���
		prime[ptr++] = 3; // 3�� �Ҽ���

		for (int n = 5; n <= 1000; n += 2) { // ����� Ȧ����
			boolean flag = false;
			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				count += 2;
				if (n % prime[i] == 0) {// ����������� �Ҽ����ƴ�
					flag = true;
					break;// ���̻� ���ʿ�
				}
			}
			if (!flag) {// ���������� ������ ������������
				prime[ptr++] = n;// �Ҽ��迭�� ����
				count++;
			}
		}
		for (int i = 0; i < ptr; i++)// ã�� ptr���� �Ҽ��� ��Ÿ��
			System.out.println(prime[i]);

		System.out.println("�������� ������ Ƚ��: " + count);
	}
}
