package MUMPractice;

public class CountOnes {

	public static void main(String[] args) {
		int n = 32;
		int result = countOnes(n);
		System.out.println(result);
	}
	
	public static int countOnes(int n) {
		int countOnes = 0;
		while(n != 0) {
			if(n % 2 == 1) {
				countOnes++;
				n /= 2;
			}
			else {
				n /= 2;
			}
		}
		return countOnes;
	}

}
