import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dah_Hsian_discussion_room_4F extends JFrame{

	private JFrame frame;
	private Dah_Hsian_discussion_room_4F_2 dhdr401;
	private long id;
	private User user = new User();
	private String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dah_Hsian_discussion_room_4F window = new Dah_Hsian_discussion_room_4F(109);
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
	public Dah_Hsian_discussion_room_4F(long id) {
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
		frame.setBounds(100, 100, 847, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u9810\u7D04");
		btnNewButton.setForeground(new Color(115,121,59));
		btnNewButton.setBounds(21, 127, 85, 47);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setForeground(new Color(66,66,28));
		lblNewLabel.setFont(new Font("Tsukushi A Round Gothic", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(356, 36, 147, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dah_Hsian_discussion_room_1 room = new Dah_Hsian_discussion_room_1(id);
			}
		});
		btnNewButton_1.setForeground(new Color(115,121,59));
		btnNewButton_1.setBounds(21, 32, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_in login = new Login_in();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setForeground(new Color(115,121,59));
		btnNewButton_2.setBounds(702, 32, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setForeground(new Color(115,121,59));
		btnNewButton_3.setBounds(21, 246, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setForeground(new Color(115,121,59));
		btnNewButton_4.setBounds(21, 413, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5/27");
		btnNewButton_5.setForeground(new Color(115,121,59));
		btnNewButton_5.setBounds(168, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("5/28");
		btnNewButton_5_1.setForeground(new Color(115,121,59));
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1.setBounds(246, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_1_1 = new JButton("5/29");
		btnNewButton_5_1_1.setForeground(new Color(115,121,59));
		btnNewButton_5_1_1.setBounds(324, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_1);
		
		JButton btnNewButton_5_1_2 = new JButton("5/30");
		btnNewButton_5_1_2.setForeground(new Color(115,121,59));
		btnNewButton_5_1_2.setBounds(402, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_2);
		
		JButton btnNewButton_5_1_3 = new JButton("5/31");
		btnNewButton_5_1_3.setForeground(new Color(115,121,59));
		btnNewButton_5_1_3.setBounds(480, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_3);
		
		JButton btnNewButton_5_1_4 = new JButton("6/1");
		btnNewButton_5_1_4.setForeground(new Color(115,121,59));
		btnNewButton_5_1_4.setBounds(558, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_4);
		
		JButton btnNewButton_5_1_4_1 = new JButton("6/2");
		btnNewButton_5_1_4_1.setForeground(new Color(115,121,59));
		btnNewButton_5_1_4_1.setBounds(636, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_4_1);
		
		JButton btnNewButton_5_2 = new JButton("6/3");
		btnNewButton_5_2.setForeground(new Color(115,121,59));
		btnNewButton_5_2.setBounds(168, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("6/4");
		btnNewButton_5_3.setForeground(new Color(115,121,59));
		btnNewButton_5_3.setBounds(246, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("6/5");
		btnNewButton_5_4.setForeground(new Color(115,121,59));
		btnNewButton_5_4.setBounds(324, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("6/6");
		btnNewButton_5_5.setForeground(new Color(115,121,59));
		btnNewButton_5_5.setBounds(402, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("6/7");
		btnNewButton_5_6.setForeground(new Color(115,121,59));
		btnNewButton_5_6.setBounds(480, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("6/8");
		btnNewButton_5_7.setForeground(new Color(115,121,59));
		btnNewButton_5_7.setBounds(558, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_7);
		
		JButton btnNewButton_5_8 = new JButton("6/9");
		btnNewButton_5_8.setForeground(new Color(115,121,59));
		btnNewButton_5_8.setBounds(636, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_8);
		
		JLabel lblNewLabel_1 = new JLabel("\u65E5\u671F");
		lblNewLabel_1.setForeground(new Color(66,66,28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(108, 143, 46, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u8A0E\u8AD6\u5BA4");
		lblNewLabel_1_1.setForeground(new Color(66,66,28));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(119, 266, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_6 = new JButton("401(\u4EBA\u6578\u9650\u52363-6\u4EBA)");
		btnNewButton_6.setForeground(new Color(115,121,59));
		btnNewButton_6.setBounds(205, 227, 161, 39);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("402(\u4EBA\u6578\u9650\u52363-6\u4EBA)");
		btnNewButton_6_1.setForeground(new Color(115,121,59));
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6_1.setBounds(387, 227, 161, 39);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton("403(\u4EBA\u6578\u9650\u52363-6\u4EBA)");
		btnNewButton_6_2.setForeground(new Color(115,121,59));
		btnNewButton_6_2.setBounds(205, 295, 161, 39);
		frame.getContentPane().add(btnNewButton_6_2);
		
		JButton btnNewButton_6_3 = new JButton("404(\u4EBA\u6578\u9650\u52363-9\u4EBA)");
		btnNewButton_6_3.setForeground(new Color(115,121,59));
		btnNewButton_6_3.setBounds(387, 295, 161, 39);
		frame.getContentPane().add(btnNewButton_6_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u6642\u6BB5");
		lblNewLabel_1_1_1.setForeground(new Color(66,66,28));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(108, 433, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_7 = new JButton("08:00-08:30");
		btnNewButton_7.setForeground(new Color(115,121,59));
		btnNewButton_7.setBounds(180, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("08:30-09:00");
		btnNewButton_1_1.setForeground(new Color(115,121,59));
		btnNewButton_1_1.setBounds(278, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("09:00-09:30");
		btnNewButton_2_1.setForeground(new Color(115,121,59));
		btnNewButton_2_1.setBounds(381, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("09:30-10:00");
		btnNewButton_3_1.setForeground(new Color(115,121,59));
		btnNewButton_3_1.setBounds(480, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("10:00-10:30");
		btnNewButton_4_1.setForeground(new Color(115,121,59));
		btnNewButton_4_1.setBounds(580, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_5_9 = new JButton("10:30-11:00");
		btnNewButton_5_9.setForeground(new Color(115,121,59));
		btnNewButton_5_9.setBounds(682, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_5_9);
		
		JButton btnNewButton_6_4 = new JButton("11:00-11:30");
		btnNewButton_6_4.setForeground(new Color(115,121,59));
		btnNewButton_6_4.setBounds(180, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_6_4);
		
		JButton btnNewButton_7_1 = new JButton("11:30-12:00");
		btnNewButton_7_1.setForeground(new Color(115,121,59));
		btnNewButton_7_1.setBounds(278, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_7_1);
		
		JButton btnNewButton_8 = new JButton("12:00-12:30");
		btnNewButton_8.setForeground(new Color(115,121,59));
		btnNewButton_8.setBounds(381, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("12:30-13:00");
		btnNewButton_9.setForeground(new Color(115,121,59));
		btnNewButton_9.setBounds(480, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("13:00-13:30");
		btnNewButton_10.setForeground(new Color(115,121,59));
		btnNewButton_10.setBounds(580, 446, 105, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("13:30-14:00");
		btnNewButton_11.setForeground(new Color(115,121,59));
		btnNewButton_11.setBounds(682, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("14:00-14:30");
		btnNewButton_12.setForeground(new Color(115,121,59));
		btnNewButton_12.setBounds(180, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("14:30-15:00");
		btnNewButton_13.setForeground(new Color(115,121,59));
		btnNewButton_13.setBounds(278, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("15:00-15:30");
		btnNewButton_14.setForeground(new Color(115,121,59));
		btnNewButton_14.setBounds(381, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("15:30-16:00");
		btnNewButton_15.setForeground(new Color(115,121,59));
		btnNewButton_15.setBounds(480, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("16:00-16:30");
		btnNewButton_16.setForeground(new Color(115,121,59));
		btnNewButton_16.setBounds(580, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("16:30-17:00");
		btnNewButton_17.setForeground(new Color(115,121,59));
		btnNewButton_17.setBounds(682, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("17:00-17:30");
		btnNewButton_18.setForeground(new Color(115,121,59));
		btnNewButton_18.setBounds(180, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("17:30-18:00");
		btnNewButton_19.setForeground(new Color(115,121,59));
		btnNewButton_19.setBounds(278, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("18:00-18:30");
		btnNewButton_20.setForeground(new Color(115,121,59));
		btnNewButton_20.setBounds(381, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("18:30-19:00");
		btnNewButton_21.setForeground(new Color(115,121,59));
		btnNewButton_21.setBounds(480, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_21_1 = new JButton("19:00-19:30");
		btnNewButton_21_1.setForeground(new Color(115,121,59));
		btnNewButton_21_1.setBounds(580, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_21_1);
		
		JButton btnNewButton_21_2 = new JButton("19:30-20:00");
		btnNewButton_21_2.setForeground(new Color(115,121,59));
		btnNewButton_21_2.setBounds(682, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_21_2);
		
		JButton btnNewButton_21_3 = new JButton("20:00-20:30");
		btnNewButton_21_3.setForeground(new Color(115,121,59));
		btnNewButton_21_3.setBounds(180, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_3);
		
		JButton btnNewButton_21_4 = new JButton("20:30-21:00");
		btnNewButton_21_4.setForeground(new Color(115,121,59));
		btnNewButton_21_4.setBounds(278, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_4);
		
		JButton btnNewButton_21_5 = new JButton("21:00-21:30");
		btnNewButton_21_5.setForeground(new Color(115,121,59));
		btnNewButton_21_5.setBounds(381, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_5);
		
		JButton btnNewButton_21_5_1 = new JButton("21:30-22:00");
		btnNewButton_21_5_1.setForeground(new Color(115,121,59));
		btnNewButton_21_5_1.setBounds(480, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_5_1);
		
		JButton btnNewButton_22 = new JButton("\u4E0B\u4E00\u6B65");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dah_Hsian_discussion_room_4F_2 dr4f = new Dah_Hsian_discussion_room_4F_2(id);
				frame.setVisible(false);
			}
		});
		btnNewButton_22.setForeground(new Color(115,121,59));
		btnNewButton_22.setBounds(684, 604, 85, 23);
		frame.getContentPane().add(btnNewButton_22);
		
		frame.setVisible(true);
	}
}
