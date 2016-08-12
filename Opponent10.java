package com.rockpaperscissors;

public class Opponent10 extends Player {

	protected String Opponent10 = "Keith";

	public Opponent10() {

	}

	public String getOpponent10() {
		return Opponent10;
	}

	public void setOpponent10(String opponent10) {
		Opponent10 = opponent10;
	}

	@Override
	public int handy() {

		int opponentThrow = (int) (Math.random() * 2);
		return opponentThrow;

	}

	@Override
	public String namey() {
		String opponentName = Opponent10;
		return opponentName;
	}

}
