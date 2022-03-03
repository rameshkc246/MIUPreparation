package finalPractice;

public class Solve10 {

	public static void main(String[] args) {
		int[] solve = solve10();
		for(int x : solve) {
			System.out.println(x);
		}
	}
	
	public static int[] solve10() {
		int[] result = new int[2];
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if(fact(x) + fact(y) == fact(10)) {
					result[0] = x;
					result[1] = y;
				}
			}
		}
		return result;
	}
	
	public static int fact(int n) {
		if(n <= 1) {
			return 1;
		}
		else {
			return n * fact(n - 1);
		}
	}

}
