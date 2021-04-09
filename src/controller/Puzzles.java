package controller;

import mru.tsc.model.Toy;

public class Puzzles extends Toy{
	
	private char puzzleType;
	
	public Puzzles(String SN, String name, String brand, double price, int count, String age, char puzzleType) {
		super(name, SN, brand, price, count, age);
		this.puzzleType = puzzleType;
	}
	
	@Override
	public String toString() {
		return "Puzzles [name=" + name + ", SN=" + SN + ", brand=" + brand + ", price="
				+ price + ", count=" + count + ", age=" + age + ", puzzleType=" + puzzleType + "]";
	}

	public char getPuzzleType() {
		return puzzleType;
	}

	public void setPuzzleType(char puzzleType) {
		this.puzzleType = puzzleType;
	}
	/**
	 * @param none
	 * @return String 
	 * 
	 * Method to return the proper format to write into the text file for type of Toy Puzzles
	 */
	@Override
	public String printFormat() {
		return SN + ";" + name + ";" + brand + ";" + price + ";" + count + ";" + age + ";" 
				+ puzzleType;
	}
	
}