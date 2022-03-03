package MUMPractice;

public class Is235Array {

	public static void main(String[] args) {
		int[] a = {2,3,6,7,11};
		int result = is235Array(a);
		System.out.println(result);
	}
	
	public static int is235Array(int[] a) {
		int countDivisibleBy2 = 0, countDivisibleBy3 = 0, countDivisibleBy5 = 0, countNotDivisibleByAny = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				countDivisibleBy2++;
			}
			if(a[i] % 3 == 0) {
				countDivisibleBy3++;
			}
			if(a[i] % 5 == 0) {
				countDivisibleBy5++;
			}
			if(a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0) {
				countNotDivisibleByAny++;
			}
		}
		if((countDivisibleBy2+countDivisibleBy3+countDivisibleBy5+countNotDivisibleByAny) == a.length) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
