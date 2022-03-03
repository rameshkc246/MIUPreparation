package finalPractice;

public class DecodeArray1 {

	public static void main(String[] args) {
		System.out.println(decodeArray(new int[] {0,1,1,1,1,1,1,0,1}));
	}
	
	public static int decodeArray(int[] a) {
		int num = 0, countZeroes = 0, sign = 1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
				countZeroes++;
			}
			else if(a[i] == 1) {
				num = num * 10 + countZeroes;
				countZeroes = 0;
			}
			else {
				sign = -1;
			}
		}
		return sign * num;
	}
}
