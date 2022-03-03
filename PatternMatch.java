package finalPractice;

public class PatternMatch {

	public static void main(String[] args) {
		int[] a = {1,2,3,-5,-5,3,4};
		int[] p = {3,-2,3};
		int result = matches(a, p);
		System.out.println(result);
	}
	
	public static int matches(int[] a, int[] p) {
		int k = 0, j = 0;
		for(int i = 0; i < p.length; i++) {
			if(p[i] > 0) {
				for(j = 0; k < a.length && j < Math.abs(p[i]); j++,k++) {
					if(a[k] < 0) {
						return 0;
					}
				}
			}
			else {
				for(j = 0; k < a.length && j < Math.abs(p[i]); j++,k++) {
					if(a[k] > 0) {
						return 0;
					}
				}
			}
			if(j != Math.abs(p[i])) 
				return 0;
		}
		return 1;
	}

}
