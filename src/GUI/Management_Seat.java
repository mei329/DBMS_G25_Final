package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import Entity.Order;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Management_Seat {

	private JFrame frame;
	private JTextField textFieldSeatNum;
	private Order order = new Order();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management_Seat window = new Management_Seat();
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
	public Management_Seat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219, 219, 178));
		frame.setBounds(100, 100, 600, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("\u56DE\u9996\u9801");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager_page home = new Manager_page();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(25, 37, 85, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u767B\u51FA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_page login = new Login_page();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(457, 37, 85, 23);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("\u5EA7\u4F4D\u7BA1\u7406");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(230, 33, 100, 25);
		frame.getContentPane().add(lblNewLabel);

		JRadioButton rdbtnBan = new JRadioButton("\u7981\u6B62\u501F\u95B1");
		buttonGroup.add(rdbtnBan);
		rdbtnBan.setBounds(367, 198, 105, 23);
		frame.getContentPane().add(rdbtnBan);

		JRadioButton rdbtnAllow = new JRadioButton("\u958B\u653E\u501F\u95B1");
		rdbtnAllow.setSelected(true);
		buttonGroup.add(rdbtnAllow);
		rdbtnAllow.setBounds(367, 145, 105, 23);
		frame.getContentPane().add(rdbtnAllow);

		textFieldSeatNum = new JTextField();
		textFieldSeatNum.setBounds(255, 178, 96, 21);
		frame.getContentPane().add(textFieldSeatNum);
		textFieldSeatNum.setColumns(10);

		JButton btnSave = new JButton("儲存");
		btnSave.setBounds(367, 252, 85, 23);
		frame.getContentPane().add(btnSave);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "中正圖書館", "達賢圖書館", "綜院圖書館" }));
		comboBox.setBounds(109, 177, 121, 27);
		frame.getContentPane().add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("選取圖書館");
		lblNewLabel_1.setBounds(109, 159, 85, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("輸入座位號碼");
		lblNewLabel_2.setBounds(255, 159, 105, 16);
		frame.getContentPane().add(lblNewLabel_2);

		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seatNum = textFieldSeatNum.getText();
				String location = (String) (comboBox.getSelectedItem());
				
				System.out.println(location);
				int locatID = 0;
				if (location == "中正圖書館") {
					locatID = 4;
					if (!seatNum.startsWith("A") && !seatNum.isBlank()) {
						JOptionPane.showMessageDialog(frame, "座位不存在於該圖書館", "錯誤", JOptionPane.WARNING_MESSAGE);
						return;
					}
				} else if (location == "達賢圖書館") {
					locatID = 1;
					if (!seatNum.startsWith("4") && !seatNum.isBlank()) {
						JOptionPane.showMessageDialog(frame, "座位不存在於該圖書館", "錯誤", JOptionPane.WARNING_MESSAGE);
						return;
					}
				}

				System.out.println(locatID);
				
				if (locatID != 0) {
					if (seatNum == null || seatNum.isBlank()) {
						// update from locat_id

						if (rdbtnAllow.isSelected()) {
							if (order.updatePlaceStatus(locatID, "T")) {
								JOptionPane.showMessageDialog(frame, "座位狀態儲存成功！", "成功",
										JOptionPane.INFORMATION_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(frame, "無法更改座位狀態，請檢查您所輸入的資訊", "錯誤",
										JOptionPane.WARNING_MESSAGE);
							}
						}

						if (rdbtnBan.isSelected()) {
							if (order.updatePlaceStatus(locatID, "F")) {
								JOptionPane.showMessageDialog(frame, "座位狀態儲存成功！", "成功",
										JOptionPane.INFORMATION_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(frame, "無法更改座位狀態，請檢查您所輸入的資訊", "錯誤",
										JOptionPane.WARNING_MESSAGE);
							}
						}
					} else {
						// update from seat_id

						if (rdbtnAllow.isSelected()) {
							if (order.updatePlaceStatus(seatNum, "T")) {
								JOptionPane.showMessageDialog(frame, "座位狀態儲存成功！", "成功",
										JOptionPane.INFORMATION_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(frame, "無法更改座位狀態，請檢查您所輸入的資訊", "錯誤",
										JOptionPane.WARNING_MESSAGE);
							}
						}

						if (rdbtnBan.isSelected()) {
							if (order.updatePlaceStatus(seatNum, "F")) {
								JOptionPane.showMessageDialog(frame, "座位狀態儲存成功！", "成功",
										JOptionPane.INFORMATION_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(frame, "無法更改座位狀態，請檢查您所輸入的資訊", "錯誤",
										JOptionPane.WARNING_MESSAGE);
							}
						}
					}
				}
			}
		});

		frame.setVisible(true);
	}
}
