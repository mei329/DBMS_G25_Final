package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Otherlib_discussionroom_commerce {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otherlib_discussionroom_commerce window = new Otherlib_discussionroom_commerce();
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
	public Otherlib_discussionroom_commerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 867, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u9810\u7D04");
		btnNewButton.setBounds(25, 120, 85, 47);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u5546\u5716");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(385, 29, 77, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(25, 25, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(706, 25, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(25, 239, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(25, 406, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5/27");
		btnNewButton_5.setBounds(172, 111, 68, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("5/28");
		btnNewButton_5_1.setBounds(250, 111, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_1_1 = new JButton("5/29");
		btnNewButton_5_1_1.setBounds(328, 111, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_1);
		
		JButton btnNewButton_5_1_2 = new JButton("5/30");
		btnNewButton_5_1_2.setBounds(406, 111, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_2);
		
		JButton btnNewButton_5_1_3 = new JButton("5/31");
		btnNewButton_5_1_3.setBounds(484, 111, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_3);
		
		JButton btnNewButton_5_1_4 = new JButton("6/1");
		btnNewButton_5_1_4.setBounds(562, 111, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_4);
		
		JButton btnNewButton_5_1_4_1 = new JButton("6/2");
		btnNewButton_5_1_4_1.setBounds(640, 111, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_4_1);
		
		JButton btnNewButton_5_2 = new JButton("6/3");
		btnNewButton_5_2.setBounds(172, 144, 68, 23);
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("6/4");
		btnNewButton_5_3.setBounds(250, 144, 68, 23);
		frame.getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("6/5");
		btnNewButton_5_4.setBounds(328, 144, 68, 23);
		frame.getContentPane().add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("6/6");
		btnNewButton_5_5.setBounds(406, 144, 68, 23);
		frame.getContentPane().add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("6/7");
		btnNewButton_5_6.setBounds(484, 144, 68, 23);
		frame.getContentPane().add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("6/8");
		btnNewButton_5_7.setBounds(562, 144, 68, 23);
		frame.getContentPane().add(btnNewButton_5_7);
		
		JButton btnNewButton_5_8 = new JButton("6/9");
		btnNewButton_5_8.setBounds(640, 144, 68, 23);
		frame.getContentPane().add(btnNewButton_5_8);
		
		JLabel lblNewLabel_1 = new JLabel("\u65E5\u671F");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(112, 136, 46, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u8A0E\u8AD6\u5BA4");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(123, 259, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_6 = new JButton("\u4E00 (\u4EBA\u6578\u9650\u52363-5\u4EBA)");
		btnNewButton_6.setBounds(220, 247, 161, 39);
		frame.getContentPane().add(btnNewButton_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u6642\u6BB5");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(112, 426, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_7 = new JButton("08:00-08:30");
		btnNewButton_7.setBounds(184, 406, 105, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("08:30-09:00");
		btnNewButton_1_1.setBounds(282, 406, 105, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("09:00-09:30");
		btnNewButton_2_1.setBounds(385, 406, 105, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("09:30-10:00");
		btnNewButton_3_1.setBounds(484, 406, 105, 23);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("10:00-10:30");
		btnNewButton_4_1.setBounds(584, 406, 105, 23);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_5_9 = new JButton("10:30-11:00");
		btnNewButton_5_9.setBounds(686, 406, 105, 23);
		frame.getContentPane().add(btnNewButton_5_9);
		
		JButton btnNewButton_6_4 = new JButton("11:00-11:30");
		btnNewButton_6_4.setBounds(184, 438, 105, 23);
		frame.getContentPane().add(btnNewButton_6_4);
		
		JButton btnNewButton_7_1 = new JButton("11:30-12:00");
		btnNewButton_7_1.setBounds(282, 438, 105, 23);
		frame.getContentPane().add(btnNewButton_7_1);
		
		JButton btnNewButton_8 = new JButton("12:00-12:30");
		btnNewButton_8.setBounds(385, 438, 105, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("12:30-13:00");
		btnNewButton_9.setBounds(484, 438, 105, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("13:00-13:30");
		btnNewButton_10.setBounds(584, 439, 105, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("13:30-14:00");
		btnNewButton_11.setBounds(686, 438, 105, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("14:00-14:30");
		btnNewButton_12.setBounds(184, 473, 105, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("14:30-15:00");
		btnNewButton_13.setBounds(282, 473, 105, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("15:00-15:30");
		btnNewButton_14.setBounds(385, 473, 105, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("15:30-16:00");
		btnNewButton_15.setBounds(484, 473, 105, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("16:00-16:30");
		btnNewButton_16.setBounds(584, 473, 105, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("16:30-17:00");
		btnNewButton_17.setBounds(686, 473, 105, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("17:00-17:30");
		btnNewButton_18.setBounds(184, 506, 105, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("17:30-18:00");
		btnNewButton_19.setBounds(282, 506, 105, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("18:00-18:30");
		btnNewButton_20.setBounds(385, 506, 105, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("18:30-19:00");
		btnNewButton_21.setBounds(484, 506, 105, 23);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_21_1 = new JButton("19:00-19:30");
		btnNewButton_21_1.setBounds(584, 506, 105, 23);
		frame.getContentPane().add(btnNewButton_21_1);
		
		JButton btnNewButton_21_2 = new JButton("19:30-20:00");
		btnNewButton_21_2.setBounds(686, 506, 105, 23);
		frame.getContentPane().add(btnNewButton_21_2);
		
		JButton btnNewButton_21_3 = new JButton("20:00-20:30");
		btnNewButton_21_3.setBounds(184, 539, 105, 23);
		frame.getContentPane().add(btnNewButton_21_3);
		
		JButton btnNewButton_21_4 = new JButton("20:30-21:00");
		btnNewButton_21_4.setBounds(282, 539, 105, 23);
		frame.getContentPane().add(btnNewButton_21_4);
		
		JButton btnNewButton_21_5 = new JButton("21:00-21:30");
		btnNewButton_21_5.setBounds(385, 539, 105, 23);
		frame.getContentPane().add(btnNewButton_21_5);
		
		JButton btnNewButton_21_5_1 = new JButton("21:30-22:00");
		btnNewButton_21_5_1.setBounds(484, 539, 105, 23);
		frame.getContentPane().add(btnNewButton_21_5_1);
		
		JButton btnNewButton_22 = new JButton("\u4E0B\u4E00\u6B65");
		btnNewButton_22.setBounds(706, 597, 85, 23);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_6_1 = new JButton("\u4E8C (\u4EBA\u6578\u9650\u52363-5\u4EBA)");
		btnNewButton_6_1.setBounds(428, 247, 161, 39);
		frame.getContentPane().add(btnNewButton_6_1);
		
		frame.setVisible(true);
	}
}
