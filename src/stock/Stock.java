package stock;
import java.util.ArrayList;
import java.util.Scanner;

public class Stock {

		protected StockKind kind = StockKind.American;
		protected String ticker;           // �ʵ�  �ֽ�����
		protected int buyprice;        // �ʵ�  ���� ����
		protected int sellprice;       // �ʵ�  �Ǹ� ����
		protected int purchases;          // �ʵ�  ���� ����
		protected int sales;              // �ʵ�  �Ǹ� ����
		protected double dividend;        // �ʵ�  ���
		
		
		public Stock() {   // ������
			
		}
		
		public Stock(String ticker, int buyprice, int purchases, double dividend) {   //������
		this.ticker = ticker;
		this.buyprice = buyprice;
		this.purchases = purchases;
		this.dividend = dividend;
	}
		
		
		public void printInfo() {      // �޼ҵ�  
			System.out.println("Stock:" + ticker + "  Buy price:" + buyprice + "  Purchases:" + purchases + "  Dividend:" + dividend);
		}
		
		public void earn() {           // �޼ҵ�      �ǸŰ���*�ǸŰ��� - ���Ű���*���Ű����� ����Ͽ� ������ ���մϴ�. ����� ���Ű����� �ǸŰ����� �����ϰ� �ؾ߸� ����ε� ���� ���ɴϴ�.
			System.out.println(sellprice * sales - buyprice * purchases);
		}
		
		public void getUserInput(Scanner input) {
			System.out.print("Stock ticker :");
			String ticker = input.next();          // ������ �ֽ�����
			this.setTicker(ticker);
			System.out.print("Buy Price :");
			int buyprice = input.nextInt(); // ���Ű���
			this.setBuyprice(buyprice);
			System.out.print("How many purchases :");
			int purchases = input.nextInt();   // ���Ű���
			this.setPurchases(purchases);
			System.out.print("Dividend :");
			Double dividend = input.nextDouble(); // ����
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

