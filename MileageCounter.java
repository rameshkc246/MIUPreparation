package MUMPractice;

public class MileageCounter {

	public static void main(String[] args) {
		int[] counter = {9,5,9,7,9,8,9};
		int miles = 1;
		int[] result = mileageCounter(counter, miles);
		for(int x : result) {
			System.out.println(x);
		}
	}
	
	public static int[] mileageCounter(int[] counter, int miles) {
		int carryMiles = 0, milesDigit, resultMile;
		int[] resultCounter = new int[counter.length];
		for(int i = 0; i < counter.length; i++) {
			milesDigit = miles % 10;
			miles /= 10;
			resultMile = carryMiles + milesDigit + counter[i];
			if(resultMile >= 10) {
				resultCounter[i] = resultMile % 10;
				carryMiles = 1;
			}
			else {
				resultCounter[i] = resultMile;
				carryMiles = 0;
			}
			
		}
		return resultCounter;
		
	}

}
