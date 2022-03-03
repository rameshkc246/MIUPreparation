package finalPractice;

public class MeeraArraySumZero {

	public static void main(String[] args) {
		System.out.println(isMeera(new int[] {-4,0,1,0,2,1}));
	}
	
	public static int isMeera(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
			if(a[i] >= i)
				return 0;
		}
		return sum == 0? 1 : 0;
	}
}
