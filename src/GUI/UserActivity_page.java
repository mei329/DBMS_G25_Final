package GUI;

import Entity.Order;
import Entity.User;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class UserActivity_page {

	private JFrame frame;
	private long id;
	private User user = new User();
	private Order order = new Order();
	private String name;
	private String placeType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserActivity_page window = new UserActivity_page(109405094, "Seat");
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
	public UserActivity_page(long id, String placeType) {
		this.id = id;
		name = user.getName(id);
		this.placeType = placeType;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219, 219, 178));
		frame.setBounds(100, 100, 828, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page bp = new Home_page(id);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(32, 24, 85, 23);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("預約紀錄");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(360, 35, 100, 25);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_page l = new Login_page();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(691, 24, 85, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton = new JButton("\u9810\u7D04");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (placeType.equals("Seat")) {
					Seat_page s1 = new Seat_page(id);
				} else if (placeType.equals("Room")) {
					RoomOrder_Dah_Hsian_4F d4 = new RoomOrder_Dah_Hsian_4F(id);
				} else if (placeType.equals("Quick")) {
					RoomOrder_Quick q = new RoomOrder_Quick(id);
				} else if (placeType.equals("Home")) {
					Home_page bp = new Home_page(id);
				}
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(32, 139, 85, 50);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(32, 265, 85, 50);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("借用歷史");
		btnNewButton_4.setBounds(27, 380, 90, 50);
		frame.getContentPane().add(btnNewButton_4);

		JLabel lblNewLabel_1 = new JLabel("修改預約");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(370, 125, 77, 15);
		frame.getContentPane().add(lblNewLabel_1);

		ArrayList<Long> oids = order.getUserOrder(id);
		System.out.println(id + "'s order_id: " + oids);
		JPanel panel = new JPanel();
		panel.setBounds(230, 200, 365, 218);
		panel.setLayout(new GridLayout(oids.size(), 1, 0, 0));
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBounds(227, 160, 380, 218);
		frame.getContentPane().add(scrollPane);

		ArrayList<JButton> btns = new ArrayList<JButton>();
		for (int i = 0; i < oids.size(); i++) {
			String info = order.getOrderString(oids.get(i));
			btns.add(new JButton());
			btns.get(i).setText(info);
			btns.get(i).setPreferredSize(new Dimension(360, 25));
			panel.add(btns.get(i));

			// disable orders that are expired
			order.renew();
			if (order.select("order_status", "Orders", "order_id", String.valueOf(oids.get(i)))[0].equals("F")) {
				btns.get(i).setEnabled(false);
			}

			// add button listener
			btns.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = ((JButton) e.getSource());
					if (b.getBackground() == Color.DARK_GRAY) {
						b.setBackground(UIManager.getColor("Button.background"));
						b.setForeground(Color.black);
						b.setBorderPainted(true);
					} else {
						for (JButton btn : btns) {
							btn.setBackground(UIManager.getColor("Button.background"));
							btn.setForeground(Color.black);
							btn.setBorderPainted(true);
						}

						b.setBackground(Color.DARK_GRAY);
						b.setForeground(Color.white);
						b.setBorderPainted(false);
					}
				}
			});
		}

		JButton btnNewButton_7 = new JButton("取消");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : btns) {
					if (b.getBackground().equals(Color.DARK_GRAY)) {
						int n = JOptionPane.showConfirmDialog(frame, "確定取消預約?", "確認", JOptionPane.OK_OPTION);
						if (n == 0) {
							long oid = oids.get(btns.indexOf(b));
							if (order.delOrder(oid)) {
								JOptionPane.showMessageDialog(frame, "成功取消預約!");
								b.setEnabled(false);
							} else {
								JOptionPane.showMessageDialog(frame, "未成功取消預約...", "Error", JOptionPane.ERROR_MESSAGE,
										null);
							}
						}
						b.setBackground(UIManager.getColor("Button.background"));
						b.setForeground(Color.black);
						b.setBorderPainted(true);
					}
				}
			}
		});
		btnNewButton_7.setBounds(250, 405, 65, 25);
		frame.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("暫離");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : btns) {
					if (b.getBackground().equals(Color.DARK_GRAY)) {
						JOptionPane.showConfirmDialog(frame, "確定保留1小時?", "確認", JOptionPane.OK_OPTION);
						b.setBackground(UIManager.getColor("Button.background"));
						b.setForeground(Color.black);
						b.setBorderPainted(true);
					}
				}
			}
		});
		btnNewButton_8.setBounds(335, 405, 65, 25);
		frame.getContentPane().add(btnNewButton_8);

		JLabel lblNewLabel_2 = new JLabel(id + " " + name);
		lblNewLabel_1.setForeground(new Color(66, 66, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(690, 55, 100, 15);
		frame.getContentPane().add(lblNewLabel_2);

		JButton btnNewButton_9 = new JButton("續借");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : btns) {
					if (b.getBackground().equals(Color.DARK_GRAY)) {
						String hrs = JOptionPane.showInputDialog(frame, "請輸入要延長續借幾小時（整數）：", "1");
						if (hrs != null) {
							int nHrs = Integer.parseInt(hrs.trim());

							if (nHrs > 0) {
								long oid = oids.get(btns.indexOf(b));
								System.out.println(oid);

								if (order.extendBorrow(oid, nHrs)) {
									JOptionPane.showMessageDialog(frame, "成功續借" + nHrs + "小時!");
									b.setText(order.getOrderString(oid));
								} else {
									JOptionPane.showMessageDialog(frame, "未成功續借...", "Error", JOptionPane.ERROR_MESSAGE,
											null);
								}
							}
						}
						b.setBackground(UIManager.getColor("Button.background"));
						b.setForeground(Color.black);
						b.setBorderPainted(true);
					}
				}
			}
		});
		btnNewButton_9.setBounds(420, 405, 65, 25);
		frame.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_9_1 = new JButton("修改");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : btns) {
					if (b.getBackground().equals(Color.DARK_GRAY)) {
						long oid = oids.get(btns.indexOf(b));

						String[] options = { "修改時段", "修改人員" };
						int n = JOptionPane.showOptionDialog(frame, "請問您要修改預約時段還是修改使用人員?", "修改確認",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
								options[0]);

						if (n == 0) {
							// 修改時段
							String[] parts = b.getText().split("~");
							String t = parts[0].substring(parts[0].length() - 5) + "-" + parts[1];
							String range = JOptionPane.showInputDialog(frame,
									"請輸入借用開始與結束時間（以「-」分隔、僅限整點或半點）：ex 10:00-12:30", t);

							try {
								if (range != null) {
									String[] rdata = range.replace(':', '.').split("-");
									if (rdata.length == 2) {
										double start = Double.parseDouble(rdata[0]);
										double end = Double.parseDouble(rdata[1]);
										System.out.println(start + ", " + end);
										if (start < end) {
											if (order.modifyTime(oid, "borrow_start", start)
													&& order.modifyTime(oid, "borrow_end", end)) {
												JOptionPane.showMessageDialog(frame, "成功修改時段!");
												b.setText(order.getOrderString(oid));
											} else {
												JOptionPane.showMessageDialog(frame, "未成功修改時段...", "Error",
														JOptionPane.ERROR_MESSAGE, null);
											}
										}
									}
								}
							} catch (Exception e1) {
								System.err.println(e1);
								JOptionPane.showMessageDialog(frame, "未成功修改時段...", "Error", JOptionPane.ERROR_MESSAGE,
										null);
							}

						} else if (n == 1) {
							// 修改人員
							if (b.getBackground().equals(Color.DARK_GRAY)) {
								String sid = order.select("seat_id", "Orders", "order_id", String.valueOf(oid))[0];
								String[] users = order.select("user_id", "OrderUsers", "order_id", String.valueOf(oid));

								String before = users[0];
								// check if isRoom and isLender
								if (!sid.matches("^[ABC].*")) {
									String lender = order.getLender(String.valueOf(oid));
									String otherU = "[]";
									if (users.length != 1) {
										if (users[users.length - 1].equals(lender)) {
											otherU = Arrays.toString(users).replace(", " + lender, "");
										} else {
											otherU = Arrays.toString(users).replace(lender + ", ", "");
										}
									}

									before = JOptionPane.showInputDialog(frame,
											"租借人：" + lender + "\n其他借用人：" + otherU + "\n請輸入「轉讓人」之user_id：");
									if (before != null) {
										if (!Arrays.toString(users).contains(before)) {
											JOptionPane.showMessageDialog(frame, before + "不是借用者", "要求失敗",
													JOptionPane.ERROR_MESSAGE);
											return;
										}
										if (lender.equals(before)) {
											JOptionPane.showMessageDialog(frame, "不能更改租借者", "要求失敗",
													JOptionPane.ERROR_MESSAGE);
											return;
										}
									}
								}

								if (before != null) {
									String after = JOptionPane.showInputDialog(frame,
											"轉讓人：" + before + "\n請輸入「被轉讓人」之user_id：");
									if (after != null) {
										if (order.modifyUser(oid, Long.parseLong(before), Long.parseLong(after))) {
											JOptionPane.showMessageDialog(frame, "成功轉讓座位!", "通知",
													JOptionPane.INFORMATION_MESSAGE);
										} else {
											JOptionPane.showMessageDialog(frame, "未成功轉讓座位...", "Error",
													JOptionPane.ERROR_MESSAGE, null);
										}
									}
								}
							}
						}
						b.setBackground(UIManager.getColor("Button.background"));
						b.setForeground(Color.black);
						b.setBorderPainted(true);
					}
				}
			}
		});
		btnNewButton_9_1.setBounds(505, 405, 65, 25);
		frame.getContentPane().add(btnNewButton_9_1);

		frame.setVisible(true);
	}
}