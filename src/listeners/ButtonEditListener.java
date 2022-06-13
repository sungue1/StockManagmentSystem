package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class ButtonEditListener implements ActionListener {

	WindowFrame frame;

	public ButtonEditListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getStockedit());
		frame.revalidate();
		frame.repaint();
	}
}
