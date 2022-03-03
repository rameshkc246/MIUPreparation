package MUMSampleTest;

public class CenteredArray {

	public static void main(String[] args) {
		int[] a = {};
		int status = isCenteredArray(a);
		System.out.println(status);
	}
	
	public static int isCenteredArray(int[] a) {
		int l = a.length;
		int count = 1;
		if(l % 2 == 0 || l == 0) {
			return 0;
		}
		else if(l == 1) {
			return 1;
		}
		else {
			int m = (int)Math.floor(l/ 2);
			for(int i = 0; i < l; i++) {
				if(i == m) {
					continue;
				}
				else if( a[i] > a[m]) {
					count++;
				}
				else {
					break;
				}
			}
			if(count == l) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
	}

}
