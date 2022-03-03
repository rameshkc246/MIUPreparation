package finalPractice;

public class ZeroPlentiful {

	public static void main(String[] args) {
		System.out.println(isZeroPlentiful(new int[] {}));
	}
	
	public static int isZeroPlentiful(int[] a) {
		int countZeroSequence = 0, countZeroes;
		for(int i = 0; i < a.length;) {
			if(a[i] == 0) {
				countZeroes = 0;
				while(i < a.length && a[i] == 0) {
					countZeroes++;
					i++;
				}
				if(countZeroes >= 4) {
					countZeroSequence++;
				}
				else {
					return 0;
				}
			}
			i++;
		}
		return countZeroSequence >= 1? countZeroSequence : 0;
	}
}
