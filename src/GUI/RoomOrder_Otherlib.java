package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class RoomOrder_Otherlib {

	private JFrame frame;
	private long id;
	private String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomOrder_Otherlib window = new RoomOrder_Otherlib(109405094,"name");
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
	public RoomOrder_Otherlib(long id, String name) {
		this.id = id;
		this.name = name;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219,219,178));
		frame.setBounds(100, 100, 656, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("歡迎 "+id+" "+name);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(468, 32, 151, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(451, 57, 85, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_page login = new Login_page();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(534, 57, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Room_page book = new Room_page(id);
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(115,121,59));
		btnNewButton.setBounds(26, 57, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel(" \u4E2D\u6B63\u5716\u66F8\u9928/\u5546\u5716/\u7D9C\u5716");
		lblNewLabel.setForeground(new Color(115,121,59));
		lblNewLabel.setFont(new Font("Tsukushi A Round Gothic", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(196, 44, 221, 78);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u7814\u7A76\u5C0F\u9593");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_1.setForeground(new Color(115,121,59));
		btnNewButton_1.setBounds(122, 190, 126, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u96C6\u601D\u5C0F\u9593");
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_1_1.setForeground(new Color(115,121,59));
		btnNewButton_1_1.setBounds(372, 190, 132, 49);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("\u5546\u5716\u7814\u8A0E\u5BA4");
		btnNewButton_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_1_2.setForeground(new Color(115,121,59));
		btnNewButton_1_2.setBounds(122, 310, 126, 49);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("\u7D9C\u5716\u7814\u8A0E\u5BA4");
		btnNewButton_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_1_3.setForeground(new Color(115,121,59));
		btnNewButton_1_3.setBounds(372, 310, 132, 49);
		frame.getContentPane().add(btnNewButton_1_3);
		
		frame.setVisible(true);
	}

}
