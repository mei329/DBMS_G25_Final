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
		frame.setBounds(100, 100, 451, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u81EA\u7FD2\u4F4D\u7F6E\u5340\u5283\u4F4D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(149, 38, 115, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("A\u5340");
		btnNewButton.setBounds(99, 103, 85, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnB = new JButton("B\u5340");
		btnB.setBounds(220, 103, 85, 38);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C\u5340");
		btnC.setBounds(99, 174, 85, 38);
		frame.getContentPane().add(btnC);
		
		JButton btnD = new JButton("D\u5340");
		btnD.setBounds(220, 174, 85, 38);
		frame.getContentPane().add(btnD);
	}

}
