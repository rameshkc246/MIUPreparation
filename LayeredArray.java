package MUMPractice;

public class LayeredArray {

	public static void main(String[] args) {
		int[] a = {2,2,2,2,2,4,4,7,7,7};
		int result = isLayered(a);
		System.out.println(result);
	}
	
	public static int isLayered(int[] a) {
		int sameCount = 1;
		if(a.length == 0 || a.length == 1) return 0;
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] == a[i+1])
				sameCount++;
			else if(a[i] < a[i+1]) {
				if(sameCount < 2) {
					return 0;
				}
				sameCount = 1;
			}
			else
				return 0;
		}
		return sameCount < 2 ? 0 : 1;
	}

}
