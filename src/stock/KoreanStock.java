package stock;

import java.util.Scanner;

public class KoreanStock extends Stock {

	public void getUserInput(Scanner input) {
		System.out.print("Stock ticker :");
		String ticker = input.next(); // ������ �ֽ�����
		this.setTicker(ticker);

		System.out.print("Buy Price :");
		int buyprice = input.nextInt(); // ���Ű���
		this.setBuyprice(buyprice);

		System.out.print("How many purchases :");
		int purchases = input.nextInt(); // ���Ű���
		this.setPurchases(purchases);

		String answer = "x";
		while (!(answer.equals("common")) && !(answer.equals("preferred"))) {
			System.out.print("common stock or preferred stock ");
			answer = input.next();
			if (answer.equals("common")) {
				double dividend2 = 0;
				this.setDividend(dividend2);
				break;
			} else if (answer.equals("preferred")) {
				System.out.print("Dividend :");
				Double dividend = input.nextDouble(); // ����
				this.setDividend(dividend);
				break;
			} else {

			}
		}
	}

}
