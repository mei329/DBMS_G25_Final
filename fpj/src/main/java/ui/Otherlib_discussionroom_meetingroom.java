import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Otherlib_discussionroom_meetingroom {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otherlib_discussionroom_meetingroom window = new Otherlib_discussionroom_meetingroom();
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
	public Otherlib_discussionroom_meetingroom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 868, 661);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u9810\u7D04");
		btnNewButton.setBounds(10, 117, 85, 47);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u96C6\u601D\u5C0F\u9593");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(370, 26, 77, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.setBounds(10, 22, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(691, 22, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(10, 236, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(10, 403, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5/27");
		btnNewButton_5.setBounds(157, 108, 68, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("5/28");
		btnNewButton_5_1.setBounds(235, 108, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_1_1 = new JButton("5/29");
		btnNewButton_5_1_1.setBounds(313, 108, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_1);
		
		JButton btnNewButton_5_1_2 = new JButton("5/30");
		btnNewButton_5_1_2.setBounds(391, 108, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_2);
		
		JButton btnNewButton_5_1_3 = new JButton("5/31");
		btnNewButton_5_1_3.setBounds(469, 108, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_3);
		
		JButton btnNewButton_5_1_4 = new JButton("6/1");
		btnNewButton_5_1_4.setBounds(547, 108, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_4);
		
		JButton btnNewButton_5_1_4_1 = new JButton("6/2");
		btnNewButton_5_1_4_1.setBounds(625, 108, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_4_1);
		
		JButton btnNewButton_5_2 = new JButton("6/3");
		btnNewButton_5_2.setBounds(157, 141, 68, 23);
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("6/4");
		btnNewButton_5_3.setBounds(235, 141, 68, 23);
		frame.getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("6/5");
		btnNewButton_5_4.setBounds(313, 141, 68, 23);
		frame.getContentPane().add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("6/6");
		btnNewButton_5_5.setBounds(391, 141, 68, 23);
		frame.getContentPane().add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("6/7");
		btnNewButton_5_6.setBounds(469, 141, 68, 23);
		frame.getContentPane().add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("6/8");
		btnNewButton_5_7.setBounds(547, 141, 68, 23);
		frame.getContentPane().add(btnNewButton_5_7);
		
		JButton btnNewButton_5_8 = new JButton("6/9");
		btnNewButton_5_8.setBounds(625, 141, 68, 23);
		frame.getContentPane().add(btnNewButton_5_8);
		
		JLabel lblNewLabel_1 = new JLabel("\u65E5\u671F");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(97, 133, 46, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u8A0E\u8AD6\u5BA4");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(108, 256, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_6 = new JButton("A(\u4EBA\u6578\u9650\u52365-10\u4EBA)");
		btnNewButton_6.setBounds(194, 217, 161, 39);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("B(\u4EBA\u6578\u9650\u52363-6\u4EBA)");
		btnNewButton_6_1.setBounds(376, 217, 161, 39);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton("C(\u4EBA\u6578\u9650\u52363-6\u4EBA)");
		btnNewButton_6_2.setBounds(194, 285, 161, 39);
		frame.getContentPane().add(btnNewButton_6_2);
		
		JButton btnNewButton_6_3 = new JButton("D(\u4EBA\u6578\u9650\u52363-9\u4EBA)");
		btnNewButton_6_3.setBounds(376, 285, 161, 39);
		frame.getContentPane().add(btnNewButton_6_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u6642\u6BB5");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(97, 423, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_7 = new JButton("08:00-08:30");
		btnNewButton_7.setBounds(169, 403, 105, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("08:30-09:00");
		btnNewButton_1_1.setBounds(267, 403, 105, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("09:00-09:30");
		btnNewButton_2_1.setBounds(370, 403, 105, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("09:30-10:00");
		btnNewButton_3_1.setBounds(469, 403, 105, 23);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("10:00-10:30");
		btnNewButton_4_1.setBounds(569, 403, 105, 23);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_5_9 = new JButton("10:30-11:00");
		btnNewButton_5_9.setBounds(671, 403, 105, 23);
		frame.getContentPane().add(btnNewButton_5_9);
		
		JButton btnNewButton_6_4 = new JButton("11:00-11:30");
		btnNewButton_6_4.setBounds(169, 435, 105, 23);
		frame.getContentPane().add(btnNewButton_6_4);
		
		JButton btnNewButton_7_1 = new JButton("11:30-12:00");
		btnNewButton_7_1.setBounds(267, 435, 105, 23);
		frame.getContentPane().add(btnNewButton_7_1);
		
		JButton btnNewButton_8 = new JButton("12:00-12:30");
		btnNewButton_8.setBounds(370, 435, 105, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("12:30-13:00");
		btnNewButton_9.setBounds(469, 435, 105, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("13:00-13:30");
		btnNewButton_10.setBounds(569, 436, 105, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("13:30-14:00");
		btnNewButton_11.setBounds(671, 435, 105, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("14:00-14:30");
		btnNewButton_12.setBounds(169, 470, 105, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("14:30-15:00");
		btnNewButton_13.setBounds(267, 470, 105, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("15:00-15:30");
		btnNewButton_14.setBounds(370, 470, 105, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("15:30-16:00");
		btnNewButton_15.setBounds(469, 470, 105, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("16:00-16:30");
		btnNewButton_16.setBounds(569, 470, 105, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("16:30-17:00");
		btnNewButton_17.setBounds(671, 470, 105, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("17:00-17:30");
		btnNewButton_18.setBounds(169, 503, 105, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("17:30-18:00");
		btnNewButton_19.setBounds(267, 503, 105, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("18:00-18:30");
		btnNewButton_20.setBounds(370, 503, 105, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("18:30-19:00");
		btnNewButton_21.setBounds(469, 503, 105, 23);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_21_1 = new JButton("19:00-19:30");
		btnNewButton_21_1.setBounds(569, 503, 105, 23);
		frame.getContentPane().add(btnNewButton_21_1);
		
		JButton btnNewButton_21_2 = new JButton("19:30-20:00");
		btnNewButton_21_2.setBounds(671, 503, 105, 23);
		frame.getContentPane().add(btnNewButton_21_2);
		
		JButton btnNewButton_21_3 = new JButton("20:00-20:30");
		btnNewButton_21_3.setBounds(169, 536, 105, 23);
		frame.getContentPane().add(btnNewButton_21_3);
		
		JButton btnNewButton_21_4 = new JButton("20:30-21:00");
		btnNewButton_21_4.setBounds(267, 536, 105, 23);
		frame.getContentPane().add(btnNewButton_21_4);
		
		JButton btnNewButton_21_5 = new JButton("21:00-21:30");
		btnNewButton_21_5.setBounds(370, 536, 105, 23);
		frame.getContentPane().add(btnNewButton_21_5);
		
		JButton btnNewButton_21_5_1 = new JButton("21:30-22:00");
		btnNewButton_21_5_1.setBounds(469, 536, 105, 23);
		frame.getContentPane().add(btnNewButton_21_5_1);
		
		JButton btnNewButton_22 = new JButton("\u4E0B\u4E00\u6B65");
		btnNewButton_22.setBounds(673, 594, 85, 23);
		frame.getContentPane().add(btnNewButton_22);
	}

}
