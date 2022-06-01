import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Dah_Hsian_discussion_room_book_success {

	private JFrame frame;
	private JTextField room;
	private JTextField date;
	private JTextField time;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dah_Hsian_discussion_room_book_success window = new Dah_Hsian_discussion_room_book_success();
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
	public Dah_Hsian_discussion_room_book_success() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 852, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.setBounds(26, 24, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(413, 28, 77, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(679, 24, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("\u9810\u7D04");
		btnNewButton.setBounds(26, 105, 85, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(26, 187, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(21, 290, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("\u6210\u529F\u9810\u7D04\u5EA7\u4F4D");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(141, 194, 121, 65);
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
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(335, 218, 66, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(335, 255, 60, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(394, 256, 96, 21);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("\u7CFB\u6240\uFF1A");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(500, 255, 60, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(553, 252, 96, 21);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(718, 252, 96, 21);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_4 = new JLabel("\u8B49\u865F\uFF1A");
		lblNewLabel_4.setBounds(671, 255, 46, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u5176\u4ED6\u4F7F\u7528\u8005\uFF1A");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(336, 310, 80, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(335, 360, 60, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(394, 361, 96, 21);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("\u7CFB\u6240\uFF1A");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(500, 360, 60, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(553, 357, 96, 21);
		frame.getContentPane().add(textField_7);
		
		JLabel lblNewLabel_4_1 = new JLabel("\u8B49\u865F\uFF1A");
		lblNewLabel_4_1.setBounds(671, 360, 46, 15);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(718, 357, 96, 21);
		frame.getContentPane().add(textField_8);
	}

}
