package finalPractice;

public class CompleteArrayEven {

	public static void main(String[] args) {
		System.out.println(isComplete(new int[] {2,1,3,5,4,7,6,8,1,10,3}));
	}
	
	public static int isComplete(int[] a) {
		int largest = Integer.MIN_VALUE, found;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				largest = a[i];
				if(a[i] > largest) {
					largest = a[i];
				}
			}
		}
		int num = 2;
		while(num < largest) {
			found = 0;
			for(int j = 0; j < a.length; j++) {
				if(num == a[j]) {
					found = 1;
				}
			}
			if(found != 1) 
				return 0;
			num += 2;
		}
		return 1;
	}
}
