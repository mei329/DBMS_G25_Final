package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
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

import Entity.Blacklist;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Manager_2 {

	private JFrame frame;
	private JTable table;
	private Blacklist blck = new Blacklist();
	private String[][] data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_2 window = new Manager_2();
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
	public Manager_2() {
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
				Manager_1 m1 = new Manager_1();
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
		lblNewLabel.setBounds(291, 40, 100, 25);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("歷史紀錄");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(66, 66, 28));
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(280, 110, 109, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		// JPanel panel = new JPanel();
		// panel.setBounds(165, 140, 350, 200);
		// frame.getContentPane().add(panel);

		createTable();
		
		JButton addBlck = new JButton("加入黑名單");
		addBlck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long uid = Long.parseLong(JOptionPane.showInputDialog(frame, "請輸入user_id"));
				if (blck.add(uid)) {
					JOptionPane.showMessageDialog(frame, "成功加入黑名單!");
					createTable();
					
				} else {
					JOptionPane.showMessageDialog(frame, "未成功加入黑名單...");
				}
			}
		});
		addBlck.setBounds(212, 360, 100, 25);
		frame.getContentPane().add(addBlck);

		JButton delBlck = new JButton("取消黑名單");
		delBlck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long bid = Long.parseLong(JOptionPane.showInputDialog(frame, "請輸入list_id"));
				if (blck.expire(bid)) {
					JOptionPane.showMessageDialog(frame, "成功取消黑名單!");
					createTable();
				} else {
					JOptionPane.showMessageDialog(frame, "未成功取消黑名單...");
				}
			}
		});
		delBlck.setBounds(360, 360, 100, 25);
		frame.getContentPane().add(delBlck);

		frame.setVisible(true);
	}
	
	public void createTable() {
		String[] title = { "list_id", "status", "banned_date", "user_id" };
		data = blck.getBlacklist();
		
		table = new JTable(data, title);
		table.setBackground(UIManager.getColor("Panel.background"));
		table.setBounds(165, 140, 350, 174);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(165, 140, 350, 200);
		frame.getContentPane().add(sp);

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
	}
}
