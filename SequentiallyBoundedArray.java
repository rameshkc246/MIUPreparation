package MUMPractice;

public class SequentiallyBoundedArray {

	public static void main(String[] args) {
		int[] a = {5,5,5,5,7};
		int result = isSequentiallyBounded(a);
		System.out.println(result);
	}
	
	public static int isSequentiallyBounded(int[] a) {
		if(a.length == 0) 
			return 1;
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] > a[i+1] || a[i] < 0)
				return 0;
		}
		for(int j = 0; j < a.length; ) {
			int countNumber = 0;
			int tempNumber = a[j];
			while(countNumber < tempNumber && j < a.length) {
				if(a[j] != tempNumber)
					break;
				countNumber++;
				j++;
			}
			if(countNumber == tempNumber)
				return 0;
		}
		return 1;
	}

}
