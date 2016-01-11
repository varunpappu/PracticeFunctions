## Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer. 
## Square all numbers k (0 <= k <= n) between 0 and n. Count the numbers of
## digits d used in the writing of all the k**2. Call nb_dig (or nbDig or ...) 
## the function taking n and d as parameters and returning this count.

## Examples:

## n = 10, d = 1, the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
## We are using the digit 1 in 1, 16, 81, 100. The total count is then 4.

## nb_dig(25, 1):
## the numbers of interest are
## 1, 4, 9, 10, 11, 12, 13, 14, 19, 21 which squared are 1, 16, 81, 100, 121, 144, 169, 196, 361, 441
## so there are 11 digits `1` for the squares of numbers between 0 and 25.
## Note that 121 has twice the digit 1.


public class CounttheDigit {

	public static void main(String[] args) {

		int n = 5750;
		int d = 0;
		System.out.println(nbDig(n, d));
	}

	private static int nbDig(int n, int d) {

		int counter = 0;
		int[] arr = new int[n + 1];
		int mod = 0;

		if (d == 0) 
			counter = 1;
		else
			counter = 0;

		for (int i = 1; i <= n; i++) {
			arr[i] = (int) Math.pow(i, 2);
			while (arr[i] > 0) {
				mod = arr[i] % 10;
				if (mod == d) {
					counter++;
				}
				arr[i] = arr[i] / 10;
			}
		}
		return counter;
	}
}
