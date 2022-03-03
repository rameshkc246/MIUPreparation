package MUMPractice;

public class MercurialArray {

	public static void main(String[] args) {
		int[] a = {8,2,1,1,18,3,11,1,5};
		int result = isMercurial(a);
		System.out.println(result);
	}
	
	public static int isMercurial(int[] a) {
		int threeStatus = 0, nextOneStatus = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 1) {
				int k = i+1;
				while(k < a.length) {
					if(a[k] == 3) {
						threeStatus = 1;
					}
					if(a[k] == 1) {
						nextOneStatus = 1;
						break;
					}
					k++;
				}
				if(threeStatus == 1 && nextOneStatus == 1) {
					return 0;
				}
				else {
					threeStatus = 0;
					nextOneStatus = 0;
				}
			}
		}
		return 1;
	}

}
