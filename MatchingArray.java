package MUMPractice;

public class MatchingArray {

	public static void main(String[] args) {
		int[] A = {1,2,3,-1,-1};
		int[] P = {3,-2};
		int result = matches(A, P);
		System.out.println(result);
	}
	
	public static int matches(int[] A, int[] P) {
		for(int i = 0; i < A.length;) {
			for(int j = 0; j < P.length; j++) {
				int pvalue = P[j];
				if(pvalue > 0) {
					while(pvalue >= 1) {
						if(A[i] < 0)
							return 0;
						i++; pvalue--;
					}
				}
				else {
					while(pvalue <= -1) {
						if(A[i] > 0)
							return 0;
						i++; pvalue++;
					}
				}
				
			}
		}
		return 1;
	}

}



