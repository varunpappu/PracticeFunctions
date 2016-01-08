## Given time in seconds, return formatted string, as shown in following example:
## Example:

## Input: 90061 sec
## Output: 1 1 1 1

## Explanation: 90061 sec = 1 day, 1 hour, 1 min and 1 sec


public class ConvertTime {

	public static void main(String[] args) {
		int seconds = 90061;
		System.out.println(converttime(seconds));
	}

	private static String converttime(int seconds) {
		final int MINUTES_IN_AN_HOUR = 60;
	    final int SECONDS_IN_A_MINUTE = 60;
	    
	    int day = 0;
	    
	    int minutes = seconds / SECONDS_IN_A_MINUTE;
	    seconds = seconds - (minutes * SECONDS_IN_A_MINUTE);

	    int hours = minutes / MINUTES_IN_AN_HOUR;
	    minutes = minutes - (hours * MINUTES_IN_AN_HOUR);
	    day = hours/24;
	    hours = hours - day * 24;
	    
	    return day + " " + hours + " " + minutes + " " + seconds;
	}
}
