package finalPractice;

public class PairwiseSum {

	public static void main(String[] args) {
		int[] a = {3,4,3,6};
		int[] rslt = pairwiseSum(a);
		for(int x: rslt) System.out.print(x + ",");
	}
	
	public static int[] pairwiseSum(int[] a) {
		if(a.length == 0 || a.length % 2 != 0) return null;
		int[] rslt = new int[a.length/2];
		for(int i = 0; i < a.length/2; i++) {
			rslt[i] = a[2*i] + a[2*i+1];
		}
		return rslt;
	}
}
