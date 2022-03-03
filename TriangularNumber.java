package finalPractice;

public class TriangularNumber {

	public static void main(String[] args) {
		System.out.println(isTriangular(11));
	}
	
	public static int isTriangular(int n) {
		int sum = 0;
		for(int j = 1; sum <= n; j++) {
			sum += j;
			if(sum == n) return 1;
		}
		return 0;
	}

}
