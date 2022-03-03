package finalPractice;

public class NBasedIntegerRaounding {

	public static void main(String[] args) {
		int[] a = {-18,1,2,3,4,5,21};
		int n = 4;
		int[] rslt = nBasedIntegerRounding(a, n);
		for(int x : rslt) {
			System.out.print(x + ",");
		}
	}
	
	public static int[] nBasedIntegerRounding(int[] a, int n) {
		if(n <= 0) return a;
		for(int i = 0; i < a.length; i++) {
			if(a[i] <= 0) continue;
			int factor = a[i] / n;
			if((n*(factor+1) - a[i]) <= (a[i] - n*factor))
				a[i] = n*(factor+1);
			else
				a[i] = n*factor;
			
		}
		return a;
	}
}
