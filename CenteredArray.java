package finalPractice;

public class CenteredArray {

	public static void main(String[] args) {
		System.out.println(isCentered(new int[] {6,3,9,4,5}));
	}
	
	public static int isCentered(int[] a) {
		if(a.length % 2 == 0) return 0;
		int l = 0, r = a.length-1;
		int mid = a.length/2;
		while(l < r) {
			if(a[l] < a[mid] || a[r] < a[mid]) {
				return 0;
			}
			l++; r--;
		}
		return 1;
	}
}
