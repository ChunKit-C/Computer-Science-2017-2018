import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

// Chun-Kit Chung
//2/25/2018

public class FirstGUIpt2 {

	private JFrame frame;
	private JTextField txtItem;
	private JTextField description;
	private JTextField model;
	private JTextField cost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstGUIpt2 window = new FirstGUIpt2();
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
	public FirstGUIpt2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 556, 286);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 539, 55);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEinventory = new JLabel("e-Inventory");
		lblEinventory.setFont(new Font("Calibri", Font.PLAIN, 49));
		lblEinventory.setBounds(10, 0, 283, 55);
		panel.add(lblEinventory);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 55, 539, 192);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		txtItem = new JTextField();
		txtItem.setBackground(new Color(255, 255, 255));
		txtItem.setBounds(62, 11, 56, 20);
		panel_1.add(txtItem);
		txtItem.setColumns(10);
		
		JLabel lblItemNo = new JLabel("Item No:");
		lblItemNo.setBounds(10, 11, 86, 20);
		panel_1.add(lblItemNo);
		
		JLabel lblDescription = new JLabel("Item Description:");
		lblDescription.setBounds(10, 39, 101, 14);
		panel_1.add(lblDescription);
		
		description = new JTextField();
		description.setBounds(112, 36, 97, 20);
		panel_1.add(description);
		description.setColumns(10);
		
		model = new JTextField();
		model.setBounds(79, 61, 86, 20);
		panel_1.add(model);
		model.setColumns(10);
		
		JLabel lblModel = new JLabel("Item Model:");
		lblModel.setBounds(10, 64, 86, 14);
		panel_1.add(lblModel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"TV", "DVD", "PC", "Laptop"}));
		comboBox.setBounds(401, 11, 113, 20);
		panel_1.add(comboBox);
		
		JLabel lblType = new JLabel("Item Type:");
		lblType.setBounds(329, 14, 62, 14);
		panel_1.add(lblType);
		
		JLabel lblCost = new JLabel("Item Cost:");
		lblCost.setBounds(10, 89, 65, 14);
		panel_1.add(lblCost);
		
		cost = new JTextField();
		cost.setText("$0.00");
		cost.setBounds(69, 86, 86, 20);
		panel_1.add(cost);
		cost.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(10, 114, 65, 14);
		panel_1.add(lblQuantity);
		
		JCheckBox chckbxAvailable = new JCheckBox("Availability ");
		chckbxAvailable.setBounds(401, 35, 97, 23);
		panel_1.add(chckbxAvailable);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(69, 111, 49, 20);
		panel_1.add(spinner);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 151, 540, 44);
		panel_1.add(panel_2);
		panel_2.setBackground(Color.RED);
		panel_2.setLayout(null);
		
		JButton btnNewItem = new JButton("New Item");
		btnNewItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtItem.setText(""); //When the New Item Button is clicked all the controls should clear
				description.setText(""); 
				model.setText(""); 
				cost.setText(""); 
			}
		});
		btnNewItem.setBounds(10, 11, 89, 23);
		panel_2.add(btnNewItem);
		
		JButton btnNew = new JButton("Update Item");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtItem.getText()); //When the Update item Button is clicked you should display all information to the Console
				System.out.println(description.getText());
				System.out.println(model.getText());
				System.out.println(cost.getText());
			}
		});
		btnNew.setBounds(109, 11, 106, 23);
		panel_2.add(btnNew);
		
		JButton btnDeleteItem = new JButton("Delete Item");
		btnDeleteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedWriter output = null;
				try { 
				    File file = new File("itemsData.txt"); 
				     output = new BufferedWriter(new FileWriter(file));     
				           output.write(""); 
				           output.newLine();
				} //end try=
				catch ( IOException e1 ) { 



				    e1.printStackTrace(); 
				} //end catch
				finally { 
				    	if ( output != null ) { 
				       	try { 
				output.close(); 
				}//end try
				catch ( IOException e1 ) { 
				e1.printStackTrace(); 
				} //end catch
				}//end if 
				}//end finally

			}
		});
		btnDeleteItem.setBounds(225, 11, 101, 23);
		panel_2.add(btnDeleteItem);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if  (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit", "Exit!",  JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
					System.exit(0); //Opens a pop up window and asks if you want to exit the application
			}
			}
		});
		
		btnExit.setBounds(452, 11, 72, 23);
		panel_2.add(btnExit);
		
		JButton btnSaveItem = new JButton("Save Item");
		btnSaveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedWriter output = null; //button will save the item in a text file 
				try { 
				    File file = new File("itemsData.txt"); 
				     output = new BufferedWriter(new FileWriter(file, true));     
				           output.write(txtItem.getText() + ":" + description.getText() + ":" + model.getText() + ":" + cost.getText() + ":"); 
				           output.newLine();
				} //end try=
				catch ( IOException e1 ) { 



				    e1.printStackTrace(); 
				} //end catch
				finally { 
				    	if ( output != null ) { 
				       	try { 
				output.close(); 
				}//end try
				catch ( IOException e1 ) { 
				e1.printStackTrace(); 
				} //end catch
				}//end if 
				}//end finally

			}
		});
		btnSaveItem.setBounds(336, 11, 106, 23);
		panel_2.add(btnSaveItem);
	}
}
