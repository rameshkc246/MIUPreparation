package finalPractice;

public class MercurialArray {

	public static void main(String[] args) {
		System.out.println(isMercurial(new int[] {2,5,3,6,5,1,6,1}));
	}
	
	public static int isMercurial(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 1) {
				for(int j = i+1; j < a.length; j++) {
					if(a[j] == 3) {
						for(int k = j + 1; k < a.length; k++) {
							if(a[k] == 1) {
								return 0;
							}
						}
					}
				}
			}
		}
		return 1;
	}

}
