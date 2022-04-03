
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StockManager stock = new StockManager(input);
		
		int num = 0;
		
		while (num != 6) {
			System.out.println("*** Stock Managment System Menu ***");
			System.out.println("1. Buy the Stock");
			System.out.println("2. Sell the Stock");
			System.out.println("3. View your Stock");
			System.out.println("4. Show your fluctuation");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1-6: ");
			num = input.nextInt();
			System.out.println();
			
			switch(num) {
			case 1 :
				stock.BuyStock();
				break;
			case 2 :
				stock.SellStock();
				break;
			case 3 :
				stock.ViewStock();
				break;
			case 4 :
				stock.fluctuation();
				break;
			case 5 :
			}
			
		}

	}
	


}



