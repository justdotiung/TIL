package array;

public class PrimeNumber3 {
	public static void main(String[] args) {
		int count = 0; // 나눗셈의 횟수
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500];// 소수를 저장하는 배열

		prime[ptr++] = 2; // 2는 소수임
		prime[ptr++] = 3; // 3은 소수임

		for (int n = 5; n <= 1000; n += 2) { // 대상은 홀수만
			boolean flag = false;
			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				count += 2;
				if (n % prime[i] == 0) {// 나누어떨어지면 소수가아님
					flag = true;
					break;// 더이상 불필요
				}
			}
			if (!flag) {// 마지막까지 나누어 떨어지지않음
				prime[ptr++] = n;// 소수배열에 저장
				count++;
			}
		}
		for (int i = 0; i < ptr; i++)// 찾은 ptr개의 소수를 나타냄
			System.out.println(prime[i]);

		System.out.println("나눗셈을 수행한 횟수: " + count);
	}
}
