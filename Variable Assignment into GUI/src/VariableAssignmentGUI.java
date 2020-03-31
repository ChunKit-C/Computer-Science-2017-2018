import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;


// Author: Chun-Kit Chung
// Date: 3/04/2018


public class VariableAssignmentGUI {
   private double Area = 0;
   private double Perimeter = 0;
   private JFrame frame;
   NumberFormat nfc = NumberFormat.getCurrencyInstance();
   NumberFormat nf = NumberFormat.getInstance();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VariableAssignmentGUI window = new VariableAssignmentGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VariableAssignmentGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 701, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(467, 2, 228, 412);
		frame.getContentPane().add(panel_2);
		panel_2.setBackground(Color.CYAN);
		panel_2.setLayout(null);
		
		JLabel lblTaxesCalculator = new JLabel("Taxes Calculator");
		lblTaxesCalculator.setForeground(Color.BLACK);
		lblTaxesCalculator.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblTaxesCalculator.setBounds(10, 11, 208, 27);
		panel_2.add(lblTaxesCalculator);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setBounds(10, 80, 46, 14);
		panel_2.add(lblSubtotal);
		
		JLabel lblHst = new JLabel("HST (13%)");
		lblHst.setBounds(10, 117, 57, 14);
		panel_2.add(lblHst);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 154, 46, 14);
		panel_2.add(lblTotal);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(77, 117, 46, 14);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(55, 154, 46, 14);
		panel_2.add(label_2);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setText("$0.00");
		textArea_4.setBounds(66, 75, 57, 22);
		panel_2.add(textArea_4);
		
		JButton btnCalculateTotal = new JButton("Calculate Total");
		btnCalculateTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		nf.setMaximumFractionDigits(3);
			    
		float subtotal = Float.parseFloat(textArea_4.getText());   
		float HST = subtotal * 0.13f; // Calculates HST for the subtotal
		float total = subtotal + HST; // Calculates the total adding the subtotal and HST
			   
		label_1.setText(nfc.format(HST));   
		label_2.setText(nfc.format(total));  
			
			}
		});
		btnCalculateTotal.setBounds(10, 179, 120, 23);
		panel_2.add(btnCalculateTotal);
		
		JPanel panel = new JPanel();
		panel.setBounds(229, 2, 228, 411);
		frame.getContentPane().add(panel);
		panel.setBackground(Color.RED);
		panel.setLayout(null);
		
		JLabel lblKeyToAscii = new JLabel("Key to ASCII");
		lblKeyToAscii.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblKeyToAscii.setForeground(Color.WHITE);
		lblKeyToAscii.setBounds(42, 11, 176, 27);
		panel.add(lblKeyToAscii);
		
		JLabel lblEnterANumber = new JLabel("Enter a number between 33 and 255:");
		lblEnterANumber.setForeground(Color.WHITE);
		lblEnterANumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterANumber.setBounds(10, 49, 218, 14);
		panel.add(lblEnterANumber);
		
		JTextArea txtrEnterValue = new JTextArea();
		txtrEnterValue.setText("Enter value");
		txtrEnterValue.setBounds(10, 74, 141, 22);
		panel.add(txtrEnterValue);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(10, 166, 208, 22);
		panel.add(textArea_2);		
		
		JButton btnGetAsciiNumber = new JButton("Get ASCII Number");
		btnGetAsciiNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		int i = Integer.parseInt(txtrEnterValue.getText()); 
		String S;
		S=new Character((char)i).toString();  
		textArea_2.setText("The ASCII Code for " + i + " is " + S); // Equation to convert numbers to ASCII code
				
			}
		});
		btnGetAsciiNumber.setBounds(10, 107, 134, 23);
		panel.add(btnGetAsciiNumber);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setForeground(Color.WHITE);
		lblResult.setBounds(10, 141, 46, 14);
		panel.add(lblResult);
		
		JLabel lblAsciiToKey = new JLabel("ASCII to Key");
		lblAsciiToKey.setForeground(Color.WHITE);
		lblAsciiToKey.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblAsciiToKey.setBounds(42, 199, 176, 27);
		panel.add(lblAsciiToKey);
		
		JLabel lblTypeACharactersymbol = new JLabel("Type a character/Symbol:");
		lblTypeACharactersymbol.setForeground(Color.WHITE);
		lblTypeACharactersymbol.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTypeACharactersymbol.setBounds(10, 228, 218, 14);
		panel.add(lblTypeACharactersymbol);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("Enter value");
		textArea_1.setBounds(10, 253, 141, 22);
		panel.add(textArea_1);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(10, 320, 208, 22);
		panel.add(textArea_3);
		
		JButton btnGetAsciiCharacter = new JButton("Get ASCII Character");
		btnGetAsciiCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		String str = textArea_1.getText();
		int R = (int) str.charAt (0); 
		textArea_3.setText("The ASCII Code for Character " + str.charAt (0) + " is " + R); // Equation to convert letters to ASCII code
			}
		});
		btnGetAsciiCharacter.setBounds(10, 286, 149, 23);
		panel.add(btnGetAsciiCharacter);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 1, 228, 409);
		frame.getContentPane().add(panel_1);
		panel_1.setBackground(Color.YELLOW);
		panel_1.setLayout(null);
		
		JLabel lblAreaAndPerimeter = new JLabel("Area and Perimeter Calculator");
		lblAreaAndPerimeter.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblAreaAndPerimeter.setBounds(10, 11, 208, 20);
		panel_1.add(lblAreaAndPerimeter);
		
		JLabel lblLength = new JLabel("Length:");
		lblLength.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblLength.setBounds(10, 43, 49, 14);
		panel_1.add(lblLength);
		
		JLabel lblWidth = new JLabel("Width:");
		lblWidth.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblWidth.setBounds(10, 79, 46, 14);
		panel_1.add(lblWidth);
		
		JTextArea txtrEnter = new JTextArea();
		txtrEnter.setText("Enter value");
		txtrEnter.setBounds(65, 42, 92, 22);
		panel_1.add(txtrEnter);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("Enter value");
		textArea.setBounds(65, 75, 92, 22);
		panel_1.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"mm", "cm", "m"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(108, 108, 49, 20);
		panel_1.add(comboBox);
		
		JLabel lblUnitOfMeasure = new JLabel("Unit of measure:");
		lblUnitOfMeasure.setBounds(10, 109, 107, 14);
		panel_1.add(lblUnitOfMeasure);
		
		JTextArea txtResult = new JTextArea();
		txtResult.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtResult.setBounds(10, 216, 208, 22);
		panel_1.add(txtResult);
		
		
		JButton btnArea = new JButton("Area");
		btnArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Length = Integer.parseInt(txtrEnter.getText());
				int Width = Integer.parseInt(textArea.getText());
				
				Area = (Length*Width); // Equation for area
				txtResult.setText("Your Area is: "+ Area + comboBox.getSelectedItem()); // Inputs the calculated area in text box
				
			}
		});
		btnArea.setBounds(10, 149, 89, 23);
		panel_1.add(btnArea);
		
		JButton btnPerimeter = new JButton("Perimeter");
		btnPerimeter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Length = Integer.parseInt(txtrEnter.getText());
				int Width = Integer.parseInt(textArea.getText());
				
				Perimeter = (2*Length + 2*Width); // Equation for perimeter
				txtResult.setText("Your Perimeter is: "+ Perimeter + comboBox.getSelectedItem()); // Inputs the calculated perimeter in text box
			}
		});
		btnPerimeter.setBounds(118, 149, 100, 23);
		panel_1.add(btnPerimeter);
		
		
		JLabel lblReseult = new JLabel("Result:");
		lblReseult.setBounds(13, 191, 46, 14);
		panel_1.add(lblReseult);
	}
}
