package finalPractice;

public class NextFibonacciNumber {

	public static void main(String[] args) {
		int n = 8;
		int nextFibonacci = nextFibonacciNumber(n);
		System.out.println(nextFibonacci);
	}
	
	public static int nextFibonacciNumber(int n)
	{
		int fib = 0, f1, f2;
		while(true) {
			n++;
			f1 = 1;
			f2 = 1;
			for(int i = 2; i <= n && fib <= n; i++) {
				fib = f1 + f2;
				if(fib == n) {
					return fib;
				}
				f1 = f2;
				f2 = fib;
			}
		}
	}

}
