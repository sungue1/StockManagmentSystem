import java.util.Scanner;

public class StockManager {
	Stock stock;            // �ʵ�
	Scanner input;          // �ʵ�
	
	StockManager(Scanner input) {   // ������
		this.input = input;
		
	}

	public void BuyStock()    // �޼ҵ�      �ֽ� ����
	{
		stock = new Stock();
		System.out.print("Stock ticker :");
		stock.stock = input.next();          // ������ �ֽ�����
		System.out.print("Buy Price :");
		stock.buyprice = input.nextDouble(); // ���Ű���
		System.out.print("How many purchases :");
		stock.purchases = input.nextInt();   // ���Ű���
		System.out.print("Dividend :");
		stock.dividend = input.nextDouble(); // ����
	}
	
	public void SellStock()    // �޼ҵ�      �ֽ� �Ǹ� 
	{
		System.out.print("Stock ticker :");   
		String ticker = input.next();        // �Ǹ��� �ֽ�����
		if (stock.equals(null)) {            // �Է��� ������ ���� ���
			System.out.println("You don't have this stock");
			return;
		}
		
		if (stock.stock.equals(ticker)) {    // �Է��� �ֽ� ������ ���� ���
			System.out.print("Sell Price :");
		    stock.sellprice = input.nextDouble();  // �ǸŰ���
			System.out.print("How many sales :");
			stock.sales = input.nextInt();         // �ǸŰ���
			System.out.print("Earn :" );
			stock.earn();                          // earn �޼ҵ� ���
			stock = null;                          // ������ �ֽ� ����
			System.out.println("The stock is sell");
		}
		
	}
	
	public void ViewStock()     // �޼ҵ�    ������ �ֽ� ��� ���
	{
		System.out.println("Stock list");
		stock.printInfo();      // printInfo �޼ҵ� ���
	}
	
	public void fluctuation()   // �޼ҵ�     �ŷ��� ���� ����, ���� ���
	{
		System.out.print("Earn history : ");
		stock.earn();
	}
	
}
