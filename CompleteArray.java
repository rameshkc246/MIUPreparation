package MUMPractice;

public class CompleteArray {

	public static void main(String[] args) {
		int[] array = {-5,6,2,3,4,5,8};
		int result = isComplete(array);
		System.out.println(result);
	}
	
	public static int isComplete(int[] array) {
		int min = 0, max = 0, even = 0, allFound = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				even = 1;
				min = max = array[i];
				break;
			}
		}
		if(even != 1) {
			return 0;
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0 && array[i] < min) {
				min = array[i];
			}
			if(array[i] % 2 == 0 && array[i] > max) {
				max = array[i];
			}
		}
		if(min == max) {
			return 0;
		}
		while(min <= max) {
			for(int i = 0; i < array.length; i++) {
				if(min == array[i]) {
					allFound = 1;
					min++;
					break;
				}
			}
			if(allFound != 1) {
				return 0;
			}
			allFound = 0;
		}
		return 1;
	}

}
