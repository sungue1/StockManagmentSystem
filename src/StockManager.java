import java.util.ArrayList;
import java.util.Scanner;

import stock.KoreanStock;
import stock.Stock;

public class StockManager {
	ArrayList<Stock> stocks = new ArrayList<Stock>();            // �ʵ�
	Scanner input;

	StockManager(Scanner input) {   // ������
		this.input = input;

	}

	public void BuyStock() {   // �޼ҵ�      �ֽ� ����
		int kind = 0;
		while(kind !=1 && kind != 2) {
			System.out.print("1 for Amercian stock  ");
			System.out.print("2 for Korean stock ");
			System.out.print("Select Stock Kind between 1 and 2:");
			kind = input.nextInt(); 
			if (kind == 1) {
				Stock stock = new Stock();
				stock.getUserInput(input);
				stocks.add(stock);
				break;
			}
			else if (kind == 2) {
				Stock stock = new KoreanStock();
				stock.getUserInput(input);
				stocks.add(stock);
				break;
			}
			else {
				System.out.print("Select Stock Kind between 1 and 2:");
			}
		}
	}
	
	public void SellStock()    // �޼ҵ�      �ֽ� �Ǹ� 
	{
		System.out.print("Stock ticker :");   
		String ticker = input.next();        // �Ǹ��� �ֽ�����
		int index = -1;                                                                         // @@@
		for(int i = 0; i<stocks.size();i++) {
			if (stocks.get(i).getTicker().equals(ticker)) {    // �Է��� �ֽ� ������ ���� ���
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			stocks.remove(index);
			System.out.println("The stock" + ticker + " is selled");
		}
		
		else {
			System.out.println("You don't have this stock");
			return;
		}
		
	}
	
	public void ViewStocks()     // �޼ҵ�    ������ �ֽ� ��� ���
	{
		System.out.println("Stock list");
		for(int i = 0; i<stocks.size();i++) {
			stocks.get(i).printInfo();
		}
	}
	
	public void fluctuation()   // �޼ҵ�     
	{
		System.out.print("Earn history : ");
		String ticker = input.next();
		for(int i = 0; i<stocks.size();i++) {
			Stock stock = stocks.get(i);
		if(stock.equals(stock.getTicker())) {
		stock.earn();
		}
	}
    }
}
