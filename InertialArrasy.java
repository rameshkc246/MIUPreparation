package MUMPractice;

public class InertialArrasy {

	public static void main(String[] args) {
		int[] a = {2,4,6,8,10};
		int status = isInertial(a);
		System.out.println(status);
	}
	
	public static int isInertial(int[] a) {
		int condition1 = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				condition1 = 1;
				break;
			}
		}
		
		int maximum = a[0];
		int condition2 = 0;
		for(int j = 1; j < a.length; j++) {
			if(a[j] > maximum) {
				maximum = a[j];
			}
		}
		if(maximum % 2 == 0) {
			condition2 = 1;
		}
		
		int condition3 = 1;
		for(int k = 0; k < a.length; k++) {
			if(a[k] % 2 != 0) {
				for(int l = 0; l < a.length; l++) {
					if(a[l] == maximum) continue;
					if(a[l] % 2 == 0 && a[k] <= a[l]) {
						condition3 = 0;
					}
				}
			}
		}
		
		if(condition1 == 1 && condition2 == 1 && condition3 == 1) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
