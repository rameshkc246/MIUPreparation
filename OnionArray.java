package finalPractice;

public class OnionArray {

	public static void main(String[] args) {
		System.out.println(isOnion(new int[] {1,2,19,4,5}));
	}
	
	public static int isOnion(int[] a) {
		int j = 0, k = a.length-1;
		while(j < k) {
			if(a[j] + a[k] > 10) {
				return 0;
			}
			j++;
			k--;
		}
		return 1;
	}
}
