package com.rockpaperscissors;

public class Opponent7 extends Player {

	protected String Opponent7 = "Larry";

	public Opponent7() {

	}

	public String getOpponent7() {
		return Opponent7;
	}

	public void setOpponent7(String opponent7) {
		Opponent7 = opponent7;
	}

	@Override
	public int handy() {

		int opponentThrow = (int) ((Math.random() * 4 - 2));
		return opponentThrow;

	}

	@Override
	public String namey() {
		String opponentName = Opponent7;
		return opponentName;
	}

}
