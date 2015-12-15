##Write a program to reverse the string.
##Eg: This is a car -> car a is This.


public class ReverseString {
	public static void main(String[] args) {

		String s = "This is a car";
		String[] sarray = s.split(" ");

	}
	public static void reversed(String[] sarray) {
		for (int i = sarray.length - 1; i >= 0; i--) {
			System.out.print(sarray[i] + " ");
		}
	}
}
