package MUMPractice;

public class AllPossibilitiesArray {

	public static void main(String[] args) {
		int[] array = {1,2,0,3};
		int result = isAllPossibilities(array);
		System.out.println(result);
	}
	
	public static int isAllPossibilities(int[] array) {
		int isFound = 0;
		int allPossibilities = 1;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i == array[j]) {
					isFound = 1;
					break;
				}
			}
			if(isFound != 1) {
				allPossibilities = 0;
				break;
			}
			else {
				isFound = 0;
			}
		}
		return allPossibilities;
	}

}
