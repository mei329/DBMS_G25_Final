package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dah_Hsian_personaldata_1 extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		
		JButton btnHome = new JButton("\u56DE\u9996\u9801");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnHome.setBounds(10, 35, 85, 23);
		frame.getContentPane().add(btnHome);
		
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
		
		textField = new JTextField();
		textField.setBounds(265, 130, 96, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(265, 164, 96, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(267, 205, 96, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(267, 242, 96, 21);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(265, 281, 96, 21);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(277, 323, 96, 21);
		frame.getContentPane().add(textField_5);
		
		frame.setVisible(true);
	}
}
