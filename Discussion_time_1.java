import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Discussion_time_1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Discussion_time_1 window = new Discussion_time_1();
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
	public Discussion_time_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9810\u7D04\u6642\u6BB5");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(158, 28, 71, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("08:00-08:30");
		btnNewButton.setBounds(92, 65, 105, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("08:30-09:00");
		btnNewButton_1.setBounds(194, 65, 105, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("09:00-09:30");
		btnNewButton_2.setBounds(92, 86, 105, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("09:30-10:00");
		btnNewButton_3.setBounds(194, 86, 105, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("10:00-10:30");
		btnNewButton_4.setBounds(92, 107, 105, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("10:30-11:00");
		btnNewButton_5.setBounds(194, 107, 105, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("11:00-11:30");
		btnNewButton_6.setBounds(92, 128, 105, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("11:30-12:00");
		btnNewButton_7.setBounds(194, 128, 105, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("12:00-12:30");
		btnNewButton_8.setBounds(92, 150, 105, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("12:30-13:00");
		btnNewButton_9.setBounds(194, 150, 105, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("13:00-13:30");
		btnNewButton_10.setBounds(92, 171, 105, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("13:30-14:00");
		btnNewButton_11.setBounds(194, 171, 105, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("14:00-14:30");
		btnNewButton_12.setBounds(92, 193, 105, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("14:30-15:00");
		btnNewButton_13.setBounds(194, 193, 105, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("15:00-15:30");
		btnNewButton_14.setBounds(92, 214, 105, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("15:30-16:00");
		btnNewButton_15.setBounds(194, 214, 105, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("16:00-16:30");
		btnNewButton_16.setBounds(92, 236, 105, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("16:30-17:00");
		btnNewButton_17.setBounds(194, 236, 105, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("17:00-17:30");
		btnNewButton_18.setBounds(92, 257, 105, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("17:30-18:00");
		btnNewButton_19.setBounds(194, 257, 105, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("18:00-18:30");
		btnNewButton_20.setBounds(92, 278, 105, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("18:30-19:00");
		btnNewButton_21.setBounds(194, 278, 105, 23);
		frame.getContentPane().add(btnNewButton_21);
	}

}
