import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;

public class Study_location_2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private long id;
	private User user = new User();
	private String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study_location_2 window = new Study_location_2(109405094);
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
	public Study_location_2(long id) {
		this.id=id;
		name = user.getUser(id);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219,219,178));
		frame.setBounds(100, 100, 1234, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A\u5340");
		lblNewLabel.setFont(new Font("Optima", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(570, 28, 95, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Study_location_1 study = new Study_location_1(id);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnNewButton_1.setForeground(new Color(115,121,59));
		btnNewButton_1.setBounds(29, 47, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setForeground(new Color(115,121,59));
		btnNewButton_3.setBounds(51, 218, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnNewButton_4.setForeground(new Color(115,121,59));
		btnNewButton_4.setBounds(51, 355, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("A064");
		chckbxNewCheckBox_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1.setBounds(286, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("A063");
		chckbxNewCheckBox_1_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1.setBounds(345, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("A062");
		chckbxNewCheckBox_1_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_2.setBounds(456, 98, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("A061");
		chckbxNewCheckBox_1_1_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_1.setBounds(515, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("A060");
		chckbxNewCheckBox_1_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_3.setBounds(620, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("A059");
		chckbxNewCheckBox_1_1_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_2.setBounds(679, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_2);
		
		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("A058");
		chckbxNewCheckBox_1_4.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_4.setBounds(782, 98, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_4);
		
		JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("A057");
		chckbxNewCheckBox_1_1_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_3.setBounds(841, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_3);
		
		JCheckBox chckbxNewCheckBox_1_5 = new JCheckBox("A029");
		chckbxNewCheckBox_1_5.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5.setBounds(286, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5);
		
		JCheckBox chckbxNewCheckBox_1_1_4 = new JCheckBox("A025");
		chckbxNewCheckBox_1_1_4.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4.setBounds(345, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4);
		
		JCheckBox chckbxNewCheckBox_1_6 = new JCheckBox("A030");
		chckbxNewCheckBox_1_6.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6.setBounds(286, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6);
		
		JCheckBox chckbxNewCheckBox_1_1_5 = new JCheckBox("A026");
		chckbxNewCheckBox_1_1_5.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5.setBounds(345, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5);
		
		JCheckBox chckbxNewCheckBox_1_7 = new JCheckBox("A031");
		chckbxNewCheckBox_1_7.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7.setBounds(286, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7);
		
		JCheckBox chckbxNewCheckBox_1_1_6 = new JCheckBox("A027");
		chckbxNewCheckBox_1_1_6.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6.setBounds(345, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6);
		
		JCheckBox chckbxNewCheckBox_1_8 = new JCheckBox("A032");
		chckbxNewCheckBox_1_8.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8.setBounds(286, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8);
		
		JCheckBox chckbxNewCheckBox_1_1_7 = new JCheckBox("A028");
		chckbxNewCheckBox_1_1_7.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7.setBounds(345, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7);
		
		JCheckBox chckbxNewCheckBox_1_5_1 = new JCheckBox("A021");
		chckbxNewCheckBox_1_5_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_1.setBounds(456, 154, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_1);
		
		JCheckBox chckbxNewCheckBox_1_1_4_1 = new JCheckBox("A017");
		chckbxNewCheckBox_1_1_4_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_1.setBounds(515, 154, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_1);
		
		JCheckBox chckbxNewCheckBox_1_6_1 = new JCheckBox("A022");
		chckbxNewCheckBox_1_6_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_1.setBounds(456, 179, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_1);
		
		JCheckBox chckbxNewCheckBox_1_1_5_1 = new JCheckBox("A018");
		chckbxNewCheckBox_1_1_5_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_1.setBounds(515, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_1);
		
		JCheckBox chckbxNewCheckBox_1_7_1 = new JCheckBox("A023");
		chckbxNewCheckBox_1_7_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_1.setBounds(456, 207, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_1);
		
		JCheckBox chckbxNewCheckBox_1_1_6_1 = new JCheckBox("A019");
		chckbxNewCheckBox_1_1_6_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_1.setBounds(515, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_1);
		
		JCheckBox chckbxNewCheckBox_1_8_1 = new JCheckBox("A024");
		chckbxNewCheckBox_1_8_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_1.setBounds(456, 232, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_1);
		
		JCheckBox chckbxNewCheckBox_1_1_7_1 = new JCheckBox("A020");
		chckbxNewCheckBox_1_1_7_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_1.setBounds(515, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_1);
		
		JCheckBox chckbxNewCheckBox_1_5_2 = new JCheckBox("A013");
		chckbxNewCheckBox_1_5_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_2.setBounds(620, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_2);
		
		JCheckBox chckbxNewCheckBox_1_1_4_2 = new JCheckBox("A009");
		chckbxNewCheckBox_1_1_4_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_2.setBounds(620, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_2);
		
		JCheckBox chckbxNewCheckBox_1_6_2 = new JCheckBox("A014");
		chckbxNewCheckBox_1_6_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_2.setBounds(620, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_2);
		
		JCheckBox chckbxNewCheckBox_1_1_5_2 = new JCheckBox("A010");
		chckbxNewCheckBox_1_1_5_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_2.setBounds(679, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_2);
		
		JCheckBox chckbxNewCheckBox_1_7_2 = new JCheckBox("A015");
		chckbxNewCheckBox_1_7_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_7_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_2.setBounds(620, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_2);
		
		JCheckBox chckbxNewCheckBox_1_1_6_2 = new JCheckBox("A011");
		chckbxNewCheckBox_1_1_6_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_2.setBounds(679, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_2);
		
		JCheckBox chckbxNewCheckBox_1_8_2 = new JCheckBox("A016");
		chckbxNewCheckBox_1_8_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_8_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_2.setBounds(620, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_2);
		
		JCheckBox chckbxNewCheckBox_1_1_7_2 = new JCheckBox("A012");
		chckbxNewCheckBox_1_1_7_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_7_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_2.setBounds(679, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_2);
		
		JCheckBox chckbxNewCheckBox_1_5_3 = new JCheckBox("A005");
		chckbxNewCheckBox_1_5_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_3.setBounds(782, 154, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_3);
		
		JCheckBox chckbxNewCheckBox_1_1_4_3 = new JCheckBox("A001");
		chckbxNewCheckBox_1_1_4_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_3.setBounds(841, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_3);
		
		JCheckBox chckbxNewCheckBox_1_6_3 = new JCheckBox("A006");
		chckbxNewCheckBox_1_6_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_3.setBounds(782, 179, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_3);
		
		JCheckBox chckbxNewCheckBox_1_1_5_3 = new JCheckBox("A002");
		chckbxNewCheckBox_1_1_5_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_3.setBounds(841, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_3);
		
		JCheckBox chckbxNewCheckBox_1_7_3 = new JCheckBox("A007");
		chckbxNewCheckBox_1_7_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_7_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_3.setBounds(782, 207, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_3);
		
		JCheckBox chckbxNewCheckBox_1_1_6_3 = new JCheckBox("A003");
		chckbxNewCheckBox_1_1_6_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_6_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_3.setBounds(841, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_3);
		
		JCheckBox chckbxNewCheckBox_1_8_3 = new JCheckBox("A008");
		chckbxNewCheckBox_1_8_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_8_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_3.setBounds(782, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_3);
		
		JCheckBox chckbxNewCheckBox_1_1_7_3 = new JCheckBox("A004");
		chckbxNewCheckBox_1_1_7_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_7_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_3.setBounds(841, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_3);
		
		JCheckBox chckbxNewCheckBox_1_5_4 = new JCheckBox("AN05");
		chckbxNewCheckBox_1_5_4.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_4.setBounds(945, 154, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_4);
		
		JCheckBox chckbxNewCheckBox_1_1_4_4 = new JCheckBox("AN01");
		chckbxNewCheckBox_1_1_4_4.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_4.setBounds(1004, 154, 73, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_4);
		
		JCheckBox chckbxNewCheckBox_1_6_4 = new JCheckBox("AN06");
		chckbxNewCheckBox_1_6_4.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_4.setBounds(945, 179, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_4);
		
		JCheckBox chckbxNewCheckBox_1_1_5_4 = new JCheckBox("AN02");
		chckbxNewCheckBox_1_1_5_4.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_4.setBounds(1004, 179, 73, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_4);
		
		JCheckBox chckbxNewCheckBox_1_7_4 = new JCheckBox("AN07");
		chckbxNewCheckBox_1_7_4.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_7_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_4.setBounds(945, 207, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_4);
		
		JCheckBox chckbxNewCheckBox_1_1_6_4 = new JCheckBox("AN03");
		chckbxNewCheckBox_1_1_6_4.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_6_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_4.setBounds(1004, 207, 73, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_4);
		
		JCheckBox chckbxNewCheckBox_1_8_4 = new JCheckBox("AN08");
		chckbxNewCheckBox_1_8_4.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_8_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_4.setBounds(945, 232, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_4);
		
		JCheckBox chckbxNewCheckBox_1_1_7_4 = new JCheckBox("AN04");
		chckbxNewCheckBox_1_1_7_4.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_7_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_4.setBounds(1004, 232, 73, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_4);
		
		JCheckBox chckbxNewCheckBox_1_5_5 = new JCheckBox("A055");
		chckbxNewCheckBox_1_5_5.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_5.setBounds(206, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_5);
		
		JCheckBox chckbxNewCheckBox_1_1_4_5 = new JCheckBox("A053");
		chckbxNewCheckBox_1_1_4_5.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_5.setBounds(265, 281, 76, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_5);
		
		JCheckBox chckbxNewCheckBox_1_6_5 = new JCheckBox("A056");
		chckbxNewCheckBox_1_6_5.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_5.setBounds(206, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_5);
		
		JCheckBox chckbxNewCheckBox_1_1_5_5 = new JCheckBox("A054");
		chckbxNewCheckBox_1_1_5_5.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_5.setBounds(265, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_5);
		
		JCheckBox chckbxNewCheckBox_1_5_6 = new JCheckBox("A051");
		chckbxNewCheckBox_1_5_6.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_6.setBounds(385, 281, 72, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_6);
		
		JCheckBox chckbxNewCheckBox_1_1_4_6 = new JCheckBox("A049");
		chckbxNewCheckBox_1_1_4_6.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_6.setBounds(444, 281, 90, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_6);
		
		JCheckBox chckbxNewCheckBox_1_6_6 = new JCheckBox("A052");
		chckbxNewCheckBox_1_6_6.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_6.setBounds(385, 306, 72, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_6);
		
		JCheckBox chckbxNewCheckBox_1_1_5_6 = new JCheckBox("A048");
		chckbxNewCheckBox_1_1_5_6.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_6.setBounds(444, 306, 90, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_6);
		
		JCheckBox chckbxNewCheckBox_1_5_7 = new JCheckBox("A047");
		chckbxNewCheckBox_1_5_7.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_7.setBounds(551, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_7);
		
		JCheckBox chckbxNewCheckBox_1_1_4_7 = new JCheckBox("A045");
		chckbxNewCheckBox_1_1_4_7.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_7.setBounds(610, 281, 76, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_7);
		
		JCheckBox chckbxNewCheckBox_1_6_7 = new JCheckBox("A048");
		chckbxNewCheckBox_1_6_7.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_7.setBounds(551, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_7);
		
		JCheckBox chckbxNewCheckBox_1_1_5_7 = new JCheckBox("A046");
		chckbxNewCheckBox_1_1_5_7.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_7.setBounds(610, 306, 76, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_7);
		
		JCheckBox chckbxNewCheckBox_1_5_8 = new JCheckBox("A043");
		chckbxNewCheckBox_1_5_8.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_8.setBounds(713, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_8);
		
		JCheckBox chckbxNewCheckBox_1_1_4_8 = new JCheckBox("A041");
		chckbxNewCheckBox_1_1_4_8.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_8.setBounds(772, 281, 76, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_8);
		
		JCheckBox chckbxNewCheckBox_1_6_8 = new JCheckBox("A044");
		chckbxNewCheckBox_1_6_8.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_8.setBounds(713, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_8);
		
		JCheckBox chckbxNewCheckBox_1_1_5_8 = new JCheckBox("A042");
		chckbxNewCheckBox_1_1_5_8.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_8.setBounds(772, 306, 76, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_8);
		
		JCheckBox chckbxNewCheckBox_1_5_9 = new JCheckBox("A039");
		chckbxNewCheckBox_1_5_9.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_9.setBounds(876, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_9);
		
		JCheckBox chckbxNewCheckBox_1_1_4_9 = new JCheckBox("A037");
		chckbxNewCheckBox_1_1_4_9.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_9.setBounds(935, 281, 75, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_9);
		
		JCheckBox chckbxNewCheckBox_1_6_9 = new JCheckBox("A040");
		chckbxNewCheckBox_1_6_9.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_9.setBounds(876, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_9);
		
		JCheckBox chckbxNewCheckBox_1_1_5_9 = new JCheckBox("A038");
		chckbxNewCheckBox_1_1_5_9.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_9.setBounds(935, 306, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_9);
		
		JCheckBox chckbxNewCheckBox_1_5_10 = new JCheckBox("A035");
		chckbxNewCheckBox_1_5_10.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_10.setBounds(1022, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_10);
		
		JCheckBox chckbxNewCheckBox_1_1_4_10 = new JCheckBox("A033");
		chckbxNewCheckBox_1_1_4_10.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_10.setBounds(1081, 281, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_10);
		
		JCheckBox chckbxNewCheckBox_1_6_10 = new JCheckBox("A036");
		chckbxNewCheckBox_1_6_10.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_6_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_10.setBounds(1022, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_10);
		
		JCheckBox chckbxNewCheckBox_1_1_5_10 = new JCheckBox("A034");
		chckbxNewCheckBox_1_1_5_10.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_5_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_10.setBounds(1081, 306, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_10);
		
		JCheckBox chckbxNewCheckBox_1_5_11 = new JCheckBox("AH13");
		chckbxNewCheckBox_1_5_11.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_11.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_11.setBounds(286, 353, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_11);
		
		JCheckBox chckbxNewCheckBox_1_1_4_11 = new JCheckBox("AH12");
		chckbxNewCheckBox_1_1_4_11.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_11.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_11.setBounds(345, 353, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_11);
		
		JCheckBox chckbxNewCheckBox_1_5_12 = new JCheckBox("AH11");
		chckbxNewCheckBox_1_5_12.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_12.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_12.setBounds(402, 353, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_12);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12 = new JCheckBox("AH10");
		chckbxNewCheckBox_1_1_4_12.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_12.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12.setBounds(461, 353, 73, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_1 = new JCheckBox("AH9");
		chckbxNewCheckBox_1_1_4_12_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_12_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1.setBounds(526, 353, 80, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1);
		
		JCheckBox chckbxNewCheckBox_1_5_11_1 = new JCheckBox("AH8");
		chckbxNewCheckBox_1_5_11_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_11_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_11_1.setBounds(608, 353, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_11_1);
		
		JCheckBox chckbxNewCheckBox_1_1_4_11_1 = new JCheckBox("AH7");
		chckbxNewCheckBox_1_1_4_11_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_11_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_11_1.setBounds(667, 353, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_11_1);
		
		JCheckBox chckbxNewCheckBox_1_5_12_1 = new JCheckBox("AH6");
		chckbxNewCheckBox_1_5_12_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_5_12_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_12_1.setBounds(724, 353, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_12_1);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_2 = new JCheckBox("AH5");
		chckbxNewCheckBox_1_1_4_12_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_12_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_2.setBounds(783, 353, 77, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_2);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1 = new JCheckBox("AH4");
		chckbxNewCheckBox_1_1_4_12_1_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_12_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1.setBounds(840, 353, 85, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1_1 = new JCheckBox("AH3");
		chckbxNewCheckBox_1_1_4_12_1_1_1.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_12_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1_1.setBounds(903, 353, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1_2 = new JCheckBox("AH2");
		chckbxNewCheckBox_1_1_4_12_1_1_2.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_12_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1_2.setBounds(958, 353, 78, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1_3 = new JCheckBox("AH1");
		chckbxNewCheckBox_1_1_4_12_1_1_3.setForeground(new Color(66,66,28));
		chckbxNewCheckBox_1_1_4_12_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1_3.setBounds(1015, 353, 73, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(473, 423, 129, 23);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(635, 423, 134, 23);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(791, 423, 134, 23);
		frame.getContentPane().add(comboBox_1_1);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(943, 423, 134, 23);
		frame.getContentPane().add(comboBox_1_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(473, 491, 129, 23);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(635, 489, 129, 23);
		frame.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(791, 491, 129, 23);
		frame.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(943, 489, 129, 23);
		frame.getContentPane().add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(473, 563, 129, 23);
		frame.getContentPane().add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(635, 563, 129, 23);
		frame.getContentPane().add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(791, 561, 129, 23);
		frame.getContentPane().add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(943, 561, 129, 23);
		frame.getContentPane().add(comboBox_9);
		
		JLabel studentID = new JLabel();
		studentID.setHorizontalAlignment(SwingConstants.CENTER);
		studentID.setForeground(new Color(144,140,72));
		studentID.setText(Long.toString(id));
		studentID.setBounds(265, 420, 130, 26);
		frame.getContentPane().add(studentID);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(265, 488, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(265, 560, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("其他使用者1");
		lblNewLabel_1.setForeground(new Color(115,121,59));
		lblNewLabel_1.setBounds(162, 493, 78, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("其他使用者2");
		lblNewLabel_2.setForeground(new Color(115,121,59));
		lblNewLabel_2.setBounds(162, 565, 78, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		frame.setVisible(true);
	}
}