package MUMPractice;

public class VesuvianNumber {

	public static void main(String[] args) {
		int n = 50;
		int result = isVesuvian(n);
		System.out.println(result);
	}
	
	public static int isVesuvian(int n) {
		int count = 0;
		for(int i = 1; i*i < n; i++) {
			for(int j = i; j*j < n; j++) {
				if(((i*i) + (j*j)) == n) {
					count++;
				}
			}
		}
		return (count == 2)? 1 : 0;
	}

}
