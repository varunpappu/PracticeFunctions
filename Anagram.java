## Note: A word x is an anagram of another word y if we can produce y by rearranging the letters of x.

## Input Format 
## The first line will contain an integer, T, representing the number of test cases. 
## Each test case will contain a string having length len(S1)+len(S2), which will be 
## concatenation of both the strings described above in the problem.The given string will contain only characters from a to z.

## Output Format 
## An integer corresponding to each test case is printed in a different line, i.e. the number of changes required 
## for each test case. Print −1 if it is not possible.


public class Anagram {

	public static void main(String[] args) {

		String s = "xaxbbbxx";

		System.out.println(anagramtest(s));
	}

	private static int anagramtest(String s) {
		int count = 0;

		int[] counter1 = new int[26];
		int[] counter2 = new int[26];

		if (s.length() % 2 != 0)
			return -1;

		String s1 = s.substring(0, s.length() / 2);
		String s2 = s.substring(s.length() / 2);

		for (int i = 0; i < s1.length(); i++) {
			counter1[s1.charAt(i) - 97]++;
			counter2[s2.charAt(i) - 97]++;
		}

		for (int i = 0; i < 26; i++) {
			if (counter1[i] - counter2[i] > 0)
				count = count + (counter1[i] - counter2[i]);
		}
		return count;
	}
}
