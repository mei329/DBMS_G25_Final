package GUI;

import Entity.User;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Room_page extends JFrame{

	private JFrame frame;
	private User user = new User() ;
	private long id;
	private String name;

	/**
	 * Create the application.
	 */
	public Room_page(Long id) {
		this.id = id;
		name = user.getName(id);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219,219,178));
		frame.setBounds(100, 100, 476, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8A0E\u8AD6\u5BA4\u9810\u7D04");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel.setForeground(new Color(66,66,28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(157, 73, 136, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u9054\u8CE2\u5716\u66F8\u9928");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomOrder_Dah_Hsian room = new RoomOrder_Dah_Hsian(id);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(115,121,59));
		btnNewButton.setBounds(270, 159, 124, 72);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("中正圖書館/商圖/綜圖");
		btnNewButton_1.setFont(new Font("Waseem", Font.PLAIN, 15));
		btnNewButton_1.setForeground(new Color(115,121,59));
		btnNewButton_1.setBounds(50, 159, 179, 72);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomOrder_Otherlib old1 = new RoomOrder_Otherlib(id, name);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("歡迎 "+id+" "+name);
		lblNewLabel_1.setForeground(new Color(66,66,28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(306, 20, 150, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setForeground(new Color(115,121,59));
		btnNewButton_2.setBounds(372, 46, 85, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_page login = new Login_page();
				setVisible(false);
				
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u8FD4\u56DE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page book = new Home_page(id);
				book.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_3.setForeground(new Color(66,66,28));
		btnNewButton_3.setBounds(20, 20, 85, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		frame.setVisible(true);
	}

}


