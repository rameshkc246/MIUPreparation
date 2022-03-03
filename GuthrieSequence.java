package MUMPractice;

public class GuthrieSequence {

	public static void main(String[] args) {
		int[] a = {3, 10, 5, 16, 8, 4, 2, 1};
		int result = isGuthrieSequence(a);
		System.out.println(result);
	}
	
	public static int isGuthrieSequence(int[] a) {
		int n = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 1)
				return 1;
			else if(a[i] % 2 == 0 && a[i] == n)
				n = n / 2;
			else if(a[i] % 2 != 0 && a[i] == n)
				n = n * 3 + 1;
			else 
				break;
		}
		return 0;
	}

}
