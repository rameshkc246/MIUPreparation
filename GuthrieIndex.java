package MUMPractice;

public class GuthrieIndex {

	public static void main(String[] args) {
		int n = 3;
		int result = guthrieIndex(n);
		System.out.println(result);
	}
	
	public static int guthrieIndex(int n) {
		int index = 0;
		if(n == 1 || n <= 0)
			return 0;
		while(n != 1) {
			index++;
			if(n % 2 == 0)
				n = n / 2;
			else
				n = n * 3 + 1;
		}
		return index;
	}
}
