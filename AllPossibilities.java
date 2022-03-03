package finalPractice;

public class AllPossibilities {

	public static void main(String[] args) {
		System.out.println(isAllPossibilities(new int[] {1,2,0,3,5}));
	}
	
	public static int isAllPossibilities(int[] a) {
		int found;
		if(a.length == 0) return 0;
		for(int i = 0; i < a.length; i++) {
			found = 0;
			for(int j = 0; j < a.length; j++) {
				if(i == a[j]) {
					found = 1;
					break;
				}
			}
			if(found != 1) return 0;
		}
		return 1;
	}
}
