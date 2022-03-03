package finalPractice;

public class MathchPattern {

	public static void main(String[] args) {
		System.out.println(matchPattern(new int[] {1,1,1,2,2,2,3}, new int[] {1,2,3}));
	}
	
	public static int matchPattern(int[] a, int[] p) {
		int matches = 0;
		int k = 0;
		int i = 0;
		for (i = 0; i < a.length; i++) {
			if(a[i] == p[k])
				matches++;
			else if (matches == 0 || k == p.length-1)
				return 0; 
			else {
				if(k == p.length - 1) {
					break;
				}
				k++;
				matches = 0;
			} 
		} 
		if (i == a.length && k == p.length - 1) return 1; 
		else return 0;
		}
}
