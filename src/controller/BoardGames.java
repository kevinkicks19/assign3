package controller;

import mru.tsc.model.Toy;

public class BoardGames extends Toy{

	private String numOfPlayers;
	private String designers;
	
	public BoardGames(String SN, String name, String brand, double price, int count, String age, String numOfPlayers, String designers) {
		super(name, SN, brand, price, count, age);
		this.numOfPlayers = numOfPlayers;
		this.designers = designers;
	}

	@Override
	public String toString() {
		return "BoardGames [name=" + name + ", SN=" + SN
				+ ", brand=" + brand + ", price=" + price + ", count=" + count + ", age=" + age + 
				", numOfPlayers=" + numOfPlayers + ", designers=" + designers + "]";
	}

	public String getNumOfPlayers() {
		return numOfPlayers;
	}

	public void setNumOfPlayers(String numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}

	public String getDesigners() {
		return designers;
	}

	public void setDesigners(String designers) {
		this.designers = designers;
	}
	/**
	 * @param none
	 * @return String 
	 * 
	 * Method to return the proper format to write into the text file for type of Toy BoardGames
	 */
	@Override
	public String printFormat() {
		return SN + ";" + name + ";" + brand + ";" + price + ";" + count + ";" + age + ";" 
				+ numOfPlayers + ";" + designers;
	}
}