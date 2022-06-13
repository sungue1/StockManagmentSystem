package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.StockBuyCancelListener;
import listeners.StockBuyListener;
import listeners.StockEditListener;
import manager.StockManager;

public class StockEdit extends JPanel {
	
	WindowFrame frame;
	StockManager stockManager;

	public StockEdit(WindowFrame frame, StockManager stockManager) {
		this.frame = frame;
		this.stockManager = stockManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelTicker = new JLabel("Ticker: ", JLabel.TRAILING);
		JTextField fieldTicker = new JTextField(10);
		labelTicker.setLabelFor(fieldTicker);
		panel.add(labelTicker);
		panel.add(fieldTicker);

		JLabel labelPrice = new JLabel("Price: ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPrice.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);

		JLabel labelPurchases = new JLabel("Purchases: ", JLabel.TRAILING);
		JTextField fieldPurchases = new JTextField(10);
		labelPurchases.setLabelFor(fieldPurchases);
		panel.add(labelPurchases);
		panel.add(fieldPurchases);

		JLabel labelDividend = new JLabel("Dividend: ", JLabel.TRAILING);
		JTextField fieldDividend = new JTextField(10);
		labelDividend.setLabelFor(fieldDividend);
		
		JButton EditButton = new JButton("Edit");
		EditButton.addActionListener(new StockEditListener(fieldTicker, fieldPrice, fieldPurchases, fieldDividend, stockManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new StockBuyCancelListener(frame));
		
		panel.add(labelDividend);
		panel.add(fieldDividend);

		panel.add(EditButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		

		this.add(panel);
		this.setVisible(true);

	}

}
