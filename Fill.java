package finalPractice;

public class Fill {

	public static void main(String[] args) {
		int[] arr = {4,5,2,3,1,5,6};
		int k = 1, n = 5;
		int[] rslt = fill(arr, 2, 5);
		for(int x : rslt) {
			System.out.print(x + ",");
		}
	}
	
	public static int[] fill(int[] arr, int k, int n) {
		int[] arr2 = new int[n];
		int j = 0;
		if(k < 0 || n < 0) return null;
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[j++];
			if(j == k)
				j = 0;
		}
		return arr2;
	}
}
