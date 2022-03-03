package finalPractice;

public class InertialArray {

	public static void main(String[] args) {
		int[] arr = {4,5,1,2,8};
		int inertial = isInertial(arr);
		System.out.println(inertial);
	}
	
	public static int isInertial(int[] arr) {
		if(arr.length == 0) return 1;
		int isOdd = 0, maxValue = arr[0], oddValueGreater = 1; 
		int maxIndex = 0, status;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
				maxIndex = i;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				isOdd = 1;
				break;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			status = 0;
			if(arr[i] % 2 != 0) {
				for(int j = 0; j < arr.length; j++) {
					if(arr[j] % 2 == 0 && arr[j] > arr[i] && j != maxIndex) {
						status = 1;
						break;
					}
				}
			}
			if(status == 1) {
				oddValueGreater = 0;
				break;
			}
		}
		if(isOdd == 1 && maxValue % 2 == 0 && oddValueGreater == 1) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
