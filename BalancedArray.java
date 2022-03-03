package finalPractice;

public class BalancedArray {

	public static void main(String[] args) {
		System.out.println(isBalanced(new int[] {-2,2,1,-1,5}));
	}
	
	public static int isBalanced(int[] a) {
		int sum = 0, found;
		if(a.length < 2) return 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
			found = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[i] == -1*a[j]) {
					found = 1;
					break;
				}
			}
			if(found != 1) return 0;
		}
		return sum == 0? 1 : 0;
	}
}
