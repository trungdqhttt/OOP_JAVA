package oop_exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
	private String date;
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}
	
	public boolean checkDate() {
		String Date_REGEX = "^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|"
				+ "(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)(?:29|30)\\2))"
				+ "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3"
				+ "(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|"
				+ "[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|"
				+ "^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)(?:0?[1-9]|1\\d|"
				+ "2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

		Pattern Date_PATTERN = Pattern.compile(Date_REGEX);

		Matcher matcher = Date_PATTERN.matcher(date);
		return matcher.matches();
	}

	public void printDate() {
		
	}
}