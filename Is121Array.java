package finalPractice;

public class Is121Array {

	public static void main(String[] args) {
		System.out.println(is121Array(new int[] {1,2,1}));
	}
	
	public static int is121Array(int[] a) {
		int lOneCount = 0, rOneCount = 0, twoCount = 0;
		int i = 0;
		while(i < a.length && a[i] == 1) {
			lOneCount++;
			i++;
		}
		while(i < a.length && a[i] == 2) {
			twoCount++;
			i++;
		}
		while(i < a.length && a[i] == 1) {
			rOneCount++;
			i++;
		}
		if(lOneCount != rOneCount || lOneCount == 0 || rOneCount == 0 || twoCount == 0 || i != a.length) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
