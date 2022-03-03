package finalPractice;

public class LayeredArray {

	public static void main(String[] args) {
		System.out.println(isLayered(new int[] {2,2,1,1,3,3,3}));
	}
	
	public static int isLayered(int[] a) {
		if(a.length <= 1) return 0;
		int currentVal = a[0], count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < currentVal) return 0;
			else if(a[i] == currentVal) count++;
			else {
				if(count < 2) return 0;
				currentVal = a[i];
				count = 1;
			}
		}
		return count < 2? 0 : 1;
	}
}
