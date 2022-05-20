package manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		StockManager stockManager = getObject("stockmanager.ser");
		if (stockManager == null) {
			stockManager = new StockManager(input);
		}
		selectMenu(input, stockManager);
		putObject(stockManager, "stockmanager.ser");
	}

	public static void selectMenu(Scanner input, StockManager stockManager) {

		int num = 0;
		while (num != 6) {
			try {
				showMenu();
				num = input.nextInt();
				System.out.println();

				switch (num) {
				case 1:
					stockManager.BuyStock();
					logger.log("buy a stock");
					break;
				case 2:
					stockManager.SellStock();
					logger.log("sell a stock");
					break;
				case 3:
					stockManager.ViewStocks();
					logger.log("view a stock");
					break;
				case 4:
					stockManager.EditStock();
					logger.log("edit a stock");
					break;
				default:
					continue;
				}
			} 
			catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 6!");
				if (input.hasNext()) {
					input.next();
				}
                num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Stock Managment System Menu ***");
		System.out.println("1. Buy the Stock");
		System.out.println("2. Sell the Stock");
		System.out.println("3. View your Stocks");
		System.out.println("4. Eidt your Stock");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.print("Select one number between 1-6: ");
	}
	
	public static StockManager getObject(String filename) {
		StockManager stockManager = null;
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			stockManager = (StockManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return stockManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return stockManager;
	}

	

public static void putObject(StockManager stockManager, String filename) {
	
	try {
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		out.writeObject(stockManager);
		
		out.close();
		file.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}

