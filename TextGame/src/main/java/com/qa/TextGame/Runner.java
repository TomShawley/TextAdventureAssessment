package com.qa.TextGame;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Board board = new Board();
		Player player = new Player(1, false, "P",0,0);
//		while (player.hasTreasure = false) {
		while (player.hasTreasure == false) {

			board.printBoard();

			Scanner sc = new Scanner(System.in);
			System.out.println("What direction?");
			String direction = sc.next();

			if (direction.equalsIgnoreCase("north")) {
				System.out.println("You go " + direction);
				player.playerMoveNorth();

			} else if (direction.equalsIgnoreCase("south")) {
				System.out.println("You go " + direction);
				player.playerMoveSouth();
			} else if (direction.equalsIgnoreCase("east")) {
				System.out.println("You go " + direction);
				player.playerMoveEast();
			} else if (direction.equalsIgnoreCase("west")) {
				System.out.println("You go " + direction);
				player.playerMoveWest();
			} else {
				System.out.println("that is not a valid direction");
			}
			

		}
	}
}
