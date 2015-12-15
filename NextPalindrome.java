 ##Given a number, find the next smallest palindrome larger
 ##than the number. For example if the number is 125, next smallest palindrome is 131. 


public class NextPalindrome {

	public static void main(String[] args) {

		int number = 125;
		String s = "";
		boolean check = false;
		
		while (!check) {
			int n = number;
			
			while (n > 0) {
				s = s + n % 10;
				n = n / 10;
			}
			
			if (Integer.parseInt(s) == number) {
				System.out.println(s);
				check = true;
			} else {
				number++;
				s = "";
			}
		}
	}
}