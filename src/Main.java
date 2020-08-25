public class Main {

	public static void main(String[] args) {
		Fibonacci(10000);
	}

	public static int Fibonacci(int n) {
		int a, b = 0, c = 1;
		for (int i = 1; i < n; i++) {
			a = b;
			b = c;
			c = (a + b) % 1000000;
		}
		System.out.println(c);
		return c;
	}
}