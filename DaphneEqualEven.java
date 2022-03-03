package finalPractice;

public class DaphneEqualEven {

	public static void main(String[] args) {
		System.out.println(isDaphne(new int[] {2,4,8,6}));
	}
	
	public static int isDaphne(int[] a) {
		int l = 0, r = a.length-1;
		int hasOdd = 0;
		while(l < r && a[l] % 2 == 0 && a[r] % 2 == 0) {
			l++; r--;
		}
		if(a[l] % 2 != 0 || a[r] % 2 != 0){
			hasOdd = 1;
		}
		if(hasOdd == 1 && l <= r) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
