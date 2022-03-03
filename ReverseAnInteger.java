package MUMSampleTest;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int a = -1234;
		int r = reverseInteger(a);
		System.out.println(r);
	}
	
	public static int reverseInteger(int a) {
		int r = 0;
		while(a != 0) {
			r = r * 10 + a % 10;
			a = a / 10;
		}
		return r;
	}

}
