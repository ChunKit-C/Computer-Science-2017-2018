//Name: Chun-Kit Chung
//Date: 03/09/2018
//Version: 1.0
//Description: A game that can "predict" your age

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Birthdaygame { static float birthdaynum = 0; static int day = 0; static int month = 0;

	private JFrame frmFrame;
	private JTextField txtBDAYNUM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Birthdaygame window = new Birthdaygame();
					window.frmFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Birthdaygame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFrame = new JFrame();
		frmFrame.getContentPane().setBackground(Color.BLUE);
		frmFrame.setBackground(Color.DARK_GRAY);
		frmFrame.setBounds(100, 100, 730, 416);
		frmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFrame.getContentPane().setLayout(null);
		
		JTextArea txtInstructions = new JTextArea();
		txtInstructions.setFont(new Font("Cambria", Font.PLAIN, 17)); //Instructions
		txtInstructions.setText("Instructions:\r\n 1-Determine your birth month (January = 1, February = 2 \u2026.)\r\n 2-Multiply that number by 5\r\n 3-Add 6 to that number\r\n 4-Multiply the number by 4\r\n 5-Add 9 to the number \r\n 6-Multiply that number by 5\r\n 7-Add your birthday to the number (10 if born on the 10th and so on)\r\n");
		txtInstructions.setRows(8);
		txtInstructions.setBounds(92, 94, 552, 182);
		frmFrame.getContentPane().add(txtInstructions);
		
		txtBDAYNUM = new JTextField(); // where to put in your number
		txtBDAYNUM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBDAYNUM.setBounds(374, 287, 86, 28);
		frmFrame.getContentPane().add(txtBDAYNUM);
		txtBDAYNUM.setColumns(10);
		
		JLabel lblEnter = new JLabel("Enter your birthday number");
		lblEnter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnter.setForeground(Color.WHITE);
		lblEnter.setBounds(154, 287, 210, 28);
		frmFrame.getContentPane().add(lblEnter);
		
		JLabel lblYourBirthday = new JLabel("");
		lblYourBirthday.setForeground(Color.WHITE);
		lblYourBirthday.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblYourBirthday.setBounds(184, 326, 420, 28);
		frmFrame.getContentPane().add(lblYourBirthday);
		
		JButton btnGetBirthday = new JButton("Get birthday date "); //The button which begins the process and finds the month and day
		btnGetBirthday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { birthdaynum = Integer.parseInt(txtBDAYNUM.getText());
			birthdaynum-=165;
			birthdaynum/=100;
			month = (int) birthdaynum;
			
			birthdaynum = Integer.parseInt(txtBDAYNUM.getText());
			birthdaynum-=165;
			birthdaynum%= 100;
			day = (int)birthdaynum;
			
			lblYourBirthday.setText("Your birth month is " + month +" and your birth day is "+ day);
			}

			});
		btnGetBirthday.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGetBirthday.setBounds(486, 291, 158, 23);
		frmFrame.getContentPane().add(btnGetBirthday);
		
		JLabel lblBirthdayGame = new JLabel("Birthday Game");
		lblBirthdayGame.setFont(new Font("Cambria", Font.PLAIN, 35));
		lblBirthdayGame.setBounds(242, 41, 231, 42);
		frmFrame.getContentPane().add(lblBirthdayGame);
		
		JLabel lblLblpicture = new JLabel("");
		lblLblpicture.setIcon(new ImageIcon(Birthdaygame.class.getResource("/image/Webp.net-resizeimage (1).png")));
		lblLblpicture.setBounds(165, -5, 81, 101);
		frmFrame.getContentPane().add(lblLblpicture);
		
		JLabel lblLit = new JLabel("");
		lblLit.setIcon(new ImageIcon(Birthdaygame.class.getResource("/image/Webp.net-resizeimage (1).png")));
		lblLit.setBounds(463, -5, 86, 96);
		frmFrame.getContentPane().add(lblLit);
		
		
	} //end main
} //end class
