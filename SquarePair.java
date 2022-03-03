package MUMPractice;

public class SquarePair {

	public static void main(String[] args) {
		int[] a = {};
		int count = countSquarePair(a);
		System.out.println(count);
	}
	
	public static int countSquarePair(int[] a) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(j == i) continue;
				if(isPerfectSquare(a[i], a[j]) && (a[i] < a[j]) && a[i] > 0 && a[j] > 0) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static boolean isPerfectSquare(int a, int b) {
		int n = a + b;
		for(int i = 0; i * i <= n; i++) {
			if(i * i == n) {
				return true;
			}
		}
		return false;
	}

}
