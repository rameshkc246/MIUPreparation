package MUMPractice;

public class MartianArray {

	public static void main(String[] args) {
		int[] a = {1,3,2,1,1};
		int result = isMartian(a);
		System.out.println(result);
	}
	
	public static int isMartian(int[] a) {
		if(a.length == 0) return 0;
		int countOne = 0, countTwo = 0;
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] == a[i+1]) {
				return 0;
			}
			if(a[i] == 1) {
				countOne++;
			}
			if(a[i] == 2) {
				countTwo++;
			}
			if(i == a.length-2) {
				if(a[i+1] == 1) {
					countOne++;
				}
				if(a[i+1] == 2) {
					countTwo++;
				}
			}
		}
		return (countOne > countTwo)? 1 : 0;
	}
}
