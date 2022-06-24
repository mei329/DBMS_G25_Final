package GUI;

import Entity.User;
import Entity.ConnectDb;

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Login_page extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	ConnectDb conn;
	Statement stat;
	private User user = new User();
	private long id;
	private boolean isUser = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_page window = new Login_page();
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
	public Login_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219, 219, 178));
		frame.setBackground(new Color(255, 228, 225));
		frame.setForeground(new Color(255, 228, 225));
		frame.getContentPane().setForeground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel title = new JLabel("使用者登入(UserLogin)");
		title.setFont(new Font("PT Sans", Font.PLAIN, 16));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setForeground(new Color(66, 66, 28));
		title.setBounds(110, 25, 216, 51);
		frame.getContentPane().add(title);

		JLabel lblNewLabel_1 = new JLabel("帳號：");
		lblNewLabel_1.setForeground(new Color(115, 121, 59));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(110, 95, 50, 20);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(204, 95, 110, 21);
		frame.getContentPane().add(textField);

		textField_1 = new JTextField();
		textField_1.setBounds(204, 145, 110, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("密碼：");
		lblNewLabel_2.setForeground(new Color(115, 121, 59));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(110, 145, 50, 20);
		frame.getContentPane().add(lblNewLabel_2);

		JButton enter = new JButton("\u767B\u5165");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank() || !textField_1.getText().isBlank()) {
					id = Long.parseLong(textField.getText());
					String psswrd = textField_1.getText();

					if (isUser) {
						// user login page
						if (user.userLogin(id, psswrd)) {
							System.out.println("Successfully login.");
							Home_page booking_instance = new Home_page(id);
							frame.setVisible(false);
						} else {
							JOptionPane.showMessageDialog(frame, "帳號/密碼錯誤!", "Error", JOptionPane.WARNING_MESSAGE);
						}
					} else {
						// manager login page
						if (user.managerLogin(id, psswrd)) {
							System.out.println("Successfully login.");
							Manager_page m1 = new Manager_page();
							frame.setVisible(false);
						} else {
							JOptionPane.showMessageDialog(frame, "帳號/密碼錯誤!", "Error", JOptionPane.WARNING_MESSAGE);
						}
					}
				} else {
					JOptionPane.showMessageDialog(frame, "帳號/密碼空白!", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		enter.setForeground(new Color(115, 121, 59));
		enter.setBackground(new Color(238, 232, 170));
		enter.setBounds(170, 192, 85, 23);
		frame.getContentPane().add(enter);

		JButton mngrLogin = new JButton("<html><u>管理者登入</u></html>");
		mngrLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isUser) {
					// 轉成管理者登入畫面
					isUser = false;
					title.setText("管理者登入(MngrLogin)");
					mngrLogin.setText("<html><u>使用者登入</u></html>");
					textField.setText(null);
					textField_1.setText(null);
				} else {
					// 轉成使用者登入畫面
					isUser = true;
					title.setText("使用者登入(UserLogin)");
					mngrLogin.setText("<html><u>管理者登入</u></html>");
					textField.setText(null);
					textField_1.setText(null);
				}
			}
		});
		mngrLogin.setFont(new Font("Dialog", Font.BOLD, 14));
		mngrLogin.setForeground(Color.GRAY);
		mngrLogin.setBorder(null);
		mngrLogin.setContentAreaFilled(false);
		mngrLogin.setBounds(170, 220, 85, 23);
		frame.getContentPane().add(mngrLogin);

		frame.setVisible(true);
	}
}