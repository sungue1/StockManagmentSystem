import java.util.Scanner;

public class StockManager {
	Stock stock;            // 필드
	Scanner input;          // 필드
	
	StockManager(Scanner input) {   // 생성자
		this.input = input;
		
	}

	public void BuyStock()    // 메소드      주식 구매
	{
		stock = new Stock();
		System.out.print("Stock ticker :");
		stock.stock = input.next();          // 구매할 주식종류
		System.out.print("Buy Price :");
		stock.buyprice = input.nextDouble(); // 구매가격
		System.out.print("How many purchases :");
		stock.purchases = input.nextInt();   // 구매개수
		System.out.print("Dividend :");
		stock.dividend = input.nextDouble(); // 배당금
	}
	
	public void SellStock()    // 메소드      주식 판매 
	{
		System.out.print("Stock ticker :");   
		String ticker = input.next();        // 판매할 주식종류
		if (stock.equals(null)) {            // 입력한 종류가 없을 경우
			System.out.println("You don't have this stock");
			return;
		}
		
		if (stock.stock.equals(ticker)) {    // 입력한 주식 종류가 있을 경우
			System.out.print("Sell Price :");
		    stock.sellprice = input.nextDouble();  // 판매가격
			System.out.print("How many sales :");
			stock.sales = input.nextInt();         // 판매개수
			System.out.print("Earn :" );
			stock.earn();                          // earn 메소드 사용
			stock = null;                          // 구매한 주식 비우기
			System.out.println("The stock is sell");
		}
		
	}
	
	public void ViewStock()     // 메소드    보유한 주식 목록 출력
	{
		System.out.println("Stock list");
		stock.printInfo();      // printInfo 메소드 사용
	}
	
	public void fluctuation()   // 메소드     거래로 인한 이익, 손해 출력
	{
		System.out.print("Earn history : ");
		stock.earn();
	}
	
}
