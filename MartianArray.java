package finalPractice;

public class MartianArray {

	public static void main(String[] args) {
		System.out.println(isMartian(new int[] {0}));
	}
	
	public static int isMartian(int[] a) {
		int countOne = 0, countTwo = 0;
		if(a.length == 0) return 0;
		for(int i = 0; i < a.length; i++) {
			if(i < a.length - 1)
				if(a[i] == a[i+1]) return 0;
			if(a[i] == 1) countOne++;
			if(a[i] == 2) countTwo++;
		}
		return countOne >= countTwo? 1 : 0;
	}
}
