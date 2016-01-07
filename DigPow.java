## Some numbers have funny properties. For example:

## digPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
## digPow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92 * k
## digPow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
## digPow(46288, 3) should return 51 since 4³ + 6^4+ 2^5 + 8^6 + 8^7 = 2360688 = 46288 * 51

## Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive 
## integer p we want to find a positive integer k, if it exists, such as the sum of the digits 
## of n taken to the successive powers of p is equal to k * n. In other words:

## Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
## If it is the case we will return k, if not return -1.



import java.util.ArrayList;

public class DigPow {

	public static void main(String[] args) {
		int number = 46288;
		int pow = 3;
		System.out.println(digPow(number, pow));
	}

	public static long digPow(int number, int pow) {

		ArrayList<Integer> ls = new ArrayList<Integer>();
		int n = number;
		long sum = 0;
		while (n > 0) {
			ls.add(n % 10);
			n = n / 10;
		}
		int i = ls.size() - 1;
		while (i >= 0) {
			sum = sum + (long) (Math.pow(ls.get(i), pow));
			pow++;
			i--;
		}

		if (sum % number == 0)
			return sum/number;
		else
			return -1;

	}

}
