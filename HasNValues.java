package MUMPractice;

import java.util.ArrayList;

public class HasNValues {

	public static void main(String[] args) {
		int[] a = {4,1,1,1,8,1,1,1,3,3};
		int n = 3;
		int result = hasNValues(a, n);
		System.out.println(result);
	}
	
	public static int hasNValues(int[] a, int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(n > a.length) return 0;
		for(int i = 0; i < a.length; i++) {
			if(!list.contains(a[i])) {
				list.add(a[i]);
			}
		}
		if(list.size() == n) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
