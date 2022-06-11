package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.StockBuy;
import gui.StockViewer;
import gui.WindowFrame;

public class ButtonSellListener implements ActionListener {

	WindowFrame frame;

	public ButtonSellListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getStocksell());
		frame.revalidate();
		frame.repaint();
	}

}
