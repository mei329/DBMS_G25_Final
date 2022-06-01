package ui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Dah_Hsian_discussion_room_1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dah_Hsian_discussion_room_1 window = new Dah_Hsian_discussion_room_1();
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
	public Dah_Hsian_discussion_room_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(228, 44, 101, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8A0E\u8AD6\u5BA4");
		lblNewLabel_1.setBounds(130, 273, 46, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("4F");
		btnNewButton.setBounds(244, 346, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnf = new JButton("5F");
		btnf.setBounds(244, 299, 85, 23);
		frame.getContentPane().add(btnf);
		
		JButton btnf_1 = new JButton("7F");
		btnf_1.setBounds(244, 253, 85, 23);
		frame.getContentPane().add(btnf_1);
		
		JButton btnf_2 = new JButton("8F");
		btnf_2.setBounds(244, 207, 85, 23);
		frame.getContentPane().add(btnf_2);
		
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.setBounds(26, 47, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u6B61\u8FCE (\u4F7F\u7528\u8005\u59D3\u540D+\u5B78\u865F)");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(370, 22, 151, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(463, 47, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(357, 47, 85, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
