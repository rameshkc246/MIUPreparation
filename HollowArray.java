package finalPractice;

public class HollowArray {

	public static void main(String[] args) {
		System.out.println(isHollow(new int[] {1,2,0,0,0,3,0,4,4}));
	}
	
	public static int isHollow(int[] a) {
		int l = 0, r = a.length-1, count = 0;
		while(a[l] != 0 && a[r] != 0) {
			l++; r--;
		}
		for(int i = l; i <= r; i++) {
			if(a[i] != 0) return 0;
			if(a[i] == 0) count++;
		}
		return count >= 3? 1 : 0;
	}
}
