package finalPractice;

public class ComputeDepthWithoutLibrary {

	public static void main(String[] args) {
		System.out.println(computeDepth(25));
	}
	
	public static int computeDepth(int n) {
		int depth = 0, count = 0, found, digit, num;
		int[] rslt = new int[10];
		for(int i = 0; i < rslt.length; i++) {
			rslt[i] = -1;
		}
		while(true) {
			depth++;
			num = n * depth;
			while(num != 0) {
				digit = num % 10;
				found = 0;
				for(int i = 0; i < rslt.length; i++) {
					if(rslt[i] == digit) {
						found = 1; break;
					}
				}
				if(found == 0) {
					rslt[count] = digit;
					count++;
					if(count == 10) return depth;
				}
				num /= 10;
			}
			
		}
	}
}
