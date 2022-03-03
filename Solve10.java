package MUMPractice;

public class Solve10 {

	public static void main(String[] args) {
		int[] a = solve10();
		System.out.println(a[0] + " and " + a[1]);
	}
	
	public static int[] solve10() {
		long factorial10 = findFactorial(10);
		int[] a = new int[2];
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				System.out.println(findFactorial(i) + findFactorial(j));
				if((findFactorial(i) + findFactorial(j)) == factorial10) {
					a[0] = i;
					a[1] = j;
					break;
				}
			}
			
		}
		return a;
	}
	
	public static int findFactorial(int n) {
		if(n <= 1)
			return 1;
		else
			return n * findFactorial(n-1);
	}

}
