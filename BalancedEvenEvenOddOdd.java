package finalPractice;

public class BalancedEvenEvenOddOdd {

	public static void main(String[] args) {
		System.out.println(isBalanced(new int[] {1,3,4,5}));
	}
	
	public static int isBalanced(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(i % 2 == 0 && a[i] % 2 != 0) 
				return 0;
			if(i % 2 != 0 && a[i] % 2 == 0) 
				return 0;
		}
		return 1;
	}
}
