package MUMSampleTest;

public class CommonElementsOfArrays {

	public static void main(String[] args) {
		int[] a1 = {1};
		int[] a2 = {2, 4, 1, 5};
		int[] a3 = findCommonElement(a1, a2);
		for(int x : a3) {
			System.out.println(x);
		}

	}
	
	public static int[] findCommonElement(int[] a1, int[] a2) {
		if(a1 == null || a2 == null) 
			return null;
		if(a1.length <= 0 || a2.length <= 0)
			return new int[0];
		int min = (a1.length < a2.length)? a1.length : a2.length;
		int[] a3 = new int[min];
		int k = 0;
		int[] a, b;
		if(min == a1.length) {
			a = a1;
			b = a2;
		}
		else {
			a = a2;
			b = a1;
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a1[i] == a2[j]) {
					a3[k] = a1[i];
					k++;
				}
			}
		}
		
		int[] retArray = new int[k];
		for(int l = 0; l < retArray.length; l++) {
			retArray[l] = a3[l];
		}
		return retArray;
	}

}
