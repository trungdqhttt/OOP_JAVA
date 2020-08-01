package oop_exercise;

public class Entry {
	public static void main(String[] args) {
		Date date = new Date();
		date.setDate("28/02/2020");
		
		if (date.checkDate()) {
			System.out.println(date.getDate() + " is valid");
		} else {
			System.out.println(date.getDate() + " isn't valid");
		}

	}
}