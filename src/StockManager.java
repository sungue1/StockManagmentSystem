import java.util.ArrayList;
import java.util.Scanner;

import stock.FinancialStock;
import stock.ConsumerstaplesStock;
import stock.Stock;
import stock.StockSector;

public class StockManager {
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	Scanner input;

	StockManager(Scanner input) {
		this.input = input;

	}

	public void BuyStock() {
		int kind = 0;
		while (kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 for IT stock");
			System.out.println("2 for  Financial stock");
			System.out.println("3 for Consumerstaples stock");
			System.out.print("Select num 1, 2, or 3 for Stock sector:");
			kind = input.nextInt();
			if (kind == 1) {
				Stock stock = new Stock(StockSector.IT);
				stock.getUserInput(input);
				stocks.add(stock);
				break;
			} else if (kind == 2) {
				Stock stock = new FinancialStock(StockSector.Financial);
				stock.getUserInput(input);
				stocks.add(stock);
				break;
			} else if (kind == 3) {
				Stock stock = new ConsumerstaplesStock(StockSector.Consumerstaples);
				stock.getUserInput(input);
				stocks.add(stock);
				break;
			} else {
				System.out.print("Select num 1, 2, or 3 for Stock sector:");
			}
		}
	}

	public void SellStock() {
		System.out.print("Stock ticker :");
		String ticker = input.next();
		int index = -1;
		for (int i = 0; i < stocks.size(); i++) {
			if (stocks.get(i).getTicker().equals(ticker)) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			stocks.remove(index);
			System.out.println("How much these you selled?");
			int sellprice = input.nextInt();
			System.out.println("The stock " + ticker + " is selled");
		}

		else {
			System.out.println("You don't have this stock");
			return;
		}

	}

	public void ViewStocks() {
		System.out.println("Stock list");
		for (int i = 0; i < stocks.size(); i++) {
			stocks.get(i).printInfo();
		}
	}

	public void EditStock() {
		System.out.print("Stock ticker: ");
		String ticker = input.next();
		for (int i = 0; i < stocks.size(); i++) {
			Stock stock = stocks.get(i);
			if (stocks.get(i).getTicker().equals(ticker)) {
				int num = -1;
				while (num != 4) {
					System.out.println("** Stock Info Edit Menu **");
					System.out.println("1. Edit Buyprice");
					System.out.println("2. Edit Purchases");
					System.out.println("3. Edit Dividend");
					System.out.println("4. Exit");
					System.out.println("Select one number between 1 - 4: ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Stock Buyprice");
						int buyprice = input.nextInt();
						stock.setBuyprice(buyprice);
					} else if (num == 2) {
						System.out.print("Stock Purchases");
						int purchases = input.nextInt();
						stock.setPurchases(purchases);
					} else if (num == 3) {
						System.out.print("Stock Dividend");
						Double dividend = input.nextDouble();
						stock.setDividend(dividend);
					} else {
						continue;
					} // if
				} // while
				break;
			} // if
		} // for
	}
}
