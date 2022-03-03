package MUMPractice;

public class Centered15Array {

	public static void main(String[] args) {
		int[] a = {2,1,10, 4, 1,4,3};
		int result = isCentered15(a);
		System.out.println(result);
	}
	
	public static int isCentered15(int[] a) {
		int l = 0, r = a.length - 1;
		int sum = 0;
		while(l <= r) {
			for(int i = l + 1; i < r; i++) {
				sum += a[i];
			}
			if(sum == 15)
				return 1;
			l++;
			r--;
			sum = 0;
		}
		return 0;
	}

}
