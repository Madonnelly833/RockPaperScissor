package com.rockpaperscissors;

public class Opponent2 extends Player {

	protected String Opponent2 = "Steve";

	public Opponent2() {

	}

	public String getOpponent2() {
		return Opponent2;
	}

	public void setOpponent2(String opponent2) {
		Opponent2 = opponent2;
	}

	@Override
	public int handy() {

		int opponentThrow = (int) ((Math.random() * 4));
		return opponentThrow;

	}

	@Override
	public String namey() {
		String opponentName = Opponent2;
		return opponentName;
	}

}
