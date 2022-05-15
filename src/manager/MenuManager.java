package manager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StockManager stockManager = new StockManager(input);

		selectMenu(input, stockManager);
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
					break;
				case 2:
					stockManager.SellStock();
					break;
				case 3:
					stockManager.ViewStocks();
					break;
				case 4:
					stockManager.EditStock();
					break;
				default:
					continue;
				}
			} catch (InputMismatchException e) {
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

}
