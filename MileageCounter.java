package finalPractice;

public class MileageCounter {

	public static void main(String[] args) {
		int[] a = {9,9,9,9,9,9,9};
		int[] rslt = mileageCounter(a, 13);
		for(int x : rslt) System.out.print(x + ",");
	}
	
	public static int[] mileageCounter(int[] a, int miles) {
		int digit, carry = 0, val = 0;
		for(int i = 0; i < a.length; i++) {
			digit = miles % 10;
			miles /= 10;
			val = a[i] + digit + carry;
			if(val >= 10) {
				a[i] = val % 10;
				carry = 1;
			}
			if(carry == 0 && miles == 0) break;
		}
		return a;
	}
}
