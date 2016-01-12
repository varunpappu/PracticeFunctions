## You are going to be given a word. Your job will be to make sure that each 
## character in that word has the exact same number of occurrences. 
## You will return true if it is valid, or false if it is not.

## For example:

## "abcabc" is a valid word because 'a' appears twice, 'b' appears twice, and'c' appears twice.
## "abcabcd" is NOT a valid word because 'a' appears twice, 'b' appears twice, 'c' appears twice, but 'd' only appears once!
## "123abc!" is a valid word because all of the characters only appear once in the word.

## For this kata, capitals are considered the same as lowercase letters. Therefore: 'A' == 'a' .

## Input

## A string (no spaces) containing [a-z],[A-Z],[0-9] and common symbols. The length will be 0 < string < 100.

## Output

## true if the word is a valid word, or false if the word is not valid.



import java.util.HashMap;

public class CharacterCounter {

	public static void main(String[] args) {
		String s = "abcdefabcdef";
		System.out.println(validateWord(s));
	}

	private static boolean validateWord(String s) {

		HashMap<Character, Integer> charCounter = new HashMap<Character, Integer>();
		char[] arr = s.toLowerCase().toCharArray();
		for (char c : arr) {
			if (charCounter.containsKey(c)) {
				charCounter.put(c, charCounter.get(c) + 1);
			} else {
				charCounter.put(c, 1);
			}
		}
		return check(charCounter, arr);
	}

	private static boolean check(HashMap<Character, Integer> charCounter, char[] arr) {
		int check = charCounter.get(arr[0]);
		for (Integer temp : charCounter.values()) {
			if (check != temp)
				return false;
		}
		return true;
	}
}
