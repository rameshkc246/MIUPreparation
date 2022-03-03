package finalPractice;

public class SmallestContainsDigit2 {

	public static void main(String[] args) {
		System.out.println(smallest(6));
	}
	
	public static int smallest(int n) {
		int num = 0, k, i;
		while(true) {
			num++;
			for(i = 1; i <= n; i++) {
				int multiple = num * i;
				int found = 0;
				while(multiple != 0) {
					if(multiple % 10 == 2) {
						found = 1;
						break;
					}
					multiple /= 10;
				}
				if(found != 1) {
					break;
				}
			}
			if(n == i-1)
				return num;
		}
		
	}

}
