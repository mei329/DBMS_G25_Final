import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Otherlib_discussionroom_1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otherlib_discussionroom_1 window = new Otherlib_discussionroom_1();
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
	public Otherlib_discussionroom_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 656, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u6B61\u8FCE (\u4F7F\u7528\u8005\u59D3\u540D+\u5B78\u865F)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(452, 32, 151, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(428, 57, 85, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(534, 57, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.setBounds(26, 57, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel(" \u4E2D\u6B63\u5716\u66F8\u9928/\u5546\u5716/\u7D9C\u5716");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(196, 44, 185, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u7814\u7A76\u5C0F\u9593");
		btnNewButton_1.setBounds(54, 190, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u96C6\u601D\u5C0F\u9593");
		btnNewButton_1_1.setBounds(183, 190, 85, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("\u5546\u5716\u7814\u8A0E\u5BA4");
		btnNewButton_1_2.setBounds(320, 190, 116, 23);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("\u7D9C\u5716\u7814\u8A0E\u5BA4");
		btnNewButton_1_3.setBounds(475, 190, 104, 23);
		frame.getContentPane().add(btnNewButton_1_3);
	}

}
