package ui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Study_location_1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study_location_1 window = new Study_location_1();
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
	public Study_location_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 506, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u81EA\u7FD2\u4F4D\u7F6E\u5340\u5283\u4F4D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(182, 37, 115, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("A\u5340");
		btnNewButton.setBounds(73, 163, 85, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnB = new JButton("B\u5340");
		btnB.setBounds(212, 163, 85, 38);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("A1\u5340");
		btnC.setBounds(73, 227, 85, 38);
		frame.getContentPane().add(btnC);
		
		JButton btnD = new JButton("C\u5340");
		btnD.setBounds(342, 163, 85, 38);
		frame.getContentPane().add(btnD);
		
		JLabel lblNewLabel_1 = new JLabel("\u53EF\u4F7F\u7528\u7B46\u96FB\u5340");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(67, 103, 91, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u53EF\u4F7F\u7528\u7B46\u96FB\u5340");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(206, 103, 91, 28);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u53EF\u4F7F\u7528\u7B46\u96FB\u5340");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(336, 103, 91, 28);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.setBounds(26, 40, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
