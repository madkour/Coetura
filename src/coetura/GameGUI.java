package coetura;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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

public class GameGUI {

	JFrame frmCoetura;
	private List<JButton> choiceButtons = new ArrayList<JButton>();

	public void hideAllChoiceButtons(){
		for(JButton b : choiceButtons){
			b.setVisible(false);
		}
	}
	
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
		frmCoetura.getContentPane().setLayout(new MigLayout("", "[18.62%,grow][544.00px,grow][23.95%,grow]", "[5.09%,grow,fill][68.08%,grow][108.00px,grow]"));
		
		JPanel toolsAndData = new JPanel();
		frmCoetura.getContentPane().add(toolsAndData, "cell 0 0 3 1,grow");
		
		JButton saveButton = new JButton("Save Game");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolsAndData.setLayout(new MigLayout("", "[87px][85px][64.68%][89px][]", "[39px]"));
		toolsAndData.add(saveButton, "cell 0 0,alignx center,growy");
		
		JButton loadButton = new JButton("Load Game");
		toolsAndData.add(loadButton, "cell 1 0,alignx center,growy");
		
		JButton button_25 = new JButton("New Game");
		toolsAndData.add(button_25, "cell 3 0,alignx center,growy");
		
		JButton button_26 = new JButton("Options");
		toolsAndData.add(button_26, "cell 4 0,growy");
		
		JPanel panel_2 = new JPanel();
		frmCoetura.getContentPane().add(panel_2, "cell 0 1,grow");
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		panel_2.add(textPane_1);
		
		JPanel panel_3 = new JPanel();
		frmCoetura.getContentPane().add(panel_3, "cell 1 1,grow");
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		panel_3.add(textPane);
		
		JPanel panel = new JPanel();
		frmCoetura.getContentPane().add(panel, "cell 2 1 1 2,grow");
		panel.setLayout(new MigLayout("", "[grow]", "[21.24%,grow][60.90%,grow]"));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4, "cell 0 0,grow");
		panel_4.setLayout(new MigLayout("", "[50%,fill][50%,fill]", "[25%,fill][25%,fill][25%,fill][25%,fill]"));
		
		JButton button_6 = new JButton("New button");
		panel_4.add(button_6, "cell 0 0");
		
		JButton button_8 = new JButton("New button");
		panel_4.add(button_8, "cell 1 0");
		
		JButton button_9 = new JButton("New button");
		panel_4.add(button_9, "cell 0 1");
		
		JButton button_11 = new JButton("New button");
		panel_4.add(button_11, "cell 1 1");
		
		JButton button_12 = new JButton("New button");
		panel_4.add(button_12, "cell 0 2");
		
		JButton button_10 = new JButton("New button");
		panel_4.add(button_10, "cell 1 2");
		
		JButton button_5 = new JButton("New button");
		panel_4.add(button_5, "cell 0 3");
		
		JButton button_7 = new JButton("New button");
		panel_4.add(button_7, "cell 1 3");
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7, "cell 0 1,grow");
		panel_7.setLayout(new CardLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8, "name_111293060566106");
		
		JPanel panel_6 = new JPanel();
		frmCoetura.getContentPane().add(panel_6, "cell 0 2,grow");
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		panel_6.add(textPane_2);
		
		JPanel panel_5 = new JPanel();
		frmCoetura.getContentPane().add(panel_5, "cell 1 2,alignx left,growy");
		panel_5.setLayout(new MigLayout("", "[][][][][]", "[33.3%,fill][33.3%,fill][33.3%,fill]"));
		
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
