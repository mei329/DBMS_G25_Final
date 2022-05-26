import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Study_location_2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study_location_2 window = new Study_location_2();
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
	public Study_location_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblA = new JLabel("A\u5340");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(146, 26, 115, 28);
		frame.getContentPane().add(lblA);
		
		JLabel lblNewLabel = new JLabel("\u9810\u7D04\u6642\u6BB5");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(174, 64, 62, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("08:00-08:30");
		btnNewButton.setBounds(99, 103, 105, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("08:30-09:00");
		btnNewButton_1.setBounds(201, 103, 105, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("09:00-09:30");
		btnNewButton_2.setBounds(99, 124, 105, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("09:30-10:00");
		btnNewButton_3.setBounds(201, 124, 105, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("10:00-10:30");
		btnNewButton_4.setBounds(99, 145, 105, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("10:30-11:00");
		btnNewButton_5.setBounds(201, 145, 105, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("11:00-11:30");
		btnNewButton_6.setBounds(99, 166, 105, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("11:30-12:00");
		btnNewButton_7.setBounds(201, 166, 105, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("12:00-12:30");
		btnNewButton_8.setBounds(99, 188, 105, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("12:30-13:00");
		btnNewButton_9.setBounds(201, 188, 105, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("13:00-13:30");
		btnNewButton_10.setBounds(99, 209, 105, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("13:30-14:00");
		btnNewButton_11.setBounds(201, 209, 105, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("14:00-14:30");
		btnNewButton_12.setBounds(99, 231, 105, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("14:30-15:00");
		btnNewButton_13.setBounds(201, 231, 105, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("15:00-15:30");
		btnNewButton_14.setBounds(99, 252, 105, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("15:30-16:00");
		btnNewButton_15.setBounds(201, 252, 105, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("16:00-16:30");
		btnNewButton_16.setBounds(99, 274, 105, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("16:30-17:00");
		btnNewButton_17.setBounds(201, 274, 105, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("17:00-17:30");
		btnNewButton_18.setBounds(99, 295, 105, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("17:30-18:00");
		btnNewButton_19.setBounds(201, 295, 105, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("18:00-18:30");
		btnNewButton_20.setBounds(99, 316, 105, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("18:30-19:00");
		btnNewButton_21.setBounds(201, 316, 105, 23);
		frame.getContentPane().add(btnNewButton_21);
	}

}
