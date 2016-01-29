## Letters in some of the SOS messages are altered by cosmic radiation during transmission. 
## Given the signal received by Earth as a string, S, determine how many letters of Sami's SOS 
## have been changed by radiation.

## Sample Input 1
## SOSSPSSQSSOR
## Sample Output 1
## 3

## Sample Input 2
## SOSSOT
## Sample Output 2
## 1

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = "MNOSOS";
		System.out.println(messageInterpret(s));

	}

	private static int messageInterpret(String s) {

		int count = 0;
		if (s == null)
			return 0;

		for (int i = 0; i <= s.length() - 1; i = i + 3) {
			if (s.charAt(i) != 'S')
				count++;
			if (s.charAt(i + 1) != 'O')
				count++;
			if (s.charAt(i + 2) != 'S')
				count++;
		}
		return count;
	}
}