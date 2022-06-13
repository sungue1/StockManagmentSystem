package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import stock.FinancialStock;
import stock.ITStock;
import stock.Stock;
import stock.ConsumerstaplesStock;
import stock.StockInput;
import stock.StockSector;

public class StockManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 26097962964103716L;
	
	ArrayList<StockInput> stocks = new ArrayList<StockInput>();
	transient Scanner input;
	StockManager(Scanner input) {
		this.input = input;
	}
	
	public void BuyStock(String ticker, String price, String purchases, String dividend) {
		StockInput stockInput = new ITStock(StockSector.IT);
		stockInput.getUserInput(input);
		stocks.add(stockInput);
	}
	
	public void SellStock(String ticker) {
		System.out.println("sell stock ticker: ");
		int index = findIndex(ticker);
		for(int i =0; i<stocks.size(); i++) {
			if (stocks.get(i).getTicker().equals(ticker)) {
				index = i;
				break;
			}
		}
		removefromStocks(index, ticker);
	}
	
	public void EditStock(String ticker, String price, String purchases, String dividend) {
		for (int i = 0; i < stocks.size(); i++) {
			StockInput stock = stocks.get(i);
			if (stock.getTicker().equals(ticker)) {
				try {
					stock.setBuyprice(Integer.parseInt(price));
					stock.setPurchases(Integer.parseInt(purchases));
					stock.setDividend(Double.parseDouble(dividend));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	public void BuyStock(StockInput stockInput) {
		stocks.add(stockInput);
	}
	
	public void SellStock(StockInput stockInput) {
		stocks.remove(stockInput);
	}

	public void BuyStock() {
		int kind = 0;
		StockInput stockInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for IT stock");
				System.out.println("2 for  Financial stock");
				System.out.println("3 for Consumerstaples stock");
				System.out.print("Select num 1, 2, or 3 for Stock sector:");
				kind = input.nextInt();
				if (kind == 1) {
					stockInput = new ITStock(StockSector.IT);
					stockInput.getUserInput(input);
					stocks.add(stockInput);
					break;
				} else if (kind == 2) {
					stockInput = new FinancialStock(StockSector.Financial);
					stockInput.getUserInput(input);
					stocks.add(stockInput);
					break;
				} else if (kind == 3) {
					stockInput = new ConsumerstaplesStock(StockSector.Consumerstaples);
					stockInput.getUserInput(input);
					stocks.add(stockInput);
					break;
				} else {
					System.out.print("Select num 1, 2, or 3 for Stock sector:");
				}
			} catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void SellStock() {
		System.out.print("Stock ticker :");
		String ticker = input.next();
		int index = findIndex(ticker);
		removefromStocks(index, ticker);
	}

	public int findIndex(String ticker) {
		int index = -1;
		for (int i = 0; i < stocks.size(); i++) {
			if (stocks.get(i).getTicker().equals(ticker)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromStocks(int index, String ticker) {
		if (index >= 0) {
			stocks.remove(index);
			System.out.println("The stock " + ticker + " is selled");
			return 1;
		} else {
			System.out.println("You don't have this stock");
			return -1;
		}
	}

	public void ViewStocks() {
		System.out.println("Stock list");
		for (int i = 0; i < stocks.size(); i++) {
			stocks.get(i).printInfo();
		}
	}
	
	public int size() {
		return stocks.size();
	}
	
	public StockInput get(int index) {
		return (Stock) stocks.get(index);
	}

	public void EditStock() {
		System.out.print("Stock ticker: ");
		String ticker = input.next();
		for (int i = 0; i < stocks.size(); i++) {
			StockInput stock = stocks.get(i);
			if (stock.getTicker().equals(ticker)) {
				int num = -1;
				while (num != 4) {
					showEditMenu();
					num = input.nextInt();
					switch (num) {
					case 1:
						stock.setStockBuyprice(input);
						break;
					case 2:
						stock.setStockPurchases(input);
						break;
					case 3:
						stock.setStockDividend(input);
						break;
					default:
						continue;
					}
				} // while
				break;
			} // if
		} // for
	}

	public void showEditMenu() {
		System.out.println("** Stock Info Edit Menu **");
		System.out.println("1. Edit Buyprice");
		System.out.println("2. Edit Purchases");
		System.out.println("3. Edit Dividend");
		System.out.println("4. Exit");
		System.out.println("Select one number between 1 - 4: ");
	}
}
