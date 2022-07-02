package com.switchexr.daymonth;

import java.util.Scanner;

public class SwithExerciseRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Day Number: ");
		int dayNumber = scanner.nextInt();
		System.out.println("Enter The Month Number: ");
		int monthNumber = scanner.nextInt();
		System.out.println();

		scanner.close();

		System.out.println("Day: " + determineNameDay(dayNumber));
		System.out.println("Month: " + determineNameOfMonth(monthNumber));
		System.out.println("Is A Week Day ???"+isWeekDay(dayNumber));
	}

	public static String determineNameDay(int dayNumber) {

		switch (dayNumber) {
		case 0:
			return "Sunday";

		case 1:
			return "Monday";

		case 2:
			return "Tuesday";

		case 3:
			return "Wednesday";

		case 4:
			return "Thursday";

		case 5:
			return "Friday";

		}

		return "Invalid";
	}

	public static String determineNameOfMonth(int monthNumber) {

		switch (monthNumber) {
		case 1:
			return "Jan";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return "Apr";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "Aug";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dec";

		}

		return "Invalid";

	}

	public static boolean isWeekDay(int dayNumber) {

		switch (dayNumber) {
		case 0:
			return false;

		case 1:
			return true;

		case 2:
			return true;

		case 3:
			return true;

		case 4:
			return true;

		case 5:
			return true;
		case 6:
			return false;

		}

		return false;
	}
}
