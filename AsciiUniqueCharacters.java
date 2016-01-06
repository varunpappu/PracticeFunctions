## Implement an algorithm to determine if an ASCII string contains all unique characters.



public class AsciiUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a b c";
		System.out.println(hasUniqueChars(s));

	}

	private static boolean hasUniqueChars(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length() - 1; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
