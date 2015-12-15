#You are given a String S and a set of substrings. You are supposed to remove every instance of those
# n substring from S so that S is of the minimum length and output the minimum length.

##Eg: "ccdaabcdbb"
##n = 2 subsring {"ab", "cd"}

##Output: ccdaabcdbb -> ccdacdbb -> cabb -> cd (length = 2)



public class StringShorten {

	public static void main(String[] args) {

		String s = "ccdaabcdbb";
		String[] substring = {"ab", "cd"};
		
		String shortenedstring = substringremoval(s, substring);
		System.out.println(shortenedstring + " " + "length:" + shortenedstring.length());
	}

	public static String substringremoval(String s, String[] substring) {
		String sub = "";
		for(int i = 0 ; i <= s.length(); i ++){
			sub = s.substring(0, i).replaceAll(substring[0], "").replaceAll(substring[1], "");
		}
		
		sub = sub.replaceAll(substring[0], "").replaceAll(substring[1], ""); 
		return sub;
	}
}