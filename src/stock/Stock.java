package stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Stock implements StockInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4548182824638008866L;
	protected StockSector sector = StockSector.IT;
	protected String ticker;
	protected int buyprice;
	protected int sellprice;
	protected int purchases;
	protected int sales;
	protected double dividend;

	public Stock() {
	}

	public Stock(StockSector sector) {
		this.sector = sector;
	}

	public Stock(String ticker, int buyprice, int purchases, double dividend) {
		this.ticker = ticker;
		this.buyprice = buyprice;
		this.purchases = purchases;
		this.dividend = dividend;
	}

	public Stock(StockSector sector, String ticker, int buyprice, int purchases, double dividend) {
		this.sector = sector;
		this.ticker = ticker;
		this.buyprice = buyprice;
		this.purchases = purchases;
		this.dividend = dividend;
	}

	public abstract void printInfo();

	public StockSector getSector() {
		return sector;
	}

	public void setSector(StockSector sector) {
		this.sector = sector;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public double getBuyprice() {
		return buyprice;
	}

	public void setBuyprice(int buyprice) throws Exception {
		if (buyprice < 0) {
			throw new Exception();
		}
		this.buyprice = buyprice;
	}

	public double getSellprice() {
		return sellprice;
	}

	public void setSellprice(int sellprice) {
		this.sellprice = sellprice;
	}

	public int getPurchases() {
		return purchases;
	}

	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public double getDividend() {
		return dividend;
	}

	public void setDividend(double dividend) {
		this.dividend = dividend;
	}

	public void setStockTicker(Scanner input) {
		System.out.print("Stock ticker: ");
		String ticker = input.next();
		this.setTicker(ticker);
	}

	public void setStockBuyprice(Scanner input) {
		int buyprice = -1;
		while (buyprice < 0) {
			System.out.print("Stock Buyprice: ");
			try {
				buyprice = input.nextInt();
				this.setBuyprice(buyprice);
			} catch (Exception e) {
				System.out.println("please put a number.");
				if (input.hasNext()) {
					input.next();
				}
			}
		}
	}

	public void setStockPurchases(Scanner input) {
		int purchases = -1;
		while (purchases < 0) {
			System.out.print("Stock Purchases: ");
			try {
				purchases = input.nextInt();
				this.setPurchases(purchases);
			} catch (Exception e) {
				System.out.println("please put a number.");
				if (input.hasNext()) {
					input.next();
				}
			}
		}
	}

	public void setStockDividend(Scanner input) {
		Double dividend = (double) -1;
		while (dividend < 0) {
			System.out.print("Stock Dividend: ");
			try {
				dividend = input.nextDouble();
				this.setDividend(dividend);
			} catch (Exception e) {
				System.out.println("please put a dividend rate.");
				if (input.hasNext()) {
					input.next();
				}
			}
		}
	}

	public String getSectorString() {
		String ssector = "none";
		switch (this.sector) {
		case IT:
			ssector = "IT";
			break;
		case Financial:
			ssector = "Financial";
			break;
		case Consumerstaples:
			ssector = "Consumerstaples";
			break;
		case Energy:
			ssector = "Energy";
			break;
		default:
		}
		return ssector;
	}

	public void setStockwithYN(Scanner input) {
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
