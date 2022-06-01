import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class Otherlib_discussionroom_socialscience_2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otherlib_discussionroom_socialscience_2 window = new Otherlib_discussionroom_socialscience_2();
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
	public Otherlib_discussionroom_socialscience_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 935, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.setBounds(26, 29, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u7D9C\u5716");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(362, 33, 77, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(720, 29, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u7D9C\u5716\u7814\u8A0E\u5BA4\u4E8C");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(177, 169, 109, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2022-5-27");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(318, 169, 85, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\u9810\u7D04");
		btnNewButton.setBounds(34, 174, 85, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(34, 293, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(34, 460, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("15:00-15:30");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(453, 169, 85, 22);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\u4EBA\u6578\u9650\u52363-12\u4EBA");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(593, 169, 129, 22);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("\u5176\u4ED6\u4F7F\u7528\u8005");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(177, 246, 109, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("\u8ACB\u8F38\u5165\u8B49\u865F\uFF1A");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(183, 279, 85, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(267, 276, 96, 21);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_3_2 = new JLabel("\u79DF\u501F\u8005");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("新細明體", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(464, 247, 74, 21);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setBounds(464, 279, 74, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("\u7CFB\u6240\uFF1A");
		lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_1.setBounds(464, 313, 74, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("\u8B49\u865F\uFF1A");
		lblNewLabel_3_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_2.setBounds(464, 341, 74, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_3_2_1_3 = new JLabel("\u65E5\u671F\uFF1A");
		lblNewLabel_3_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_3.setBounds(464, 366, 74, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_3);
		
		JButton btnNewButton_5 = new JButton("\u9810\u7D04");
		btnNewButton_5.setBounds(497, 476, 85, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\u65B0\u589E");
		btnNewButton_6.setBounds(295, 305, 68, 30);
		frame.getContentPane().add(btnNewButton_6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(527, 276, 96, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(527, 310, 96, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(527, 338, 96, 21);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(527, 366, 96, 21);
		frame.getContentPane().add(textField_4);
	}

}
