import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Discussion_room_2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Discussion_room_2 window = new Discussion_room_2();
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
	public Discussion_room_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u9810\u7D04");
		btnNewButton.setBounds(43, 12, 85, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(166, 14, 96, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_2.setBounds(296, 12, 85, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("\u6708\u4EFD");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(195, 110, 46, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("\u4E00\u6708");
		btnNewButton_3.setBounds(43, 135, 70, 32);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u4E8C\u6708");
		btnNewButton_4.setBounds(128, 135, 70, 32);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u4E09\u6708");
		btnNewButton_5.setBounds(219, 137, 70, 29);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\u56DB\u6708");
		btnNewButton_6.setBounds(311, 138, 70, 27);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("\u4E94\u6708");
		btnNewButton_7.setBounds(43, 191, 70, 32);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("\u516D\u6708");
		btnNewButton_8.setBounds(128, 194, 70, 27);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("\u4E03\u6708");
		btnNewButton_9.setBounds(219, 194, 70, 27);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("\u516B\u6708");
		btnNewButton_10.setBounds(305, 193, 76, 29);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u4E5D\u6708");
		btnNewButton_11.setBounds(43, 245, 70, 29);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("\u5341\u6708");
		btnNewButton_12.setBounds(128, 246, 70, 26);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\u5341\u4E00\u6708");
		btnNewButton_13.setBounds(219, 246, 70, 26);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u5341\u4E8C\u6708");
		btnNewButton_14.setBounds(305, 245, 76, 29);
		frame.getContentPane().add(btnNewButton_14);
		
		JLabel lblNewLabel_1 = new JLabel("2022\u5E74");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(195, 85, 46, 15);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
