package finalPractice;

public class Is121Array1 {

	public static void main(String[] args) {
		System.out.println(is121Array(new int[] {1,1,2,2,1,1,2,2,1,1}));
	}
	
	public static int is121Array(int[] a) {
		int l = 0, r = a.length-1;
		int oneCount = 0, twoCount = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != 1 && a[i] != 2) return 0;
		}
		while(l <= r) {
			if(a[l] == 1 && a[r] == 1) {
				oneCount++;
				l++; r--;
			}
			else {
				break;
			}
		}
		for(int i = l; i <= r; i++) {
			if(a[i] != 2) {
				return 0;
			}
			if(a[i] == 2) {
				twoCount++;
			}
		}
		if(oneCount >=1 && twoCount >= 1) return 1;
		else return 0;
	}
}
