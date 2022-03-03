package finalPractice;

public class GoodSpreadArray {

	public static void main(String[] args) {
		System.out.println(isGoodSpread(new int[] {2,1,4,2,1,4,4,1}));
	}
	
	public static int isGoodSpread(int[] a) {
		int count;
		for(int i = 0; i < a.length; i++) {
			count = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
			if(count > 3) return 0;
		}
		return 1;
	}
}
