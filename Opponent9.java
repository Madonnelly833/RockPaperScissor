package com.rockpaperscissors;

public class Opponent9 extends Player {

	protected String Opponent9 = "Dave";

	public Opponent9() {

	}

	public String getOpponent9() {
		return Opponent9;
	}

	public void setOpponent9(String opponent9) {
		Opponent9 = opponent9;
	}

	@Override
	public int handy() {

		int opponentSwitch = (int) (Math.random() * 5);
		int opponentThrow = 0;
		switch (opponentSwitch) {
		case 0:
		case 1:
		case 2:
		case 3:
			opponentThrow = 0;
			break;
		case 4:
			opponentThrow = 1;
			break;
		case 5:
			opponentThrow = 2;
			break;

		}

		return opponentThrow;

	}

	@Override

	public String namey() {
		String opponentName = Opponent9;
		return opponentName;
	}

}
