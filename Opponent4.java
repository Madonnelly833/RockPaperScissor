package com.rockpaperscissors;

public class Opponent4 extends Player {

	protected String Opponent4 = "Hank";

	public Opponent4() {

	}

	public String getOpponent4() {
		return Opponent4;
	}

	public void setOpponent4(String opponent4) {
		Opponent4 = opponent4;
	}

	@Override
	public int handy() {

		int opponentSwitch = (int) (Math.random() * 10);
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
		case 6:
			opponentThrow = 3;
		case 7:
			opponentThrow = 4;
		case 8:
		case 9:
		case 10:
			opponentThrow = 0;

		}

		return opponentThrow;

	}

	@Override
	public String namey() {
		String opponentName = Opponent4;
		return opponentName;
	}

}
