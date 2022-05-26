import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Discussion_room_1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Discussion_room_1 window = new Discussion_room_1();
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
	public Discussion_room_1() {
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
		
		JLabel lblNewLabel = new JLabel("\u8A0E\u8AD6\u5BA4\u9810\u7D04");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(133, 25, 136, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u9054\u8CE2\u5716\u66F8\u9928");
		btnNewButton.setBounds(75, 70, 104, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4E2D\u6B63\u5716\u66F8\u9928");
		btnNewButton_1.setBounds(224, 70, 104, 51);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5546\u9662\u5716\u66F8\u9928");
		btnNewButton_2.setBounds(75, 162, 104, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u7D9C\u5408\u5716\u66F8\u9928");
		btnNewButton_3.setBounds(224, 161, 104, 51);
		frame.getContentPane().add(btnNewButton_3);
	}

}
