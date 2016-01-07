## Your task is to make a function that can take any non-negative integer as a 
## argument and return it with it's digits in descending order. Descending order 
## means that you take the highest digit and place the next highest digit immediately after it.

## Examples:

## Input: 145263 Output: 654321
## Input: 1254859723 Output: 9875543221

import java.util.ArrayList;

public class DescendingOrder {

	public static void main(String[] args) {
		int num = 145263;
		System.out.println(sortDesc(num));

	}

	private static int sortDesc(int num) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		String s = "";
		int n = num;
		int mod = n % 10;
		while (n > 0) {
			ls.add(mod);
			n = n / 10;
			mod = n % 10;
		}
		
		descendingorder(ls);
		
		for (Integer val : ls) {
			s = s + val + "";
		}
		return Integer.parseInt(s);
	}

	private static ArrayList<Integer> descendingorder(ArrayList<Integer> ls) {
		for (int i = ls.size() - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ls.get(j) < ls.get(j + 1)) {
					int temp = ls.get(j);
					ls.set(j, ls.get(j + 1));
					ls.set(j + 1, temp);
				}
			}
		}
		return ls;
	}
}
