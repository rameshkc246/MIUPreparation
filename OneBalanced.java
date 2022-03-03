package finalPractice;

public class OneBalanced {

	public static void main(String[] args) {
		System.out.println(isOneBalanced(new int[] {}));
	}
	
	public static int isOneBalanced(int[] a) {
		int oneCount = 0, nonOneCount = 0, oneStatus = 0, nonOneStatus = 0;
		if(a.length == 0) return 1;
		for(int i = 0; i < a.length; i++) {
			if(oneStatus == 0 && a[i] == 1) {
				oneCount++;
				oneStatus = 1;
				nonOneStatus = 0;
			}
			if(nonOneStatus == 0 && a[i] != 1) {
				nonOneCount++;
				nonOneStatus = 1;
				oneStatus = 0;
			}
		}
		if(oneCount >= 3 || oneCount <= 0 || nonOneCount <= 0 || nonOneCount >= 2) return 0;
		else return 1;
	}
}
