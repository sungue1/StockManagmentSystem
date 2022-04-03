import java.util.ArrayList;

public class Stock {    

		String stock;           // 필드  주식종류
		double buyprice;        // 필드  구매 가격
		double sellprice;       // 필드  판매 가격
		int purchases;          // 필드  구매 개수
		int sales;              // 필드  판매 개수
		double dividend;        // 필드  배당
		
		
		public Stock() {   // 생성자
			
		}
		
		public Stock(String stock, double buyprice, int purchases, double dividend) {   //생성자
		this.stock = stock;
		this.buyprice = buyprice;
		this.purchases = purchases;
		this.dividend = dividend;
	}
		
		
		public void printInfo() {      // 메소드     list문을 이용하여 여러개의 주식들을 한번에 볼 수 있게 만들 생각입니다.
//			ArrayList<String> stock = new ArrayList<String>();
//			stock.add("Stock:" + stock + "  Buy price:" + buyprice + "  Purchases:" + purchases + "  Dividend:" + dividend);
//			stock.add("Stock:" + stock + "  Buy price:" + buyprice + "  Purchases:" + purchases + "  Dividend:" + dividend);
//			stock.add("Stock:" + stock + "  Buy price:" + buyprice + "  Purchases:" + purchases + "  Dividend:" + dividend);
//			for(int i =0; i<stock.size(); ++i)
			System.out.println("Stock:" + stock + "  Buy price:" + buyprice + "  Purchases:" + purchases + "  Dividend:" + dividend);
		}
		
		public void earn() {           // 메소드      판매가격*판매개수 - 구매가격*구매개수를 계산하여 번돈을 구합니다. 현재는 구매개수와 판매개수를 동일하게 해야만 제대로된 값이 나옵니다.
			System.out.println(sellprice * sales - buyprice * purchases);
		}
}

