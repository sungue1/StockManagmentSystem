package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class StockBuy extends JFrame {

	public StockBuy() {
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
		panel.add(labelDividend);
		panel.add(fieldDividend);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(panel);
		this.setVisible(true);

	}

}
