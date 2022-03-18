import java.util.Scanner;

public class StockManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("*** Stock Managment System Menu ***");
			System.out.println("1. Add Companys");
			System.out.println("2. Delete Companys");
			System.out.println("3. Edit Companys");
			System.out.println("4. View Companys");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6: ");
			num = input.nextInt();
			System.out.println();
			
			switch(num) {
			case 1 :
				System.out.print("Stock ticker :");
				String ticker = input.next();
				System.out.print("Market capitalization :");
				String cap = input.next();
				System.out.print("Open price :");
				String Op = input.next();
				System.out.print("Close price :");
				String Cp = input.next();
				System.out.print("Dividend :");
				Double Dividend = input.nextDouble();
				break;
			case 2 :
			case 3 :
			case 4 :
				System.out.print("Stock ticker :");
				String ticker2 = input.next();
			case 5 :
			}
			
		}

	}

}