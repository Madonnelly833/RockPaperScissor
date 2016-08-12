package com.rockpaperscissors;

public class Opponent6 extends Player {

	protected String Opponent6 = "Doug";

	public Opponent6() {

	}

	public String getOpponent6() {
		return Opponent6;
	}

	public void setOpponent6(String opponent6) {
		Opponent6 = opponent6;
	}

	@Override
	public int handy() {

		int opponentSwitch = (int) (Math.random() * 10);
		int opponentThrow = 0;
		switch (opponentSwitch) {
		case 0:
		case 2:
		case 3:
		case 4:
			opponentThrow = 0;
			break;
		case 1:
			opponentThrow = 1;
			break;
		case 5:
			opponentThrow = 2;
			break;
		case 9:
			opponentThrow = 3;
		case 7:
			opponentThrow = 4;
		case 8:
		case 6:
		case 10:
			opponentThrow = 0;
		}
		return opponentThrow;

	}

	@Override
	public String namey() {
		String opponentName = Opponent6;
		return opponentName;
	}

}
