package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.StockBuyCancelListener;
import listeners.StockBuyListener;
import listeners.StockSellListener;
import manager.StockManager;

public class StockSell extends JPanel {
	
	WindowFrame frame;
	StockManager stockManager;

	public StockSell(WindowFrame frame, StockManager stockManager) {
		this.frame = frame;
		this.stockManager = stockManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelTicker = new JLabel("Ticker: ", JLabel.TRAILING);
		JTextField fieldTicker = new JTextField(10);
		labelTicker.setLabelFor(fieldTicker);
		panel.add(labelTicker);
		panel.add(fieldTicker);

		JLabel labelPurchases = new JLabel("Purchases: ", JLabel.TRAILING);
		JTextField fieldPurchases = new JTextField(10);
		labelPurchases.setLabelFor(fieldPurchases);
		panel.add(labelPurchases);
		panel.add(fieldPurchases);
		
		JButton saveButton = new JButton("sell");
		saveButton.addActionListener(new StockSellListener(fieldTicker, fieldPurchases, stockManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new StockBuyCancelListener(frame));

		panel.add(saveButton);	
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		

		this.add(panel);
		this.setVisible(true);

	}

}
