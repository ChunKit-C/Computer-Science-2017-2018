import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;

// Chun-Kit Chung
// 2/23/2018

public class ChungFirstGUI {

	private JFrame frmGUI;
	private JComboBox comboBox;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChungFirstGUI window = new ChungFirstGUI();
					window.frmGUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChungFirstGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGUI = new JFrame();
		frmGUI.getContentPane().setBackground(Color.DARK_GRAY);
		frmGUI.setBounds(100, 100, 560, 353);
		frmGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGUI.getContentPane().setLayout(null);
		
		JTextArea txtrMyFirstText = new JTextArea();
		txtrMyFirstText.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtrMyFirstText.setForeground(Color.BLUE);
		txtrMyFirstText.setText("My First Text Box");
		txtrMyFirstText.setBounds(4, 72, 108, 22);
		frmGUI.getContentPane().add(txtrMyFirstText);
		
		
		JButton btnClickMe = new JButton("Click me");
		btnClickMe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrMyFirstText.setText("Hello World"); 	//Program displays Hello world in the console screen
			}
		});
		btnClickMe.setBounds(4, 33, 89, 23);
		frmGUI.getContentPane().add(btnClickMe);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);		//Program will close when this button is clicked
			}
		});
		btnExit.setBounds(455, 289, 89, 23);
		frmGUI.getContentPane().add(btnExit);
		
		JLabel lblFirstLabel = new JLabel("First Label");
		lblFirstLabel.setForeground(Color.WHITE);
		lblFirstLabel.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblFirstLabel.setBounds(0, 0, 141, 36);
		frmGUI.getContentPane().add(lblFirstLabel);
		
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador", "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan", "Yukon"}));
		comboBox.setSelectedIndex(9);
		comboBox.setBounds(4, 253, 186, 28);
		frmGUI.getContentPane().add(comboBox);
		
		JTextArea txtrProvinces = new JTextArea();
		txtrProvinces.setText("Provinces");
		txtrProvinces.setBounds(4, 220, 76, 22);
		frmGUI.getContentPane().add(txtrProvinces);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Computer Science");
		chckbxNewCheckBox.setBounds(0, 115, 141, 23);
		frmGUI.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Computer Engineering");
		chckbxNewCheckBox_1.setBounds(0, 152, 158, 23);
		frmGUI.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Computer Animation");
		chckbxNewCheckBox_2.setBounds(0, 190, 141, 23);
		frmGUI.getContentPane().add(chckbxNewCheckBox_2);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("On/Off");
		tglbtnNewToggleButton.setBounds(468, 256, 76, 23);
		frmGUI.getContentPane().add(tglbtnNewToggleButton);
		
		JLabel lblLblpicture = new JLabel("lblPicture");
		lblLblpicture.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\Screenshots\\Screenshot (7).png"));
		lblLblpicture.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblLblpicture.setForeground(Color.WHITE);
		lblLblpicture.setBackground(Color.WHITE);
		lblLblpicture.setBounds(287, 0, 257, 258);
		frmGUI.getContentPane().add(lblLblpicture);
		
		JButton btnChangeText = new JButton("Change Text");
		btnChangeText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblFirstLabel.setText(  txtrMyFirstText.getText()  );
			}
		});
		btnChangeText.setBounds(169, 21, 108, 23);
		frmGUI.getContentPane().add(btnChangeText);
		
		JButton btnClearText = new JButton("Clear Text");
		btnClearText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtrMyFirstText.setText("");  //When the button is clicked the program should clear the text from the text field
			}
		});
		btnClearText.setBounds(169, 71, 108, 23);
		frmGUI.getContentPane().add(btnClearText);
		
		JButton btnHide = new JButton("Hide");
		btnHide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblLblpicture.setVisible(false);  //When the button Hide is clicked the Label with image should disappear
			}
		});
		btnHide.setBounds(183, 126, 89, 23);
		frmGUI.getContentPane().add(btnHide);
		
		JButton btnShow = new JButton("Show"); 
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblLblpicture.setVisible(true);  //When the button Show is clicked the Label with image should reappear
			}
		});
		btnShow.setBounds(183, 171, 89, 23);
		frmGUI.getContentPane().add(btnShow);
	}
	public ComboBoxModel getComboBoxModel() {
		return comboBox.getModel();
	}
	public void setComboBoxModel(ComboBoxModel model) {
		comboBox.setModel(model);
	}
}
