import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Manager_1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_1 window = new Manager_1();
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
	public Manager_1() {
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
		
		JButton btnNewButton_1 = new JButton("\u8A02\u55AE\u7BA1\u7406");
		btnNewButton_1.setBounds(229, 183, 106, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u9ED1\u540D\u55AE\u7BA1\u7406");
		btnNewButton_2.setBounds(78, 183, 106, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\u5EA7\u4F4D\u7BA1\u7406");
		btnNewButton_2_1.setBounds(395, 183, 106, 48);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_3.setBounds(34, 31, 85, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("\u767B\u51FA");
		btnNewButton_3_1.setBounds(485, 31, 85, 23);
		frame.getContentPane().add(btnNewButton_3_1);
	}
}
