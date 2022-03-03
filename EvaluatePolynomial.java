package finalPractice;

public class EvaluatePolynomial {

	public static void main(String[] args) {
		System.out.println(eval(new int[] {3,2,1}, 3.0));
	}
	
	public static double eval(int[] a, double x) {
		int val = 0;
		for(int i = 0; i < a.length; i++) {
			val += (a[i] * power(x, i)); 
		}
		return val;
	}
	
	public static double power(double n, int pow) {
		int power = 1;
		for(int i = 1; i <= pow; i++) {
			power *= n;
		}
		return power;
	}
}
