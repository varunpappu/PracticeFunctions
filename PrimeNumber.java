##Print all prime numbers before a number N


public class PrimeNumbers {

	public static void main(String[] args) {

		int n = 100;

		for (int i = 1; i < n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(i);
		}
	}
}
