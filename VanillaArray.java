package MUMPractice;

public class VanillaArray {

	public static void main(String[] args) {
		int[] a = {9, 99, 999, -9999};
		int result = isVanilla(a);
		System.out.println(result);
	}
	
	public static int isVanilla(int[] a) {
		if(a.length == 0) {
			return 1;
		}
		else {
			int digit = a[0] % 10;
			int ithDigit;
			for(int i = 0; i < a.length; i++) {
				if(a[i] < 0) {
					a[i] = -1 * a[i];
				}
				while(a[i] != 0) {
					ithDigit = a[i] % 10;
					if(digit != ithDigit) {
						return 0;
					}
					a[i] /= 10;
				}
			}
			return 1;
		}
	}

}
