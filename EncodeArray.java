package finalPractice;

public class EncodeArray {

	public static void main(String[] args) {
		int n = -45;
		int[] rslt = encodeArray(n);
		for(int x: rslt) {
			System.out.print(x + ",");
		}
	}
	
	public static int[] encodeArray(int n) {
		int size = 0, num = n, digit, index;
		if(n < 0) {
			size = 1;
			num = -1 * num;
		}
		while(num != 0) {
			digit = num % 10;
			size += digit + 1;
			num /= 10;
		}
		int[] encode = new int[size];
		num = n;
		if(n < 0) {
			num = -1 * num;
			encode[0] = -1;
			index = encode.length;
			while(num != 0) {
				digit = num % 10;
				index--;
				encode[index] = 1;
				for(int i = index-1; i > index - digit ; i--) {
					encode[i] = 0;
				}
				index = index - digit;
				num /= 10;
			}
		}
		else {
			index = encode.length;
			while(num != 0) {
				digit = num % 10;
				index--;
				encode[index] = 1;
				for(int i = index-1; i > index - digit ; i--) {
					encode[i] = 0;
				}
				index = index - digit;
				num /= 10;
			}
		}
		return encode;
	}
}
