package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Entity.User;

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Dah_Hsian_account_activity_order {

	private long id;
	private String name;
	private JFrame frame;
	private User user = new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dah_Hsian_account_activity_order window = new Dah_Hsian_account_activity_order(109405094);
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
	public Dah_Hsian_account_activity_order(long id) {
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
				Booking_page_1 bp1 = new Booking_page_1(id);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(32, 24, 85, 23);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(370, 28, 77, 15);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(691, 24, 85, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton = new JButton("\u9810\u7D04");
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
		System.out.println(oid);
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

		JButton btnNewButton_7 = new JButton("\u53D6\u6D88\u9810\u7D04");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : jButton) {
					if (b.getBackground().equals(Color.DARK_GRAY)) {
						// long id = oid.get(jButton.indexOf(b));
						JOptionPane.showConfirmDialog(frame, "確定取消預約?");
						b.setBackground(null);
						b.setForeground(Color.black);
					}
				}
			}
		});
		btnNewButton_7.setBounds(309, 436, 85, 23);
		frame.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("\u8B8A\u66F4\u6210\u54E1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : jButton) {
					if (b.getBackground().equals(Color.DARK_GRAY)) {
						// long id = oid.get(jButton.indexOf(b));
						JOptionPane.showConfirmDialog(frame, "確定變更人員?");
						b.setBackground(null);
						b.setForeground(Color.black);
					}
				}
			}
		});
		btnNewButton_8.setBounds(427, 436, 85, 23);
		frame.getContentPane().add(btnNewButton_8);

		JLabel lblNewLabel_2 = new JLabel(id + " " + name);
		lblNewLabel_1.setForeground(new Color(66,66,28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(690, 55, 100, 15);
		frame.getContentPane().add(lblNewLabel_2);

		frame.setVisible(true);
	}
}