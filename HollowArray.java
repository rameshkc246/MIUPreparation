package MUMPractice;

public class HollowArray {

	public static void main(String[] args) {
		int[] array = {1,2,4,5,0,0,0,0,0,3,0,4,5,5};
		int result = isHollow(array);
		System.out.println(result);
	}
	
	public static int isHollow(int[] array) {
		int countNonZeros = 0, countZeros = 0, nonZeroStatus = 0, zeroStatus = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0 && nonZeroStatus == 0 ) {
				countNonZeros++;
			}
			if(array[i] == 0 && zeroStatus == 0) {
				countZeros++;
				nonZeroStatus = 1;
			}
			if(array[i] != 0 && nonZeroStatus == 1) {
				countNonZeros--;
				zeroStatus = 1;
			}
			if(array[i] == 0 && zeroStatus == 1) {
				return 0;
			}
		}
		if(countZeros >= 3 && countNonZeros == 0)
			return 1;
		else
			return 0;
	}

}
