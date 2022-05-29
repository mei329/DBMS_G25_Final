import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Manager {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager window = new Manager();
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
	public Manager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 623, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7BA1\u7406\u8005\u4ECB\u9762");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(246, 35, 89, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u4F7F\u7528\u8005\u7BA1\u7406");
		btnNewButton.setBounds(154, 123, 106, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u8A02\u55AE\u7BA1\u7406");
		btnNewButton_1.setBounds(328, 123, 106, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u9ED1\u540D\u55AE\u7BA1\u7406");
		btnNewButton_2.setBounds(154, 225, 106, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\u5EA7\u4F4D\u7BA1\u7406");
		btnNewButton_2_1.setBounds(328, 225, 106, 48);
		frame.getContentPane().add(btnNewButton_2_1);
	}
}
