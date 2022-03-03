package finalPractice;

import java.util.ArrayList;

public class FullnessQuatient {

	public static void main(String[] args) {
		System.out.println(fullnessQuotient(94));
	}
	
	public static int fullnessQuotient(int n) {
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int base = 2; base <= 9; base++) {
			int num = n;
			while(num != 0) {
				list.add(num % base);
				num /= base;
			}
			if(!list.contains(0)) {
				count++;
			}
			list.clear();
		}
		return count;
	}
}
