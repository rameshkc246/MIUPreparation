package finalPractice;

public class CompleteArrayWith4Conditions {

	public static void main(String[] args) {
		System.out.println(isComplete(new int[] {6,2,4,3,5,9,11}));
	}
	
	public static int isComplete(int[] a) {
		int isEven = 0, min = Integer.MAX_VALUE, max= Integer.MIN_VALUE, found;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) 
				isEven = 1;
			if(a[i] % 2 == 0 && a[i] < min) 
				min = a[i];
			if(a[i] % 2 == 0 && a[i] > max)
				max = a[i];
		}
		if(max == min || isEven == 0) return 0;
		while(min < max) {
			min++;
			found = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j] == min) {
					found = 1;
					break;
				}
			}
			if(found != 1) 
				return 0;
		}
		return 1;
	}
}
