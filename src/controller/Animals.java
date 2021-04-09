package mru.tsc.controller;

import mru.tsc.model.Toy;
/**
 * This class is the animal subclass.
 * @author Jasraj
 *
 */
public class Animals extends Toy{

	private String material;
	private char size;
	
	/**
	 * This constructs an animal toy with a name, serial number, brand, price, count, appropriate age, material type, and size.
	 * @param SN Serial number of toy.
	 * @param name Name of toy.
	 * @param brand Brand of toy.
	 * @param price Price of toy.
	 * @param count How many toys are in stock
	 * @param age Appropriate age of the toy.
	 * @param material Material of the toy.
	 * @param size Size of the toy.
	 */
	public Animals(String SN, String name, String brand, double price, int count, String age,  String material,  char size) {
		super(name, SN, brand, price, count, age);
		this.material = material;
		this.size = size;
	}
	
	/**
	 * Prints out all relevant toy information.
	 */
	@Override
	public String toString() {
		return "Animals [name=" + name + ", SN=" + SN + ", brand=" + brand
				+ ", price=" + price + ", count=" + count + ", age=" + age + ", material=" + material + ", size=" + size + "]";
	}

	/**
	 * Gets the material of the toy.
	 * @return Returns the material of the toy as a String.
	 */
	public String getMaterial() {
		return material;
	}
	
	/**
	 * Sets the type of material.
	 * @param material The material used for the toy.
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	
	/**
	 * Gets the size of the toy.
	 * @return Returns the size of a toy as a char.
	 */
	public char getSize() {
		return size;
	}
	
	/**
	 * Sets the size of the toy.
	 * @param size The size of the toy.
	 */
	public void setSize(char size) {
		this.size = size;
	}
	
	/**
     * @param none
     * @return String 
     * 
     * Method to return the proper format to write into the text file for type Animals
     */
	@Override
	public String printFormat() {
		return SN + ";" + name + ";" + brand + ";" + price + ";" + count + ";" + age + ";" 
				+ material + ";" + size;
	}
	
}