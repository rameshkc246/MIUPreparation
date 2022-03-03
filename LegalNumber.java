package finalPractice;

public class LegalNumber {

	public static void main(String[] args) {
		System.out.println(isLegalNumber(new int[] {2,1,3,5}, 4));
	}
	
	public static int isLegalNumber(int[] a, int n) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= 4) {
				return 0;
			}
		}
		return 1;
	}

}
