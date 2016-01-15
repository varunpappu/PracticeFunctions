## If we list all the natural numbers below 10 that are multiples of 3 or 5, 
## we get 3, 5, 6 and 9. The sum of these multiples is 23.

## Find the sum of all the multiples of 3 or 5 below N.


import java.util.Scanner;

public class Mutiples3and5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the values");
			System.out.println("SUM " + findSum(in.nextLong()));
		}
	}

	public static long findSum(long n) {
		long sum = 0;
		long multiples3 = summation((n - 1) / 3) * 3;
		long multiples5 = summation((n - 1) / 5) * 5;
		long multiples15 = summation((n - 1) / 15) * 15;

		return multiples3 + multiples5 - multiples15;
	}

	public static long summation(long x) {
		return (x * (x + 1)) / 2;
	}
}