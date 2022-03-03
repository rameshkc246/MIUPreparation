package finalPractice;

public class SystematicallyIncreasing {

	public static void main(String[] args) {
		System.out.println(isSystematicallyIncreasing(new int[] {1,2,1,2,1,2,3}));
	}
	
	public static int isSystematicallyIncreasing(int[] a) {
		int sequenceCount = 0, i, k = 0;
		for(i = 0; i < a.length; i++) {
			if(a[i] == 1) {
				k = 1;
				sequenceCount++;
			}
			if(a[i] != k && k < sequenceCount) {
				return 0;
			}
			if(a[i] == k) {
				k++;
			}
		}
		if(k - 1 != sequenceCount) return 0;
		else return 1;
	}

}
