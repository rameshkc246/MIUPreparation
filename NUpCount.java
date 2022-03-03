package MUMPractice;

public class NUpCount {

	public static void main(String[] args) {
		int[] a = {2, 3, 1, 5, -8, 6};
		int n = 5;
		int upcount = nUpCount(a, n);
		System.out.println(upcount);
	}
	
	public static int nUpCount(int[] a, int n) {
		int upcount = 0, status = 1, sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			if(sum > n) {
				if(status == 1) {
					upcount++;
					status = 0;
				}
			}
			else {
				status = 1;
			}
			
		}
		return upcount;
	}

}
