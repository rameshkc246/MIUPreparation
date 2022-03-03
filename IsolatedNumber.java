package finalPractice;

public class IsolatedNumber {

	public static void main(String[] args) {
		System.out.println(isIsolated(58));
	}
	
	public static int isIsolated(int n) {
		long sqrt = n*n, cube;
		int sqrtDigit, cubeDigit;
		if(n < 1 || n > 2097151) return -1;
		while(sqrt != 0) {
			cube = n*n*n;
			sqrtDigit = (int)(sqrt % 10);
			while(cube != 0) {
				cubeDigit = (int)(cube % 10);
				if(cubeDigit == sqrtDigit) {
					return 0;
				}
				cube /= 10;
			}
			sqrt /= 10;
		}
		return 1;
	}

}
