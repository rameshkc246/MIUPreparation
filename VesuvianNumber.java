package finalPractice;

public class VesuvianNumber {

	public static void main(String[] args) {
		System.out.println(isVesuvian(50));
	}
	
	public static int isVesuvian(int n) {
		int count = 0;
		for(int i = 1; i * i <= n; i++) {
			for(int j = 1; j*j <= n; j++) {
				if(i*i + j*j == n) {
					count++;
				}
			}
			if(count == 2) return 1;
		}
		return 0;
	}
}
