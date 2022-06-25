package GUI;

import Entity.Order;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;

public class SeatOrder_A {

	private JFrame frame;
	private JTextField tfodate;
	private JTextField tfoTimeStart;
	private JTextField tfoTimeEnd;
	private JTextField textField_1;
	private JTextField textField_2;
	private Order order = new Order();
	private ArrayList<String> checked;
	private ArrayList<String> bannedSeats;
	private long id;
	private String order_date;
	private double borrow_start;
	private double borrow_end;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeatOrder_A window = new SeatOrder_A(109405094);
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
	public SeatOrder_A(long id) {
		this.id = id;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219, 219, 178));
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
				Seat_page study = new Seat_page(id);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnNewButton_1.setForeground(new Color(115, 121, 59));
		btnNewButton_1.setBounds(29, 31, 85, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_3.setForeground(new Color(115, 121, 59));
		btnNewButton_3.setBounds(39, 110, 120, 40);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserActivity_page s3 = new UserActivity_page(id, "Seat");
				frame.setVisible(false);
			}
		});
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnNewButton_4.setForeground(new Color(115, 121, 59));
		btnNewButton_4.setBounds(39, 190, 120, 40);
		frame.getContentPane().add(btnNewButton_4);

		ArrayList<JCheckBox> checkboxes = new ArrayList<JCheckBox>();

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("A064");
		chckbxNewCheckBox_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1.setBounds(275, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		checkboxes.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("A063");
		chckbxNewCheckBox_1_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1.setBounds(343, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1);
		checkboxes.add(chckbxNewCheckBox_1_1);

		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("A062");
		chckbxNewCheckBox_1_2.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_2.setBounds(440, 98, 70, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_2);
		checkboxes.add(chckbxNewCheckBox_1_2);

		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("A061");
		chckbxNewCheckBox_1_1_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_1.setBounds(511, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1);
		checkboxes.add(chckbxNewCheckBox_1_1_1);

		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("A060");
		chckbxNewCheckBox_1_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_3.setBounds(609, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_3);
		checkboxes.add(chckbxNewCheckBox_1_3);

		JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("A059");
		chckbxNewCheckBox_1_1_2.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_2.setBounds(677, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_2);
		checkboxes.add(chckbxNewCheckBox_1_1_2);

		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("A058");
		chckbxNewCheckBox_1_4.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_4.setBounds(780, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_4);
		checkboxes.add(chckbxNewCheckBox_1_4);

		JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("A057");
		chckbxNewCheckBox_1_1_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_3.setBounds(848, 98, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_3);
		checkboxes.add(chckbxNewCheckBox_1_1_3);

		JCheckBox chckbxNewCheckBox_1_5 = new JCheckBox("A029");
		chckbxNewCheckBox_1_5.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5.setBounds(275, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5);
		checkboxes.add(chckbxNewCheckBox_1_5);

		JCheckBox chckbxNewCheckBox_1_1_4 = new JCheckBox("A025");
		chckbxNewCheckBox_1_1_4.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4.setBounds(343, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4);
		checkboxes.add(chckbxNewCheckBox_1_1_4);

		JCheckBox chckbxNewCheckBox_1_6 = new JCheckBox("A030");
		chckbxNewCheckBox_1_6.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6.setBounds(275, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6);
		checkboxes.add(chckbxNewCheckBox_1_6);

		JCheckBox chckbxNewCheckBox_1_1_5 = new JCheckBox("A026");
		chckbxNewCheckBox_1_1_5.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5.setBounds(343, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5);
		checkboxes.add(chckbxNewCheckBox_1_1_5);

		JCheckBox chckbxNewCheckBox_1_7 = new JCheckBox("A031");
		chckbxNewCheckBox_1_7.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7.setBounds(275, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7);
		checkboxes.add(chckbxNewCheckBox_1_7);

		JCheckBox chckbxNewCheckBox_1_1_6 = new JCheckBox("A027");
		chckbxNewCheckBox_1_1_6.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6.setBounds(343, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6);
		checkboxes.add(chckbxNewCheckBox_1_1_6);

		JCheckBox chckbxNewCheckBox_1_8 = new JCheckBox("A032");
		chckbxNewCheckBox_1_8.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8.setBounds(275, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8);
		checkboxes.add(chckbxNewCheckBox_1_8);

		JCheckBox chckbxNewCheckBox_1_1_7 = new JCheckBox("A028");
		chckbxNewCheckBox_1_1_7.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7.setBounds(343, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7);
		checkboxes.add(chckbxNewCheckBox_1_1_7);

		JCheckBox chckbxNewCheckBox_1_5_1 = new JCheckBox("A021");
		chckbxNewCheckBox_1_5_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_1.setBounds(440, 154, 70, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_1);
		checkboxes.add(chckbxNewCheckBox_1_5_1);

		JCheckBox chckbxNewCheckBox_1_1_4_1 = new JCheckBox("A017");
		chckbxNewCheckBox_1_1_4_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_1.setBounds(512, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_1);
		checkboxes.add(chckbxNewCheckBox_1_1_4_1);

		JCheckBox chckbxNewCheckBox_1_6_1 = new JCheckBox("A022");
		chckbxNewCheckBox_1_6_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_1.setBounds(440, 179, 70, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_1);
		checkboxes.add(chckbxNewCheckBox_1_6_1);

		JCheckBox chckbxNewCheckBox_1_1_5_1 = new JCheckBox("A018");
		chckbxNewCheckBox_1_1_5_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_1.setBounds(511, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_1);
		checkboxes.add(chckbxNewCheckBox_1_1_5_1);

		JCheckBox chckbxNewCheckBox_1_7_1 = new JCheckBox("A023");
		chckbxNewCheckBox_1_7_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_1.setBounds(440, 207, 70, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_1);
		checkboxes.add(chckbxNewCheckBox_1_7_1);

		JCheckBox chckbxNewCheckBox_1_1_6_1 = new JCheckBox("A019");
		chckbxNewCheckBox_1_1_6_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_1.setBounds(511, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_1);
		checkboxes.add(chckbxNewCheckBox_1_1_6_1);

		JCheckBox chckbxNewCheckBox_1_8_1 = new JCheckBox("A024");
		chckbxNewCheckBox_1_8_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_1.setBounds(440, 232, 70, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_1);
		checkboxes.add(chckbxNewCheckBox_1_8_1);

		JCheckBox chckbxNewCheckBox_1_1_7_1 = new JCheckBox("A020");
		chckbxNewCheckBox_1_1_7_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_1.setBounds(511, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_1);
		checkboxes.add(chckbxNewCheckBox_1_1_7_1);

		JCheckBox chckbxNewCheckBox_1_6_2_1 = new JCheckBox("A013");
		chckbxNewCheckBox_1_6_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_2_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_2_1.setBounds(609, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_2_1);
		checkboxes.add(chckbxNewCheckBox_1_6_2_1);

		JCheckBox chckbxNewCheckBox_1_1_4_2 = new JCheckBox("A009");
		chckbxNewCheckBox_1_1_4_2.setForeground(new Color(66, 66, 28));
		checkboxes.add(chckbxNewCheckBox_1_1_4_2);

		JCheckBox chckbxNewCheckBox_1_6_2 = new JCheckBox("A014");
		chckbxNewCheckBox_1_6_2.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_2.setBounds(609, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_2);
		checkboxes.add(chckbxNewCheckBox_1_6_2);

		JCheckBox chckbxNewCheckBox_1_1_5_2 = new JCheckBox("A010");
		chckbxNewCheckBox_1_1_5_2.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_2.setBounds(677, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_2);
		checkboxes.add(chckbxNewCheckBox_1_1_5_2);

		JCheckBox chckbxNewCheckBox_1_7_2 = new JCheckBox("A015");
		chckbxNewCheckBox_1_7_2.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_7_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_2.setBounds(609, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_2);
		checkboxes.add(chckbxNewCheckBox_1_7_2);

		JCheckBox chckbxNewCheckBox_1_1_6_2 = new JCheckBox("A011");
		chckbxNewCheckBox_1_1_6_2.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_2.setBounds(677, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_2);
		checkboxes.add(chckbxNewCheckBox_1_1_6_2);

		JCheckBox chckbxNewCheckBox_1_8_2 = new JCheckBox("A016");
		chckbxNewCheckBox_1_8_2.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_8_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_2.setBounds(609, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_2);
		checkboxes.add(chckbxNewCheckBox_1_8_2);

		JCheckBox chckbxNewCheckBox_1_1_7_2 = new JCheckBox("A012");
		chckbxNewCheckBox_1_1_7_2.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_7_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_2.setBounds(677, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_2);
		checkboxes.add(chckbxNewCheckBox_1_1_7_2);

		JCheckBox chckbxNewCheckBox_1_5_3 = new JCheckBox("A005");
		chckbxNewCheckBox_1_5_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_3.setBounds(780, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_3);
		checkboxes.add(chckbxNewCheckBox_1_5_3);

		JCheckBox chckbxNewCheckBox_1_1_4_3 = new JCheckBox("A001");
		chckbxNewCheckBox_1_1_4_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_3.setBounds(848, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_3);
		checkboxes.add(chckbxNewCheckBox_1_1_4_3);

		JCheckBox chckbxNewCheckBox_1_6_3 = new JCheckBox("A006");
		chckbxNewCheckBox_1_6_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_3.setBounds(780, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_3);
		checkboxes.add(chckbxNewCheckBox_1_6_3);

		JCheckBox chckbxNewCheckBox_1_1_5_3 = new JCheckBox("A002");
		chckbxNewCheckBox_1_1_5_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_3.setBounds(848, 179, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_3);
		checkboxes.add(chckbxNewCheckBox_1_1_5_3);

		JCheckBox chckbxNewCheckBox_1_7_3 = new JCheckBox("A007");
		chckbxNewCheckBox_1_7_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_7_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_3.setBounds(780, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_3);
		checkboxes.add(chckbxNewCheckBox_1_7_3);

		JCheckBox chckbxNewCheckBox_1_1_6_3 = new JCheckBox("A003");
		chckbxNewCheckBox_1_1_6_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_6_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_3.setBounds(848, 207, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_3);
		checkboxes.add(chckbxNewCheckBox_1_1_6_3);

		JCheckBox chckbxNewCheckBox_1_8_3 = new JCheckBox("A008");
		chckbxNewCheckBox_1_8_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_8_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_3.setBounds(780, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_3);
		checkboxes.add(chckbxNewCheckBox_1_8_3);

		JCheckBox chckbxNewCheckBox_1_1_7_3 = new JCheckBox("A004");
		chckbxNewCheckBox_1_1_7_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_7_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_3.setBounds(848, 232, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_3);
		checkboxes.add(chckbxNewCheckBox_1_1_7_3);

		JCheckBox chckbxNewCheckBox_1_1_5_2_1 = new JCheckBox("A009");
		chckbxNewCheckBox_1_1_5_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_2_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_2_1.setBounds(677, 154, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_2_1);
		checkboxes.add(chckbxNewCheckBox_1_1_5_2_1);

		JCheckBox chckbxNewCheckBox_1_5_4 = new JCheckBox("AN05");
		chckbxNewCheckBox_1_5_4.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_4.setBounds(945, 154, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_4);
		checkboxes.add(chckbxNewCheckBox_1_5_4);

		JCheckBox chckbxNewCheckBox_1_1_4_4 = new JCheckBox("AN01");
		chckbxNewCheckBox_1_1_4_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_4.setBounds(1015, 154, 73, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_4);
		checkboxes.add(chckbxNewCheckBox_1_1_4_4);

		JCheckBox chckbxNewCheckBox_1_6_4 = new JCheckBox("AN06");
		chckbxNewCheckBox_1_6_4.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_4.setBounds(945, 179, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_4);
		checkboxes.add(chckbxNewCheckBox_1_6_4);

		JCheckBox chckbxNewCheckBox_1_1_5_4 = new JCheckBox("AN02");
		chckbxNewCheckBox_1_1_5_4.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_4.setBounds(1015, 179, 73, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_4);
		checkboxes.add(chckbxNewCheckBox_1_1_5_4);

		JCheckBox chckbxNewCheckBox_1_7_4 = new JCheckBox("AN07");
		chckbxNewCheckBox_1_7_4.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_7_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_7_4.setBounds(945, 207, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_7_4);
		checkboxes.add(chckbxNewCheckBox_1_7_4);

		JCheckBox chckbxNewCheckBox_1_1_6_4 = new JCheckBox("AN03");
		chckbxNewCheckBox_1_1_6_4.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_6_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_6_4.setBounds(1015, 207, 73, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_6_4);
		checkboxes.add(chckbxNewCheckBox_1_1_6_4);

		JCheckBox chckbxNewCheckBox_1_8_4 = new JCheckBox("AN08");
		chckbxNewCheckBox_1_8_4.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_8_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_8_4.setBounds(945, 232, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_8_4);
		checkboxes.add(chckbxNewCheckBox_1_8_4);

		JCheckBox chckbxNewCheckBox_1_1_7_4 = new JCheckBox("AN04");
		chckbxNewCheckBox_1_1_7_4.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_7_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_7_4.setBounds(1015, 232, 73, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_7_4);
		checkboxes.add(chckbxNewCheckBox_1_1_7_4);

		JCheckBox chckbxNewCheckBox_1_5_5 = new JCheckBox("A055");
		chckbxNewCheckBox_1_5_5.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_5.setBounds(206, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_5);
		checkboxes.add(chckbxNewCheckBox_1_5_5);

		JCheckBox chckbxNewCheckBox_1_1_4_5 = new JCheckBox("A053");
		chckbxNewCheckBox_1_1_4_5.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_5.setBounds(275, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_5);
		checkboxes.add(chckbxNewCheckBox_1_1_4_5);

		JCheckBox chckbxNewCheckBox_1_6_5 = new JCheckBox("A056");
		chckbxNewCheckBox_1_6_5.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_5.setBounds(206, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_5);
		checkboxes.add(chckbxNewCheckBox_1_6_5);

		JCheckBox chckbxNewCheckBox_1_1_5_5 = new JCheckBox("A054");
		chckbxNewCheckBox_1_1_5_5.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_5.setBounds(275, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_5);
		checkboxes.add(chckbxNewCheckBox_1_1_5_5);

		JCheckBox chckbxNewCheckBox_1_5_6 = new JCheckBox("A051");
		chckbxNewCheckBox_1_5_6.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_6.setBounds(385, 281, 72, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_6);
		checkboxes.add(chckbxNewCheckBox_1_5_6);

		JCheckBox chckbxNewCheckBox_1_1_4_6 = new JCheckBox("A049");
		chckbxNewCheckBox_1_1_4_6.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_6.setBounds(460, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_6);
		checkboxes.add(chckbxNewCheckBox_1_1_4_6);

		JCheckBox chckbxNewCheckBox_1_6_6 = new JCheckBox("A052");
		chckbxNewCheckBox_1_6_6.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_6.setBounds(385, 306, 72, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_6);
		checkboxes.add(chckbxNewCheckBox_1_6_6);

		JCheckBox chckbxNewCheckBox_1_1_5_6 = new JCheckBox("A048");
		chckbxNewCheckBox_1_1_5_6.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_6.setBounds(460, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_6);
		checkboxes.add(chckbxNewCheckBox_1_1_5_6);

		JCheckBox chckbxNewCheckBox_1_5_7 = new JCheckBox("A047");
		chckbxNewCheckBox_1_5_7.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_7.setBounds(551, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_7);
		checkboxes.add(chckbxNewCheckBox_1_5_7);

		JCheckBox chckbxNewCheckBox_1_1_4_7 = new JCheckBox("A045");
		chckbxNewCheckBox_1_1_4_7.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_7.setBounds(620, 281, 65, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_7);
		checkboxes.add(chckbxNewCheckBox_1_1_4_7);

		JCheckBox chckbxNewCheckBox_1_6_7 = new JCheckBox("A048");
		chckbxNewCheckBox_1_6_7.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_7.setBounds(551, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_7);
		checkboxes.add(chckbxNewCheckBox_1_6_7);

		JCheckBox chckbxNewCheckBox_1_1_5_7 = new JCheckBox("A046");
		chckbxNewCheckBox_1_1_5_7.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_7.setBounds(620, 306, 65, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_7);
		checkboxes.add(chckbxNewCheckBox_1_1_5_7);

		JCheckBox chckbxNewCheckBox_1_5_8 = new JCheckBox("A043");
		chckbxNewCheckBox_1_5_8.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_8.setBounds(713, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_8);
		checkboxes.add(chckbxNewCheckBox_1_5_8);

		JCheckBox chckbxNewCheckBox_1_1_4_8 = new JCheckBox("A041");
		chckbxNewCheckBox_1_1_4_8.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_8.setBounds(782, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_8);
		checkboxes.add(chckbxNewCheckBox_1_1_4_8);

		JCheckBox chckbxNewCheckBox_1_6_8 = new JCheckBox("A044");
		chckbxNewCheckBox_1_6_8.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_8.setBounds(713, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_8);
		checkboxes.add(chckbxNewCheckBox_1_6_8);

		JCheckBox chckbxNewCheckBox_1_1_5_8 = new JCheckBox("A042");
		chckbxNewCheckBox_1_1_5_8.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_8.setBounds(782, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_8);
		checkboxes.add(chckbxNewCheckBox_1_1_5_8);

		JCheckBox chckbxNewCheckBox_1_5_9 = new JCheckBox("A039");
		chckbxNewCheckBox_1_5_9.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_9.setBounds(874, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_9);
		checkboxes.add(chckbxNewCheckBox_1_5_9);

		JCheckBox chckbxNewCheckBox_1_1_4_9 = new JCheckBox("A037");
		chckbxNewCheckBox_1_1_4_9.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_9.setBounds(942, 281, 60, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_9);
		checkboxes.add(chckbxNewCheckBox_1_1_4_9);

		JCheckBox chckbxNewCheckBox_1_6_9 = new JCheckBox("A040");
		chckbxNewCheckBox_1_6_9.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_9.setBounds(874, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_9);
		checkboxes.add(chckbxNewCheckBox_1_6_9);

		JCheckBox chckbxNewCheckBox_1_1_5_9 = new JCheckBox("A038");
		chckbxNewCheckBox_1_1_5_9.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_9.setBounds(942, 306, 60, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_9);
		checkboxes.add(chckbxNewCheckBox_1_1_5_9);

		JCheckBox chckbxNewCheckBox_1_5_10 = new JCheckBox("A035");
		chckbxNewCheckBox_1_5_10.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_10.setBounds(1022, 281, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_10);
		checkboxes.add(chckbxNewCheckBox_1_5_10);

		JCheckBox chckbxNewCheckBox_1_1_4_10 = new JCheckBox("A033");
		chckbxNewCheckBox_1_1_4_10.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_10.setBounds(1090, 281, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_10);
		checkboxes.add(chckbxNewCheckBox_1_1_4_10);

		JCheckBox chckbxNewCheckBox_1_6_10 = new JCheckBox("A036");
		chckbxNewCheckBox_1_6_10.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_6_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6_10.setBounds(1022, 306, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_6_10);
		checkboxes.add(chckbxNewCheckBox_1_6_10);

		JCheckBox chckbxNewCheckBox_1_1_5_10 = new JCheckBox("A034");
		chckbxNewCheckBox_1_1_5_10.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_5_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_5_10.setBounds(1090, 306, 68, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_5_10);
		checkboxes.add(chckbxNewCheckBox_1_1_5_10);

		JCheckBox chckbxNewCheckBox_1_5_11 = new JCheckBox("AH13");
		chckbxNewCheckBox_1_5_11.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_11.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_11.setBounds(236, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_11);
		checkboxes.add(chckbxNewCheckBox_1_5_11);

		JCheckBox chckbxNewCheckBox_1_1_4_11 = new JCheckBox("AH12");
		chckbxNewCheckBox_1_1_4_11.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_11.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_11.setBounds(304, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_11);
		checkboxes.add(chckbxNewCheckBox_1_1_4_11);

		JCheckBox chckbxNewCheckBox_1_5_12 = new JCheckBox("AH11");
		chckbxNewCheckBox_1_5_12.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_12.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_12.setBounds(372, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_12);
		checkboxes.add(chckbxNewCheckBox_1_5_12);

		JCheckBox chckbxNewCheckBox_1_1_4_12 = new JCheckBox("AH10");
		chckbxNewCheckBox_1_1_4_12.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_12.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12.setBounds(440, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12);
		checkboxes.add(chckbxNewCheckBox_1_1_4_12);

		JCheckBox chckbxNewCheckBox_1_1_4_12_1 = new JCheckBox("AH09");
		chckbxNewCheckBox_1_1_4_12_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_12_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1.setBounds(508, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1);
		checkboxes.add(chckbxNewCheckBox_1_1_4_12_1);

		JCheckBox chckbxNewCheckBox_1_5_11_1 = new JCheckBox("AH08");
		chckbxNewCheckBox_1_5_11_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_11_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_11_1.setBounds(576, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_11_1);
		checkboxes.add(chckbxNewCheckBox_1_5_11_1);

		JCheckBox chckbxNewCheckBox_1_1_4_11_1 = new JCheckBox("AH07");
		chckbxNewCheckBox_1_1_4_11_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_11_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_11_1.setBounds(644, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_11_1);
		checkboxes.add(chckbxNewCheckBox_1_1_4_11_1);

		JCheckBox chckbxNewCheckBox_1_5_12_1 = new JCheckBox("AH06");
		chckbxNewCheckBox_1_5_12_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_5_12_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5_12_1.setBounds(712, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_5_12_1);
		checkboxes.add(chckbxNewCheckBox_1_5_12_1);

		JCheckBox chckbxNewCheckBox_1_1_4_12_2 = new JCheckBox("AH05");
		chckbxNewCheckBox_1_1_4_12_2.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_12_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_2.setBounds(780, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_2);
		checkboxes.add(chckbxNewCheckBox_1_1_4_12_2);

		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1 = new JCheckBox("AH04");
		chckbxNewCheckBox_1_1_4_12_1_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_12_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1.setBounds(848, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1);
		checkboxes.add(chckbxNewCheckBox_1_1_4_12_1_1);

		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1_1 = new JCheckBox("AH03");
		chckbxNewCheckBox_1_1_4_12_1_1_1.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_12_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1_1.setBounds(916, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1_1);
		checkboxes.add(chckbxNewCheckBox_1_1_4_12_1_1_1);

		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1_2 = new JCheckBox("AH02");
		chckbxNewCheckBox_1_1_4_12_1_1_2.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_12_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1_2.setBounds(983, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1_2);
		checkboxes.add(chckbxNewCheckBox_1_1_4_12_1_1_2);

		JCheckBox chckbxNewCheckBox_1_1_4_12_1_1_3 = new JCheckBox("AH01");
		chckbxNewCheckBox_1_1_4_12_1_1_3.setForeground(new Color(66, 66, 28));
		chckbxNewCheckBox_1_1_4_12_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1_4_12_1_1_3.setBounds(1051, 353, 66, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_4_12_1_1_3);
		checkboxes.add(chckbxNewCheckBox_1_1_4_12_1_1_3);

		ArrayList<JTextField> textFields = new ArrayList<JTextField>();
		
		JLabel lbOdate = new JLabel("借閱日期");
		lbOdate.setHorizontalAlignment(SwingConstants.CENTER);
		lbOdate.setBounds(51, 491, 78, 24);
		frame.getContentPane().add(lbOdate);

		tfodate = new JTextField(java.time.LocalDate.now().toString());
		tfodate.setBounds(131, 491, 100, 24);
		frame.getContentPane().add(tfodate);
		textFields.add(tfodate);

		JLabel lbOTime = new JLabel("借閱時間");
		lbOTime.setHorizontalAlignment(SwingConstants.CENTER);
		lbOTime.setBounds(51, 541, 78, 24);
		frame.getContentPane().add(lbOTime);

		tfoTimeStart = new JTextField();
		tfoTimeStart.setText(order.formatTime(java.time.LocalDateTime.now().getHour() + 1));
		tfoTimeStart.setBounds(131, 541, 40, 24);
		frame.getContentPane().add(tfoTimeStart);
		textFields.add(tfoTimeStart);

		JLabel lbd = new JLabel("~");
		lbd.setHorizontalAlignment(SwingConstants.CENTER);
		lbd.setBounds(171, 541, 20, 24);
		frame.getContentPane().add(lbd);

		tfoTimeEnd = new JTextField();
		tfoTimeEnd.setText(order.formatTime(java.time.LocalDateTime.now().getHour() + 4));
		tfoTimeEnd.setBounds(191, 541, 40, 24);
		frame.getContentPane().add(tfoTimeEnd);
		textFields.add(tfoTimeEnd);

		setBoxStatus(checkboxes);
		
		JLabel lblNewLabel_3 = new JLabel("總數：85");
		lblNewLabel_3.setBounds(70, 281, 60, 15);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("空位：" + String.format("%2d", 85 - bannedSeats.size()));
		lblNewLabel_4.setBounds(70, 306, 60, 15);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_6 = new JLabel("入座：  3");
		lblNewLabel_6.setBounds(70, 331, 60, 15);
		frame.getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("暫離：  2");
		lblNewLabel_7.setBounds(70, 356, 60, 15);
		frame.getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("(修改後請按Enter鍵)");
		lblNewLabel_8.setForeground(Color.GRAY);
		lblNewLabel_8.setBounds(95, 575, 120, 15);
		frame.getContentPane().add(lblNewLabel_8);

		for (JTextField t : textFields) {
			t.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						setBoxStatus(checkboxes);
						lblNewLabel_4.setText("空位：" + String.format("%2d", 85 - bannedSeats.size()));
					}
				}
			});
			
			t.addFocusListener(new FocusAdapter() {
				String beforeTxt, afterTxt;

				public void focusGained(FocusEvent e) {
					beforeTxt = t.getText();
				}

				public void focusLost(FocusEvent e) {
					afterTxt = t.getText();
					if (!afterTxt.equals(beforeTxt)) {
						setBoxStatus(checkboxes);
						lblNewLabel_4.setText("空位：" + String.format("%2d", 85 - bannedSeats.size()));
					}
				}
			});
		}

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(328, 542, 129, 23);
		frame.getContentPane().add(comboBox);

		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(562, 542, 129, 23);
		frame.getContentPane().add(comboBox_2);

		JComboBox<String> comboBox_3 = new JComboBox<String>();
		comboBox_3.setBounds(824, 542, 129, 23);
		frame.getContentPane().add(comboBox_3);

		JLabel studentID = new JLabel();
		studentID.setHorizontalAlignment(SwingConstants.CENTER);
		studentID.setForeground(new Color(144, 140, 72));
		studentID.setText(Long.toString(id));
		studentID.setBounds(324, 492, 130, 26);
		frame.getContentPane().add(studentID);

		textField_1 = new JTextField();
		textField_1.setBounds(562, 492, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(824, 492, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("其他使用者1");
		lblNewLabel_1.setForeground(new Color(115, 121, 59));
		lblNewLabel_1.setBounds(587, 465, 78, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("其他使用者2");
		lblNewLabel_2.setForeground(new Color(115, 121, 59));
		lblNewLabel_2.setBounds(847, 466, 78, 16);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_1_1 = new JLabel("主借者");
		lblNewLabel_1_1.setForeground(new Color(115, 121, 59));
		lblNewLabel_1_1.setBounds(368, 465, 78, 16);
		frame.getContentPane().add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("座位確認");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order_date = tfodate.getText().trim();
				borrow_start = Double.parseDouble(tfoTimeStart.getText().trim().replace(':', '.'));
				borrow_end = Double.parseDouble(tfoTimeEnd.getText().trim().replace(':', '.'));

				comboBox.removeAllItems();
				comboBox_2.removeAllItems();
				comboBox_3.removeAllItems();
				checked = new ArrayList<String>();

				for (JCheckBox box : checkboxes) {
					if (box.isSelected()) {
						checked.add(box.getText());
					}
				}

				switch (checked.size()) {
				case 0:
					JOptionPane.showMessageDialog(null, "No seats selected!", "Error!", JOptionPane.ERROR_MESSAGE);
					break;
				case 1:
					comboBox.addItem(checked.get(0));
					comboBox.setSelectedItem(comboBox.getItemAt(0));
					break;
				case 2:
					for (int i = 0; i < 2; i++) {
						comboBox.addItem(checked.get(i));
						comboBox_2.addItem(checked.get(i));
					}
					comboBox.setSelectedItem(comboBox.getItemAt(0));
					comboBox_2.setSelectedItem(comboBox.getItemAt(1));
					break;
				case 3:
					for (int i = 0; i < 3; i++) {
						comboBox.addItem(checked.get(i));
						comboBox_2.addItem(checked.get(i));
						comboBox_3.addItem(checked.get(i));
					}
					comboBox.setSelectedItem(comboBox.getItemAt(0));
					comboBox_2.setSelectedItem(comboBox.getItemAt(1));
					comboBox_3.setSelectedItem(comboBox.getItemAt(2));
					break;
				default:
					JOptionPane.showMessageDialog(null, "Please select less than 3 seats, tks!", "Error!",
							JOptionPane.ERROR_MESSAGE);
					break;
				}
			}
		});
		btnNewButton.setBounds(580, 400, 85, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("送出預約");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> seats = new ArrayList<String>();
				ArrayList<Long> users = new ArrayList<Long>();
				String id_and_seat = "";
				// check input correctness
				switch (checked.size()) {
				case 0:
					JOptionPane.showMessageDialog(null, "No seats selected!", "Error!", JOptionPane.ERROR_MESSAGE);
					return;
				case 1:
					seats.add(comboBox.getSelectedItem().toString());
					users.add(id);
					id_and_seat = "學號：" + id + "  座位：" + seats.get(0) + "\n";
					break;
				case 2:
					seats.add(comboBox.getSelectedItem().toString());
					seats.add(comboBox_2.getSelectedItem().toString());
					users.add(id);
					users.add(Long.parseLong(textField_1.getText()));
					if (seats.get(0).equals(seats.get(1))) {
						JOptionPane.showMessageDialog(null, "Please select different seats for each people, tks!",
								"Error!", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (textField_1.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please provide correct studentID, tks!", "Error!",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

					id_and_seat = "學號：" + users.get(0) + "  座位：" + seats.get(0) + "\n" + "學號：" + users.get(1) + " 座位："
							+ seats.get(1) + "\n";
					break;
				case 3:
					seats.add(comboBox.getSelectedItem().toString());
					seats.add(comboBox_2.getSelectedItem().toString());
					seats.add(comboBox_3.getSelectedItem().toString());
					users.add(id);
					users.add(Long.parseLong(textField_1.getText()));
					users.add(Long.parseLong(textField_2.getText()));

					// If all elements are distinct, size of HashSet should be same array.
					Set<String> s = new HashSet<String>(seats);
					if (s.size() != checked.size()) {
						JOptionPane.showMessageDialog(null, "Please select different seats for each people, tks!",
								"Error!", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (textField_1.getText().equals("") || textField_2.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please provide correct studentID, tks!", "Error!",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

					id_and_seat = "學號：" + users.get(0) + "  座位：" + seats.get(0) + "\n" + "學號：" + users.get(1) + " 座位："
							+ seats.get(1) + "\n" + "學號：" + users.get(2) + " 座位：" + seats.get(2) + "\n";
					break;
				}

				// check if the order time is not in the past
				order_date = tfodate.getText().trim();
				borrow_start = Double.parseDouble(tfoTimeStart.getText().trim().replace(':', '.'));
				borrow_end = Double.parseDouble(tfoTimeEnd.getText().trim().replace(':', '.'));

				String msg = order.checkCurrentTime(order_date, borrow_start);
				if (!msg.equals("true")) {
					JOptionPane.showMessageDialog(frame, msg, "Error!", JOptionPane.ERROR_MESSAGE);
					return;
				}

				// Place order
				Object[] options = { "預約", "取消" };
				String oInfo = id_and_seat + "大樓：中正\n" + "區域：A\n" + "日期：" + order_date + "\n" + "時段："
						+ order.formatTime(borrow_start) + " ~ " + order.formatTime(borrow_end) + "\n" + "";

				int n = JOptionPane.showOptionDialog(frame, oInfo, "預約確認", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, // no custom Icon
						options, // the titles of buttons
						options[0]); // default button title

				// Reservation confirmed
				if (n == 0) {
					String fail = "";
					for (int i = 0; i < seats.size(); i++) {
						String checkMsg = order.checkSeat(seats.get(i), users.get(i), order_date, borrow_start, borrow_end);
						if (checkMsg.equals("true")) {
							ArrayList<Long> u = new ArrayList<Long>();
							u.add(users.get(i));
							if (order.createOrder(seats.get(i), order_date, borrow_start, borrow_end, u) == -1l) {
								fail += seats.get(i) + " ";
							}
						} else {
							JOptionPane.showMessageDialog(frame, checkMsg, "Error!", JOptionPane.ERROR_MESSAGE);
							fail += seats.get(i) + " ";
						}
					}

					if (fail == "") {
						JOptionPane.showMessageDialog(frame, "預約成功!!!", "通知", JOptionPane.INFORMATION_MESSAGE, null);
					} else {
						JOptionPane.showMessageDialog(frame, fail + "預約失敗...", "Error", JOptionPane.ERROR_MESSAGE,
								null);
					}
					UserActivity_page s3 = new UserActivity_page(id, "Seat");
					frame.setVisible(false);
				}
			}
		});
		btnNewButton_2.setBounds(1064, 520, 85, 23);
		frame.getContentPane().add(btnNewButton_2);

		frame.setVisible(true);
	}

	public void setBoxStatus(ArrayList<JCheckBox> checkboxes) {
		order_date = tfodate.getText().trim();
		borrow_start = Double.parseDouble(tfoTimeStart.getText().trim().replace(':', '.'));
		borrow_end = Double.parseDouble(tfoTimeEnd.getText().trim().replace(':', '.'));

		bannedSeats = order.getBannedSeats("A", order_date, borrow_start, borrow_end);
		for (JCheckBox b : checkboxes) {
			if (bannedSeats.contains(b.getText())) {
				b.setEnabled(false);
				b.setBackground(Color.LIGHT_GRAY);
			} else {
				b.setEnabled(true);
				b.setBackground(UIManager.getColor("Button.background"));
			}
		}
	}
}