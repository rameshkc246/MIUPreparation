package finalPractice;

import java.util.ArrayList;

public class ClusterCompression {

	public static void main(String[] args) {
		int[] a = {2,2,2,2,4,3,3,3,4,4,4,3};
		int[] result = clusterCompression(a);
		for(int x : result) {
			System.out.print(x + ",");
		}
	}
	
	public static int[] clusterCompression(int[] a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(a.length == 0) return null;
		list.add(a[0]);
		for(int i = 0; i < a.length - 1; i++) {
			if(a[i] != a[i+1]) {
				list.add(a[i+1]);
			}
		}
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

}
