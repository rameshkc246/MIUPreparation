package MUMPractice;

public class LegalBaseNumber {

	public static void main(String[] args) {
		int[] a = {1,2,1,0,2};
		int base = 2;
		int result = isLegalNumber(a, base);
		System.out.println(result);
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
