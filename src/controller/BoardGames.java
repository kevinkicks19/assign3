package mru.tsc.controller;

import mru.tsc.model.Toy;
/**
 * This class is the Board Game subclass.
 * @author Jasraj
 *
 */
public class BoardGames extends Toy{

	private String numOfPlayers;
	private String designers;
	
	/**
	 * This constructs a board game with a name, serial number, brand, price, count, appropriate age, number of players, and designer(s).
	 * @param SN Serial number of toy.
	 * @param name Name of toy.
	 * @param brand Brand of toy.
	 * @param price Price of toy.
	 * @param count How many toys are in stock.
	 * @param age Appropriate age of toy.
	 * @param numOfPlayers Number of players for game.
	 * @param designers People who made the game.
	 */
	public BoardGames(String SN, String name, String brand, double price, int count, String age, String numOfPlayers, String designers) {
		super(name, SN, brand, price, count, age);
		this.numOfPlayers = numOfPlayers;
		this.designers = designers;
	}

	 /**
	 * Prints out all relevant game information.
	 */
	@Override
	public String toString() {
		return "BoardGames [name=" + name + ", SN=" + SN
				+ ", brand=" + brand + ", price=" + price + ", count=" + count + ", age=" + age + 
				", numOfPlayers=" + numOfPlayers + ", designers=" + designers + "]";
	}

	/**
	 * Gets the number of players.
	 * @return Returns the number of players as a string.
	 */
	public String getNumOfPlayers() {
		return numOfPlayers;
	}

	/**
	 * Sets the number of players.
	 * @param numOfPlayers The material used for the toy.
	 */
	public void setNumOfPlayers(String numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}

	/**
	 * Gets the designers of the game.
	 * @return Returns the designers of the game as a String.
	 */
	public String getDesigners() {
		return designers;
	}

	/**
	 * Sets the designers of the game.
	 * @param designers The designers of the game.
	 */
	public void setDesigners(String designers) {
		this.designers = designers;
	}

	/**
     * @param none
     * @return String 
     * 
     * Method to return the proper format to write into the text file for type Toy BoardGames
     */
	@Override
	public String printFormat() {
		return SN + ";" + name + ";" + brand + ";" + price + ";" + count + ";" + age + ";" 
				+ numOfPlayers + ";" + designers;
	}
}