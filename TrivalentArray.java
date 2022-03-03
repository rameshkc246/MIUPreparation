package finalPractice;

import java.util.ArrayList;

public class TrivalentArray {

	public static void main(String[] args) {
		System.out.println(isTrivalent(new int[] {2,3,4,3,2,3,4,6}));
	}
		
	public static int isTrivalent(int[] a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < a.length; i++) {
			if(!list.contains(a[i])) {
				list.add(a[i]);
				if(list.size() > 3)
					return 0;
			}
		}
		return list.size() == 3? 1 : 0;
	}
}
