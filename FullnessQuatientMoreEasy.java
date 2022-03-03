package finalPractice;

public class FullnessQuatientMoreEasy {

	public static void main(String[] args) {
		System.out.println(fullnessQuotient(94));
	}
	
	public static int fullnessQuotient(int n) {
		int count = 0;
		for(int base = 2; base <= 9; base++) {
			int num = n;
			while(num != 0) {
				if(num % base == 0 && num != 0) {
					break;
				}
				num /= base;
			}
			if(num == 0) {
				count++;
			}
		}
		return count;
	}

}
