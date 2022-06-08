import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class Study_location_3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private Color background = new Color(219,219,178);
	private Color btncolor = new Color(115,121,59);
	private Color word = new Color(66,66,28);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study_location_3 window = new Study_location_3();
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
	public Study_location_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(background);
		frame.setBounds(100, 100, 960, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u9996\u9801");
		btnNewButton_1.setBounds(34, 42, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_3.setBounds(141, 186, 141, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_4.setBounds(141, 340, 141, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u501F\u7528\u7D00\u9304");
		btnNewButton_5.setBounds(402, 125, 108, 38);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("A\u5340");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(413, 89, 78, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u4F7F\u7528\u72C0\u614B");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(414, 274, 77, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(334, 321, 96, 21);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(465, 321, 96, 21);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("\u4FDD\u7559");
		btnNewButton.setBounds(662, 196, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("\u7E8C\u501F");
		btnNewButton_2.setBounds(662, 257, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("\u4FEE\u6539");
		btnNewButton_6.setBounds(662, 319, 85, 23);
		frame.getContentPane().add(btnNewButton_6);
	}
}