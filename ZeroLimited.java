package finalPractice;

public class ZeroLimited {

	public static void main(String[] args) {
		System.out.println(isZeroLimited(new int[] {0,0,0}));
	}
	
	public static int isZeroLimited(int[] a) {
		for(int i = 0, k = 0; i < a.length; i++) {
			if(3*i+1 < a.length) {
				if(a[3*i+1] != 0) return 0;
			}
			if(i == 3*k+1) { 
				k++;continue;
			}
			else {
				if(a[i] == 0) return 0;
			}
		}
		return 1;
	}
}
