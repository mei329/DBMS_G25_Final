package GUI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Entity.Blacklist;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Management_Blacklist {

	private JFrame frame;
	private JTable table;
	private Blacklist blck = new Blacklist();
	private String[][] data;
	private String bid = null;
	private int selectRow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management_Blacklist window = new Management_Blacklist();
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
	public Management_Blacklist() {
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

		JLabel lblNewLabel = new JLabel("\u9ED1\u540D\u55AE\u7BA1\u7406");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(285, 40, 100, 25);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("歷史紀錄");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(66, 66, 28));
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(280, 110, 109, 23);
		frame.getContentPane().add(lblNewLabel_2);

		// create table
		table = new JTable(new DefaultTableModel(new Object[]{ "list_id", "status", "banned_date", "user_id" }, 0));
		table.setDefaultEditor(Object.class, null);
		table.setBackground(UIManager.getColor("Panel.background"));
		table.setBounds(165, 140, 350, 174);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(165, 140, 350, 200);
		frame.getContentPane().add(sp);
		
		data = blck.getBlckList();
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
			if (i == 2) {
				column.setPreferredWidth(70); // third column is bigger
			} else if (i == 3) {
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
					bid = (String) table.getValueAt(row, column);
					selectRow = row;
				} else {
					bid = null;
				}
			}
		});

		JButton addBlck = new JButton("加入黑名單");
		addBlck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = JOptionPane.showInputDialog(frame, "請輸入欲加入之user_id");
				if (uid != null) {
					if (blck.add(Long.parseLong(uid))) {
						JOptionPane.showMessageDialog(frame, "成功加入黑名單!", "通知", JOptionPane.INFORMATION_MESSAGE);
						model.addRow(blck.getBlckInfo(blck.count()-1));
					} else {
						JOptionPane.showMessageDialog(frame, "未成功加入黑名單...", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		addBlck.setBounds(170, 360, 100, 25);
		frame.getContentPane().add(addBlck);

		JButton delBlck = new JButton("刪除黑名單");
		delBlck.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (bid != null) {
					int n = JOptionPane.showConfirmDialog(frame, "是否刪除黑名單：" + bid, "修改確認", JOptionPane.OK_OPTION);
					if (n == 0) {
						if (blck.del(Long.parseLong(bid))) {
							JOptionPane.showMessageDialog(frame, "成功刪除黑名單!", "通知", JOptionPane.INFORMATION_MESSAGE);
							model.removeRow(selectRow);
						} else {
							JOptionPane.showMessageDialog(frame, "未成刪除消黑名單...", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				} else {
					JOptionPane.showMessageDialog(frame, "請點選任一格list_id", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		delBlck.setBounds(290, 360, 100, 25);
		frame.getContentPane().add(delBlck);

		JButton updBlck = new JButton("取消黑名單");
		updBlck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bid != null) {
					int n = JOptionPane.showConfirmDialog(frame, "是否取消黑名單：" + bid, "修改確認", JOptionPane.OK_OPTION);
					if (n == 0) {
						if (blck.update(Long.parseLong(bid), "blcklst_status", "'F'")) {
							JOptionPane.showMessageDialog(frame, "成功取消黑名單!", "通知", JOptionPane.INFORMATION_MESSAGE);
							model.setValueAt("F", selectRow, 1);
						} else {
							JOptionPane.showMessageDialog(frame, "未成功取消黑名單...", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				} else {
					JOptionPane.showMessageDialog(frame, "請點選任一格list_id", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		updBlck.setBounds(410, 360, 100, 25);
		frame.getContentPane().add(updBlck);

		JLabel lblNewLabel_1 = new JLabel("(請點選任一格 list_id)");
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
