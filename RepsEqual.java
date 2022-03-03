package MUMPractice;

public class RepsEqual {

	public static void main(String[] args) {
		int[] a = {0,3,2,0,5,3};
		int n = 32053;
		int result = repsEqual(a, n);
		System.out.println(result);
	}
	
	public static int repsEqual(int[] a, int n) {
		int digit;
		if(a.length <= 0)
			return 0;
		for(int i = a.length - 1; i >= 0; i--) {
			digit = n % 10;
			n /= 10;
			if(digit != a[i])
				return 0;
		}
		return 1;
	}

}
