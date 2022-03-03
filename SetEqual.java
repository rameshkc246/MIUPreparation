package finalPractice;

public class SetEqual {

	public static void main(String[] args) {
		int[] arr1 = {1,3,4,6};
		int[] arr2 = {6,4,3,3};
		int rslt = isSetEqual(arr1, arr2);
		System.out.println(rslt);
	}
	
	public static int isSetEqual(int[] arr1, int[] arr2) {
		int found;
		if(arr1.length != arr2.length) return 0;
		for(int i = 0; i < arr1.length; i++) {
			found = 0;
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					found = 1;
					break;
				}
			}
			if(found != 1) return 0;
		}
		return 1;
	}
}
