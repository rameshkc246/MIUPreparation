package finalPractice;

public class VanillaArray {

	public static void main(String[] args) {
		System.out.println(isVanilla(new int[] {11,11,1111,-11111}));
	}
	
	public static int isVanilla(int[] a) {
		if(a.length == 0) return 1;
		int digit = a[0] % 10;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0)
				a[i] *= -1;
			while(a[i] != 0) {
				if(digit != a[i] % 10) {
					return 0;
				}
				a[i] /= 10;
			}
		}
		return 1;
	}

}

