## You are going to be given an array of integers. Your job is to take that array and find an 
## index N where the sum of the integers to the left of N is equal to the sum of the integers 
## to the right of N. If there is no index that would make this happen, return -1.

## For example:

## Let's say you are given the array {1,2,3,4,3,2,1}:
## Your function will return the index 3, because at the 3rd position of the array, 
## the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.

## Let's look at another one.
## You are given the array {1,100,50,-51,1,1}:
## Your function will return the index 1, because at the 1st position of the array, the sum of left side of the 
## index ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.

## Note: Please remember that in most programming/scripting languages the index of an array starts at 0.


## Output:

## The index N such as the side to the left of N is equal to the side to the right of N. If you do not 
## find an index that fits these rules, then you will return -1.


public class EqualSides {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 1, 2, 3 };

		System.out.println(findEvenIndex(arr));

	}	

	private static int findEvenIndex(int[] arr) {

		int index = arr.length;

		while (index > 0) {

			int leftside = 0;
			int rightside = 0;

			for (int i = 0; i < index; i++) {
				leftside = leftside + arr[i];
			}

			for (int i = index + 1; i < arr.length; i++) {
				rightside = rightside + arr[i];
			}

			if (leftside == rightside) {
				return index;
			} else
				index--;
		}
		return -1;
	}
}
