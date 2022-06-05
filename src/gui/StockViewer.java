package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.StockManager;
import stock.StockInput;

public class StockViewer extends JPanel {
	
	WindowFrame frame;
	
	StockManager stockManager;

	public StockViewer(WindowFrame frame, StockManager stockManager) {
		this.frame = frame;
		this.stockManager = stockManager;
		
		System.out.println("***" + stockManager.size() + "***");
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Ticker");
		model.addColumn("Price");
		model.addColumn("Purchases");
		model.addColumn("Dividend");
		
		for(int i = 0; i < stockManager.size(); i ++) {
			Vector row = new Vector();
			StockInput si= stockManager.get(i);
			row.add(si.getTicker());
			row.add(si.getBuyprice());
			row.add(si.getPurchases());
			row.add(si.getDividend());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);

	}
}
