package finalPractice;

import java.util.ArrayList;

public class HasNValues {

	public static void main(String[] args) {
		System.out.println(allValuesTheSame(new int[] {1,1,1,8,8,1,1,1,3}, 3));
	}
	
	public static int allValuesTheSame(int[] a, int n) {
		int[] rslt = new int[n];
		int k = 0, found, j;
		for(int i = 0; i < a.length; i++) {
			found = 0;
			for(j = 0; j < rslt.length; j++) {
				if(a[i] == rslt[j]) {
					found = 1; break;
				}
			}
			if(found == 0 && k == rslt.length) {
				return 0;
			}
			if(found == 0) {
				rslt[k++] = a[i];
			}
		}
		return k == n? 1 : 0;
	}
}
