public class UnderscoreTransform {

	public static void main(String[] args) {

		String s = "__________hello___________world______";
		String result = "";
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '_') {
				count++;
				if (count < 2) {
					result = result + s.charAt(i);
				}
			} else {
				result = result + s.charAt(i);
				count = 0;
			}
		}
		System.out.println(result);
	}
}