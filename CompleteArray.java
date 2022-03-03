package finalPractice;

public class CompleteArray {

	public static void main(String[] args) {
		System.out.println(isComplete(new int[] {-28, 36}));
	}
	
	public static int isComplete(int[] a) {
		int isEven = 0, isSquare = 0, isSum8 = 0;
		for(int i = 0; i < a.length; i++) {
			if(isSquare(a[i])) isSquare = 1;
			if(a[i] % 2 == 0) isEven = 1;
			if(i < a.length-1 && a[i] + a[i+1] == 8) isSum8 = 1;
			if(isEven == 1 && isSquare == 1 && isSum8 == 1) return 1;
		}
		return 0;
	}
	
	public static boolean isSquare(int n) {
		for(int i = 1; i*i <= n; i++) {
			if(i*i == n) {
				return true;
			}
		}
		return false;
	}

}
