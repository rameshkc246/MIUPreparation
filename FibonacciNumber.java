package finalPractice;

public class FibonacciNumber {

	public static void main(String[] args) {
		System.out.println(isFibonacci(4));
	}
	
	public static int isFibonacci(int n) {
		int f1 = 1, f2 = 1, fib = 0;
		if(n == 1 || n == 2) return 1; 
		for(int i = 3; fib <= n; i++) {
			fib = f1 + f2;
			if(fib == n)
				return 1;
			f1 = f2;
			f2 = fib;
		}
		return 0;
	}
}
