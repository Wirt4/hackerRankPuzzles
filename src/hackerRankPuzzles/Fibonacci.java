package hackerRankPuzzles;
//2021-3-27
//simple problem but getting used to JUnit workflow
public class Fibonacci {
	public static int fibonacci(int n) {
		switch(n) {
		case 0:
			return 0;
		case 1:
			return 1;
		default:
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
