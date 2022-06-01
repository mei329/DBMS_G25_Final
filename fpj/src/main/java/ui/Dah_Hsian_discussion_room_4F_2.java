import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class Dah_Hsian_discussion_room_4F_2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dah_Hsian_discussion_room_4F_2 window = new Dah_Hsian_discussion_room_4F_2();
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
	public Dah_Hsian_discussion_room_4F_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 856, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.setBounds(22, 20, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(358, 24, 77, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(716, 20, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("4\u6A13 401\u5BA4");
		lblNewLabel_1.setFont(new Font("�s�ө���", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(173, 160, 91, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2022-5-27");
		lblNewLabel_2.setFont(new Font("�s�ө���", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(314, 160, 85, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\u9810\u7D04");
		btnNewButton.setBounds(30, 165, 85, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(30, 284, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(30, 451, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("15:00-15:30");
		lblNewLabel_2_1.setFont(new Font("�s�ө���", Font.PLAIN, 16));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(449, 160, 85, 22);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\u4EBA\u6578\u9650\u52363-6\u4EBA");
		lblNewLabel_2_1_1.setFont(new Font("�s�ө���", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(589, 160, 129, 22);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("\u5176\u4ED6\u4F7F\u7528\u8005");
		lblNewLabel_3.setFont(new Font("�s�ө���", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(173, 237, 109, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("\u8ACB\u8F38\u5165\u8B49\u865F\uFF1A");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(179, 270, 85, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setBounds(263, 267, 96, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_2 = new JLabel("\u79DF\u501F\u8005");
		lblNewLabel_3_2.setFont(new Font("�s�ө���", Font.PLAIN, 14));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(460, 238, 74, 21);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setBounds(460, 270, 74, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("\u7CFB\u6240\uFF1A");
		lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_1.setBounds(460, 304, 74, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("\u8B49\u865F\uFF1A");
		lblNewLabel_3_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_2.setBounds(460, 332, 74, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_3_2_1_3 = new JLabel("\u65E5\u671F\uFF1A");
		lblNewLabel_3_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_3.setBounds(460, 357, 74, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_3);
		
		JButton btnNewButton_5 = new JButton("\u9810\u7D04");
		btnNewButton_5.setBounds(493, 467, 85, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\u65B0\u589E");
		btnNewButton_6.setBounds(289, 300, 68, 30);
		frame.getContentPane().add(btnNewButton_6);
	}
}
