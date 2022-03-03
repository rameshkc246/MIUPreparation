package MUMPractice;

public class IsolatedNumber {

	public static void main(String[] args) {
		long n = 0;
		long result = isIsolated(n);
		System.out.println(result);
	}
	
	public static long isIsolated(long n) {
		long square, cube;
		long squareDigit, cubeDigit;
		if(n > 2097151 || n < 1)
			return -1;
		square = n * n;
		cube = n * n * n;
		long tempcube = cube;
		while(square != 0) {
			squareDigit = square % 10;
			while(tempcube != 0) {
				cubeDigit = tempcube % 10;
				if(squareDigit == cubeDigit) {
					return 0;
				}
				tempcube = tempcube / 10;
			}
			square /= 10;
			tempcube = cube;
		}
		return 1;
	}

}
