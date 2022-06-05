import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Otherlib_discussionroom_meetingroom_3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otherlib_discussionroom_meetingroom_3 window = new Otherlib_discussionroom_meetingroom_3();
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
	public Otherlib_discussionroom_meetingroom_3() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u56DE\u9996\u9801");
		btnNewButton.setBounds(32, 26, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u96C6\u601D\u5C0F\u9593");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(241, 30, 95, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(470, 26, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("\u9810\u7D04");
		btnNewButton_1.setBounds(46, 94, 85, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(46, 181, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(46, 276, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("\u9810\u7D04\u6210\u529F");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(257, 181, 75, 15);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
