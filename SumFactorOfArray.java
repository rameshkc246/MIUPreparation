package MUMPractice;

public class SumFactorOfArray {

	public static void main(String[] args) {
		int[] a = {3,0,2,0,-5,0};
		int result = sumFactor(a);
		System.out.println(result);
	}
	
	public static int sumFactor(int[] a) {
		int arraySum = 0, sumFactorCount = 0;
		for(int i = 0; i < a.length; i++) {
			arraySum = arraySum + a[i];
		}
		for(int j = 0; j < a.length; j++) {
			if(a[j] == arraySum)
				sumFactorCount++;
		}
		return sumFactorCount;
	}

}
