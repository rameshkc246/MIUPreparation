package MUMPractice;

public class DepthOfInteger {

	public static void main(String[] args) {
		int n = 13;
		int result = computeDepth(n);
		System.out.println(result);
	}
	
	public static int computeDepth(int n) {
		String digitContributed = "\0";
		int depth = 1;
		int tempnum;
		int digit;
		l2:
		while(true) {
			tempnum = n * depth;
			while(tempnum != 0) {
				digit = tempnum % 10;
				String s = Integer.toString(digit);
				if(!digitContributed.contains(s)) {
					digitContributed = digitContributed + s;
				}
				if(digitContributed.length() == 11) {
					break l2;
				}
				tempnum = tempnum / 10;
			}
			depth++;
		}
		return depth;
	}

}
