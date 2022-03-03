package MUMPractice;

public class IsFibonacci {

	public static void main(String[] args) {
		int n = 8;
		int result = isFibonacci(n);
		System.out.println(result);
	}
	
	public static int isFibonacci(int n) {
		if(n == 1) return 1;
		int f1 = 1, f2 = 1, fib;
		for(fib = 0; fib <= n;) {
			fib = f1 + f2;
			f1 = f2;
			f2 = fib;
			if(fib == n) {
				return 1;
			}
		}
		return 0;
	}
}
