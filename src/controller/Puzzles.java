package mru.tsc.controller;

import mru.tsc.model.Toy;

/**
 * This class is the puzzle subclass.
 * @author Jasraj
 *
 */
public class Puzzles extends Toy{
	
	private char puzzleType;
	
	/**
	 * This constructs a puzzle with a serial number, name, brand, price, count, appropriate age, and puzzle-type.
	 * @param SN Serial number of the puzzle.
	 * @param name Name of the puzzle.
	 * @param brand Brand of the puzzle.
	 * @param price Price of the puzzle.
	 * @param count Amount of puzzles in stock.
	 * @param age Appropriate age for the puzzle 
	 * @param puzzleType
	 */
	public Puzzles(String SN, String name, String brand, double price, int count, String age, char puzzleType) {
		super(name, SN, brand, price, count, age);
		this.puzzleType = puzzleType;
	}
	/**
	 * Prints out all relevant puzzle information.
	 */
	@Override
	public String toString() {
		return "Puzzles [name=" + name + ", SN=" + SN + ", brand=" + brand + ", price="
				+ price + ", count=" + count + ", age=" + age + ", puzzleType=" + puzzleType + "]";
	}

	/**
	 * Gets the puzzle-type.
	 * @return Returns the puzzle-type as a char.
	 */
	public char getPuzzleType() {
		return puzzleType;
	}

	/**
	 * Sets the puzzle-type.
	 * @param puzzleType The puzzle-type.
	 */
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