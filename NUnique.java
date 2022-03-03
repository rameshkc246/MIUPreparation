package finalPractice;

public class NUnique {

	public static void main(String[] args) {
		int result = nUnique(new int[] {2,3,3,7}, 5);
		System.out.println(result);
	}
	
	public static int nUnique(int[] arr, int n) {
		int sumCount = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == n) {
					sumCount++;
				}
			}
		}
		return sumCount==1? 1 : 0;
	}

}
