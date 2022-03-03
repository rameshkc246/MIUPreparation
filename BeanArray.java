package finalPractice;

public class BeanArray {

	public static void main(String[] args) {
		System.out.println(isBean(new int[] {4,9,8}));
	}
	
	public static int isBean(int[] a) {
		int found;
		for(int i = 0; i < a.length; i++) {
			found = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[i] == 2*a[j] || a[i] == 2*a[j]+1 || a[i] == a[j]/2) {
					found = 1;
				}
			}
			if(found != 1) return 0;
		}
		return 1;
	}
}
