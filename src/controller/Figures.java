package controller;

import mru.tsc.model.Toy;

public class Figures extends Toy {
	
	private char classification;

	public Figures(String SN, String name, String brand, double price, int count, String age, char classification) {
		super(name, SN, brand, price, count, age);
		this.classification = classification;
	}
	
	@Override
	public String toString() {
		return "Figures [name=" + name + ", SN=" + SN + ", brand=" + brand
				+ ", price=" + price + ", count=" + count + ", age=" + age + " classification=" + classification + "]";
	}

	public char getClassification() {
		return classification;
	}

	public void setClassification(char classification) {
		this.classification = classification;
	}
	
	/**
	 * @param none
	 * @return String 
	 * 
	 * Method to return the proper format to write into the text file for type of Toy Figures
	 */
	@Override
	public String printFormat() {
		return SN + ";" + name + ";" + brand + ";" + price + ";" + count + ";" + age + ";" 
				+ classification;
	}
	
}