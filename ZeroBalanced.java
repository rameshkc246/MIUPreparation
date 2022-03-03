package MUMPractice;

public class ZeroBalanced {

	public static void main(String[] args) {
		int[] a = {3,2,4,-3,-2};
		int result = isZeroBalanced(a);
		System.out.println(result);
	}
	
	public static int isZeroBalanced(int[] a) {
		int balancedSum = 0;
		int zeroBalanced = 1;
		if(a.length == 0) return 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i] == a[j] || a[i] == -a[j]) {
					balancedSum += a[j];
				}
			}
			if(balancedSum != 0) {
				zeroBalanced = 0; 
				break;
			}
		}
		return zeroBalanced;
	}

}
