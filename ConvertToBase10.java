package MUMPractice;

public class ConvertToBase10 {

	public static void main(String[] args) {
		int[] a = {3,7,1};
		int base = 6;
		int result = convertToBase10(a, base);
		System.out.println(result);
	}
	
	public static int convertToBase10(int[] a, int base) {
		int legalStatus = isLegalNumber(a, base);
		int decimal = 0;
		if(legalStatus == 0)
			return 0;
		for(int i = 0, k = a.length-1; i < a.length; i++, k--) {
			decimal += (a[k] * (int)Math.pow(base, i));
		}
		return decimal;
	}
	
	public static int isLegalNumber(int[] a, int base) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0 || a[i] >= base) {
				return 0;
			}
		}
		return 1;
	}

}
