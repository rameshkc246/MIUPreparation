package MUMPractice;

public class ClosestFibonacci {

	public static void main(String[] args) {
		int n = 10;
		int result = closestFibonacci(n);
		System.out.println(result);
	}
	
	public static int closestFibonacci(int n) {
		if(n < 1) return 0;
		if(n == 1) return 1;
		int f1 = 1, f2 = 1, fib, tempfib;
		for(fib = 0; fib <= n;) {
			tempfib = fib;
			fib = f1 + f2;
			f1 = f2;
			f2 = fib;
			if(fib > n) {
				return tempfib;
			}
		}
		return fib;
	}

}
