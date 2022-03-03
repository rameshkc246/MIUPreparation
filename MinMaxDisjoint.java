package finalPractice;

public class MinMaxDisjoint {

	public static void main(String[] args) {
		System.out.println(isMinMaxDisjoint(new int[] {3,2,4,6,2,7,9}));
	}
	
	public static int isMinMaxDisjoint(int[] a) {
		int min, minIndex, max, maxIndex, minCount = 0, maxCount = 0;
		if(a.length == 0) return 0;
		min = max = a[0];
		minIndex = maxIndex = 0;
		for(int i = 1; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
				minIndex = i;
			}
			if(a[i] > max) {
				max = a[i];
				maxIndex = i;
			}	
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] == min)
				minCount++;
			if(a[i] == max)
				maxCount++;
		}
		if(min != max && minIndex != maxIndex-1 && minIndex != maxIndex + 1 && minCount == 1 && maxCount == 1) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
