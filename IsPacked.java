package finalPractice;

public class IsPacked {

	public static void main(String[] args) {
		System.out.println(isPacked(new int[] {4,4,4,4,2,2,4,4,4,4}));
	}	
	
	public static int isPacked(int[] a) {
		for(int i = 0; i < a.length; ) {
			if(a[i] <= 0) return 0;
			int j = a[i];
			int val = a[i];
			while(j > 0 && i < a.length) {
				if(val == a[i]) {
					i++;
					j--;
				}
				else {
					break;
				}
			}
			for(int k = i; k < a.length; k++) {
				if(val == a[k]) {
					return 0;
				}
			}
			if(j != 0) {
				return 0;
			}
		}
		return 1;
	}
}
