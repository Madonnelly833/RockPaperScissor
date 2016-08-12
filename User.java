package com.rockpaperscissors;

public class User extends Player {

	String userName = null;
	int throwChoice;
	int userThrow;

	public User() {
	}

	@Override
	public int handy() {

		int userThrow = (throwChoice - 1);
		return userThrow;

	}

	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}

}
