package GUI;

import Entity.User;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;

public class Dah_Hsian_discussion_room_1 {

	private JFrame frame;
	private long id;
	private String name;
	private User user = new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dah_Hsian_discussion_room_1 window = new Dah_Hsian_discussion_room_1(109405094);
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
	public Dah_Hsian_discussion_room_1(long id) {
		this.id=id;
		name = user.getUser(id);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219,219,178));
		frame.getContentPane().setForeground(new Color(173, 216, 230));
		frame.setBounds(100, 100, 572, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setForeground(new Color(66,66,28));
		lblNewLabel.setFont(new Font("Tsukushi A Round Gothic", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(210, 67, 151, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8A0E\u8AD6\u5BA4");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(66,66,28));
		lblNewLabel_1.setBounds(100, 230, 75, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("4F");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton.setForeground(new Color(115,121,59));
		btnNewButton.setBounds(228, 354, 130, 50);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dah_Hsian_discussion_room_4F dr4f = new Dah_Hsian_discussion_room_4F(id);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnf = new JButton("5F");
		btnf.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnf.setForeground(new Color(115,121,59));
		btnf.setBounds(228, 280, 130, 50);
		frame.getContentPane().add(btnf);
		
		JButton btnf_1 = new JButton("7F");
		btnf_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnf_1.setForeground(new Color(115,121,59));
		btnf_1.setBounds(228, 207, 130, 50);
		frame.getContentPane().add(btnf_1);
		
		JButton btnf_2 = new JButton("8F");
		btnf_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnf_2.setForeground(new Color(115,121,59));
		btnf_2.setBounds(228, 133, 130, 50);
		frame.getContentPane().add(btnf_2);
		
		JButton btnBack = new JButton("返回");
		btnBack.setForeground(new Color(115,121,59));
		btnBack.setBounds(26, 32, 85, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Booking_page_1 bp1 = new Booking_page_1(id);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_1_1 = new JLabel("歡迎 "+ id +" "+name);
		lblNewLabel_1_1.setForeground(new Color(66,66,28));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(397, 21, 151, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setForeground(new Color(115,121,59));
		btnNewButton_2.setBounds(470, 47, 85, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_page login = new Login_page();
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setForeground(new Color(115,121,59));
		btnNewButton_3.setBounds(390, 47, 85, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dah_Hsian_personaldata_1 dhpd = new Dah_Hsian_personaldata_1();
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(btnNewButton_3);
		
		frame.setVisible(true);
	}
}
