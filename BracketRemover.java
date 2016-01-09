## Given a string which may include opening or closing round brackets, 
## can you tell whether the string contains a balanced pair(s) of round brackets,
## that is there are no brackets which are either opened & not closed, or vice versa. 
## Opening round brackets always have to come before closing bracket. An empty string is balanced.



public class BracketRemover {

	public static void main(String[] args) {

		String s = "d(as)";
		System.out.println(bracketsCheckers(s));

	}

	private static boolean bracketsCheckers(String s) {
		
		if(s == null)
			return false;
		int counter1 = 0;
		int counter2 = 0;
		
		for(int i = 0; i < s.length(); i ++){
			if(s.charAt(i) == ')')
				counter1++;
			else if(s.charAt(i) == '(')
				if(counter1 > counter2){
					return false;
				}else
					counter2++;	
		}
		if(counter1 == counter2)
			return true;
		else
			return false;
	}
}	