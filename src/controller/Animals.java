package controller;

import mru.tsc.model.Toy;

public class Animals extends Toy{

	private String material;
	private char size;
	
	public Animals(String SN, String name, String brand, double price, int count, String age,  String material,  char size) {
		super(name, SN, brand, price, count, age);
		this.material = material;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Animals [ name=" + name + ", SN=" + SN + ", brand=" + brand
				+ ", price=" + price + ", count=" + count + ", age=" + age + ", material=" + material + ", size=" + size + "]";
	}

	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public char getSize() {
		return size;
	}
	
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