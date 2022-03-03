package finalPractice;

public class WaveArray {

	public static void main(String[] args) {
		System.out.println(isWave(new int[] {7,6,3,4,5}));
	}
	
	public static int isWave(int[] a) {
		int oddTurn = 1, evenTurn = 1;
		int k = 0;
		for(int i = 0; i < a.length; i++) {
			if(evenTurn == 1 && a[i] % 2 == 0) {
				k++;
				evenTurn = 0;
				oddTurn = 1;
			}
			if(oddTurn == 1 && a[i] % 2 != 0) {
				k++;
				oddTurn = 0;
				evenTurn = 1;
			}
		}
		return (k == a.length)? 1 : 0;
	}
}
