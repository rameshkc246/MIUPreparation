package MUMPractice;

import java.util.ArrayList;

public class EncodeNumber {

	public static void main(String[] args) {
		int n = 11;
		int[] result = encodeNumber(n);
		for(int x: result) {
			System.out.println(x);
		}
	}
	
	public static int[] encodeNumber(int n) {
		if(n <= 1) {
			return null;
		}
		ArrayList<Integer> factorList = new ArrayList<Integer>();
		for(int i = 1; i < n; i++) {
			int primeFactor = nextPrime(i);
			while(n % primeFactor == 0) {
				factorList.add(primeFactor);
				n /= primeFactor;
			}
			if(n == 1)
				break;
		}
		int[] result = new int[factorList.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = factorList.get(i);
		}
		return result;
	}
	
	 public static int nextPrime(int n) {
	    	int composite = 0;
	    	for(int i = n+1; i < Integer.MAX_VALUE; i++) {
	    		for(int j = 2; j < i; j++) {
	    			if(i % j == 0) {
	    				composite = 1;
	    				break;
	    			}
	    		}
	    		if(composite == 0) {
	    			return i ;
	    		}
	    		else {
	    			composite = 0;
	    		}
	    	}
			return 0;
	 }

}
