package finalPractice;

public class CountOneOfBinary {

	public static void main(String[] args) {
		System.out.println(countOne(15));
	}
	
	public static int countOne(int n) {
		int count = 0;
		while(n != 0) {
			if(n % 2 == 1) count++;
			n /= 2;
		}
		return count;
	}
}
