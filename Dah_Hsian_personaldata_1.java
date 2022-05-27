import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Dah_Hsian_personaldata_1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dah_Hsian_personaldata_1 window = new Dah_Hsian_personaldata_1();
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
	public Dah_Hsian_personaldata_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.setBounds(10, 35, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(247, 39, 77, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(664, 163, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("\u767B\u51FA");
		btnNewButton.setBounds(489, 35, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("\u9810\u7D04");
		btnNewButton_3.setBounds(15, 151, 85, 47);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3_1.setBounds(15, 225, 85, 55);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(10, 306, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_1.setBounds(211, 133, 46, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u8B49\u865F\uFF1A");
		lblNewLabel_1_1.setBounds(211, 167, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u7CFB\u6240\uFF1A");
		lblNewLabel_1_1_1.setBounds(211, 208, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("\u5B78\u5236\uFF1A");
		lblNewLabel_1_1_1_1.setBounds(211, 245, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("\u5E33\u865F\uFF1A");
		lblNewLabel_1_1_1_2.setBounds(211, 284, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("\u96FB\u5B50\u90F5\u4EF6\uFF1A");
		lblNewLabel_1_1_1_3.setBounds(211, 326, 77, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1_3);
	}

}
