import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Study_location_3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study_location_3 window = new Study_location_3();
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
	public Study_location_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1215, 581);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblA = new JLabel("A\u5340");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(507, 25, 115, 28);
		frame.getContentPane().add(lblA);
		
		JLabel lblNewLabel = new JLabel("\u60A8\u7684\u5EA7\u4F4D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(434, 63, 74, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5DF2\u5165\u5EA7");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(547, 63, 46, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u53EF\u9078");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(634, 63, 46, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("A");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(25, 92, 46, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("B");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(25, 132, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("C");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(25, 168, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("D");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(25, 208, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("E");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setBounds(25, 247, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("F");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setBounds(25, 283, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("G");
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6.setBounds(25, 319, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("H");
		lblNewLabel_3_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7.setBounds(25, 351, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("I");
		lblNewLabel_3_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_8.setBounds(25, 393, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("J");
		lblNewLabel_3_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_9.setBounds(25, 428, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("K");
		lblNewLabel_3_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_10.setBounds(25, 465, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(78, 461, 46, 28);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBounds(134, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(190, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(249, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(314, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(373, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBounds(434, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBounds(490, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBounds(547, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("10");
		btnNewButton_9.setBounds(602, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("11");
		btnNewButton_10.setBounds(663, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("12");
		btnNewButton_11.setBounds(721, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("13");
		btnNewButton_12.setBounds(777, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("14");
		btnNewButton_13.setBounds(834, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("15");
		btnNewButton_14.setBounds(893, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("16");
		btnNewButton_15.setBounds(949, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("17");
		btnNewButton_16.setBounds(1005, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("18");
		btnNewButton_17.setBounds(1061, 461, 46, 28);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_2_1 = new JButton("3");
		btnNewButton_2_1.setBounds(190, 424, 46, 28);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.setBounds(190, 389, 46, 28);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("3");
		btnNewButton_2_3.setBounds(190, 312, 46, 28);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_3_1 = new JButton("3");
		btnNewButton_2_3_1.setBounds(190, 347, 46, 28);
		frame.getContentPane().add(btnNewButton_2_3_1);
		
		JButton btnNewButton_2_3_2 = new JButton("3");
		btnNewButton_2_3_2.setBounds(190, 279, 46, 28);
		frame.getContentPane().add(btnNewButton_2_3_2);
		
		JButton btnNewButton_2_3_3 = new JButton("3");
		btnNewButton_2_3_3.setBounds(190, 243, 46, 28);
		frame.getContentPane().add(btnNewButton_2_3_3);
		
		JButton btnNewButton_2_3_4 = new JButton("3");
		btnNewButton_2_3_4.setBounds(190, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_2_3_4);
		
		JButton btnNewButton_2_3_5 = new JButton("3");
		btnNewButton_2_3_5.setBounds(190, 164, 46, 28);
		frame.getContentPane().add(btnNewButton_2_3_5);
		
		JButton btnNewButton_2_3_6 = new JButton("3");
		btnNewButton_2_3_6.setBounds(190, 125, 46, 28);
		frame.getContentPane().add(btnNewButton_2_3_6);
		
		JButton btnNewButton_2_3_7 = new JButton("3");
		btnNewButton_2_3_7.setBounds(190, 85, 46, 28);
		frame.getContentPane().add(btnNewButton_2_3_7);
		
		JButton btnNewButton_3_1 = new JButton("4");
		btnNewButton_3_1.setBounds(249, 424, 46, 28);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("4");
		btnNewButton_3_2.setBounds(249, 389, 46, 28);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("4");
		btnNewButton_3_3.setBounds(249, 347, 46, 28);
		frame.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_3_4 = new JButton("4");
		btnNewButton_3_4.setBounds(249, 315, 46, 28);
		frame.getContentPane().add(btnNewButton_3_4);
		
		JButton btnNewButton_3_5 = new JButton("4");
		btnNewButton_3_5.setBounds(249, 279, 46, 28);
		frame.getContentPane().add(btnNewButton_3_5);
		
		JButton btnNewButton_3_6 = new JButton("4");
		btnNewButton_3_6.setBounds(249, 243, 46, 28);
		frame.getContentPane().add(btnNewButton_3_6);
		
		JButton btnNewButton_3_7 = new JButton("4");
		btnNewButton_3_7.setBounds(249, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_3_7);
		
		JButton btnNewButton_3_8 = new JButton("4");
		btnNewButton_3_8.setBounds(249, 168, 46, 28);
		frame.getContentPane().add(btnNewButton_3_8);
		
		JButton btnNewButton_3_9 = new JButton("4");
		btnNewButton_3_9.setBounds(249, 128, 46, 28);
		frame.getContentPane().add(btnNewButton_3_9);
		
		JButton btnNewButton_3_10 = new JButton("4");
		btnNewButton_3_10.setBounds(249, 88, 46, 28);
		frame.getContentPane().add(btnNewButton_3_10);
		
		JButton btnNewButton_4_1 = new JButton("5");
		btnNewButton_4_1.setBounds(314, 424, 46, 28);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("5");
		btnNewButton_4_2.setBounds(314, 389, 46, 28);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton("5");
		btnNewButton_4_3.setBounds(314, 347, 46, 28);
		frame.getContentPane().add(btnNewButton_4_3);
		
		JButton btnNewButton_4_4 = new JButton("5");
		btnNewButton_4_4.setBounds(314, 312, 46, 28);
		frame.getContentPane().add(btnNewButton_4_4);
		
		JButton btnNewButton_4_5 = new JButton("5");
		btnNewButton_4_5.setBounds(314, 279, 46, 28);
		frame.getContentPane().add(btnNewButton_4_5);
		
		JButton btnNewButton_4_6 = new JButton("5");
		btnNewButton_4_6.setBounds(314, 243, 46, 28);
		frame.getContentPane().add(btnNewButton_4_6);
		
		JButton btnNewButton_4_7 = new JButton("5");
		btnNewButton_4_7.setBounds(314, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_4_7);
		
		JButton btnNewButton_4_8 = new JButton("5");
		btnNewButton_4_8.setBounds(314, 164, 46, 28);
		frame.getContentPane().add(btnNewButton_4_8);
		
		JButton btnNewButton_4_9 = new JButton("5");
		btnNewButton_4_9.setBounds(314, 128, 46, 28);
		frame.getContentPane().add(btnNewButton_4_9);
		
		JButton btnNewButton_4_10 = new JButton("5");
		btnNewButton_4_10.setBounds(314, 88, 46, 28);
		frame.getContentPane().add(btnNewButton_4_10);
		
		JButton btnNewButton_5_1 = new JButton("6");
		btnNewButton_5_1.setBounds(373, 424, 46, 28);
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("6");
		btnNewButton_5_2.setBounds(373, 389, 46, 28);
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("6");
		btnNewButton_5_3.setBounds(373, 347, 46, 28);
		frame.getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("6");
		btnNewButton_5_4.setBounds(373, 315, 46, 28);
		frame.getContentPane().add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("6");
		btnNewButton_5_5.setBounds(373, 279, 46, 28);
		frame.getContentPane().add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("6");
		btnNewButton_5_6.setBounds(373, 243, 46, 28);
		frame.getContentPane().add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("6");
		btnNewButton_5_7.setBounds(373, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_5_7);
		
		JButton btnNewButton_5_8 = new JButton("6");
		btnNewButton_5_8.setBounds(370, 164, 46, 28);
		frame.getContentPane().add(btnNewButton_5_8);
		
		JButton btnNewButton_5_9 = new JButton("6");
		btnNewButton_5_9.setBounds(370, 128, 46, 28);
		frame.getContentPane().add(btnNewButton_5_9);
		
		JButton btnNewButton_5_10 = new JButton("6");
		btnNewButton_5_10.setBounds(373, 88, 46, 28);
		frame.getContentPane().add(btnNewButton_5_10);
		
		JButton btnNewButton_6_1 = new JButton("7");
		btnNewButton_6_1.setBounds(434, 424, 46, 28);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton("7");
		btnNewButton_6_2.setBounds(434, 389, 46, 28);
		frame.getContentPane().add(btnNewButton_6_2);
		
		JButton btnNewButton_6_3 = new JButton("7");
		btnNewButton_6_3.setBounds(434, 347, 46, 28);
		frame.getContentPane().add(btnNewButton_6_3);
		
		JButton btnNewButton_6_4 = new JButton("7");
		btnNewButton_6_4.setBounds(434, 315, 46, 28);
		frame.getContentPane().add(btnNewButton_6_4);
		
		JButton btnNewButton_6_5 = new JButton("7");
		btnNewButton_6_5.setBounds(434, 279, 46, 28);
		frame.getContentPane().add(btnNewButton_6_5);
		
		JButton btnNewButton_6_6 = new JButton("7");
		btnNewButton_6_6.setBounds(434, 243, 46, 28);
		frame.getContentPane().add(btnNewButton_6_6);
		
		JButton btnNewButton_6_7 = new JButton("7");
		btnNewButton_6_7.setBounds(434, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_6_7);
		
		JButton btnNewButton_6_8 = new JButton("7");
		btnNewButton_6_8.setBounds(434, 164, 46, 28);
		frame.getContentPane().add(btnNewButton_6_8);
		
		JButton btnNewButton_6_9 = new JButton("7");
		btnNewButton_6_9.setBounds(434, 128, 46, 28);
		frame.getContentPane().add(btnNewButton_6_9);
		
		JButton btnNewButton_6_10 = new JButton("7");
		btnNewButton_6_10.setBounds(434, 88, 46, 28);
		frame.getContentPane().add(btnNewButton_6_10);
		
		JButton btnNewButton_7_1 = new JButton("8");
		btnNewButton_7_1.setBounds(490, 423, 46, 28);
		frame.getContentPane().add(btnNewButton_7_1);
		
		JButton btnNewButton_8_1 = new JButton("9");
		btnNewButton_8_1.setBounds(547, 423, 46, 28);
		frame.getContentPane().add(btnNewButton_8_1);
		
		JButton btnNewButton_9_1 = new JButton("10");
		btnNewButton_9_1.setBounds(602, 423, 46, 28);
		frame.getContentPane().add(btnNewButton_9_1);
		
		JButton btnNewButton_10_1 = new JButton("11");
		btnNewButton_10_1.setBounds(663, 423, 46, 28);
		frame.getContentPane().add(btnNewButton_10_1);
		
		JButton btnNewButton_11_1 = new JButton("12");
		btnNewButton_11_1.setBounds(721, 423, 46, 28);
		frame.getContentPane().add(btnNewButton_11_1);
		
		JButton btnNewButton_7_2 = new JButton("8");
		btnNewButton_7_2.setBounds(490, 389, 46, 28);
		frame.getContentPane().add(btnNewButton_7_2);
		
		JButton btnNewButton_8_2 = new JButton("9");
		btnNewButton_8_2.setBounds(547, 389, 46, 28);
		frame.getContentPane().add(btnNewButton_8_2);
		
		JButton btnNewButton_9_2 = new JButton("10");
		btnNewButton_9_2.setBounds(602, 389, 46, 28);
		frame.getContentPane().add(btnNewButton_9_2);
		
		JButton btnNewButton_10_2 = new JButton("11");
		btnNewButton_10_2.setBounds(663, 389, 46, 28);
		frame.getContentPane().add(btnNewButton_10_2);
		
		JButton btnNewButton_11_2 = new JButton("12");
		btnNewButton_11_2.setBounds(721, 389, 46, 28);
		frame.getContentPane().add(btnNewButton_11_2);
		
		JButton btnNewButton_7_3 = new JButton("8");
		btnNewButton_7_3.setBounds(490, 347, 46, 28);
		frame.getContentPane().add(btnNewButton_7_3);
		
		JButton btnNewButton_8_3 = new JButton("9");
		btnNewButton_8_3.setBounds(547, 347, 46, 28);
		frame.getContentPane().add(btnNewButton_8_3);
		
		JButton btnNewButton_9_3 = new JButton("10");
		btnNewButton_9_3.setBounds(602, 347, 46, 28);
		frame.getContentPane().add(btnNewButton_9_3);
		
		JButton btnNewButton_10_3 = new JButton("11");
		btnNewButton_10_3.setBounds(663, 347, 46, 28);
		frame.getContentPane().add(btnNewButton_10_3);
		
		JButton btnNewButton_11_3 = new JButton("12");
		btnNewButton_11_3.setBounds(721, 347, 46, 28);
		frame.getContentPane().add(btnNewButton_11_3);
		
		JButton btnNewButton_7_4 = new JButton("8");
		btnNewButton_7_4.setBounds(490, 312, 46, 28);
		frame.getContentPane().add(btnNewButton_7_4);
		
		JButton btnNewButton_8_4 = new JButton("9");
		btnNewButton_8_4.setBounds(547, 312, 46, 28);
		frame.getContentPane().add(btnNewButton_8_4);
		
		JButton btnNewButton_9_4 = new JButton("10");
		btnNewButton_9_4.setBounds(602, 312, 46, 28);
		frame.getContentPane().add(btnNewButton_9_4);
		
		JButton btnNewButton_10_4 = new JButton("11");
		btnNewButton_10_4.setBounds(663, 312, 46, 28);
		frame.getContentPane().add(btnNewButton_10_4);
		
		JButton btnNewButton_11_4 = new JButton("12");
		btnNewButton_11_4.setBounds(721, 312, 46, 28);
		frame.getContentPane().add(btnNewButton_11_4);
		
		JButton btnNewButton_7_5 = new JButton("8");
		btnNewButton_7_5.setBounds(490, 279, 46, 28);
		frame.getContentPane().add(btnNewButton_7_5);
		
		JButton btnNewButton_8_5 = new JButton("9");
		btnNewButton_8_5.setBounds(547, 279, 46, 28);
		frame.getContentPane().add(btnNewButton_8_5);
		
		JButton btnNewButton_9_5 = new JButton("10");
		btnNewButton_9_5.setBounds(602, 279, 46, 28);
		frame.getContentPane().add(btnNewButton_9_5);
		
		JButton btnNewButton_10_5 = new JButton("11");
		btnNewButton_10_5.setBounds(663, 279, 46, 28);
		frame.getContentPane().add(btnNewButton_10_5);
		
		JButton btnNewButton_11_5 = new JButton("12");
		btnNewButton_11_5.setBounds(721, 279, 46, 28);
		frame.getContentPane().add(btnNewButton_11_5);
		
		JButton btnNewButton_7_6 = new JButton("8");
		btnNewButton_7_6.setBounds(490, 243, 46, 28);
		frame.getContentPane().add(btnNewButton_7_6);
		
		JButton btnNewButton_8_6 = new JButton("9");
		btnNewButton_8_6.setBounds(547, 243, 46, 28);
		frame.getContentPane().add(btnNewButton_8_6);
		
		JButton btnNewButton_9_6 = new JButton("10");
		btnNewButton_9_6.setBounds(602, 243, 46, 28);
		frame.getContentPane().add(btnNewButton_9_6);
		
		JButton btnNewButton_10_6 = new JButton("11");
		btnNewButton_10_6.setBounds(663, 243, 46, 28);
		frame.getContentPane().add(btnNewButton_10_6);
		
		JButton btnNewButton_11_6 = new JButton("12");
		btnNewButton_11_6.setBounds(721, 243, 46, 28);
		frame.getContentPane().add(btnNewButton_11_6);
		
		JButton btnNewButton_7_7 = new JButton("8");
		btnNewButton_7_7.setBounds(490, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_7_7);
		
		JButton btnNewButton_8_7 = new JButton("9");
		btnNewButton_8_7.setBounds(547, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_8_7);
		
		JButton btnNewButton_9_7 = new JButton("10");
		btnNewButton_9_7.setBounds(602, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_9_7);
		
		JButton btnNewButton_10_7 = new JButton("11");
		btnNewButton_10_7.setBounds(663, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_10_7);
		
		JButton btnNewButton_11_7 = new JButton("12");
		btnNewButton_11_7.setBounds(721, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_11_7);
		
		JButton btnNewButton_7_8 = new JButton("8");
		btnNewButton_7_8.setBounds(490, 168, 46, 28);
		frame.getContentPane().add(btnNewButton_7_8);
		
		JButton btnNewButton_8_8 = new JButton("9");
		btnNewButton_8_8.setBounds(547, 168, 46, 28);
		frame.getContentPane().add(btnNewButton_8_8);
		
		JButton btnNewButton_9_8 = new JButton("10");
		btnNewButton_9_8.setBounds(602, 168, 46, 28);
		frame.getContentPane().add(btnNewButton_9_8);
		
		JButton btnNewButton_10_8 = new JButton("11");
		btnNewButton_10_8.setBounds(663, 168, 46, 28);
		frame.getContentPane().add(btnNewButton_10_8);
		
		JButton btnNewButton_11_8 = new JButton("12");
		btnNewButton_11_8.setBounds(721, 168, 46, 28);
		frame.getContentPane().add(btnNewButton_11_8);
		
		JButton btnNewButton_7_9 = new JButton("8");
		btnNewButton_7_9.setBounds(490, 132, 46, 28);
		frame.getContentPane().add(btnNewButton_7_9);
		
		JButton btnNewButton_8_9 = new JButton("9");
		btnNewButton_8_9.setBounds(547, 132, 46, 28);
		frame.getContentPane().add(btnNewButton_8_9);
		
		JButton btnNewButton_9_9 = new JButton("10");
		btnNewButton_9_9.setBounds(602, 132, 46, 28);
		frame.getContentPane().add(btnNewButton_9_9);
		
		JButton btnNewButton_10_9 = new JButton("11");
		btnNewButton_10_9.setBounds(663, 132, 46, 28);
		frame.getContentPane().add(btnNewButton_10_9);
		
		JButton btnNewButton_11_9 = new JButton("12");
		btnNewButton_11_9.setBounds(721, 132, 46, 28);
		frame.getContentPane().add(btnNewButton_11_9);
		
		JButton btnNewButton_7_10 = new JButton("8");
		btnNewButton_7_10.setBounds(490, 88, 46, 28);
		frame.getContentPane().add(btnNewButton_7_10);
		
		JButton btnNewButton_8_10 = new JButton("9");
		btnNewButton_8_10.setBounds(547, 88, 46, 28);
		frame.getContentPane().add(btnNewButton_8_10);
		
		JButton btnNewButton_9_10 = new JButton("10");
		btnNewButton_9_10.setBounds(602, 88, 46, 28);
		frame.getContentPane().add(btnNewButton_9_10);
		
		JLabel lblNewLabel_3_10_1 = new JLabel("K");
		lblNewLabel_3_10_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_10_1.setBounds(1127, 465, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_10_1);
		
		JLabel lblNewLabel_3_9_1 = new JLabel("J");
		lblNewLabel_3_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_9_1.setBounds(1127, 428, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_9_1);
		
		JLabel lblNewLabel_3_8_1 = new JLabel("I");
		lblNewLabel_3_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_8_1.setBounds(1127, 393, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_8_1);
		
		JLabel lblNewLabel_3_7_1 = new JLabel("H");
		lblNewLabel_3_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7_1.setBounds(1127, 351, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_7_1);
		
		JLabel lblNewLabel_3_6_1 = new JLabel("G");
		lblNewLabel_3_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6_1.setBounds(1127, 319, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_6_1);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("F");
		lblNewLabel_3_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5_1.setBounds(1127, 283, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_5_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("E");
		lblNewLabel_3_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_1.setBounds(1127, 247, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("D");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1.setBounds(1127, 208, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("C");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setBounds(1127, 168, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("B");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(1127, 132, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_11 = new JLabel("A");
		lblNewLabel_3_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_11.setBounds(1127, 92, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_11);
		
		JButton btnNewButton_16_1 = new JButton("17");
		btnNewButton_16_1.setBounds(1005, 428, 46, 28);
		frame.getContentPane().add(btnNewButton_16_1);
		
		JButton btnNewButton_17_1 = new JButton("18");
		btnNewButton_17_1.setBounds(1061, 428, 46, 28);
		frame.getContentPane().add(btnNewButton_17_1);
		
		JButton btnNewButton_16_2 = new JButton("17");
		btnNewButton_16_2.setBounds(1005, 393, 46, 28);
		frame.getContentPane().add(btnNewButton_16_2);
		
		JButton btnNewButton_17_2 = new JButton("18");
		btnNewButton_17_2.setBounds(1061, 393, 46, 28);
		frame.getContentPane().add(btnNewButton_17_2);
		
		JButton btnNewButton_16_3 = new JButton("17");
		btnNewButton_16_3.setBounds(1005, 351, 46, 28);
		frame.getContentPane().add(btnNewButton_16_3);
		
		JButton btnNewButton_17_3 = new JButton("18");
		btnNewButton_17_3.setBounds(1061, 351, 46, 28);
		frame.getContentPane().add(btnNewButton_17_3);
		
		JButton btnNewButton_16_4 = new JButton("17");
		btnNewButton_16_4.setBounds(1005, 319, 46, 28);
		frame.getContentPane().add(btnNewButton_16_4);
		
		JButton btnNewButton_17_4 = new JButton("18");
		btnNewButton_17_4.setBounds(1061, 319, 46, 28);
		frame.getContentPane().add(btnNewButton_17_4);
		
		JButton btnNewButton_16_5 = new JButton("17");
		btnNewButton_16_5.setBounds(1005, 283, 46, 28);
		frame.getContentPane().add(btnNewButton_16_5);
		
		JButton btnNewButton_17_5 = new JButton("18");
		btnNewButton_17_5.setBounds(1061, 283, 46, 28);
		frame.getContentPane().add(btnNewButton_17_5);
		
		JButton btnNewButton_16_6 = new JButton("17");
		btnNewButton_16_6.setBounds(1005, 234, 46, 28);
		frame.getContentPane().add(btnNewButton_16_6);
		
		JButton btnNewButton_17_6 = new JButton("18");
		btnNewButton_17_6.setBounds(1061, 234, 46, 28);
		frame.getContentPane().add(btnNewButton_17_6);
		
		JButton btnNewButton_16_7 = new JButton("17");
		btnNewButton_16_7.setBounds(1005, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_16_7);
		
		JButton btnNewButton_17_7 = new JButton("18");
		btnNewButton_17_7.setBounds(1061, 204, 46, 28);
		frame.getContentPane().add(btnNewButton_17_7);
		
		JButton btnNewButton_16_8 = new JButton("17");
		btnNewButton_16_8.setBounds(1005, 161, 46, 28);
		frame.getContentPane().add(btnNewButton_16_8);
		
		JButton btnNewButton_17_8 = new JButton("18");
		btnNewButton_17_8.setBounds(1061, 161, 46, 28);
		frame.getContentPane().add(btnNewButton_17_8);
		
		JButton btnNewButton_16_9 = new JButton("17");
		btnNewButton_16_9.setBounds(1005, 125, 46, 28);
		frame.getContentPane().add(btnNewButton_16_9);
		
		JButton btnNewButton_17_9 = new JButton("18");
		btnNewButton_17_9.setBounds(1061, 125, 46, 28);
		frame.getContentPane().add(btnNewButton_17_9);
		
		JButton btnNewButton_16_10 = new JButton("17");
		btnNewButton_16_10.setBounds(1005, 92, 46, 28);
		frame.getContentPane().add(btnNewButton_16_10);
		
		JButton btnNewButton_17_10 = new JButton("18");
		btnNewButton_17_10.setBounds(1061, 92, 46, 28);
		frame.getContentPane().add(btnNewButton_17_10);
	}

}
