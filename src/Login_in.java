import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class Login_in extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	ConnectDb conn;
	Statement stat;
	private User user = new User();
	private long id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_in window = new Login_in();
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
	public Login_in() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219,219,178));
		frame.setBackground(new Color(255, 228, 225));
		frame.setForeground(new Color(255, 228, 225));
		frame.getContentPane().setForeground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u4F7F\u7528\u8005\u767B\u5165(Login in)");
		lblNewLabel.setFont(new Font("PT Sans", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(66,66,28));
		lblNewLabel.setBounds(103, 25, 216, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u4F7F\u7528\u8005\u5E33\u865F\uFF1A");
		lblNewLabel_1.setForeground(new Color(115,121,59));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(99, 87, 98, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(209, 94, 110, 21);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 151, 110, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u4F7F\u7528\u8005\u5BC6\u78BC\uFF1A");
		lblNewLabel_2.setForeground(new Color(115,121,59));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(103, 151, 94, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\u767B\u5165");
		btnNewButton.setForeground(new Color(115,121,59));
		btnNewButton.setBackground(new Color(238, 232, 170));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = Long.parseLong(textField.getText());
				Booking_page booking_instance = new Booking_page(id);
				booking_instance.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(171, 212, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		frame.setVisible(true);
	}
}