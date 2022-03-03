package finalPractice;

public class ConvertToBase10 {

	public static void main(String[] args) {
		System.out.println(convertToBase10(new int[] {1,1,1,2}, 2));
	}
	
	public static int convertToBase10(int[] a, int base) {
		if(isLegal(a, base) != 1) return 0;
		int decimal = 0, term = 1;
		for(int i = a.length-1; i >= 0; i--) {
			decimal += a[i] * term;
			term *= base;
		}
		return decimal;
	}
	
	public static int isLegal(int[] a, int base) {
		int isLegal = 1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= base) {
				isLegal = 0;
				break;
			}
		}
		return isLegal;
	}

}
