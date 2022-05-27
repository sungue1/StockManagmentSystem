package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StockViewer extends JFrame {

	public StockViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Ticker");
		model.addColumn("Price");
		model.addColumn("Purchases");
		model.addColumn("Dividend");

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}
}
