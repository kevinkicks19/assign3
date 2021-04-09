package mru.tsc.controller;

import mru.tsc.model.Toy;

/**
 * This class is the toy figure subclass.
 * @author Jasraj
 *
 */
public class Figures extends Toy {
	
	private char classification;

	/**
	 * This constructs a figure with a serial number, name, brand, price, count, appropriate age, and classification.
	 * @param SN Serial number of the toy.
	 * @param name Name of the toy.
	 * @param brand Brand of the toy.
	 * @param price Price of the toy.
	 * @param count How many toys are in stock.
	 * @param age Appropriate age of the toy.
	 * @param classification What type of figure the toy is.
	 */
	public Figures(String SN, String name, String brand, double price, int count, String age, char classification) {
		super(name, SN, brand, price, count, age);
		this.classification = classification;
	}
	
	/**
	 * Prints out all relevant toy information.
	 */
	@Override
	public String toString() {
		return "Figures [name=" + name + ", SN=" + SN + ", brand=" + brand
				+ ", price=" + price + ", count=" + count + ", age=" + age + " classification=" + classification + "]";
	}

	/**
	 * Gets the classification of the toy.
	 * @return Returns the classification of the toy as a char.
	 */
	public char getClassification() {
		return classification;
	}
/**
 * Sets the classification of the toy.
 * @param classification The classification of the toy.
 */
	public void setClassification(char classification) {
		this.classification = classification;
	}
	
	/**
     * @param none
     * @return String 
     * 
     * Method to return the proper format to write into the text file for type Figures
     */
	@Override
	public String printFormat() {
		return SN + ";" + name + ";" + brand + ";" + price + ";" + count + ";" + age + ";" 
				+ classification;
	}
	
}