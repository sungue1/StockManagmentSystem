import java.util.ArrayList;

public class Stock {    

		String stock;           // �ʵ�  �ֽ�����
		double buyprice;        // �ʵ�  ���� ����
		double sellprice;       // �ʵ�  �Ǹ� ����
		int purchases;          // �ʵ�  ���� ����
		int sales;              // �ʵ�  �Ǹ� ����
		double dividend;        // �ʵ�  ���
		
		
		public Stock() {   // ������
			
		}
		
		public Stock(String stock, double buyprice, int purchases, double dividend) {   //������
		this.stock = stock;
		this.buyprice = buyprice;
		this.purchases = purchases;
		this.dividend = dividend;
	}
		
		
		public void printInfo() {      // �޼ҵ�     list���� �̿��Ͽ� �������� �ֽĵ��� �ѹ��� �� �� �ְ� ���� �����Դϴ�.
//			ArrayList<String> stock = new ArrayList<String>();
//			stock.add("Stock:" + stock + "  Buy price:" + buyprice + "  Purchases:" + purchases + "  Dividend:" + dividend);
//			stock.add("Stock:" + stock + "  Buy price:" + buyprice + "  Purchases:" + purchases + "  Dividend:" + dividend);
//			stock.add("Stock:" + stock + "  Buy price:" + buyprice + "  Purchases:" + purchases + "  Dividend:" + dividend);
//			for(int i =0; i<stock.size(); ++i)
			System.out.println("Stock:" + stock + "  Buy price:" + buyprice + "  Purchases:" + purchases + "  Dividend:" + dividend);
		}
		
		public void earn() {           // �޼ҵ�      �ǸŰ���*�ǸŰ��� - ���Ű���*���Ű����� ����Ͽ� ������ ���մϴ�. ����� ���Ű����� �ǸŰ����� �����ϰ� �ؾ߸� ����ε� ���� ���ɴϴ�.
			System.out.println(sellprice * sales - buyprice * purchases);
		}
}

