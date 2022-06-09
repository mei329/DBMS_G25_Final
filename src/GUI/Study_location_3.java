package GUI;

import Entity.Order;
import Entity.User;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Study_location_3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private Color background = new Color(219, 219, 178);
	private Color btncolor = new Color(115, 121, 59);
	private Color word = new Color(66, 66, 28);
	private long id;
	private User user = new User();
	private String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study_location_3 window = new Study_location_3(109405094);
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
	public Study_location_3(long id) {
		this.id = id;
		name = user.getUser(id);
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
				Booking_page bp = new Booking_page(id);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(32, 24, 85, 23);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("A 區");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(370, 28, 77, 25);
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
				Study_location_1 s1 = new Study_location_1(id);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(32, 139, 85, 50);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(32, 265, 85, 50);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(27, 380, 90, 50);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("\u501F\u7528\u7D00\u9304");
		btnNewButton_5.setBounds(250, 100, 150, 35);
		frame.getContentPane().add(btnNewButton_5);

		JLabel lblNewLabel_1 = new JLabel("修改預約");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(370, 175, 77, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton_6 = new JButton("\u9055\u898F/\u505C\u6B0A\u7D00\u9304");
		btnNewButton_6.setBounds(410, 100, 150, 35);
		frame.getContentPane().add(btnNewButton_6);

		ArrayList<Long> oid = user.getOrders(id);
		System.out.println(id + "'s order_id: " + oid);
		JPanel panel = new JPanel();
		panel.setBounds(234, 200, 352, 218);
		panel.setLayout(new GridLayout(oid.size(), 1, 0, 0));
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBounds(234, 200, 352, 218);
		frame.getContentPane().add(scrollPane);

		ArrayList<JButton> jButton = new ArrayList<JButton>();
		for (int i = 0; i < oid.size(); i++) {
			jButton.add(new JButton());
			jButton.get(i).setText(user.getOrderInfo(oid.get(i)));
			panel.add(jButton.get(i));
			jButton.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					((JButton) e.getSource()).setBackground(Color.DARK_GRAY);
					((JButton) e.getSource()).setForeground(Color.white);
					((JButton) e.getSource()).setOpaque(true);
					((JButton) e.getSource()).setBorderPainted(false);
				}
			});
		}

		JButton btnNewButton_7 = new JButton("取消");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : jButton) {
					if (b.getBackground().equals(Color.DARK_GRAY)) {
						// long id = oid.get(jButton.indexOf(b));
						int n = JOptionPane.showConfirmDialog(frame, "確定取消預約?");
						if (n == 0) {
							String[] parts = b.getText().split("   ");
							System.out.println(Arrays.toString(parts));
							Order o = new Order();
							if (o.delOrder(Long.parseLong(parts[0]))) {
								panel.remove(b);
								panel.repaint();
							} else {
								JOptionPane.showMessageDialog(frame, "未成功取消預約...");
							}
						} else {
							b.setBackground(null);
							b.setForeground(Color.black);
						}
					}
				}
			}
		});
		btnNewButton_7.setBounds(250, 436, 65, 25);
		frame.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("暫離");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : jButton) {
					if (b.getBackground().equals(Color.DARK_GRAY)) {
						// long id = oid.get(jButton.indexOf(b));
						JOptionPane.showConfirmDialog(frame, "確定保留1小時?");
						b.setBackground(null);
						b.setForeground(Color.black);
					}
				}
			}
		});
		btnNewButton_8.setBounds(335, 436, 65, 25);
		frame.getContentPane().add(btnNewButton_8);

		JLabel lblNewLabel_2 = new JLabel(id + " " + name);
		lblNewLabel_1.setForeground(new Color(66, 66, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(690, 55, 100, 15);
		frame.getContentPane().add(lblNewLabel_2);

		JButton btnNewButton_9 = new JButton("續借");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : jButton) {
					if (b.getBackground().equals(Color.DARK_GRAY)) {
						// long id = oid.get(jButton.indexOf(b));
						JOptionPane.showInputDialog(frame, "請輸入要延長續借幾小時：", "1");
						b.setBackground(null);
						b.setForeground(Color.black);
					}
				}
			}
		});
		btnNewButton_9.setBounds(420, 436, 65, 25);
		frame.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_9_1 = new JButton("修改");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : jButton) {
					if (b.getBackground().equals(Color.DARK_GRAY)) {
						String[] options = { "修改時段", "修改人員" };
						JOptionPane.showOptionDialog(frame, "請問您要修改預約時段還是修改使用人員?", "修改確認", JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
						b.setBackground(null);
						b.setForeground(Color.black);
					}
				}
			}
		});
		btnNewButton_9_1.setBounds(505, 436, 65, 25);
		frame.getContentPane().add(btnNewButton_9_1);

		frame.setVisible(true);
	}
}