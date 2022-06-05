import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Otherlib_discussionroom_commerce_3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otherlib_discussionroom_commerce_3 window = new Otherlib_discussionroom_commerce_3();
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
	public Otherlib_discussionroom_commerce_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u56DE\u9996\u9801");
		btnNewButton.setBounds(21, 21, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u5546\u5716");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(230, 25, 95, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(459, 21, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("\u9810\u7D04");
		btnNewButton_1.setBounds(35, 89, 85, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(35, 176, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(35, 271, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("\u9810\u7D04\u6210\u529F");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(246, 176, 75, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		frame.setVisible(true);
	}

}
