package stock;

import java.util.Scanner;

public class KoreanStock extends Stock {

	public void getUserInput(Scanner input) {
		System.out.print("Stock ticker :");
		String ticker = input.next(); // 구매할 주식종류
		this.setTicker(ticker);

		System.out.print("Buy Price :");
		int buyprice = input.nextInt(); // 구매가격
		this.setBuyprice(buyprice);

		System.out.print("How many purchases :");
		int purchases = input.nextInt(); // 구매개수
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
				Double dividend = input.nextDouble(); // 배당금
				this.setDividend(dividend);
				break;
			} else {

			}
		}
	}

}
