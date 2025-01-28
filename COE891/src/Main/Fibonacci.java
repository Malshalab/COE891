package Main;

public class Fibonacci {
	public static int compute(int n) {
		int result = 0;
		if (n < 0) throw new IllegalArgumentException("Negative input is not allowed");
		if (n <= 1) {
			result = n;
		} else {
			result = compute(n - 1) + compute(n - 2); }
		return result; }
	}
