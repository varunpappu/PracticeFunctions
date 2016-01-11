## You are going to be given a string. Your job is to return that 
## string in a certain order that I will explain below:

## Let's say you start with this: 012345

## The first thing you do is reverse it:543210
## Then you will take the string from the 1st position and reverse it again:501234
## Then you will take the string from the 2nd position and reverse it again:504321
## Then you will take the string from the 3rd position and reverse it again:504123

## Continue this pattern until you have done every single position, and then you 
## will return the string you have created. For this particular number, you would return:504132



public class ReversingFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "4ppso1vdjc9rjyf5bkmd5nztr8";
		System.out.println(funReverse(s));

	}

	private static String funReverse(String s) {

		String reverse = "";
		String result = "";
		int length = s.length();

		do {
			reverse = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				reverse = reverse + s.charAt(i);
			}
			s = reverse.substring(1, s.length());
			result = result + "" + reverse.charAt(0);

		} while (result.length() != length);
		
		return result;
	}
}
