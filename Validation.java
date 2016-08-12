package com.rockpaperscissors;

public class Validation {

	public static boolean oppNumber(String numChosen) {

		try {

			int isValid = Integer.parseInt(numChosen);
			if ((isValid < 0) || (isValid > 11)) {
				return true;
			}
			return false;
		}

		catch (NumberFormatException e) {
			return true;
		}

	}

	public static boolean userThrow(int throwChoice) {

		try {

			if ((throwChoice < 0) || (throwChoice > 6)) {
				return true;
			}
			return false;
		}

		catch (NumberFormatException e) {
			return true;
		}

	}
}
