import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dah_Hsian_discussion_room_book_success {

	private JFrame frame;
	private JTextField room;
	private JTextField date;
	private JTextField time;
	private User user =new User() ;
	private long id;
	private String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dah_Hsian_discussion_room_book_success window = new Dah_Hsian_discussion_room_book_success(109);
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
	public Dah_Hsian_discussion_room_book_success(long id) {
		this.id = id;
		name = user.getUser(id);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219,219,178));
		frame.setBounds(100, 100, 852, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Booking_page page = new Booking_page(id);
				page.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(115,121,59));
		btnNewButton_1.setBounds(26, 24, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setForeground(new Color(66,66,28));
		lblNewLabel.setFont(new Font("Tsukushi A Round Gothic", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(317, 28, 173, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_in login = new Login_in();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setForeground(new Color(115,121,59));
		btnNewButton_2.setBounds(679, 24, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setForeground(new Color(115,121,59));
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_3.setForeground(new Color(115,121,59));
		btnNewButton_3.setBounds(26, 187, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_4.setForeground(new Color(115,121,59));
		btnNewButton_4.setBounds(26, 290, 85, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("成功預約座位！");
		lblNewLabel_1.setFont(new Font("Tsukushi B Round Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setForeground(new Color(144,140,72));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(141, 194, 157, 65);
		frame.getContentPane().add(lblNewLabel_1);
		
		room = new JTextField();
		room.setColumns(10);
		room.setBounds(338, 120, 96, 21);
		frame.getContentPane().add(room);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(458, 120, 96, 21);
		frame.getContentPane().add(date);
		
		time = new JTextField();
		time.setColumns(10);
		time.setBounds(338, 163, 216, 23);
		frame.getContentPane().add(time);
		
		JLabel lblNewLabel_2 = new JLabel("\u79DF\u501F\u8005\uFF1A");
		lblNewLabel_2.setForeground(new Color(66,66,28));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(335, 218, 66, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_3.setForeground(new Color(66,66,28));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(335, 255, 60, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u8B49\u865F\uFF1A");
		lblNewLabel_4.setForeground(new Color(66,66,28));
		lblNewLabel_4.setBounds(526, 259, 46, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u5176\u4ED6\u4F7F\u7528\u8005\uFF1A");
		lblNewLabel_5.setForeground(new Color(66,66,28));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(336, 310, 80, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_3_2.setForeground(new Color(66,66,28));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(335, 360, 60, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("\u8B49\u865F\uFF1A");
		lblNewLabel_4_1.setForeground(new Color(66,66,28));
		lblNewLabel_4_1.setBounds(526, 364, 46, 15);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JButton btnNewButton_3_1 = new JButton("預約");
		btnNewButton_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_3_1.setForeground(new Color(115, 121, 59));
		btnNewButton_3_1.setBounds(26, 96, 85, 55);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JLabel lblNewLabel_6 = new JLabel(name);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(394, 254, 96, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(Long.toString(id));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(573, 258, 96, 16);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_6_1 = new JLabel("name");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setBounds(394, 359, 96, 16);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("id");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setBounds(573, 359, 96, 16);
		frame.getContentPane().add(lblNewLabel_7_1);
		
		frame.setVisible(true);
	}
}