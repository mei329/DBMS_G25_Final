package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager_page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_page window = new Manager_page();
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
	public Manager_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219, 219, 178));
		frame.setBounds(100, 100, 623, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7BA1\u7406\u8005\u4ECB\u9762");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(250, 35, 100, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u8A02\u55AE\u7BA1\u7406");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Management_Order m3= new Management_Order();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(160, 260, 106, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u9ED1\u540D\u55AE\u7BA1\u7406");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Management_Blacklist m2 = new Management_Blacklist();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(160, 140, 106, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\u5EA7\u4F4D\u7BA1\u7406");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Management_Seat m4 = new Management_Seat();
				frame.setVisible(false);
			}
		});
		btnNewButton_2_1.setBounds(340, 260, 106, 48);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("\u767B\u51FA");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_page l = new Login_page();
				frame.setVisible(false);
			}
		});
		btnNewButton_3_1.setBounds(485, 31, 85, 23);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1_1 = new JButton("使用者管理");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Management_User m5 = new Management_User();
				frame.setVisible(false);
			}
		});
		btnNewButton_2_1_1.setBounds(340, 140, 106, 48);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		frame.setVisible(true);
	}
}
