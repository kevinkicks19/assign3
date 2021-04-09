package model;

public abstract class Toy {
	
	public String name;
	public String SN;
	public String brand;
	public double price;
	public int count;
	public String age;
	
	public Toy(String name, String SN, String brand, double price, int count, String age) {
		this.name = name;
		this.SN = SN;
		this.brand = brand;
		this.price = price;
		this.count = count;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Toy [name=" + name + ", SN=" + SN + ", brand=" + brand + ", price=" + price + ", count=" + count
				+ ", age=" + age + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSN() {
		return SN;
	}
	
	public void setSN(String SN) {
		this.SN = SN;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
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