package coetura;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Game {
	static GameGUI window;
	String nl = "\n";

	public Game() {

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new GameGUI();
					window.frmCoetura.setVisible(true);
					hideAllChoiceButtons();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Text Control
	public static void clearMain() {
		window.mainText.setText("");
	}

	public static void rewriteMain(String t) {
		window.mainText.setText(t);
	}

	public static void writeMain(String t) {
		window.mainText.setText(window.mainText.getText() + t);
	}

	public static void writelnMain(String t) {
		String ot = window.mainText.getText();

		if (ot.length() == 0) {
			window.mainText.setText(t);
		} else {
			window.mainText.setText(ot + "\n" + t);
		}

	}

	// Button Methods
	public static void hideAllChoiceButtons() {
		for (JButton b : window.choiceButtons) {
			b.setVisible(false);
		}
	}

	public static void newGame() {
		int option = JOptionPane.showConfirmDialog(null,
				"Start new game? This will delete any unsaved data.");
		if (option == JOptionPane.NO_OPTION
				|| option == JOptionPane.CANCEL_OPTION) {
			Game.writelnMain("New Game cancelled.");
		} else if (option == JOptionPane.YES_OPTION) {
			hideAllChoiceButtons();
			writelnMain("New Game");
		}

	}

	public static void options() {
		hideAllChoiceButtons();
		writelnMain("Options: This is not implemented yet.");
	}

	public static void saveGame() {
		hideAllChoiceButtons();
		writelnMain("Save Game: This is not implemented yet.");
	}

	public static void loadGame() {
		hideAllChoiceButtons();
		writelnMain("Load Game:This is not implemented yet.");
	}

}
