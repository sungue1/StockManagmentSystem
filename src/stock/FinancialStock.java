package stock;

import java.util.Scanner;

public class FinancialStock extends Stock {

	public FinancialStock(StockSector sector) {
		this.sector = sector;
	}

	public void getUserInput(Scanner input) {
		System.out.print("Stock ticker :");
		String ticker = input.next();
		this.setTicker(ticker);

		System.out.print("Buy Price :");
		int buyprice = input.nextInt();
		this.setBuyprice(buyprice);

		System.out.print("How many purchases :");
		int purchases = input.nextInt();
		this.setPurchases(purchases);

		System.out.print("Dividend :");
		Double dividend = input.nextDouble();
		this.setDividend(dividend);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("high stability ? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.println("You get a low lisk and low return");
			} else if (answer == 'n' || answer == 'N') {
				System.out.println("You get a high lisk and high return");
			} else {

			}
		}
	}
}
