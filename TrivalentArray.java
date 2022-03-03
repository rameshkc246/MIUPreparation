package MUMPractice;

import java.util.ArrayList;

public class TrivalentArray {

	public static void main(String[] args) {
		int[] a = {2,1,4,22,22};
		int result = isTrivalent(a);
		System.out.println(result);
	}
	
	public static int isTrivalent(int[] a) {
		ArrayList<Integer> arrayValues = new ArrayList<Integer>();
		if(a.length == 0)
			return 0;
		for(int i = 0; i < a.length; i++) {
			if(!arrayValues.contains(a[i])) {
				arrayValues.add(a[i]);
			}
			if(arrayValues.size() > 3) {
				return 0;
			}
		}
		return 1;
	}

}
