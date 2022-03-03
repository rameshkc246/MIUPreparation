package finalPractice;

public class DecodeArray {

	public static void main(String[] args) {
		System.out.println(decodeArray(new int[] {0,-3,0,-4,0}));
	}
	
	public static int decodeArray(int[] a) {
		int n = Math.abs(a[0] - a[1]);
		for(int i = 1; i < a.length - 1; i++) {
			n = (n * 10) + Math.abs(a[i] - a[i+1]);
		}
		return n;
	}
}
