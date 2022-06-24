package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Entity.User;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Management_User {

	private JFrame frame;
	private JTable table;
	private User user = new User();
	private String[][] data;
	private String uid = null;
	private int selectRow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management_User window = new Management_User();
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
	public Management_User() {
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

		JLabel lblNewLabel = new JLabel("使用者管理");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(285, 40, 100, 25);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("名單列表");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(66, 66, 28));
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(280, 110, 109, 23);
		frame.getContentPane().add(lblNewLabel_2);

		// create table
		table = new JTable(new DefaultTableModel(new Object[] { "user_id", "name", "status", "violations" }, 0));
		table.setDefaultEditor(Object.class, null);
		table.setBackground(UIManager.getColor("Panel.background"));
		table.setBounds(165, 140, 350, 174);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(165, 140, 350, 200);
		frame.getContentPane().add(sp);

		data = user.getUserList();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < data.length; i++) {
			model.addRow(data[i]);
		}

		JTableHeader tableHeader = table.getTableHeader();
		Font headerFont = new Font("Verdana", Font.BOLD, 11);
		tableHeader.setFont(headerFont);

		TableColumn column = null;
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		for (int i = 0; i < 4; i++) {
			column = table.getColumnModel().getColumn(i);
			dtcr.setHorizontalAlignment(SwingConstants.CENTER);
			column.setCellRenderer(dtcr);
			if (i == 0) {
				column.setPreferredWidth(70);
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
					uid = (String) table.getValueAt(row, column);
					selectRow = row;
				} else {
					uid = null;
				}
			}
		});

		JButton addUser = new JButton("註冊使用者");
		addUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog(frame, "請依序輸入使用者名稱、證號、密碼（以「/」區隔）", "name/id/psswrd");
				if (input != null) {
					String[] parts = input.split("/");
					if (user.createUser(parts[0].trim(), Long.parseLong(parts[1].trim()), parts[2].trim())) {
						JOptionPane.showMessageDialog(frame, "成功註冊：" + parts[0], "通知", JOptionPane.INFORMATION_MESSAGE);
						model.addRow(user.getUserInfo(Long.parseLong(parts[1].trim())));
					} else {
						JOptionPane.showMessageDialog(frame, "未成功註冊使用者...", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		addUser.setBounds(170, 360, 100, 25);
		frame.getContentPane().add(addUser);

		JButton delUser = new JButton("刪除使用者");
		delUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (uid != null) {
					int n = JOptionPane.showConfirmDialog(frame, "是否刪除使用者：" + uid, "修改確認", JOptionPane.OK_OPTION);
					if (n == 0) {
						if (user.deleteUser(Long.parseLong(uid))) {
							JOptionPane.showMessageDialog(frame, "成功刪除使用者!", "通知", JOptionPane.INFORMATION_MESSAGE);
							model.removeRow(selectRow);
						} else {
							JOptionPane.showMessageDialog(frame, "未成功刪除使用者...", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				} else {
					JOptionPane.showMessageDialog(frame, "請點選任一格user_id", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		delUser.setBounds(290, 360, 100, 25);
		frame.getContentPane().add(delUser);

		JButton setStatus = new JButton("更改狀態");
		setStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (uid != null) {
					int n = JOptionPane.showConfirmDialog(frame, "是否更改使用者狀態：" + uid, "修改確認", JOptionPane.OK_OPTION);
					if (n == 0) {
						if (user.updateUserStatus(Long.parseLong(uid))) {
							JOptionPane.showMessageDialog(frame, "成功修改使用者狀態!", "通知", JOptionPane.INFORMATION_MESSAGE);
							if (model.getValueAt(selectRow, 2).equals("F")) {
								model.setValueAt("T", selectRow, 2);
							} else {
								model.setValueAt("F", selectRow, 2);
							}
						} else {
							JOptionPane.showMessageDialog(frame, "未成功修改使用者狀態...", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				} else {
					JOptionPane.showMessageDialog(frame, "請點選任一格user_id", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		setStatus.setBounds(410, 360, 100, 25);
		frame.getContentPane().add(setStatus);

		JLabel lblNewLabel_1 = new JLabel("(請點選任一格 user_id)");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setBounds(330, 400, 130, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("(請輸入規定資訊)");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setBounds(175, 400, 130, 15);
		frame.getContentPane().add(lblNewLabel_1_1);

		frame.setVisible(true);
	}
}
