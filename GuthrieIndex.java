package finalPractice;

public class GuthrieIndex {

	public static void main(String[] args) {
		int n = 42;
		int result = guthrieIndex(n);
		System.out.println(result);
	}
	
	public static int guthrieIndex(int n) {
		int index = 0;
		while(n != 1) {
			index++;
			if(n % 2 == 0) {
				n /= 2;
			}
			else {
				n = 3 * n + 1;
			}
		}
		return index;
	}


}
