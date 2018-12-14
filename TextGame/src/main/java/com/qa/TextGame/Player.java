package com.qa.TextGame;

import java.sql.Array;

public class Player {
	private int movement = 1;
	// boolean hasTreasure = false;
	public boolean hasTreasure = false;
	private String name = "Finn";
	private int xMovement = 0;
	private int yMovement = 0;
	private double xStart;
	private double yStart;
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

	public double getXStart() {
		return xStart;
	}

	public void setXStart(double xStart) {
		this.xStart = xStart;
	}

	public double getYStart() {
		return yStart;
	}

	public void setYStart(double yStart) {
		this.yStart = yStart;
	}

	public double playerStartx() {
	 xStart = Math.random() * 10 ;
	 return xStart;
	  
	}

	public double playerStarty() {
		yStart =Math.random() * 10 ;
		return yStart;
	}

	public double playerMoveNorth() {
		xStart = xStart + 1;
		return xStart;
	}

	public double playerMoveSouth() {
		xStart = xStart - 1;
		return xStart;
	}

	public double playerMoveEast() {
		yStart = yStart + 1;
		return yStart;
	}

	public double playerMoveWest() {
		yStart = yStart - 1;
		return yStart;
	}

}
