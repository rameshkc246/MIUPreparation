package finalPractice;

public class CubePerfect {

	public static void main(String[] args) {
		System.out.println(isCubePerfect(new int[] {-1,27, 3,-27}));
	}
	
	public static int isCubePerfect(int[] a) {
		int isCube, sign = -1, element;
		for(int i = 0; i < a.length; i++) {
			isCube = 0;
			if(a[i] < 0)
				element = sign*a[i];
			else
				element = a[i];
			for(int j = 0; j*j*j <= element; j++) {
				if(j*j*j == element) {
					isCube = 1;
					break;
				}
			}
			if(isCube != 1) return 0;
		}
		return 1;
	}
}
