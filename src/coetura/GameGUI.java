package coetura;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;

public class GameGUI {

	JFrame frmCoetura;
	List<JButton> choiceButtons = new ArrayList<JButton>();
	JTextPane mainText;

	/**
	 * Create the application.
	 */
	public GameGUI() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frmCoetura = new JFrame();
		frmCoetura.setMinimumSize(new Dimension(1024, 620));
		frmCoetura.setResizable(false);
		frmCoetura.setTitle("Coetura");
		frmCoetura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCoetura.getContentPane().setLayout(
				new MigLayout("", "[18.62%,grow][544.00px,grow][23.95%,grow]",
						"[5.09%,grow,fill][68.08%,grow][108.00px,grow]"));

		JPanel toolsAndData = new JPanel();
		toolsAndData.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null,
				null));
		frmCoetura.getContentPane().add(toolsAndData, "cell 0 0 3 1,grow");

		JButton saveButton = new JButton("Save Game");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.saveGame();
			}
		});
		toolsAndData.setLayout(new MigLayout("",
				"[87px][85px][64.68%][89px][]", "[39px]"));
		toolsAndData.add(saveButton, "cell 0 0,alignx center,growy");

		JButton BtnLoadGame = new JButton("Load Game");
		toolsAndData.add(BtnLoadGame, "cell 1 0,alignx center,growy");
		BtnLoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.loadGame();
			}
		});

		JButton btnNewGame = new JButton("New Game");
		toolsAndData.add(btnNewGame, "cell 3 0,alignx center,growy");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.newGame();
			}
		});

		JButton btnOptions = new JButton("Options");
		toolsAndData.add(btnOptions, "cell 4 0,growy");
		btnOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.options();
			}
		});

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		frmCoetura.getContentPane().add(panel_2, "cell 0 1,grow");
		panel_2.setLayout(new BorderLayout(0, 0));

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		panel_2.add(textPane_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		frmCoetura.getContentPane().add(panel_3, "cell 1 1,grow");
		panel_3.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane, BorderLayout.CENTER);

		mainText = new JTextPane();
		mainText.setEditable(false);
		scrollPane.setViewportView(mainText);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		frmCoetura.getContentPane().add(panel, "cell 2 1 1 2,grow");
		panel.setLayout(new MigLayout("", "[grow]",
				"[21.24%,grow][60.90%,grow]"));

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.add(panel_4, "cell 0 0,grow");
		panel_4.setLayout(new MigLayout("", "[50%,fill][50%,fill]",
				"[25%,fill][25%,fill][25%,fill][25%,fill]"));

		JButton btnApperance = new JButton("Appearance");
		panel_4.add(btnApperance, "cell 0 0");

		JButton btnStats = new JButton("Stats");
		panel_4.add(btnStats, "cell 1 0");

		JButton btnInventory = new JButton("Inventory");
		panel_4.add(btnInventory, "cell 0 1");

		JButton btnLevels = new JButton("Levels");
		panel_4.add(btnLevels, "cell 1 1");

		JButton btnStatusEffects = new JButton("Status Effects");
		panel_4.add(btnStatusEffects, "cell 0 2");

		JButton button_10 = new JButton("");
		button_10.setEnabled(false);
		panel_4.add(button_10, "cell 1 2");

		JButton button_5 = new JButton("");
		button_5.setEnabled(false);
		panel_4.add(button_5, "cell 0 3");

		JButton btnCredit = new JButton("Credit");
		panel_4.add(btnCredit, "cell 1 3");

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.add(panel_7, "cell 0 1,grow");
		panel_7.setLayout(new BorderLayout(0, 0));

		JTextArea textArea = new JTextArea();
		panel_7.add(textArea);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		frmCoetura.getContentPane().add(panel_6, "cell 0 2,grow");
		panel_6.setLayout(new BorderLayout(0, 0));

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		panel_6.add(textPane_2);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		frmCoetura.getContentPane().add(panel_5, "cell 1 2,alignx left,growy");
		panel_5.setLayout(new MigLayout("", "[][][][][]",
				"[33.3%,fill][33.3%,fill][33.3%,fill]"));

		JButton choice00 = new JButton("New button");
		panel_5.add(choice00, "cell 0 0");
		choiceButtons.add(choice00);

		JButton choice01 = new JButton("New button");
		panel_5.add(choice01, "cell 1 0");
		choiceButtons.add(choice01);

		JButton choice02 = new JButton("New button");
		panel_5.add(choice02, "cell 2 0");
		choiceButtons.add(choice02);

		JButton choice03 = new JButton("New button");
		panel_5.add(choice03, "cell 3 0");
		choiceButtons.add(choice03);

		JButton choice04 = new JButton("New button");
		panel_5.add(choice04, "cell 4 0");
		choiceButtons.add(choice04);

		JButton choice05 = new JButton("New button");
		panel_5.add(choice05, "cell 5 0");
		choiceButtons.add(choice05);

		JButton choice10 = new JButton("New button");
		panel_5.add(choice10, "cell 0 1");
		choiceButtons.add(choice10);

		JButton choice11 = new JButton("New button");
		panel_5.add(choice11, "cell 1 1");
		choiceButtons.add(choice11);

		JButton choice12 = new JButton("New button");
		panel_5.add(choice12, "cell 2 1");
		choiceButtons.add(choice12);

		JButton choice13 = new JButton("New button");
		panel_5.add(choice13, "cell 3 1");
		choiceButtons.add(choice13);

		JButton choice14 = new JButton("New button");
		panel_5.add(choice14, "cell 4 1");
		choiceButtons.add(choice14);

		JButton choice15 = new JButton("New button");
		panel_5.add(choice15, "cell 5 1");
		choiceButtons.add(choice15);

		JButton choice20 = new JButton("New button");
		panel_5.add(choice20, "cell 0 2");
		choiceButtons.add(choice20);

		JButton choice21 = new JButton("New button");
		panel_5.add(choice21, "cell 1 2");
		choiceButtons.add(choice21);

		JButton choice22 = new JButton("New button");
		panel_5.add(choice22, "cell 2 2");
		choiceButtons.add(choice22);

		JButton choice23 = new JButton("New button");
		panel_5.add(choice23, "cell 3 2");
		choiceButtons.add(choice23);

		JButton choice24 = new JButton("New button");
		panel_5.add(choice24, "cell 4 2");
		choiceButtons.add(choice24);

		JButton choice25 = new JButton("New button");
		panel_5.add(choice25, "cell 5 2");
		choiceButtons.add(choice25);

	}
}
