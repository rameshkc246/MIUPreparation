package MUMPractice;

public class HasNValues1 {

	public static void main(String[] args) {
		int[] a = {4,1,1,1,8,1,1,1,3,3};
		int n = 3;
		int result = hasNValues(a, n);
		System.out.println(result);
	}
	
	public static int hasNValues(int[] a, int n) {
		int alreadyExist, dIndex = 0;
		int[] diffValues = new int[n];
		if(n > a.length) return 0;
		for(int i = 0; i < a.length; i++) {
			alreadyExist = 0;
			for(int j = 0; j < diffValues.length; j++) {
				if(a[i] == diffValues[j]) {
					alreadyExist = 1; break;
				}
			}
			if(alreadyExist == 0) {
				if(dIndex == n) {
					return 0;
				}
				else {
					diffValues[dIndex++] = a[i];
				}
			}
		}
		return (dIndex == n)? 1 : 0;
	}
}
