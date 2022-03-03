package finalPractice;

import java.util.ArrayList;

public class ComputeDepth {

	public static void main(String[] args) {
		System.out.println(computeDepth(25));
	}
	
	public static int computeDepth(int n) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int num, digit;
		for(int i = 1; i < Integer.MAX_VALUE; i++) {
			num = n * i;
			while(num != 0) {
				digit = num % 10; 
				if(!digits.contains(digit)) {
					digits.add(digit);
				}
				if(digits.size() == 10) {
					return i;
				}
				num /= 10;
			}
		}
		return 0;
	}

}
