package finalPractice;

public class MNSequencedArray {

	public static void main(String[] args) {
		System.out.println(isSequencedArray(new int[] {-5,-4,-4,-3,-4,-3,-2},-5,-2));
	}
	
	public static int isSequencedArray(int[] a, int m, int n) {
		int found, i, j, k;
		for(i = 0; i < a.length; i =i+k) {
			found = 0;
			for(j = i, k = 0; j < a.length; j++, k++) {
				if(a[j] < m) {
					return 0;
				}
				if(a[j] == m) {
					found = 1;
				}
				if(a[j] > m) {
					m++;
					break;
				}
			}
			if(found != 1) return 0;
		}
		return 1;
	}
}
