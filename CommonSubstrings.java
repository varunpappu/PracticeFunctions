## Given 2 strings, your job is to find out if there is a substring that 
## appears in both strings. You will return true if you find a substring that 
## appears in both strings, or false if you do not. We only care about substrings 
## that are longer than one letter long.

## Examples:

## Example 1*
## SubstringTest("Something","Fun"); //Returns false

## Example 2*
## SubstringTest("Something","Home"); //Returns true
## In the above example, example 2 returns true because both of the inputs contain 
## the substring "me". (soMEthing and hoME)
## In example 1, the method will return false because something and fun contain no
## common substrings. (We do not count the 'n' as a substring in this Kata because it is only 1 character long)


public class CommonSubstrings {

	public static void main(String[] args) {
		String s1 = "halamadrid";
		String s2 = "hladird";
		System.out.println(SubstringTest(s1, s2));
	}

	private static boolean SubstringTest(String s1, String s2) {

		String sub1 = s1.toLowerCase();
		String sub2 = s2.toLowerCase();
		
		for (int i = 1; i <= sub1.length()-1; i++) {
			for (int j = 1; j <= sub2.length()-1; j++) {
				if(sub1.substring(i-1, i+1).equals(sub2.substring(j-1, j+1))){
					return true;
				}
			}
		}
		return false;
	}
}
