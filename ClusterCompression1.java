package finalPractice;

public class ClusterCompression1 {

	public static void main(String[] args) {
		int[] a = {2,2,2,2,4,3,3,3,4,4,4,3};
		int[] result = clusterCompression(a);
		for(int x : result) {
			System.out.print(x + ",");
		}
	}
	
	public static int[] clusterCompression(int[] a) {
		int clusterCount = 1;
		if(a.length == 0) return null;
		for(int i = 0; i < a.length - 1; i++) {
			if(a[i] != a[i+1]) {
				clusterCount++;
			}
		}
		int[] result = new int[clusterCount];
		result[0] = a[0];
		for(int i = 0, j = 1; i < a.length - 1; i++) {
			if(a[i] != a[i+1]) {
				result[j++] = a[i+1];
			}
		}
		return result;
	}

}
