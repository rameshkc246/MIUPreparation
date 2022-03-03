package MUMPractice;

public class NUniqueArray {

	public static void main(String[] args) {
		System.out.println(isNUnique(new int[] {}, 11));
	}
	
	public static int isNUnique(int[] a, int n) {
		int counter = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] + a[j] == n)
					counter++;
			}
		}
		if(counter == 1)
			return 1;
		else
			return 0;
	}

}
