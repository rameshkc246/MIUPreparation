package finalPractice;

public class DualArray {

	public static void main(String[] args) {
		System.out.println(isDual(new int[] {1,2,3,0,4,-1}));
	}
	
	public static int isDual(int[] a) {
		if(a.length % 2 != 0) return 0;
		if(a.length == 0 || a.length == 2) return 1;
		int sum = a[0] + a[1];
		for(int i = 1; 2*i + 1 <= a.length; i++) {
			System.out.println((2*i) + ":"+ (2*i+1));
			if(a[2*i] + a[2*i+1] != sum) 
				return 0;
		}
		return 1;
	}
}
