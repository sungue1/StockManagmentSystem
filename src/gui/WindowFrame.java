package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.StockManager;

public class WindowFrame extends JFrame {

	StockManager stockManager;
	MenuSelection menuselection;
	StockBuy stockbuy;
	StockViewer stockviewer;
	

	public WindowFrame(StockManager stockManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.stockManager = stockManager;
		menuselection = new MenuSelection(this);
		stockbuy = new StockBuy(this);
		stockviewer = new StockViewer(this, this.stockManager);

		this.setupPanel(menuselection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public StockBuy getStockbuy() {
		return stockbuy;
	}

	public void setStockbuy(StockBuy stockbuy) {
		this.stockbuy = stockbuy;
	}

	public StockViewer getStockviewer() {
		return stockviewer;
	}

	public void setStockviewer(StockViewer stockviewer) {
		this.stockviewer = stockviewer;
	}

}
