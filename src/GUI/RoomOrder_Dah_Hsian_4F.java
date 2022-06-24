package GUI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import Entity.Order;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class RoomOrder_Dah_Hsian_4F {

	public long studentId;// = 109405094l
	public String orderDate;
	public double borrow_start;// = 10
	public double borrow_end;// = 12
	public String room;
	private ArrayList<JButton> dateBtns = new ArrayList<JButton>();
	private ArrayList<JButton> roomBtns = new ArrayList<JButton>();
	private ArrayList<JButton> timeBtns = new ArrayList<JButton>();

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomOrder_Dah_Hsian_4F window = new RoomOrder_Dah_Hsian_4F(109405094);
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
	public RoomOrder_Dah_Hsian_4F(long id) {
		this.studentId = id;
		orderDate = "2022-06-08";
		borrow_start = 10;
		borrow_end = 12;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219, 219, 178));
		frame.setBounds(100, 100, 847, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(381, 36, 77, 15);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Room_page bp1 = new Room_page(studentId);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(21, 32, 85, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_page l = new Login_page();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(702, 32, 85, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(21, 214, 85, 55);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("借用紀錄");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserActivity_page u = new UserActivity_page(studentId, "Room");
				frame.setVisible(false);
			}
		});
		btnNewButton_4.setBounds(21, 381, 90, 55);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("06-25");
		btnNewButton_5.setBounds(168, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5);
		dateBtns.add(btnNewButton_5);

		JButton btnNewButton_5_1 = new JButton("06-26");
		btnNewButton_5_1.setBounds(246, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1);
		dateBtns.add(btnNewButton_5_1);

		JButton btnNewButton_5_1_1 = new JButton("06-27");
		btnNewButton_5_1_1.setBounds(324, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_1);
		dateBtns.add(btnNewButton_5_1_1);

		JButton btnNewButton_5_1_2 = new JButton("06-28");
		btnNewButton_5_1_2.setBounds(402, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_2);
		dateBtns.add(btnNewButton_5_1_2);

		JButton btnNewButton_5_1_3 = new JButton("06-29");
		btnNewButton_5_1_3.setBounds(480, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_3);
		dateBtns.add(btnNewButton_5_1_3);

		JButton btnNewButton_5_1_4 = new JButton("06-30");
		btnNewButton_5_1_4.setBounds(558, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_4);
		dateBtns.add(btnNewButton_5_1_4);

		JButton btnNewButton_5_1_4_1 = new JButton("07-01");
		btnNewButton_5_1_4_1.setBounds(636, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_4_1);
		dateBtns.add(btnNewButton_5_1_4_1);

		JButton btnNewButton_5_2 = new JButton("07-02");
		btnNewButton_5_2.setBounds(168, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_2);
		dateBtns.add(btnNewButton_5_2);

		JButton btnNewButton_5_3 = new JButton("07-03");
		btnNewButton_5_3.setBounds(246, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_3);
		dateBtns.add(btnNewButton_5_3);

		JButton btnNewButton_5_4 = new JButton("07-04");
		btnNewButton_5_4.setBounds(324, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_4);
		dateBtns.add(btnNewButton_5_4);

		JButton btnNewButton_5_5 = new JButton("07-05");
		btnNewButton_5_5.setBounds(402, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_5);
		dateBtns.add(btnNewButton_5_5);

		JButton btnNewButton_5_6 = new JButton("07-06");
		btnNewButton_5_6.setBounds(480, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_6);
		dateBtns.add(btnNewButton_5_6);

		JButton btnNewButton_5_7 = new JButton("07-07");
		btnNewButton_5_7.setBounds(558, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_7);
		dateBtns.add(btnNewButton_5_7);

		JButton btnNewButton_5_8 = new JButton("07-08");
		btnNewButton_5_8.setBounds(636, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_8);
		dateBtns.add(btnNewButton_5_8);

		changeDate();
		addButtonListener(dateBtns);

		JLabel lblNewLabel_1 = new JLabel("\u65E5\u671F");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(108, 143, 46, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("\u8A0E\u8AD6\u5BA4");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(119, 266, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1);

		JButton btnNewButton_6 = new JButton("401(\u4EBA\u6578\u9650\u52363-6\u4EBA)");
		btnNewButton_6.setBounds(205, 227, 161, 39);
		frame.getContentPane().add(btnNewButton_6);
		roomBtns.add(btnNewButton_6);

		JButton btnNewButton_6_1 = new JButton("402(\u4EBA\u6578\u9650\u52363-6\u4EBA)");
		btnNewButton_6_1.setBounds(387, 227, 161, 39);
		frame.getContentPane().add(btnNewButton_6_1);
		roomBtns.add(btnNewButton_6_1);

		JButton btnNewButton_6_2 = new JButton("403(\u4EBA\u6578\u9650\u52363-6\u4EBA)");
		btnNewButton_6_2.setBounds(205, 295, 161, 39);
		frame.getContentPane().add(btnNewButton_6_2);
		roomBtns.add(btnNewButton_6_2);

		JButton btnNewButton_6_3 = new JButton("404(\u4EBA\u6578\u9650\u52363-9\u4EBA)");
		btnNewButton_6_3.setBounds(387, 295, 161, 39);
		frame.getContentPane().add(btnNewButton_6_3);
		roomBtns.add(btnNewButton_6_3);

		addButtonListener(roomBtns);

		JLabel lblNewLabel_1_1_1 = new JLabel("\u6642\u6BB5");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(108, 433, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		JButton btnNewButton_7 = new JButton("08:00-08:30");
		btnNewButton_7.setBounds(180, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_7);
		timeBtns.add(btnNewButton_7);

		JButton btnNewButton_1_1 = new JButton("08:30-09:00");
		btnNewButton_1_1.setBounds(278, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		timeBtns.add(btnNewButton_1_1);

		JButton btnNewButton_2_1 = new JButton("09:00-09:30");
		btnNewButton_2_1.setBounds(381, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		timeBtns.add(btnNewButton_2_1);

		JButton btnNewButton_3_1 = new JButton("09:30-10:00");
		btnNewButton_3_1.setBounds(480, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_3_1);
		timeBtns.add(btnNewButton_3_1);

		JButton btnNewButton_4_1 = new JButton("10:00-10:30");
		btnNewButton_4_1.setBounds(580, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_4_1);
		timeBtns.add(btnNewButton_4_1);

		JButton btnNewButton_5_9 = new JButton("10:30-11:00");
		btnNewButton_5_9.setBounds(682, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_5_9);
		timeBtns.add(btnNewButton_5_9);

		JButton btnNewButton_6_4 = new JButton("11:00-11:30");
		btnNewButton_6_4.setBounds(180, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_6_4);
		timeBtns.add(btnNewButton_6_4);

		JButton btnNewButton_7_1 = new JButton("11:30-12:00");
		btnNewButton_7_1.setBounds(278, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_7_1);
		timeBtns.add(btnNewButton_7_1);

		JButton btnNewButton_8 = new JButton("12:00-12:30");
		btnNewButton_8.setBounds(381, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_8);
		timeBtns.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("12:30-13:00");
		btnNewButton_9.setBounds(480, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_9);
		timeBtns.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("13:00-13:30");
		btnNewButton_10.setBounds(580, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_10);
		timeBtns.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("13:30-14:00");
		btnNewButton_11.setBounds(682, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_11);
		timeBtns.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("14:00-14:30");
		btnNewButton_12.setBounds(180, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_12);
		timeBtns.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("14:30-15:00");
		btnNewButton_13.setBounds(278, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_13);
		timeBtns.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("15:00-15:30");
		btnNewButton_14.setBounds(381, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_14);
		timeBtns.add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("15:30-16:00");
		btnNewButton_15.setBounds(480, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_15);
		timeBtns.add(btnNewButton_15);

		JButton btnNewButton_16 = new JButton("16:00-16:30");
		btnNewButton_16.setBounds(580, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_16);
		timeBtns.add(btnNewButton_16);

		JButton btnNewButton_17 = new JButton("16:30-17:00");
		btnNewButton_17.setBounds(682, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_17);
		timeBtns.add(btnNewButton_17);

		JButton btnNewButton_18 = new JButton("17:00-17:30");
		btnNewButton_18.setBounds(180, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_18);
		timeBtns.add(btnNewButton_18);

		JButton btnNewButton_19 = new JButton("17:30-18:00");
		btnNewButton_19.setBounds(278, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_19);
		timeBtns.add(btnNewButton_19);

		JButton btnNewButton_20 = new JButton("18:00-18:30");
		btnNewButton_20.setBounds(381, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_20);
		timeBtns.add(btnNewButton_20);

		JButton btnNewButton_21 = new JButton("18:30-19:00");
		btnNewButton_21.setBounds(480, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_21);
		timeBtns.add(btnNewButton_21);

		JButton btnNewButton_21_1 = new JButton("19:00-19:30");
		btnNewButton_21_1.setBounds(580, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_21_1);
		timeBtns.add(btnNewButton_21_1);

		JButton btnNewButton_21_2 = new JButton("19:30-20:00");
		btnNewButton_21_2.setBounds(682, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_21_2);
		timeBtns.add(btnNewButton_21_2);

		JButton btnNewButton_21_3 = new JButton("20:00-20:30");
		btnNewButton_21_3.setBounds(180, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_3);
		timeBtns.add(btnNewButton_21_3);

		JButton btnNewButton_21_4 = new JButton("20:30-21:00");
		btnNewButton_21_4.setBounds(278, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_4);
		timeBtns.add(btnNewButton_21_4);

		JButton btnNewButton_21_5 = new JButton("21:00-21:30");
		btnNewButton_21_5.setBounds(381, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_5);
		timeBtns.add(btnNewButton_21_5);

		JButton btnNewButton_21_5_1 = new JButton("21:30-22:00");
		btnNewButton_21_5_1.setBounds(480, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_5_1);
		timeBtns.add(btnNewButton_21_5_1);

		addTimeBtnListener(timeBtns);

		JButton btnNewButton_22 = new JButton("\u4E0B\u4E00\u6B65");
		btnNewButton_22.setBounds(684, 604, 85, 23);
		frame.getContentPane().add(btnNewButton_22);
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "預約", "取消" };
				int n = JOptionPane.showOptionDialog(frame,
						"學號：" + studentId + "\n" + "大樓：達賢\n" + "自習室：" + room.substring(0, 3) + "\n日期：" + orderDate
								+ "\n時段：" + String.format("%05.2f", borrow_start).replace('.', ':') + " ~ "
								+ String.format("%05.2f", borrow_end).replace('.', ':') + "\n",
						"預約確認", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, // no custom Icon
						options, // the titles of buttons
						options[0]); // default button title

				// 按下去之後要做的事
				if (n == 0) {
					RoomOrder_Dah_Hsian_4F_2 dh2 = new RoomOrder_Dah_Hsian_4F_2(studentId, room, orderDate,
							borrow_start, borrow_end);
					frame.setVisible(false);
				}
			}
		});

		frame.setVisible(true);
	}

	public void addButtonListener(ArrayList<JButton> btns) {
		class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				for (JButton b : btns) {
					b.setBackground(UIManager.getColor("Button.background"));
					b.setForeground(Color.black);
					b.setBorderPainted(true);
				}
				((JButton) e.getSource()).setBackground(Color.DARK_GRAY);
				((JButton) e.getSource()).setForeground(Color.white);
				((JButton) e.getSource()).setBorderPainted(false);

				if (btns.equals(dateBtns)) {
					orderDate = "2022-" + ((JButton) e.getSource()).getText().trim();
				} else if (btns.equals(roomBtns)) {
					room = ((JButton) e.getSource()).getText().trim();
				}
				if (orderDate != null && room != null) {
					checkTime(room.substring(0, 3), orderDate);
				}
			}

			public void checkTime(String roomId, String orderDate) {
				for (JButton b : timeBtns) {
					b.setEnabled(true);
				}
				Order o = new Order();
				ArrayList<double[]> time = o.getOrderTime(roomId, orderDate);
				for (double[] t : time) {
					int start = (int) Math.ceil((t[0] - 8) * 2);
					int end = (int) Math.ceil((t[1] - t[0]) * 2) + start;
					for (int i = start; i < end; i++) {
						timeBtns.get(i).setEnabled(false);
					}
				}
			}
		}

		ActionListener listener = new ButtonListener();
		for (JButton b : btns) {
			b.addActionListener(listener);
		}
	}

	public void addTimeBtnListener(ArrayList<JButton> btns) {
		class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				// get all clicked buttons index
				ArrayList<Integer> index = new ArrayList<Integer>();
				for (JButton b : btns) {
					if (b.getBackground() == Color.DARK_GRAY) {
						index.add(btns.indexOf(b));
					}
				}

				// paint the action button
				if (index.size() < 2 || ((JButton) e.getSource()).getBackground() == Color.DARK_GRAY) {
					JButton b = ((JButton) e.getSource());
					if (b.getBackground() == Color.DARK_GRAY) {
						// undo click button
						b.setBackground(UIManager.getColor("Button.background"));
						b.setForeground(Color.black);
						b.setBorderPainted(true);
					} else {
						// clicked < 2 buttons
						b.setBackground(Color.DARK_GRAY);
						b.setForeground(Color.white);
						b.setBorderPainted(false);
						index.add(btns.indexOf(b));
						Collections.sort(index);

						// buttons must be chosen continuously
						if (index.size() == 2) {
							int disabled = -1;
							int last = index.get(1);
							for (int i = index.get(0); i <= last; i++) {
								if (!btns.get(i).isEnabled()) {
									disabled = i;
								}
								if (disabled == -1) {
									btns.get(i).setBackground(Color.DARK_GRAY);
									btns.get(i).setForeground(Color.white);
									btns.get(i).setBorderPainted(false);
								} else if (i > disabled) {
									btns.get(i).setBackground(UIManager.getColor("Button.background"));
									btns.get(i).setForeground(Color.black);
									btns.get(i).setBorderPainted(true);
								}
							}
						}
					}
				} else {
					for (JButton b : timeBtns) {
						b.setBackground(UIManager.getColor("Button.background"));
						b.setForeground(Color.black);
						b.setBorderPainted(true);
					}
					index.clear();
					((JButton) e.getSource()).setBackground(Color.DARK_GRAY);
					((JButton) e.getSource()).setForeground(Color.white);
					((JButton) e.getSource()).setBorderPainted(false);
				}

				// get results
				index.clear();
				for (JButton b : btns) {
					if (b.getBackground() == Color.DARK_GRAY) {
						index.add(btns.indexOf(b));
					}
				}
				if (index.size() > 1) {
					borrow_start = Double
							.parseDouble(btns.get(index.get(0)).getText().substring(0, 5).replace(':', '.'));
					borrow_end = Double
							.parseDouble(btns.get(index.get(index.size()-1)).getText().substring(6, 11).replace(':', '.'));
				}
			}
		}

		ActionListener listener = new ButtonListener();
		for (JButton b : btns) {
			b.addActionListener(listener);
		}
	}

	public void changeDate() {
		ArrayList<String> date = new ArrayList<String>();
		int m = 1;
		while (m <= 12) {
			if (m < 8) {
				for (int d = 1; d < 29; d++) {
					if (d < 10) {
						date.add("0" + m + "-0" + d);
					} else {
						date.add("0" + m + "-" + d);
					}
				}
				if (m != 2) {
					date.add("0" + m + "-29");
					date.add("0" + m + "-30");
					if (m % 2 == 1) {
						date.add("0" + m + "-31");
					}
				}
			} else {
				String str = "2022-0";
				if (m < 10) {
					str += m;
				} else {
					str = String.valueOf(m);
				}
				for (int d = 1; d < 31; d++) {
					if (d < 10) {
						date.add(str + "-0" + d);
					} else {
						date.add(str + "-" + d);
					}
				}
				if (m % 2 == 0) {
					date.add(str + "-31");
				}
			}
			m++;
		}

		LocalDate today = java.time.LocalDate.now();
		int ind = date.indexOf(today.toString().substring(5));
		for (int i = ind; i < ind + 14; i++) {
			dateBtns.get(i - ind).setText(date.get(i));
		}
	}

}