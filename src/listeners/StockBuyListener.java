package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import manager.StockManager;
import stock.ITStock;
import stock.Stock;
import stock.StockInput;
import stock.StockSector;

public class StockBuyListener implements ActionListener {

	JTextField fieldTicker;
	JTextField fieldPrice;
	JTextField fieldPurchases;
	JTextField fieldDividend;
	StockManager stockManager;
	
	
	public StockBuyListener(
			JTextField fieldTicker,
			JTextField fieldPrice,
			JTextField fieldPurchases,
			JTextField fieldDividend, 
			StockManager stockManager) {
		this.fieldTicker = fieldTicker;
		this.fieldPrice = fieldPrice;
		this.fieldPurchases = fieldPurchases;
		this.fieldDividend = fieldDividend;
		this.stockManager = stockManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		StockInput stock = new ITStock(StockSector.IT); 
		try {
			((Stock) stock).setTicker(fieldTicker.getText());
			stock.setBuyprice(Integer.parseInt(fieldPrice.getText()));
			stock.setPurchases(Integer.parseInt(fieldPurchases.getText()));
			stock.setDividend(Double.parseDouble(fieldDividend.getText()));
			stockManager.BuyStock(stock);
			putObject(stockManager, "stockmanager.ser");
			stock.printInfo();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(StockManager stockManager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(stockManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
