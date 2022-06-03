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

public class Study_location_2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study_location_2 window = new Study_location_2();
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
	public Study_location_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1234, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A\u5340");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(570, 28, 78, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u9996\u9801");
		btnNewButton_1.setBounds(29, 47, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(29, 207, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(29, 353, 90, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("A064");
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1.setBounds(286, 98, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("A063");
		chckbxNewCheckBox_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1.setBounds(345, 98, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("A062");
		chckbxNewCheckBox_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_2.setBounds(456, 98, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("A061");
		chckbxNewCheckBox_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_1.setBounds(515, 98, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("A060");
		chckbxNewCheckBox_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_3.setBounds(620, 98, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("A059");
		chckbxNewCheckBox_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_2.setBounds(679, 98, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_2);
		
		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("A058");
		chckbxNewCheckBox_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_4.setBounds(782, 98, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_4);
		
		JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("A057");
		chckbxNewCheckBox_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_3.setBounds(841, 98, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_3);
		
		JCheckBox chckbxNewCheckBox_1_5 = new JCheckBox("A029");
		chckbxNewCheckBox_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5.setBounds(286, 154, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5);
		
		JCheckBox chckbxNewCheckBox_1_1_4 = new JCheckBox("A025");
		chckbxNewCheckBox_1_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4.setBounds(345, 154, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4);
		
		JCheckBox chckbxNewCheckBox_1_6 = new JCheckBox("A030");
		chckbxNewCheckBox_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6.setBounds(286, 179, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6);
		
		JCheckBox chckbxNewCheckBox_1_1_5 = new JCheckBox("A026");
		chckbxNewCheckBox_1_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5.setBounds(345, 179, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5);
		
		JCheckBox chckbxNewCheckBox_1_7 = new JCheckBox("A031");
		chckbxNewCheckBox_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7.setBounds(286, 207, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7);
		
		JCheckBox chckbxNewCheckBox_1_1_6 = new JCheckBox("A027");
		chckbxNewCheckBox_1_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6.setBounds(345, 207, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6);
		
		JCheckBox chckbxNewCheckBox_1_8 = new JCheckBox("A032");
		chckbxNewCheckBox_1_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8.setBounds(286, 232, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8);
		
		JCheckBox chckbxNewCheckBox_1_1_7 = new JCheckBox("A028");
		chckbxNewCheckBox_1_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7.setBounds(345, 232, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7);
		
		JCheckBox chckbxNewCheckBox_1_5_1 = new JCheckBox("A021");
		chckbxNewCheckBox_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_1.setBounds(456, 154, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_1);
		
		JCheckBox chckbxNewCheckBox_1_1_4_1 = new JCheckBox("A017");
		chckbxNewCheckBox_1_1_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_1.setBounds(515, 154, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_1);
		
		JCheckBox chckbxNewCheckBox_1_6_1 = new JCheckBox("A022");
		chckbxNewCheckBox_1_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_1.setBounds(456, 179, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_1);
		
		JCheckBox chckbxNewCheckBox_1_1_5_1 = new JCheckBox("A018");
		chckbxNewCheckBox_1_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_1.setBounds(515, 179, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_1);
		
		JCheckBox chckbxNewCheckBox_1_7_1 = new JCheckBox("A023");
		chckbxNewCheckBox_1_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_1.setBounds(456, 207, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_1);
		
		JCheckBox chckbxNewCheckBox_1_1_6_1 = new JCheckBox("A019");
		chckbxNewCheckBox_1_1_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_1.setBounds(515, 207, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_1);
		
		JCheckBox chckbxNewCheckBox_1_8_1 = new JCheckBox("A024");
		chckbxNewCheckBox_1_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_1.setBounds(456, 232, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_1);
		
		JCheckBox chckbxNewCheckBox_1_1_7_1 = new JCheckBox("A020");
		chckbxNewCheckBox_1_1_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_1.setBounds(515, 232, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_1);
		
		JCheckBox chckbxNewCheckBox_1_5_2 = new JCheckBox("A013");
		chckbxNewCheckBox_1_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_2.setBounds(620, 154, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_2);
		
		JCheckBox chckbxNewCheckBox_1_1_4_2 = new JCheckBox("A009");
		chckbxNewCheckBox_1_1_4_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_2.setBounds(679, 154, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_2);
		
		JCheckBox chckbxNewCheckBox_1_6_2 = new JCheckBox("A014");
		chckbxNewCheckBox_1_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_2.setBounds(620, 179, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_2);
		
		JCheckBox chckbxNewCheckBox_1_1_5_2 = new JCheckBox("A010");
		chckbxNewCheckBox_1_1_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_2.setBounds(679, 179, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_2);
		
		JCheckBox chckbxNewCheckBox_1_7_2 = new JCheckBox("A015");
		chckbxNewCheckBox_1_7_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_2.setBounds(620, 207, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_2);
		
		JCheckBox chckbxNewCheckBox_1_1_6_2 = new JCheckBox("A011");
		chckbxNewCheckBox_1_1_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_2.setBounds(679, 207, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_2);
		
		JCheckBox chckbxNewCheckBox_1_8_2 = new JCheckBox("A016");
		chckbxNewCheckBox_1_8_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_2.setBounds(620, 232, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_2);
		
		JCheckBox chckbxNewCheckBox_1_1_7_2 = new JCheckBox("A012");
		chckbxNewCheckBox_1_1_7_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_2.setBounds(679, 232, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_2);
		
		JCheckBox chckbxNewCheckBox_1_5_3 = new JCheckBox("A005");
		chckbxNewCheckBox_1_5_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_3.setBounds(782, 154, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_3);
		
		JCheckBox chckbxNewCheckBox_1_1_4_3 = new JCheckBox("A001");
		chckbxNewCheckBox_1_1_4_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_3.setBounds(841, 154, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_3);
		
		JCheckBox chckbxNewCheckBox_1_6_3 = new JCheckBox("A006");
		chckbxNewCheckBox_1_6_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_3.setBounds(782, 179, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_3);
		
		JCheckBox chckbxNewCheckBox_1_1_5_3 = new JCheckBox("A002");
		chckbxNewCheckBox_1_1_5_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_3.setBounds(841, 179, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_3);
		
		JCheckBox chckbxNewCheckBox_1_7_3 = new JCheckBox("A007");
		chckbxNewCheckBox_1_7_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_3.setBounds(782, 207, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_3);
		
		JCheckBox chckbxNewCheckBox_1_1_6_3 = new JCheckBox("A003");
		chckbxNewCheckBox_1_1_6_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_3.setBounds(841, 207, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_3);
		
		JCheckBox chckbxNewCheckBox_1_8_3 = new JCheckBox("A008");
		chckbxNewCheckBox_1_8_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_3.setBounds(782, 232, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_3);
		
		JCheckBox chckbxNewCheckBox_1_1_7_3 = new JCheckBox("A004");
		chckbxNewCheckBox_1_1_7_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_3.setBounds(841, 232, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_3);
		
		JCheckBox chckbxNewCheckBox_1_5_4 = new JCheckBox("AN05");
		chckbxNewCheckBox_1_5_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_4.setBounds(945, 154, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_4);
		
		JCheckBox chckbxNewCheckBox_1_1_4_4 = new JCheckBox("AN01");
		chckbxNewCheckBox_1_1_4_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_4.setBounds(1004, 154, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_4);
		
		JCheckBox chckbxNewCheckBox_1_6_4 = new JCheckBox("AN06");
		chckbxNewCheckBox_1_6_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_4.setBounds(945, 179, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_4);
		
		JCheckBox chckbxNewCheckBox_1_1_5_4 = new JCheckBox("AN02");
		chckbxNewCheckBox_1_1_5_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_4.setBounds(1004, 179, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_4);
		
		JCheckBox chckbxNewCheckBox_1_7_4 = new JCheckBox("AN07");
		chckbxNewCheckBox_1_7_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_4.setBounds(945, 207, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_4);
		
		JCheckBox chckbxNewCheckBox_1_1_6_4 = new JCheckBox("AN03");
		chckbxNewCheckBox_1_1_6_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_4.setBounds(1004, 207, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_4);
		
		JCheckBox chckbxNewCheckBox_1_8_4 = new JCheckBox("AN08");
		chckbxNewCheckBox_1_8_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_4.setBounds(945, 232, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_4);
		
		JCheckBox chckbxNewCheckBox_1_1_7_4 = new JCheckBox("AN04");
		chckbxNewCheckBox_1_1_7_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_4.setBounds(1004, 232, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_4);
		
		JCheckBox chckbxNewCheckBox_1_5_5 = new JCheckBox("A055");
		chckbxNewCheckBox_1_5_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_5.setBounds(206, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_5);
		
		JCheckBox chckbxNewCheckBox_1_1_4_5 = new JCheckBox("A053");
		chckbxNewCheckBox_1_1_4_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_5.setBounds(265, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_5);
		
		JCheckBox chckbxNewCheckBox_1_6_5 = new JCheckBox("A056");
		chckbxNewCheckBox_1_6_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_5.setBounds(206, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_5);
		
		JCheckBox chckbxNewCheckBox_1_1_5_5 = new JCheckBox("A054");
		chckbxNewCheckBox_1_1_5_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_5.setBounds(265, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_5);
		
		JCheckBox chckbxNewCheckBox_1_5_6 = new JCheckBox("A051");
		chckbxNewCheckBox_1_5_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_6.setBounds(385, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_6);
		
		JCheckBox chckbxNewCheckBox_1_1_4_6 = new JCheckBox("A049");
		chckbxNewCheckBox_1_1_4_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_6.setBounds(444, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_6);
		
		JCheckBox chckbxNewCheckBox_1_6_6 = new JCheckBox("A052");
		chckbxNewCheckBox_1_6_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_6.setBounds(385, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_6);
		
		JCheckBox chckbxNewCheckBox_1_1_5_6 = new JCheckBox("A048");
		chckbxNewCheckBox_1_1_5_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_6.setBounds(444, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_6);
		
		JCheckBox chckbxNewCheckBox_1_5_7 = new JCheckBox("A047");
		chckbxNewCheckBox_1_5_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_7.setBounds(551, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_7);
		
		JCheckBox chckbxNewCheckBox_1_1_4_7 = new JCheckBox("A045");
		chckbxNewCheckBox_1_1_4_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_7.setBounds(610, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_7);
		
		JCheckBox chckbxNewCheckBox_1_6_7 = new JCheckBox("A048");
		chckbxNewCheckBox_1_6_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_7.setBounds(551, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_7);
		
		JCheckBox chckbxNewCheckBox_1_1_5_7 = new JCheckBox("A046");
		chckbxNewCheckBox_1_1_5_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_7.setBounds(610, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_7);
		
		JCheckBox chckbxNewCheckBox_1_5_8 = new JCheckBox("A043");
		chckbxNewCheckBox_1_5_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_8.setBounds(713, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_8);
		
		JCheckBox chckbxNewCheckBox_1_1_4_8 = new JCheckBox("A041");
		chckbxNewCheckBox_1_1_4_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_8.setBounds(772, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_8);
		
		JCheckBox chckbxNewCheckBox_1_6_8 = new JCheckBox("A044");
		chckbxNewCheckBox_1_6_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_8.setBounds(713, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_8);
		
		JCheckBox chckbxNewCheckBox_1_1_5_8 = new JCheckBox("A042");
		chckbxNewCheckBox_1_1_5_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_8.setBounds(772, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_8);
		
		JCheckBox chckbxNewCheckBox_1_5_9 = new JCheckBox("A039");
		chckbxNewCheckBox_1_5_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_9.setBounds(876, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_9);
		
		JCheckBox chckbxNewCheckBox_1_1_4_9 = new JCheckBox("A037");
		chckbxNewCheckBox_1_1_4_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_9.setBounds(935, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_9);
		
		JCheckBox chckbxNewCheckBox_1_6_9 = new JCheckBox("A040");
		chckbxNewCheckBox_1_6_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_9.setBounds(876, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_9);
		
		JCheckBox chckbxNewCheckBox_1_1_5_9 = new JCheckBox("A038");
		chckbxNewCheckBox_1_1_5_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_9.setBounds(935, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_9);
		
		JCheckBox chckbxNewCheckBox_1_5_10 = new JCheckBox("A035");
		chckbxNewCheckBox_1_5_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_10.setBounds(1022, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_10);
		
		JCheckBox chckbxNewCheckBox_1_1_4_10 = new JCheckBox("A033");
		chckbxNewCheckBox_1_1_4_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_10.setBounds(1081, 281, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_10);
		
		JCheckBox chckbxNewCheckBox_1_6_10 = new JCheckBox("A036");
		chckbxNewCheckBox_1_6_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_10.setBounds(1022, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_10);
		
		JCheckBox chckbxNewCheckBox_1_1_5_10 = new JCheckBox("A034");
		chckbxNewCheckBox_1_1_5_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_10.setBounds(1081, 306, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_10);
		
		JCheckBox chckbxNewCheckBox_1_5_11 = new JCheckBox("AH13");
		chckbxNewCheckBox_1_5_11.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_11.setBounds(286, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_11);
		
		JCheckBox chckbxNewCheckBox_1_1_4_11 = new JCheckBox("AH12");
		chckbxNewCheckBox_1_1_4_11.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_11.setBounds(345, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_11);
		
		JCheckBox chckbxNewCheckBox_1_5_12 = new JCheckBox("AH11");
		chckbxNewCheckBox_1_5_12.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_12.setBounds(402, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_12);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12 = new JCheckBox("AH10");
		chckbxNewCheckBox_1_1_4_12.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12.setBounds(461, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_1 = new JCheckBox("AH9");
		chckbxNewCheckBox_1_1_4_12_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1.setBounds(513, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1);
		
		JCheckBox chckbxNewCheckBox_1_5_11_1 = new JCheckBox("AH8");
		chckbxNewCheckBox_1_5_11_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_11_1.setBounds(608, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_11_1);
		
		JCheckBox chckbxNewCheckBox_1_1_4_11_1 = new JCheckBox("AH7");
		chckbxNewCheckBox_1_1_4_11_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_11_1.setBounds(667, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_11_1);
		
		JCheckBox chckbxNewCheckBox_1_5_12_1 = new JCheckBox("AH6");
		chckbxNewCheckBox_1_5_12_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_12_1.setBounds(724, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_12_1);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_2 = new JCheckBox("AH5");
		chckbxNewCheckBox_1_1_4_12_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_2.setBounds(783, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_2);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1 = new JCheckBox("AH4");
		chckbxNewCheckBox_1_1_4_12_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1.setBounds(840, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1_1 = new JCheckBox("AH3");
		chckbxNewCheckBox_1_1_4_12_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1_1.setBounds(903, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1_2 = new JCheckBox("AH2");
		chckbxNewCheckBox_1_1_4_12_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1_2.setBounds(958, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1_3 = new JCheckBox("AH1");
		chckbxNewCheckBox_1_1_4_12_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1_3.setBounds(1015, 353, 55, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(223, 418, 129, 23);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(385, 418, 134, 23);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(541, 418, 134, 23);
		frame.getContentPane().add(comboBox_1_1);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(693, 418, 134, 23);
		frame.getContentPane().add(comboBox_1_2);
	}
}
