package coding;

import java.util.StringTokenizer;

public class TokenEx {
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("2019:10/11+123",":+/");
		System.out.println(st.hasMoreTokens());
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}
	}
}
