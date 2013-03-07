package coetura;

import java.awt.EventQueue;

public class Game {
	//static GameGUI window;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameGUI window = new GameGUI();
					window.frmCoetura.setVisible(true);
					window.hideAllChoiceButtons();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
