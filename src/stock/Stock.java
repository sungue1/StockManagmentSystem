package stock;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
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

	public void printInfo() {
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
		System.out.println("Sector:" + ssector + " Stock:" + ticker + "  Buy price:" + buyprice + "  Purchases:"
				+ purchases + "  Dividend:" + dividend);
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
	}

	public StockSector getSector() {
		return sector;
	}

	public void setSector(StockSector sector) {
		this.sector = sector;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String stock) {
		this.ticker = stock;
	}

	public double getBuyprice() {
		return buyprice;
	}

	public void setBuyprice(int buyprice) {
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

}
