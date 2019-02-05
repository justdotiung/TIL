package data.structure.algorithm.study;

public class Recursion {
	public static void main(String[] args) {
		func();
	}
	public static void func() {							//무한루프에 빠진다.
		System.out.println("hello");
		func();
	}
}
