package com.rockpaperscissors;

public class Opponent8 extends Player {

	protected String Opponent8 = "Zack";

	public Opponent8() {

	}

	public String getOpponent8() {
		return Opponent8;
	}

	public void setOpponent8(String opponent8) {
		Opponent8 = opponent8;
	}

	@Override
	public int handy() {

		int opponentSwitch = (int) (Math.random() * 10);
		int opponentThrow = 0;
		switch (opponentSwitch) {
		case 0:

		case 2:
		case 3:
			opponentThrow = 4;
			break;
		case 4:
		case 1:
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
			opponentThrow = 4;

		}
		return opponentThrow;

	}

	@Override
	public String namey() {
		String opponentName = Opponent8;
		return opponentName;
	}

}
