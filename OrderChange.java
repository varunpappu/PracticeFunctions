## Your task is to sort a given string. Each word in the String will contain a single number. 
## This number is the position the word should have in the result.

## Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

## If the input String is empty, return an empty String. The words in the 
## input String will only contain valid consecutive numbers.

## Case1: For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
## Case2: For an input: "is2 Thi1s T4est 3a" the function should return "is1 Thi2s T3est 4a"


public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "is2 Thi1s T4est 3a";
		System.out.println("String: " + s);
		System.out.println("Number Change: "
				+ numberOrder(s.replaceAll("[^a-zA-z ]", "0")));
		System.out.println("Order Change: " + orderchange(s));
	}

	private static String orderchange(String s) {
		// TODO Auto-generated method stub
		if (s == null)
			return "";

		String[] arr = s.split(" ");
		String ordered = "";
		for (int i = 0; i <= arr.length; i++) {
			for (String word : arr) {
				if (word.contains(String.valueOf(i))) {
					ordered = ordered + word + " ";
				}
			}
		}
		return ordered.trim();
	}

	private static String numberOrder(String s) {

		String[] num = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		int j = 0;
		String[] arr = s.split("");
		for (int i = 0; i <= s.length(); i++) {

			if (arr[i].equals("0")) {
				arr[i] = num[j];
				j++;
			}
		}
		String finalarr = "";
		for (int i = 0; i <= s.length(); i++) {
			finalarr = finalarr + arr[i];
		}
		return finalarr;

	}

}
