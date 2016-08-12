package com.rockpaperscissors;

public class Opponent3 extends Player {

	protected String Opponent3 = "Alan";

	public Opponent3() {

	}

	public String getOpponent3() {
		return Opponent3;
	}

	public void setOpponent3(String opponent3) {
		Opponent3 = opponent3;
	}

	@Override
	public int handy() {

		int opponentThrow = (int) ((Math.random() * 3) + 1);
		return opponentThrow;

	}

	@Override
	public String namey() {
		String opponentName = Opponent3;
		return opponentName;
	}

}
