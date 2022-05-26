import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Discussion_room_3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Discussion_room_3 window = new Discussion_room_3();
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
	public Discussion_room_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u9810\u7D04");
		btnNewButton.setBounds(39, 10, 85, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_1.setBounds(162, 12, 96, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_2.setBounds(292, 10, 85, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("2022\u5E74");
		lblNewLabel_1.setBounds(191, 79, 46, 15);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("\u65E5\u671F");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(191, 104, 46, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setBounds(20, 155, 46, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("2");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1.setBounds(76, 155, 46, 23);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("3");
		btnNewButton_3_2.setBounds(132, 155, 46, 23);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("4");
		btnNewButton_3_3.setBounds(191, 155, 46, 23);
		frame.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_3_4 = new JButton("5");
		btnNewButton_3_4.setBounds(247, 155, 46, 23);
		frame.getContentPane().add(btnNewButton_3_4);
		
		JButton btnNewButton_3_5 = new JButton("6");
		btnNewButton_3_5.setBounds(303, 155, 46, 23);
		frame.getContentPane().add(btnNewButton_3_5);
		
		JButton btnNewButton_3_6 = new JButton("7");
		btnNewButton_3_6.setBounds(359, 155, 46, 23);
		frame.getContentPane().add(btnNewButton_3_6);
		
		JButton btnNewButton_3_7 = new JButton("8");
		btnNewButton_3_7.setBounds(20, 188, 46, 23);
		frame.getContentPane().add(btnNewButton_3_7);
		
		JButton btnNewButton_3_8 = new JButton("9");
		btnNewButton_3_8.setBounds(76, 188, 46, 23);
		frame.getContentPane().add(btnNewButton_3_8);
		
		JButton btnNewButton_3_9 = new JButton("10");
		btnNewButton_3_9.setBounds(132, 188, 46, 23);
		frame.getContentPane().add(btnNewButton_3_9);
		
		JButton btnNewButton_3_10 = new JButton("11");
		btnNewButton_3_10.setBounds(191, 188, 46, 23);
		frame.getContentPane().add(btnNewButton_3_10);
		
		JButton btnNewButton_3_11 = new JButton("12");
		btnNewButton_3_11.setBounds(247, 188, 46, 23);
		frame.getContentPane().add(btnNewButton_3_11);
		
		JButton btnNewButton_3_12 = new JButton("13");
		btnNewButton_3_12.setBounds(303, 188, 46, 23);
		frame.getContentPane().add(btnNewButton_3_12);
		
		JButton btnNewButton_3_13 = new JButton("14");
		btnNewButton_3_13.setBounds(359, 188, 46, 23);
		frame.getContentPane().add(btnNewButton_3_13);
		
		JButton btnNewButton_3_14 = new JButton("15");
		btnNewButton_3_14.setBounds(20, 221, 46, 23);
		frame.getContentPane().add(btnNewButton_3_14);
		
		JButton btnNewButton_3_15 = new JButton("16");
		btnNewButton_3_15.setBounds(76, 221, 46, 23);
		frame.getContentPane().add(btnNewButton_3_15);
		
		JButton btnNewButton_3_16 = new JButton("17");
		btnNewButton_3_16.setBounds(132, 221, 46, 23);
		frame.getContentPane().add(btnNewButton_3_16);
		
		JButton btnNewButton_3_17 = new JButton("18");
		btnNewButton_3_17.setBounds(191, 221, 46, 23);
		frame.getContentPane().add(btnNewButton_3_17);
		
		JButton btnNewButton_3_18 = new JButton("19");
		btnNewButton_3_18.setBounds(247, 221, 46, 23);
		frame.getContentPane().add(btnNewButton_3_18);
		
		JButton btnNewButton_3_19 = new JButton("20");
		btnNewButton_3_19.setBounds(303, 221, 46, 23);
		frame.getContentPane().add(btnNewButton_3_19);
		
		JButton btnNewButton_3_20 = new JButton("21");
		btnNewButton_3_20.setBounds(359, 221, 46, 23);
		frame.getContentPane().add(btnNewButton_3_20);
		
		JButton btnNewButton_3_21 = new JButton("22");
		btnNewButton_3_21.setBounds(20, 254, 46, 23);
		frame.getContentPane().add(btnNewButton_3_21);
		
		JButton btnNewButton_3_22 = new JButton("23");
		btnNewButton_3_22.setBounds(76, 254, 46, 23);
		frame.getContentPane().add(btnNewButton_3_22);
		
		JButton btnNewButton_3_23 = new JButton("24");
		btnNewButton_3_23.setBounds(132, 254, 46, 23);
		frame.getContentPane().add(btnNewButton_3_23);
		
		JButton btnNewButton_3_24 = new JButton("25");
		btnNewButton_3_24.setBounds(191, 254, 46, 23);
		frame.getContentPane().add(btnNewButton_3_24);
		
		JButton btnNewButton_3_25 = new JButton("26");
		btnNewButton_3_25.setBounds(247, 254, 46, 23);
		frame.getContentPane().add(btnNewButton_3_25);
		
		JButton btnNewButton_3_26 = new JButton("27");
		btnNewButton_3_26.setBounds(303, 254, 46, 23);
		frame.getContentPane().add(btnNewButton_3_26);
		
		JButton btnNewButton_3_27 = new JButton("28");
		btnNewButton_3_27.setBounds(359, 254, 46, 23);
		frame.getContentPane().add(btnNewButton_3_27);
		
		JButton btnNewButton_3_28 = new JButton("29");
		btnNewButton_3_28.setBounds(20, 287, 46, 23);
		frame.getContentPane().add(btnNewButton_3_28);
		
		JButton btnNewButton_3_29 = new JButton("30");
		btnNewButton_3_29.setBounds(76, 287, 46, 23);
		frame.getContentPane().add(btnNewButton_3_29);
		
		JButton btnNewButton_3_30 = new JButton("31");
		btnNewButton_3_30.setBounds(132, 287, 46, 23);
		frame.getContentPane().add(btnNewButton_3_30);
	}

}
