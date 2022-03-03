package finalPractice;

public class PairedN {

	public static void main(String[] args) {
		System.out.println(isPairedN(new int[] {1,2,3,2,5,6}, 5));
	}
	
	public static int isPairedN(int[] a, int n) {
		if(a.length <= 1) return 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(i + j == n && a[i] + a[j] == n) return 1;
			}
		}
		return 0;
	}
}
