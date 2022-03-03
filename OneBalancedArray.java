package MUMPractice;

public class OneBalancedArray {

	public static void main(String[] args) {
		int[] a = {1,1,1,1,18,4,5,3};
		int result = isOneBalanced(a);
		System.out.println(result);
	}
	
	public static int isOneBalanced(int[] a) {
		if(a.length == 0) return 1;
		int countSequence = 0, countOne = 0, countNonOne = 0;
		int i = 0;
		if(a[a.length-1] != 1) return 0;
		while(i < a.length) {
			if(a[i] == 1) {
				while((i < a.length) && (a[i] == 1)) {
					countOne++;
					i++;
				}
			}
			else {
				countSequence++;
				while(i < a.length && a[i] != 1) {
					countNonOne++;
					i++;
				}
			}
		}
		if(countOne == countNonOne && countSequence == 1) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
