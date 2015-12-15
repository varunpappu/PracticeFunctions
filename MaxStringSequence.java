##Write a program to accept a nonempty string of alphanumeric characters. Define a “run” as a 
##consecutive sequence of a single character. For example, “aaaa” is a run of length 4. The program will 
##print the longest run in the given string. If there is no single longest run, then you may print any of 
##those runs whose length is at least as long as all other runs in the string. 

##Example input: a 
##Example output: a 

##Example input: aab 
##Example output: aa 

##Example input: abbbbbcc 
##Example output: bbbbb 

##Example input: aabbccdd 
##Example input: aa

public class MaxStringSequence {

	public static void main(String[] args) {

		String s = "abbbbbbccaaaaaaa";

		char currentchar = s.charAt(0);

		int max = 1;
		int count = 1;

		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
				if (count > max) {
					max = count;
					currentchar = s.charAt(i);
				}
			} else {
				count = 1;
			}
		}
		System.out.println(max);
		for (int i = 0; i < max; i++) {
			System.out.print(currentchar);
		}

	}
}