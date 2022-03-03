package finalPractice;

public class BEQNumber {

	public static void main(String[] args) {
		System.out.println(findSmallestBEQ());
	}
	
	public static int findSmallestBEQ() {
		int num, count, i;
		for(i = 1; i*i*i <= Integer.MAX_VALUE; i++) {
			num = i*i*i;
			count = 0;
			while(num != 0) {
				if(num % 10 == 6) {
					count++;
				}
				num /= 10;
			}
			if(count == 4) break;;
		}
		return i;
	}
}
