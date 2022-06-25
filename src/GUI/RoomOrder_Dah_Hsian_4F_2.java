package GUI;

import Entity.Order;
import Entity.User;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

public class RoomOrder_Dah_Hsian_4F_2 {

	private JFrame frame;
	private JTextField textField;
	private User user = new User();
	private Order order = new Order();
	private long id;
	private String name, room, order_date;
	private double borrow_start, borrow_end;
	private ArrayList<Long> uids = new ArrayList<Long>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomOrder_Dah_Hsian_4F_2 window = new RoomOrder_Dah_Hsian_4F_2(109405094, "401(人數限制3-6人)",
							"2022-06-25", 9.0, 12.0);
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
	public RoomOrder_Dah_Hsian_4F_2(long id, String room, String order_date, double borrow_start, double borrow_end) {
		this.id = id;
		uids.add(id);
		name = user.getName(id);
		this.room = room;
		this.order_date = order_date;
		this.borrow_start = borrow_start;
		this.borrow_end = borrow_end;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219, 219, 178));
		frame.setBounds(100, 100, 856, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomOrder_Dah_Hsian room = new RoomOrder_Dah_Hsian(id);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(115, 121, 59));
		btnNewButton_1.setBounds(22, 20, 85, 23);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setFont(new Font("Tsukushi A Round Gothic", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(386, 75, 121, 37);
		lblNewLabel.setForeground(new Color(66, 66, 28));
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_page login = new Login_page();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(716, 20, 85, 23);
		btnNewButton_2.setForeground(new Color(115, 121, 59));
		frame.getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel_2 = new JLabel(order_date);
		lblNewLabel_2.setForeground(new Color(66, 66, 28));
		lblNewLabel_2.setFont(new Font("�s�ө���", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(233, 158, 109, 22);
		frame.getContentPane().add(lblNewLabel_2);

		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton_3.setForeground(new Color(115, 121, 59));
		btnNewButton_3.setBounds(30, 284, 100, 55);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("借用紀錄");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserActivity_page u = new UserActivity_page(id, "Room");
				frame.setVisible(false);
			}
		});
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton_4.setForeground(new Color(115, 121, 59));
		btnNewButton_4.setBounds(30, 451, 100, 55);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_3_1 = new JButton("預約");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomOrder_Dah_Hsian_4F d4 = new RoomOrder_Dah_Hsian_4F(id);
				frame.setVisible(false);
			}
		});
		btnNewButton_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton_3_1.setForeground(new Color(115, 121, 59));
		btnNewButton_3_1.setBounds(30, 134, 100, 55);
		frame.getContentPane().add(btnNewButton_3_1);

		JLabel lblNewLabel_2_1 = new JLabel(order.formatTime(borrow_start) + "~" + order.formatTime(borrow_end));
		lblNewLabel_2_1.setFont(new Font("�s�ө���", Font.PLAIN, 16));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(387, 158, 109, 22);
		frame.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel(room);
		lblNewLabel_2_1_1.setForeground(new Color(66, 66, 28));
		lblNewLabel_2_1_1.setFont(new Font("�s�ө���", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(486, 158, 232, 22);
		frame.getContentPane().add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_3 = new JLabel("\u5176\u4ED6\u4F7F\u7528\u8005");
		lblNewLabel_3.setForeground(new Color(66, 66, 28));
		lblNewLabel_3.setFont(new Font("�s�ө���", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(296, 242, 109, 23);
		frame.getContentPane().add(lblNewLabel_3);

		textField = new JTextField();
		textField.setText("請輸入證號");
		textField.setForeground(new Color(194, 197, 204));
		textField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if (textField.getText().equals("請輸入證號")) {
					textField.setText("");
					textField.setForeground(Color.black);
				}
			}

			public void focusLost(FocusEvent e) {
				if (textField.getText().isEmpty()) {
					textField.setText("請輸入證號");
					textField.setForeground(new Color(194, 197, 204));
				}
			}
		});
		textField.setBounds(397, 245, 96, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(219, 219, 178));
		textPane.setBounds(274, 308, 350, 147);
		frame.getContentPane().add(textPane);
		textPane.setEditable(false);

		// Initialize some styles.
		StyledDocument doc = textPane.getStyledDocument();
		Style def = StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
		Style regular = doc.addStyle("regular", def);
		StyleConstants.setFontFamily(def, "PMingLiU 12");
		Style s = doc.addStyle("title", regular);
		StyleConstants.setBold(s, true);
		StyleConstants.setFontFamily(s, "Dialog 14");
		StyleConstants.setForeground(s, new Color(66, 66, 28));
		StyleConstants.setFontSize(s, 14);

		String[] initString = { "租借者\n", "姓名：" + name + "   證號：" + id + "   日期：" + java.time.LocalDate.now() + "\n\n",
				"其他使用者\n" };
		String[] initStyles = { "title", "regular", "title" };
		try {
			for (int i = 0; i < initString.length; i++) {
				doc.insertString(doc.getLength(), initString[i], doc.getStyle(initStyles[i]));
			}
		} catch (BadLocationException ble) {
			System.err.println("Couldn't insert initial text into text pane.");
		}

		JButton btnNewButton_6 = new JButton("新增");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText() != null) {
					long uid = Long.parseLong(textField.getText().trim());
					String name = user.getName(uid);
					if (order.checkUserStatus(uid)) {
						if (uid != id) {
							uids.add(id);
							String str = "姓名：" + name + "   證號：" + id + "\n";
							try {
								doc.insertString(doc.getLength(), str, doc.getStyle("regular"));
							} catch (BadLocationException ble) {
								System.err.println("Couldn't insert initial text into text pane.");
							}
						}
					} else {
						if (name == null) {
							JOptionPane.showMessageDialog(frame, "沒有該位使用者!!!", "錯誤", JOptionPane.ERROR_MESSAGE, null);
						} else {
							JOptionPane.showMessageDialog(frame, "該使用者暫時無法借閱!!!", "錯誤", JOptionPane.ERROR_MESSAGE,
									null);
						}
					}
				}
			}
		});
		btnNewButton_6.setForeground(new Color(115, 121, 59));
		btnNewButton_6.setBounds(506, 245, 68, 21);
		frame.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_5 = new JButton("\u9810\u7D04");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String checkMsg = order.checkRoom(room.substring(0, 3), uids, order_date, borrow_start, borrow_end);
				if (checkMsg.equals("true")) {
					if (order.createOrder(room.substring(0, 3), order_date, borrow_start, borrow_end, uids) != -1) {
						JOptionPane.showMessageDialog(frame, "預約成功!!!", "通知", JOptionPane.INFORMATION_MESSAGE, null);

						UserActivity_page s3 = new UserActivity_page(id, "Room");
						frame.setVisible(false);
					} else {
						JOptionPane.showMessageDialog(frame, "預約失敗...", "Error", JOptionPane.ERROR_MESSAGE, null);
					}
				} else {
					JOptionPane.showMessageDialog(frame, checkMsg);
				}

			}
		});
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_5.setForeground(new Color(115, 121, 59));
		btnNewButton_5.setBounds(633, 483, 85, 23);
		frame.getContentPane().add(btnNewButton_5);

		frame.setVisible(true);
	}
}