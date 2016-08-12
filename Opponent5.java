package com.rockpaperscissors;

public class Opponent5 extends Player {

	protected String Opponent5 = "Conan";

	public Opponent5() {

	}

	public String getOpponent5() {
		return Opponent5;
	}

	public void setOpponent1(String opponent5) {
		Opponent5 = opponent5;
	}

	@Override
	public int handy() {

		int opponentThrow = (int) ((Math.random() * 1) + 1);

		return opponentThrow;

	}

	@Override
	public String namey() {
		String opponentName = Opponent5;
		return opponentName;
	}

}
