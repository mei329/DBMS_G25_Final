package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Entity.Order;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Management_Order {

	private JFrame frame;
	private JTable table;
	private Order order = new Order();
	private String oid = null;
	private int selectRow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management_Order window = new Management_Order();
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
	public Management_Order() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219, 219, 178));
		frame.setBounds(100, 100, 723, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("\u56DE\u9996\u9801");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager_page m1 = new Manager_page();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(20, 38, 85, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u767B\u51FA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_page l = new Login_page();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(589, 38, 85, 23);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("訂單管理");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(285, 40, 100, 25);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("訂單紀錄");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(66, 66, 28));
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(280, 110, 109, 23);
		frame.getContentPane().add(lblNewLabel_2);

		// create table
		table = new JTable(new DefaultTableModel(new Object[] { "order_id", "seat_id", "status", "date", "start", "end" }, 0));
		table.setDefaultEditor(Object.class, null);
		table.setBackground(UIManager.getColor("Panel.background"));
		table.setBounds(130, 140, 420, 200);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(130, 140, 420, 200);
		frame.getContentPane().add(sp);
		
		String[] oids = order.select("order_id", "Orders", "order_status", "T");
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < oids.length; i++) {
			model.addRow(order.getOrderInfo(Long.parseLong(oids[i])));
		}

		JTableHeader tableHeader = table.getTableHeader();
		Font headerFont = new Font("Verdana", Font.BOLD, 11);
		tableHeader.setFont(headerFont);

		TableColumn column = null;
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		for (int i = 0; i < 6; i++) {
			column = table.getColumnModel().getColumn(i);
			dtcr.setHorizontalAlignment(SwingConstants.CENTER);
			column.setCellRenderer(dtcr);
			if (i == 0 || i == 3) {
				column.setPreferredWidth(70); // 1st and 4th column is bigger
			} else if (i == 1) {
				column.setPreferredWidth(50);
			} else {
				column.setPreferredWidth(20);
			}
		}

		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JTable table = (JTable) e.getSource();
				int row = table.getSelectedRow();
				int column = table.getSelectedColumn();
				if (column == 0) {
					oid = (String) table.getValueAt(row, column);
					selectRow = row;
				} else {
					oid = null;
				}
			}
		});

		JButton addBlck = new JButton("取消訂單");
		addBlck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oid != null) {
					int n = JOptionPane.showConfirmDialog(frame, "確認取消訂單?", "修改確認", JOptionPane.YES_NO_OPTION);

					if (n == 0) {
						if (order.delOrder(Long.parseLong(oid))) {
							JOptionPane.showMessageDialog(frame, "成功取消訂單!", "通知", JOptionPane.INFORMATION_MESSAGE);
							model.removeRow(selectRow);
						} else {
							JOptionPane.showMessageDialog(frame, "未成功取消訂單...", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				} else {
					JOptionPane.showMessageDialog(frame, "請點選任一格order_id", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		addBlck.setBounds(212, 360, 100, 25);
		frame.getContentPane().add(addBlck);

		JButton delBlck = new JButton("修改人員");
		delBlck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oid != null) {
					String sid = order.select("seat_id", "Orders", "order_id", oid)[0];
					String[] users = order.select("user_id", "OrderUsers", "order_id", oid);

					// choose function
					int n = -1;
					if (sid.matches("^[ABC].*")) {
						n = JOptionPane.showConfirmDialog(frame, "確認轉讓座位?", "轉讓座位", JOptionPane.DEFAULT_OPTION);
					} else {
						String[] options = { "轉讓", "新增", "刪除" };
						n = JOptionPane.showOptionDialog(frame, "請選擇功能鍵", "修改人員", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE, null, // no custom Icon
								options, // the titles of buttons
								options[0]); // default button title
					}

					if (n == 0) {
						String before = users[0];
						// check if isRoom and isLender
						if (!sid.matches("^[ABC].*")) {
							before = JOptionPane.showInputDialog(frame, "現借用者：" + Arrays.toString(users) + "\n請輸入「轉讓人」之user_id：");
							if (order.isLender(oid, before)) {
								JOptionPane.showMessageDialog(frame, "不能更改租借者", "要求失敗", JOptionPane.ERROR_MESSAGE);
								return;
							}
						}

						if (before != null) {
							String after = JOptionPane.showInputDialog(frame, "轉讓人：" + before + "\n請輸入「被轉讓人」之user_id：");
							if (after != null) {
								if (order.modifyUser(Long.parseLong(oid), Long.parseLong(before),
										Long.parseLong(after))) {
									JOptionPane.showMessageDialog(frame, "成功轉讓座位!", "通知",
											JOptionPane.INFORMATION_MESSAGE);
								} else {
									JOptionPane.showMessageDialog(frame, "未成功轉讓座位...", "Error",
											JOptionPane.ERROR_MESSAGE, null);
								}
							}
						}
					} else if (n == 1) {
						String uid = JOptionPane.showInputDialog(frame, "請輸入欲增加人員之user_id");
						if (uid != null) {
							if (order.checkAttendance(sid, users.length + 1)) {
								if (order.addUser(Long.parseLong(oid), Long.parseLong(uid))) {
									JOptionPane.showMessageDialog(frame, "成功加入" + uid + "!", "通知",
											JOptionPane.INFORMATION_MESSAGE);
								} else {
									JOptionPane.showMessageDialog(frame, "未成功加入人員...", "Error",
											JOptionPane.ERROR_MESSAGE);
								}
							} else {
								JOptionPane.showMessageDialog(frame, "超過限制人數不得加入人員!", "Error",
										JOptionPane.ERROR_MESSAGE);
							}
						}
					} else if (n == 2) {
						String uid = JOptionPane.showInputDialog(frame, Arrays.toString(users) + "\n請輸入欲刪除人員之user_id：");
						if (uid != null) {
							if (order.isLender(oid, uid)) {
								JOptionPane.showMessageDialog(frame, "不能更改租借者", "要求失敗", JOptionPane.ERROR_MESSAGE);
							} else {
								if (order.checkAttendance(sid, users.length - 1)) {
									if (order.delUser(Long.parseLong(oid), Long.parseLong(uid))) {
										JOptionPane.showMessageDialog(frame, "成功刪除" + uid + "!", "通知",
												JOptionPane.INFORMATION_MESSAGE);
									} else {
										JOptionPane.showMessageDialog(frame, "未成功刪除人員...", "Error",
												JOptionPane.ERROR_MESSAGE);
									}
								} else {
									JOptionPane.showMessageDialog(frame, "低於限制人數不得刪除人員!", "Error",
											JOptionPane.ERROR_MESSAGE);
								}
							}
						}
					} else if (n == JOptionPane.CLOSED_OPTION) {
						return;
					}
				} else {
					JOptionPane.showMessageDialog(frame, "請點選任一格order_id", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		delBlck.setBounds(360, 360, 100, 25);
		frame.getContentPane().add(delBlck);

		JLabel lblNewLabel_1 = new JLabel("(請點選任一格 order_id)");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setBounds(275, 400, 150, 15);
		frame.getContentPane().add(lblNewLabel_1);

		frame.setVisible(true);
	}
}
