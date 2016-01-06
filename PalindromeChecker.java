## According to wiki palindrome is a word, phrase, number, or other sequence of characters 
## which reads the same backward or forward. Allowances may be made for adjustments to capital letters, 
## punctuation, and word dividers. Famous examples include "A man, a plan, a canal, Panama!", "Amor, Roma", "race car" and "No 'x' in Nixon".

## All requirements from definition should be fulfilled. In case of null input return false.



public class PalindromeChecker {

	public static void main(String[] args) {

		String s = "Are we not pure? 'No sir!' Panama`s moody Noriega brags. 'It is garbage!' Irony dooms a man; a prisoner up to new era";

		System.out.println(palindromecheck(s));
	}

	private static boolean palindromecheck(String str) {
		if (str == null)
			return false;

		String nospace = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		String newstring = "";

		for (int i = nospace.length() - 1; i >= 0; i--) {
			newstring = newstring + nospace.charAt(i) + "";
		}

		for (int i = 0; i < nospace.length(); i++) {
			if (nospace.charAt(i) != newstring.charAt(i)) {
				return false;
			}
		}

		return true;
	}
}
