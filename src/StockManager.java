import java.util.ArrayList;
import java.util.Scanner;

public class StockManager {
	ArrayList<Account> accounts = new ArrayList<Account>();

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
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
				BuyStock();
				break;
			case 2 :
				SellStock();
				break;
			case 3 :
				ViewStock();
				break;
			case 4 :
				fluctuation();
				break;
			case 5 :
			}
			
		}

	}
	
	public static void BuyStock() 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Stock ticker :");
		String ticker = input.next();
		System.out.print("Buy Price :");
	    double buyprice = input.nextDouble();
		System.out.print("How many purchases :");
		int purchases = input.nextInt();
		System.out.print("Dividend :");
		double dividend = input.nextDouble();
	}
	
	public static void SellStock()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Stock ticker :");
		String ticker = input.next();
		System.out.print("Sell Price :");
	    double sellprice = input.nextDouble();
		System.out.print("How many sales :");
		int sales = input.nextInt();
		System.out.println("Earn :" );
	}
	
	public static void ViewStock()
	{
		System.out.println();
	}
	
	public static void fluctuation()
	{
		System.out.print("Stock ticker :");	
	}
	

}



