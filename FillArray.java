package MUMPractice;

public class FillArray {

	public static void main(String[] args) {
		int[] arr = {4,2,-12,5};
		int k = 1, n = 0;
		int[] arr2 = fill(arr, k, n);
		for(int x : arr2) {
			System.out.println(x);
		}
	}
	
	public static int[] fill(int[] arr, int k, int n) {
		int[] arr2 = new int[n];
		int index = 0;
		if(k <= 0 || n <= 0) return null;
		for(int i = 0; i < arr2.length;) {
			while(index < k && i < arr2.length) {
				arr2[i] = arr[index];
				i++;
				index++;
			}
			index = 0;
		}
		return arr2;
	}

}
