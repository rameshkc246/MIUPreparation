package finalPractice;

public class Henry {

	public static void main(String[] args) {
		int i = 2, j = 4;
		int sum = henry(i,j);
		System.out.println(sum);
	}
	
	public static int henry(int i, int j) {
		return (perfectNumberAt(i) + perfectNumberAt(j));
	}
	
	public static int perfectNumberAt(int i) {
		int sum, k = 0;
		int m = 0, n;
		while(k < i) {
			for(m = 2; m < Integer.MAX_VALUE; m++) {
				sum = 0;
				for(n = 1; n < m; n++) {
					if(m % n == 0) {
						sum += n;
					}
				}
				if(sum == m) {
					k++;
				}
				if(k == i)
					break;
			}
		}
		return m;
	}
}
