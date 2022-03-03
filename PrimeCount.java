package MUMPractice;

public class PrimeCount {

	public static void main(String[] args) {
		int start = 11;
		int end = 29;
		int count = primeCount(start, end);
		System.out.println(count);

	}
	
	public static int primeCount(int start, int end) {
		int count = 0;
		if(start < 0)
			start = 2;
		if(start == 0 && end == 0)
			return 0;
		if(start == 1 && end == 1)
			return 0;
		
		if(start > end)
			return 0;
		for(int i = start; i <= end; i++) {
			int status = 1;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					status = 0;
					break;
				}
			}
			if(status == 1) {
				count++;
			}
		}
		return count;
	}

}
