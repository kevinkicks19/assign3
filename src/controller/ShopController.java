package mru.tsc.controller;


import mru.tsc.model.Toy;
import mru.tsc.view.Menu;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *Main controller class for the program, contains methods to accomplish what the program
 *is meant to do
 * 
 * @author Kevin
 * @author Jasraj
 */
public class ShopController {
	
	Scanner kb = new Scanner(System.in);
	
	ArrayList<Toy> toys; 
	Menu menu = new Menu();
	private final String FILE_PATH = "res/toys.txt";
	
	/**
	 * @param none
	 * @return none
	 * @throws Exception
	 * 
	 * constructor for ShopController class, runs the program
	 */
	public ShopController() throws Exception {
		toys = new ArrayList<Toy>();
		
		
		loadData();
		launchApp();
	}
	
	/**
	 * Loads the toys.txt file into an arraylist
	 * @throws Exception
	 */
	public void loadData() throws Exception {
		File db = new File(FILE_PATH);
		String currentLine;
		String[] splittedLine;
		
		if (db.exists()) {
			Scanner fileReader = new Scanner(db);
			
			while (fileReader.hasNextLine()) {
				currentLine = fileReader.nextLine();
				splittedLine = currentLine.split(";");
				
				String SN = splittedLine[0];
				if (SN.charAt(0) == '0' || SN.charAt(0) == '1') {
					Toy t = new Figures(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), splittedLine[5], splittedLine[6].charAt(0));
					toys.add(t);
					
				} else if (SN.charAt(0) == '2' || SN.charAt(0) == '3') {
					Toy t = new Animals(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), splittedLine[5], splittedLine[6], splittedLine[7].charAt(0));
					toys.add(t);
					
				} else if (SN.charAt(0) == '4' || SN.charAt(0) == '5' || SN.charAt(0) == '6') {
					Toy t = new Puzzles(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), splittedLine[5], splittedLine[6].charAt(0));
					toys.add(t);
					
				} else if (SN.charAt(0) == '7' || SN.charAt(0) == '8' || SN.charAt(0) == '9') {
					Toy t = new BoardGames(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), splittedLine[5], splittedLine[6], splittedLine[7]);
					toys.add(t);
					
				}
			}
			
			fileReader.close();
		}
	}
	
	/**
	 * @param none
	 * @return none
	 * 
	 * Method for searching and purchasing a toy by serial number, name, or calls the search
	 *by type method
	 */
	public void findToy() {
		
		Toy findToy;
		
		int option = menu.searchMenu();
		
		switch (option) {
		
	
		case 1 :{
		
			System.out.println("Please enter Serial Number : ");
			String SN = kb.next();
		for (Toy t: toys) {
			if (t.getSN().equals(SN)) {
				findToy = t;
				System.out.println("Toy Info :" + t.toString());
				System.out.println();
				System.out.println("How many units would you like to purchase?");
				int purchaseUnit = kb.nextInt();
				int count = t.getCount();
				if (count > purchaseUnit) {
					count = (count - purchaseUnit);
					t.setCount(count);
					System.out.println("Purchase complete!");
				}
				else {
					System.out.println("Not enough stock available");
				}
				
				}}break;}
			
		
		
		case 2 :{
		
			System.out.println("Please enter a Toy Name : ");
			String name = kb.next();
			
			
			int i = 1;	
			for (Toy x: toys) {
			
					
					if (x.getName().toLowerCase().contains(name)) {
					
					System.out.println("("+i+")" + " Toy Info :" + x.toString());
					i++;
					
				}}
			System.out.println("Please enter the Serial Number of the toy you wish to purchase : ");
			String SN = kb.next();
		for (Toy t: toys) {
			if (t.getSN().equals(SN)) {
				findToy = t;
				System.out.println("Toy Info :" + t.toString());
				System.out.println();
				System.out.println("How many units would you like to purchase?");
				int purchaseUnit = kb.nextInt();
				int count = t.getCount();
				if (count > purchaseUnit) {
					count = (count - purchaseUnit);
					t.setCount(count);
					System.out.println("Purchase complete!");
				}
				else {
					System.out.println("Not enough stock available");
				}
				
				}}}break;
		
		case 3 :
			
			System.out.println("Please enter a Toy Type : ");
			System.out.println();
			System.out.println("(A) Animal");
			System.out.println("(B) Board Game");
			System.out.println("(F) Figure");
			System.out.println("(P) Puzzles");
			System.out.println();
			System.out.println("Enter an Option: ");
			char type = kb.next().toUpperCase().charAt(0);
			findToyType(type);

			System.out.println("Please enter the Serial Number of the toy you wish to purchase : ");
			String SN = kb.next();
		for (Toy t: toys) {
			if (t.getSN().equals(SN)) {
				findToy = t;
				System.out.println("Toy Info :" + t.toString());
				System.out.println();
				System.out.println("How many units would you like to purchase?");
				int purchaseUnit = kb.nextInt();
				int count = t.getCount();
				if (count > purchaseUnit) {
					count = (count - purchaseUnit);
					t.setCount(count);
					System.out.println("Purchase complete!");
				}
				else {
					System.out.println("Not enough stock available");
				}
			}}break;
		
			
		case 4 :
			menu.printMainMenu();
			
		default :
			System.out.println("Not a valid answer, please enter a valid answer : ");
			findToy();
			break;
		}
		
		
		}
	
	/**
	 * @param none
	 * @return none
	 * 
	 * Method for searching and purchasing a toy by toy type
	 */
	public void findToyType(char type) {
		
		
		ArrayList<Toy> toyType = new ArrayList<Toy>();
		int i = 1;	
			switch (type) {
			
			
			
			case 'F' :
				
				
				for (Toy x: toys) {
					
					if (x.getSN().charAt(0) == '0' || x.getSN().charAt(0) == '1') {
						toyType.add(x);
											
						System.out.println("(" +i+")" + "  Toy Info :" + x.toString());
						i++;
						}
						
					}
					break;
				
			
				
			
			case 'A' : 
				
			 
				for (Toy x: toys) {
							
					if (x.getSN().charAt(0) == '2' || x.getSN().charAt(0) == '3') {
						toyType.add(x);
						System.out.println("(" +i+")" + "  Toy Info :" + x.toString());
						i++;
						}
					}
					break;
				
				
			case 'P' :
				
			 
				for (Toy x: toys) {
					
					if (x.getSN().charAt(0) == '4' || x.getSN().charAt(0) == '5' || x.getSN().charAt(0) == '6') {
						toyType.add(x);
						
						System.out.println("(" +i+")" + "  Toy Info :" + x.toString());
						i++;
						}
					}
					break;
				
				
			case 'B' :
			
			 
				for (Toy x: toys) {
					
					if (x.getSN().charAt(0) == '7' || x.getSN().charAt(0) == '8' || x.getSN().charAt(0) == '9') {
						toyType.add(x);
						System.out.println("(" +i+")" + "  Toy Info :" + x.toString());
						i++;
						}
					}
				break;
			}
				
		
	}
	

	/**
	 * @param none
	 * @return none
	 * 
	 * Method for printing toys
	 */
	public void printToys() {
		
		System.out.println(toys.toString());
	}
	
	/**
	 * @param none
	 * @return none
	 * 
	 * Method for removing a toy by serial number
	 */
	public void removeToy() {


		System.out.println("Please enter the Serial Number of the toy you wish to remove: ");
		String SN = kb.next();
		
		for (Toy t: toys) {
			if (t.getSN().equals(SN)) {
				
				System.out.println("Toy Info :" + t.toString());
				System.out.println(); 
			}
			
			}
		
		System.out.println("Are you sure you want to remove this toy?");
		System.out.println("Y/N");
		String ans = kb.next().toUpperCase();
		if (ans.charAt(0) == 'Y') {
			
			for (Toy t: toys) 
				if (t.getSN().equals(SN)) {
					Toy removeToy = t;
					
					toys.remove(removeToy);
					break;	
				}
				
			
			
			System.out.println("Toy Removed");
		}
		else if (ans.charAt(0) == 'N') {
			
			System.out.println("Toy was not removed");
		}
		else {
			System.out.println("Not valid,");
			removeToy();
		}}
		
			
	
	
	

	/**
	 * Adds a new toy to the arraylist.
	 * @throws Exception
	 */
	private void addNewToy() throws Exception {
		
		System.out.println("Enter a Toy Type:");
		System.out.println();
		System.out.println("(A) Animal");
		System.out.println("(B) Board Game");
		System.out.println("(F) Figure");
		System.out.println("(P) Puzzles");
		System.out.println();
		System.out.println("Enter an Option: ");
		char type1 = kb.next().toUpperCase().charAt(0);
		
		switch (type1) {
		 
		case 'A':
			
		{
			Animals newToy = new Animals(null, null, null, 0, 0, null, null, ' ');
			int age;
			
			System.out.println("Enter Serial Number(SN): ");
			newToy.setSN(kb.next());
			
			System.out.println("Enter Toy Name: ");
			newToy.setName(kb.next());
			
			System.out.println("Enter Toy Brand: ");
			newToy.setBrand(kb.next());
			
			System.out.println("Enter Toy Price: ");
			newToy.setPrice(kb.nextDouble());
			if (newToy.getPrice() < 0) {
				throw new Exception();
			}

			System.out.println("Enter Toy Price: ");
			newToy.setPrice(kb.nextDouble());
			
			System.out.println("Enter Available Count: ");
			newToy.setCount(kb.nextInt());
			
			System.out.println("Enter Appropriate Age: ");
			age = kb.nextInt();
			newToy.setAge(age + "+");
			
			System.out.println("Enter Material: ");
			newToy.setMaterial(kb.next());
			
			System.out.println("Enter Size: ");
			newToy.setSize(kb.next().toUpperCase().charAt(0));
			toys.add(newToy);
			System.out.println(newToy.toString());
			break;
		}
			
		case 'B':
			
		{	
			BoardGames newToy = new BoardGames(null, null, null, 0, 0, null, null, null);
			int age;
			int minPlayers;
			int maxPlayers;
			
			System.out.println("Enter Serial Number(SN): ");
			newToy.setSN(kb.next());
			
			System.out.println("Enter Toy Name: ");
			newToy.setName(kb.next());
			
			System.out.println("Enter Toy Brand: ");
			newToy.setBrand(kb.next());
			
			System.out.println("Enter Toy Price: ");
			newToy.setPrice(kb.nextDouble());
			if (newToy.getPrice() < 0) {
				throw new Exception();
			}
			
			System.out.println("Enter Available Count: ");
			newToy.setCount(kb.nextInt());
			
			System.out.println("Enter Appropriate Age: ");
			age = kb.nextInt();
			newToy.setAge(age + "+");
			
			System.out.println("Enter Minimum Number of Players: ");
			minPlayers = kb.nextInt();
			
			System.out.println("Enter Maximum Number of Players: ");
			maxPlayers = kb.nextInt();
			
			if (minPlayers > maxPlayers) {
				throw new Exception();
			}
			
			newToy.setNumOfPlayers(minPlayers + "-" + maxPlayers);
			
			System.out.println("Who are the Designer(s): ");
			newToy.setDesigners(kb.next());
			
			toys.add(newToy);
			System.out.println(newToy.toString());
			break;
		}
			
		case 'F':
		
		{
			Figures newToy = new Figures(null, null, null, 0, 0, null, ' ');
			int age;
			
			System.out.println("Enter Serial Number(SN): ");
			newToy.setSN(kb.next());
			
			System.out.println("Enter Toy Name: ");
			newToy.setName(kb.next());
			
			System.out.println("Enter Toy Brand: ");
			newToy.setBrand(kb.next());
			
			System.out.println("Enter Toy Price: ");
			newToy.setPrice(kb.nextDouble());
			if (newToy.getPrice() < 0) {
				throw new Exception();
			}
			
			System.out.println("Enter Available Count: ");
			newToy.setCount(kb.nextInt());
			
			System.out.println("Enter Appropriate Age: ");
			age = kb.nextInt();
			newToy.setAge(age + "+");
			
			System.out.println("Enter Classification: ");
			newToy.setClassification(kb.next().toUpperCase().charAt(0));
			toys.add(newToy);
			System.out.println(newToy.toString());
			break;
		}
		
		case 'P':
			
		{
			Puzzles newToy = new Puzzles(null, null, null, 0, 0, null, ' ');	
			int age;
			
			System.out.println("Enter Serial Number(SN): ");
			newToy.setSN(kb.next());
			
			System.out.println("Enter Toy Name: ");
			newToy.setName(kb.next());
			
			System.out.println("Enter Toy Brand: ");
			newToy.setBrand(kb.next());
			
			System.out.println("Enter Toy Price: ");
			newToy.setPrice(kb.nextDouble());
			if (newToy.getPrice() < 0) {
				throw new Exception();
			}
			
			System.out.println("Enter Available Count: ");
			newToy.setCount(kb.nextInt());
			
			System.out.println("Enter Appropriate Age: ");
			age = kb.nextInt();
			newToy.setAge(age + "+");
			
			System.out.println("Enter Puzzle-Type: ");
			newToy.setPuzzleType(kb.next().toUpperCase().charAt(0));	
			toys.add(newToy);

			System.out.println(newToy.toString());
			
			break;
		}}
		
		
		System.out.println("New Toy Added!");
		
		
	}
	

	/**
	 * Adds toys in arraylist to the toys.txt file.
	 * @throws Exception
	 */
	public void saveData() throws Exception {
        FileWriter writer = new FileWriter(FILE_PATH);
        for (Toy t: toys) {
            writer.write(t.printFormat() + System.lineSeparator());

        }
        writer.close();
    }
	
	/**
	 * @param none
	 * @return none
	 * 
	 * Method for initializing the menus and other methods
	 */
	private void launchApp() throws Exception {
		boolean flag = true;
		int option;
		do
		{
			option = menu.printMainMenu();
			switch (option) {
			case 1 :
				findToy();
				break;
			case 2 :
				addNewToy();
				break;
			case 3 :
				removeToy();
				break;
			case 4 :
				saveData();
				flag = false;
			}}
			while (flag); 
		}
	
}