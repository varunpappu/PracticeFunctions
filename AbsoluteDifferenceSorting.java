## Print the space-separated pair of elements having the minimum absolute difference 
## in ascending order. If more than one pair meets this criterion, print them consecutively, 
## separated by a space, in ascending order on a single line. Because we are printing space-separated 
## pairs, some elements may appear more than once in your output.

## Sample Input 1

## 10
## -20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 

## Sample Output 1

## -20 30



import java.util.Scanner;

public class AbsoluteDifferenceSorting {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(absoluteDiff(insertionSort(arr)));

	}

	public static String absoluteDiff(int[] arr) {
		int difference = Math.abs(arr[1] - arr[0]);
		StringBuilder str = new StringBuilder();

		for (int i = 1; i <= arr.length - 1; i++) {
			int tempdiff = Math.abs(arr[i] - arr[i - 1]);

			if (tempdiff < difference) {
				str = new StringBuilder();
				str.append(arr[i - 1] + " " + arr[i] + " ");

				difference = Math.min(tempdiff, difference);

			} else if (tempdiff == difference) {
				str.append(arr[i - 1] + " " + arr[i] + " ");
			}
		}
		return str.toString();
	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int next = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > next) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = next;
		}
		return arr;
	}

}
