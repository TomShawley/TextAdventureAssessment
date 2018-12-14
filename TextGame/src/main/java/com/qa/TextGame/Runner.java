package com.qa.TextGame;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Board board = new Board();
		Player player = new Player(1, false, "P",0,0);
		Treasure Treasure = new Treasure(5,3);
		
		System.out.println("Your find yourself in a strange swamp searching fro treasure, you have a magic watch which shows you how far you are from the treasure.");
		if (((Treasure.getXLocation()) & (Treasure.getYLocation())) == ((player.getXStart()) & (player.getYStart()))){
			player.hasTreasure = true;
			
		}
//		while (player.hasTreasure = false) {
		while (player.hasTreasure == false) {

		
			board.printBoard();

			Scanner sc = new Scanner(System.in);
			System.out.println("What direction do you want to travell?");
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
			System.out.println("You're magic watch tells you "
					+ ((Treasure.getXLocation() - player.getXStart()) + (Treasure.getYLocation() - player.getYStart()))
					+ " m away from the Treasure");
			

		}System.out.println("Congratulations you found the treasure, you Win!");
	} 
	
	
}
