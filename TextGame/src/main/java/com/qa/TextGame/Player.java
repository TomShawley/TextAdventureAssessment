package com.qa.TextGame;

import java.sql.Array;

public class Player {
	private int movement = 1;
	// boolean hasTreasure = false;
	public boolean hasTreasure = false;
	private String name = "Finn";
	private int xMovement = 0;
	private int yMovement = 0;
	private int xStart;
	private int yStart;
	private int xCoord;
	private int yCoord;
	Board Board = new Board();

	public Player(int movement, boolean hasTreasure, String name, int yStart, int xStart) {
		this.movement = movement;
		this.hasTreasure = hasTreasure;
		this.name = name;
		this.yStart = yStart;
		this.xStart = xStart;

	}

	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	public boolean getHasTreasure() {
		return hasTreasure;
	}

	public void setHasTreasure(boolean hasTreasure) {
		this.hasTreasure = hasTreasure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getXMovement() {
		return xMovement;
	}

	public void setxMovement(int xMovement) {
		this.xMovement = xMovement;
	}

	public int getYMovement() {
		return yMovement;
	}

	public void setyMovement(int yMovement) {
		this.yMovement = yMovement;
	}

	public int getXStart() {
		return xStart;
	}

	public void setXStart(int xStart) {
		this.xStart = xStart;
	}

	public int getYStart() {
		return yStart;
	}

	public void setYStart(int yStart) {
		this.yStart = yStart;
	}

	public int playerStartx() {
	 xStart = (int) (Math.random() * 10) ;
	 return xStart;
	  
	}

	public int playerStarty() {
		yStart =(int) (Math.random() * 10) ;
		return yStart;
	}

	public void playerMoveNorth() {
		xStart = xStart + 1;
		
	}

	public  void playerMoveSouth() {
		xStart = xStart - 1;
		
	}

	public void playerMoveEast() {
		yStart = yStart + 1;
		
	}

	public  void playerMoveWest() {
		yStart = yStart - 1;
		
	}

}
