package finalPractice;

public class MeeraArray {

	public static void main(String[] args) {
		System.out.println(isMeera(new int[] {4,6,8,11,13}));
	}
	
	public static int isMeera(int[] a) {
		int found;
		for(int i = 0; i < a.length; i++) {
			found = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[i] == 2*a[j]) {
					found = 1;
					break;
				}
			}
			if(found == 1) return 0;
		}
		return 1;
	}
}
