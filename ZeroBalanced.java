package finalPractice;

public class ZeroBalanced {

	public static void main(String[] args) {
		System.out.println(isZeroBalanced(new int[] {}));
	}
	
	public static int isZeroBalanced(int[] a) {
		int sum = 0, sign = -1, found;
		if(a.length == 0) return 0;
		for(int i = 0; i < a.length; i++) {
			found = 0;
			sum += a[i];
			if(a[i] > 0) {
				for(int j = 0; j < a.length; j++) {
					if(sign*a[i] == a[j]) {
						found = 1;
						break;
					}
				}
			}
			else {
				for(int j = 0; j < a.length; j++) {
					if(a[i] == sign*a[j]) {
						found = 1;
						break;
					}
				}
			}
			if(found != 1) return 0;
		}
		return sum == 0? 1 : 0;
	}

}
