package mru.tsc.model;

/**
 * This class is the toy superclass that all subclasses inherit from.
 * @author Jasraj
 * @author Kevin
 *
 */
public abstract class Toy {
	
	public String name;
	public String SN;
	public String brand;
	public double price;
	public int count;
	public String age;
	
	/**
	 * This constructs a Toy with a name, serial number, brand, price, count, and appropriate age.
	 * @param name Name of the toy.
	 * @param SN Serial number of toy.
	 * @param brand Brand of toy.
	 * @param price Price of toy.
	 * @param count How many toys are in stock.
	 * @param age Appropriate age for the toy.
	 */
	public Toy(String name, String SN, String brand, double price, int count, String age) {
		this.name = name;
		this.SN = SN;
		this.brand = brand;
		this.price = price;
		this.count = count;
		this.age = age;
	}
	
	/**
	 * Gets the name of the toy.
	 * @return Returns the name of the toy as a string.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the toy.
	 * @param name The name of the toy.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the serial number of the toy.
	 * @return Returns the serial number of the toy as a string.
	 */
	public String getSN() {
		return SN;
	}
	
	/**
	 * Sets the serial number of the toy.
	 * @param SN The serial number of the toy.
	 */
	public void setSN(String SN) {
		this.SN = SN;
	}
	
	/**
	 * Gets the brand of the toy.
	 * @return Returns the brand of the toy as a string.
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * Sets the brand of the toy.
	 * @param brand The brand of the toy.
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * Gets the price of the toy.
	 * @return Returns the price of the toy as a double.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Sets the price of the toy.
	 * @param price The price of the toy.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Gets the remaining number of toys.
	 * @return Returns the remaining number of toys as an int.
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * Sets the number of remaining toys.
	 * @param count The remaining number of toys.
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	/**
	 * Gets the minimum appropriate age for the toy.
	 * @return Returns the minimum appropriate age of the toy as a string.
	 */
	public String getAge() {
		return age;
	}
	
	/**
	 * Sets the minimum appropriate age of the toy.
	 * @param age The minimum appropriate age of the toy.
	 */
	public void setAge(String age) {
		this.age = age;
	}
	

	/**
	 * Prints out all relevant toy information.
	 */
	@Override
	public String toString() {
		return "Toy [name=" + name + ", SN=" + SN + ", brand=" + brand + ", price=" + price + ", count=" + count
				+ ", age=" + age + "]";
	}

	/**
	 * @param none
	 * @return String 
	 * 
	 * Method to return the proper format to write into the text file for type Toy
	 */
	public String printFormat() {
		return SN + ";" + name + ";" + brand + ";" + price + ";" + count + ";" + age + ";";
	}
}