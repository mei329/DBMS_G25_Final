import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Booking_page_1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking_page_1 window = new Booking_page_1();
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
	public Booking_page_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8A0E\u8AD6\u5BA4\u9810\u7D04");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(158, 49, 136, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u9054\u8CE2\u5716\u66F8\u9928");
		btnNewButton.setBounds(284, 149, 104, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" \u4E2D\u6B63\u5716\u66F8\u9928/\u5546\u5716/\u7D9C\u5716");
		btnNewButton_1.setBounds(41, 149, 159, 51);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u6B61\u8FCE (\u4F7F\u7528\u8005\u59D3\u540D+\u5B78\u865F)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(287, 24, 151, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(337, 45, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u8FD4\u56DE");
		btnNewButton_3.setBounds(20, 20, 85, 23);
		frame.getContentPane().add(btnNewButton_3);
	}

}
