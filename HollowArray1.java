package MUMPractice;

public class HollowArray1 {

	public static void main(String[] args) {
		int[] array = {1,2,4,5,0,0,1,0,0,0,3,4,5,5};
		int result = isHollow(array);
		System.out.println(result);
	}
	
	public static int isHollow(int[] array) {
		int leftCount = 0, rightCount = 0, zeroCount = 0;
		int isHollow;
		int i, j;
		for( i = 0, j = 0; array[i] != 0 && i < array.length; i++, j++) {
			leftCount++;
		}
		for(i = j; array[i] == 0 && i < array.length; i++) {
			zeroCount++;
		}
		for( i = array.length-1; array[i] != 0 && i >= 0; i--) {
			rightCount++;
		}
		if(leftCount == rightCount && zeroCount >= 3 ) {
			isHollow = 1;
		}
		else {
			isHollow = 0;
		}
		return isHollow;
	}

}
