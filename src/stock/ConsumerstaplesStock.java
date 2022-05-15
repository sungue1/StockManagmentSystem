package stock;

import java.util.Scanner;

public class ConsumerstaplesStock extends Stock {

	public ConsumerstaplesStock(StockSector sector) {
		super(sector);
	}

	public void printInfo() {
		String ssector = getSectorString();
		System.out.println("Sector:" + ssector + " Stock:" + ticker + "  Buy price:" + buyprice + "  Purchases:"
				+ purchases + "  Dividend:" + dividend);
	}

	public void getUserInput(Scanner input) {
		setStockTicker(input);
		setStockBuyprice(input);
		setStockPurchases(input);
		setStockDividend(input);
		setStockwithYN(input);
	}
}
