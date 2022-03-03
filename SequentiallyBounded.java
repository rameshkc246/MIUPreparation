package finalPractice;

public class SequentiallyBounded {

	public static void main(String[] args) {
		System.out.println(isSequentiallyBounded(new int[] {2,3,3,3,4,4,5,5,5,5}));
	}
	
	public static int isSequentiallyBounded(int[] a) {
		int count;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) return 0;
			count = 0;
			for(int j = i; j < a.length - 1; j++) {
				if(a[i] > a[j]) {
					return 0;
				}
				if(a[i] == a[j]) {
					count++;
				}
			}
			if(count >= a[i]) {
				return 0;
			}
		}
		return 1;
	}

}
