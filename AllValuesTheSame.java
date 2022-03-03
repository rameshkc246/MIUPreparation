package finalPractice;

public class AllValuesTheSame {

	public static void main(String[] args) {
		System.out.println(allValuesTheSame(new int[] {2,2,2,4}));
	}
	
	public static int allValuesTheSame(int[] a) {
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] != a[i+1]) return 0;
		}
		return 1;
	}
}
