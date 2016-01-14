## Find the greater sum from 6 X 6 array.
## The index a b c 
			   d
			 e f g

			 
public class TwoDArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = i;
			}
		}
		System.out.println("SUM " + matrix(arr));
	}

	public static int matrix(int[][] arr) {
		int sum1 = 0;
		int sum2 = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				sum1 = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1]
						+ arr[i][j] + arr[i + 1][j - 1] + arr[i + 1][j]
						+ arr[i + 1][j + 1];
				if (sum1 >= sum2) {
					sum2 = sum1;
					sum1 = 0;
				}
			}
		}
		return sum2;
	}
}
