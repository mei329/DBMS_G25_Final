import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Booking_page {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking_page window = new Booking_page();
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
	public Booking_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\u6B61\u8FCE (\u4F7F\u7528\u8005\u59D3\u540D+\u5B78\u865F)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(134, 30, 151, 15);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("\u8A0E\u8AD6\u5BA4\u9810\u7D04");
		btnNewButton.setBounds(44, 110, 151, 74);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u5716\u66F8\u9928\u81EA\u7FD2\u4F4D\u7F6E\u5283\u4F4D");
		btnNewButton_1.setBounds(239, 110, 159, 74);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(313, 26, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
