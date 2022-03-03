package finalPractice;

public class TripleArray {

	public static void main(String[] args) {
		System.out.println(isTriple(new int[] {1,2,3,3,2,1,2,3,1}));
	}
	
	public static int isTriple(int[] a) {
		int count;
		for(int i = 0; i < a.length; i++) {
			count = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
			if(count != 3)
				return 0;
		}
		return 1;
	}
}
