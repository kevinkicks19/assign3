package mru.tsc.view;
import java.util.Scanner;
import mru.tsc.controller.ShopController;

import mru.tsc.controller.NewToy;
import mru.tsc.model.Toy;

/**
 * 
 * This class is the main print class for the menus involved in the program
 * 
 * @author Kevin
 *
 */
public class Menu {

	Scanner kb = new Scanner(System.in);
	public Menu() {
	Scanner kb = new Scanner(System.in);
	}
	
	/**
	 * @param none
	 * @return int option
	 * 
	 * Method for printing the main menu and returning the user's choice of option
	 */
	
	public int printMainMenu() {
		System.out.println("********************************************");
		System.out.println("******WELCOME TO OUR DIGITAL TOY STORE******");
		System.out.println("********************************************");
		
		
		System.out.println();
		System.out.println("How may we help you?");
		System.out.println("(1)     Search Inventory and Purchase Toy");
		System.out.println("(2)     Add New Toy");
		System.out.println("(3)     Remove Toy");
		System.out.println("(4)     Save & Exit");
		System.out.println();
		System.out.println("Please enter an option :");
		int option = kb.nextInt();
		return option;
	}
	
	/**
	 * @param none
	 * @return int option
	 * 
	 * Method for printing the search menu and returning the user's option
	 */
	public int searchMenu() {
		
		System.out.println();
		System.out.println("Find a toy by : ");
		System.out.println("(1)     Serial Number(SN)");
		System.out.println("(2)     Toy Name");
		System.out.println("(3)     Type");
		System.out.println("(4)     Back to Main Menu");
		System.out.println();
		System.out.println("Please enter an option :");
		int option = kb.nextInt();
		return option;
		
	}
	
	
	
	
}
