package MUMPractice;

public class IsMadhavArray {

	public static void main(String[] args) {
		int[] a = {18,9,10,6,6,6};
		int status = isMadhavArray(a);
		System.out.println(status);
	}
	
	public static int isMadhavArray(int[] a) {
		int lengthStatus = 0;
		int sum = 0;
		int start = 1;
		int end = 2;
		if(a.length == 1) return 1;
		for(int i = 1; i*(i+1)/2 <= a.length; i++) {
			if(a.length == i*(i+1)/2) {
				lengthStatus = 1;
			}
		}
		if(lengthStatus == 1) {
			for(int j = 3; j <= a.length; j++) {
				for(int k = start; k <= end; k++) {
					sum = sum + a[k];
				}
				if(sum != a[0]) {
					return 0;
				}
				sum = 0;
				start = end + 1;
				end = start + j - 1;
				if(start >= a.length) {
					break;
				}
			}
			return 1;
			
		}
		else {
			return 0;
		}
		
	}

}
