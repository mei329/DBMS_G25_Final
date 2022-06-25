package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Entity.Order;
import Entity.User;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class RoomOrder_Quick extends JFrame {

	private User user = new User();
	private Order order = new Order();
	private long id;
	private String room, order_date;
	private double borrow_start, borrow_end;
	private ArrayList<Long> uids = new ArrayList<Long>();
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomOrder_Quick window = new RoomOrder_Quick(109405094l);
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
	public RoomOrder_Quick(long id) {
		this.id = id;
		uids.add(id);
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

		JLabel lblNewLabel = new JLabel("快速預約");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(230, 33, 100, 25);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_3 = new JLabel("借用時間");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(66, 66, 28));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setBounds(100, 130, 109, 21);
		frame.getContentPane().add(lblNewLabel_3);

		textField = new JTextField("請依格式輸入時間");
		textField.addFocusListener(new FocusAdapter() {
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd hh:mm hh:mm");

			public void focusGained(FocusEvent e) {
				if (textField.getText().equals("請依格式輸入時間")) {
					String d = java.time.LocalDate.now().toString() + " "
							+ order.formatTime(java.time.LocalDateTime.now().getHour() + 1) + " "
							+ order.formatTime(java.time.LocalDateTime.now().getHour() + 4);
					textField.setText(d);
					textField.setForeground(Color.black);
				}
			}

			public void focusLost(FocusEvent e) {
				if (textField.getText().isEmpty()) {
					textField.setText("請依格式輸入時間");
					textField.setForeground(new Color(194, 197, 204));
				} else {
					try {
						if (fmt.parse(textField.getText()) != null) {
							String[] parts = textField.getText().split(" ");
							order_date = parts[0];
							borrow_start = Double.parseDouble(parts[1].replace(":", "."));
							borrow_end = Double.parseDouble(parts[2].replace(":", "."));
						}
					} catch (ParseException e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(frame, "請依格式輸入時間", "錯誤", JOptionPane.ERROR_MESSAGE, null);
						textField.setText("請依格式輸入時間");
						textField.setForeground(new Color(194, 197, 204));
					}
				}
			}
		});
		textField.setForeground(new Color(194, 197, 204));
		textField.setColumns(10);
		textField.setBounds(200, 132, 130, 21);
		frame.getContentPane().add(textField);

		JLabel lblNewLabel_1 = new JLabel("（格式：yyyy-MM-dd hh:mm hh:mm）");
		lblNewLabel_1.setForeground(new Color(66, 66, 28));
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(350, 134, 200, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_3_1 = new JLabel("其他使用者");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(new Color(66, 66, 28));
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(100, 192, 109, 21);
		frame.getContentPane().add(lblNewLabel_3_1);

		textField_1 = new JTextField();
		textField_1.setText("請輸入證號");
		textField_1.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if (textField_1.getText().equals("請輸入證號")) {
					textField_1.setText("");
					textField_1.setForeground(Color.black);
				}
			}

			public void focusLost(FocusEvent e) {
				if (textField_1.getText().isEmpty()) {
					textField_1.setText("請輸入證號");
					textField_1.setForeground(new Color(194, 197, 204));
				}
			}
		});
		textField_1.setForeground(new Color(194, 197, 204));
		textField_1.setColumns(10);
		textField_1.setBounds(200, 192, 130, 21);
		frame.getContentPane().add(textField_1);

		JButton btnNewButton_6 = new JButton("新增");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (order_date != null && textField_1.getText() != null) {
					long uid = Long.parseLong(textField_1.getText().trim());
					String name = user.getName(uid);
					if (order.checkUserStatus(uid)
							&& order.checkTime(String.valueOf(uid), order_date, borrow_start, borrow_end, null)) {
						if (uid != id) {
							uids.add(uid);
							JOptionPane.showMessageDialog(frame, "已加入之使用者：" + uids, "通知",
									JOptionPane.INFORMATION_MESSAGE, null);
						}
					} else {
						if (name == null) {
							JOptionPane.showMessageDialog(frame, "沒有該位使用者：" + uid, "錯誤", JOptionPane.ERROR_MESSAGE,
									null);
						} else {
							JOptionPane.showMessageDialog(frame, "該使用者暫時無法借閱：" + uid, "錯誤", JOptionPane.ERROR_MESSAGE,
									null);
						}
					}
				} else {
					if (order_date == null) {
						JOptionPane.showMessageDialog(frame, "請先輸入時間", "錯誤", JOptionPane.ERROR_MESSAGE, null);
					}
				}
			}
		});
		btnNewButton_6.setForeground(new Color(115, 121, 59));
		btnNewButton_6.setBounds(350, 192, 68, 21);
		frame.getContentPane().add(btnNewButton_6);

		JLabel lblNewLabel_3_1_1 = new JLabel("討論室");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setForeground(new Color(66, 66, 28));
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(100, 252, 109, 21);
		frame.getContentPane().add(lblNewLabel_3_1_1);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				ArrayList<String> rooms = order.getOpenRoom(order_date, borrow_start, borrow_end, uids);
				comboBox.removeAllItems();
				if (rooms != null) {
					for (String rid : rooms) {
						comboBox.addItem("達賢 " + rid);
					}
				}
			}

			public void focusLost(FocusEvent e) {
				comboBox.setSelectedIndex(0);
			}
		});
		comboBox.setBounds(200, 253, 130, 21);
		frame.getContentPane().add(comboBox);

		JButton btnNewButton_6_1 = new JButton("預約");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				room = comboBox.getSelectedItem().toString().substring(3);
				// Place order
				Object[] options = { "預約", "取消" };
				int n = JOptionPane.showOptionDialog(frame,
						"學號：" + uids + "\n" + "大樓：達賢\n" + "討論室：" + room + "\n日期：" + order_date + "\n時段："
								+ order.formatTime(borrow_start) + " ~ " + order.formatTime(borrow_end),
						"預約確認", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, // no custom Icon
						options, // the titles of buttons
						options[0]); // default button title

				// Reservation confirmed
				if (n == 0) {
					String checkMsg = order.checkRoom(room, uids, order_date, borrow_start, borrow_end);
					if (checkMsg.equals("true")) {
						if (order.createOrder(room, order_date, borrow_start, borrow_end, uids) != -1) {
							JOptionPane.showMessageDialog(frame, "預約成功!!!", "通知", JOptionPane.INFORMATION_MESSAGE,
									null);

							UserActivity_page s3 = new UserActivity_page(id, "Quick");
							frame.setVisible(false);
						} else {
							JOptionPane.showMessageDialog(frame, "預約失敗...", "Error", JOptionPane.ERROR_MESSAGE, null);
						}
					} else {
						JOptionPane.showMessageDialog(frame, checkMsg);
					}
				}
			}
		});
		btnNewButton_6_1.setForeground(new Color(115, 121, 59));
		btnNewButton_6_1.setBounds(350, 252, 68, 21);
		frame.getContentPane().add(btnNewButton_6_1);

		JButton btnNewButton_1 = new JButton("回首頁");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Room_page room = new Room_page(id);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(115, 121, 59));
		btnNewButton_1.setBounds(25, 30, 85, 23);
		frame.getContentPane().add(btnNewButton_1);

		frame.setVisible(true);
	}
}
