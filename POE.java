package MUMSampleTest;

public class POE {

	public static void main(String[] args) {
		int[] a = {3};
		int idx = findPointOfEquilibrium(a);
		System.out.println(idx);
	}
	
	public static int findPointOfEquilibrium(int[] a) {
		int leftSum = 0, rightSum = 0;
		for(int idx = 1; idx < a.length-1; idx++) {
			for(int i = 0; i < idx; i++) {
				leftSum = leftSum + a[i];
			}
			for(int j = idx+1; j < a.length; j++) {
				rightSum = rightSum + a[j];
			}
			if(leftSum == rightSum) {
				return idx;
			}
			leftSum = 0;
			rightSum = 0;
		}
		return -1;
	}

}
