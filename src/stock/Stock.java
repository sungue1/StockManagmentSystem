package stock;
import java.util.ArrayList;
import java.util.Scanner;

public class Stock {

		protected StockKind kind = StockKind.American;
		protected String ticker;           // 필드  주식종류
		protected int buyprice;        // 필드  구매 가격
		protected int sellprice;       // 필드  판매 가격
		protected int purchases;          // 필드  구매 개수
		protected int sales;              // 필드  판매 개수
		protected double dividend;        // 필드  배당
		
		
		public Stock() {   // 생성자
			
		}
		
		public Stock(String ticker, int buyprice, int purchases, double dividend) {   //생성자
		this.ticker = ticker;
		this.buyprice = buyprice;
		this.purchases = purchases;
		this.dividend = dividend;
	}
		
		
		public void printInfo() {      // 메소드  
			System.out.println("Stock:" + ticker + "  Buy price:" + buyprice + "  Purchases:" + purchases + "  Dividend:" + dividend);
		}
		
		public void earn() {           // 메소드      판매가격*판매개수 - 구매가격*구매개수를 계산하여 번돈을 구합니다. 현재는 구매개수와 판매개수를 동일하게 해야만 제대로된 값이 나옵니다.
			System.out.println(sellprice * sales - buyprice * purchases);
		}
		
		public void getUserInput(Scanner input) {
			System.out.print("Stock ticker :");
			String ticker = input.next();          // 구매할 주식종류
			this.setTicker(ticker);
			System.out.print("Buy Price :");
			int buyprice = input.nextInt(); // 구매가격
			this.setBuyprice(buyprice);
			System.out.print("How many purchases :");
			int purchases = input.nextInt();   // 구매개수
			this.setPurchases(purchases);
			System.out.print("Dividend :");
			Double dividend = input.nextDouble(); // 배당금
			this.setDividend(dividend);
		}
		
		
        public StockKind getKind() {
		return kind;
	}

	public void setKind(StockKind kind) {
		this.kind = kind;
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

