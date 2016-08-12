package com.rockpaperscissors;

public class Opponent1 extends Player {

	protected String Opponent1 = "Bob";

	public Opponent1() {

	}

	public String getOpponent1() {
		return Opponent1;
	}

	public void setOpponent1(String opponent1) {
		Opponent1 = opponent1;
	}

	@Override
	public int handy() {

		int opponentThrow = 4;
		return opponentThrow;

	}

	@Override
	public String namey() {
		String opponentName = Opponent1;
		return opponentName;
	}

}
