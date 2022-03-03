package MUMPractice;

public class PerfectNumberSum {

	public static void main(String[] args) {
		int l = 1, r = 3;
		int result = henry(l, r);
		System.out.println(result);
	}
	
	public static int henry(int l, int r) {
		int sum = 0;
		int factorSum = 1;
		int k = 1, num = 2;
		int nextPerfectNum = l;
		while(k <= r) {
			for(int i = 2; i <= (int)Math.ceil(num/2); i++) {
				if(num % i == 0) {
					factorSum += i;
				}
			}
			if(factorSum == num) {
				if(k == nextPerfectNum) {
					sum += factorSum;
					nextPerfectNum = r;
				}
				k++;
			}
			num++;
			factorSum = 1;
		}
		return sum;
	}

}
