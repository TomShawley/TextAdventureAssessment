package com.qa.TextGame;

import java.lang.reflect.Array;

public class Board {

	public void printBoard() {
		String x = "*";
		String P = "P";
		String T = "T";
		Player player = new Player(0, false, P, 0, 0);
		Array[][] board = new Array[10][10];
		Treasure Treasure = new Treasure(3, 1);

		{
			for (int i = 0; i < board.length; i++) {

				for (int j = 0; j < board.length; j++) {

					if (j == (player.getXStart()) & i == (player.getYStart())) {

						System.out.print("[ " + P + " ]");
					} else if (j == (Treasure.getXLocation()) & i == (Treasure.getYLocation())) {
						System.out.print("[ " + x + " ]");
					} else
						System.out.print("[ " + x + " ]");
				}

				System.out.println();
			}
			//System.out.println("You're magic watch tells you "
					//+ ((Treasure.getXLocation() - player.getXStart()) + (Treasure.getYLocation() - player.getYStart()))
					//+ " m away from the Treasure");

		}
	}
}
