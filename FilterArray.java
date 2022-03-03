package MUMPractice;

public class FilterArray {		//Note: Incomplete Logic

	public static void main(String[] args) {
		int[] array = {1,9,3,11,7,13,9};
		int result = isFilteredArray(array);
		System.out.println(result);
	}
	
	public static int isFilteredArray(int[] array) {
		int isFilter = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 9) {
				for(int j = 0; j < array.length; j++) {
					if(array[j] == 11) {
						isFilter = 1;
						break;
					}
				}
			}
			if(array[i] == 7) {
				for(int j = 0; j < array.length; j++) {
					if(array[j] == 13) {
						isFilter = 0;
						break;
					}
				}
			}
		}
		if(isFilter == 1) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
