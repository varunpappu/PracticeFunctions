## The Fibonacci numbers are the numbers in the following integer sequence (Fn):
## 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
## such as
## F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.
## Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying

## F(n) * F(n+1) = prod.
## Your function productFib takes an integer (prod) and returns an array:

## {F(n), F(n+1), 1}
## if F(n) * F(n+1) = prod or returns

## {F(n), F(n+1), 0}
## if you don't find two consecutive F(m) verifying F(m) * F(m+1) = prod. F(m) 
## will be the smallest one such as F(m) * F(m+1) > prod.

## Examples

## productFib(714) # should return {21, 34, 1}, 
                # since F(8) = 21, F(9) = 34 and 714 = 21 * 34

## productFib(800) # should return {34, 55, 0}, 
                # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55




public class ProdFibonacci {

	public static void main(String[] args) {

		long number = 4895;
		long[] result = new long[3];
		result = productFib(number);
		for (int i = 0; i < 3; i++) {
			System.out.println(result[i]);
		}
	}

	private static long[] productFib(long prod) {
		long a = 0;
		long b = 1;

		for (int i = 0; i < prod; i++) {
			long c = a + b;
			a = b;
			b = c;
			if (a * c == prod) {
				return new long[]{a, b, 1};
			} else if (a * c > prod) {
				return new long[]{a, b, 0};

			}
		}
		return new long[]{a, b, 1};

	}
}
