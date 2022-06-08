package ui;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import fpj.Order;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Dah_Hsian_discussion_room_4F {

	public long studentId ;// = 109306027l ;
	public String orderDate ;//= "2022-06-01";
	public int borrow_start ;//= 10 ;
	public int borrow_end ;//= 12 ;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// userId
					// orderDate
					// borrow_start
					// borrow_end
					Dah_Hsian_discussion_room_4F window = new Dah_Hsian_discussion_room_4F();
					window.studentId = 109306028;
					window.orderDate = "2022-06-08" ;
					window.borrow_start = 10 ;
					window.borrow_end = 12 ;
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
	public Dah_Hsian_discussion_room_4F() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 847, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// 學號
		JLabel lbSid = new JLabel("學號");
		lbSid.setHorizontalAlignment(SwingConstants.CENTER);
		lbSid.setBounds(5, 80, 78, 24);
		frame.getContentPane().add(lbSid);

		final JTextField tfsid = new JTextField();
		tfsid.setBounds(62, 80, 100, 24);
		tfsid.setColumns(10);
		tfsid.setText("109306028");
		frame.getContentPane().add(tfsid);
		
		JButton btnNewButton = new JButton("\u9810\u7D04");
		btnNewButton.setBounds(21, 127, 85, 47);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u9054\u8CE2\u5716\u66F8\u9928");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(381, 36, 77, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u56DE\u9996\u9801");
		btnNewButton_1.setBounds(21, 32, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setBounds(702, 32, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_3.setBounds(21, 246, 85, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u501F\u95B1\u7D00\u9304");
		btnNewButton_4.setBounds(21, 413, 90, 55);
		frame.getContentPane().add(btnNewButton_4);



		JButton btnNewButton_5 = new JButton("5/27");
		btnNewButton_5.setBounds(168, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("5/28");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1.setBounds(246, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_1_1 = new JButton("5/29");
		btnNewButton_5_1_1.setBounds(324, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_1);
		
		JButton btnNewButton_5_1_2 = new JButton("5/30");
		btnNewButton_5_1_2.setBounds(402, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_2);
		
		JButton btnNewButton_5_1_3 = new JButton("5/31");
		btnNewButton_5_1_3.setBounds(480, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_3);
		
		JButton btnNewButton_5_1_4 = new JButton("6/1");
		btnNewButton_5_1_4.setBounds(558, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_4);
		
		JButton btnNewButton_5_1_4_1 = new JButton("6/2");
		btnNewButton_5_1_4_1.setBounds(636, 118, 68, 23);
		frame.getContentPane().add(btnNewButton_5_1_4_1);
		
		JButton btnNewButton_5_2 = new JButton("6/3");
		btnNewButton_5_2.setBounds(168, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("6/4");
		btnNewButton_5_3.setBounds(246, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("6/5");
		btnNewButton_5_4.setBounds(324, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("6/6");
		btnNewButton_5_5.setBounds(402, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("6/7");
		btnNewButton_5_6.setBounds(480, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("6/8");
		btnNewButton_5_7.setBounds(558, 151, 68, 23);
		btnNewButton_5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((JButton)e.getSource()).setBackground(Color.DARK_GRAY);
				((JButton)e.getSource()).setForeground(Color.white);
				((JButton)e.getSource()).setOpaque(true);
				((JButton)e.getSource()).setBorderPainted (false);
			}
		});
		frame.getContentPane().add(btnNewButton_5_7);
		
		JButton btnNewButton_5_8 = new JButton("6/9");
		btnNewButton_5_8.setBounds(636, 151, 68, 23);
		frame.getContentPane().add(btnNewButton_5_8);

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
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"預約",
						"取消"};
				int n = JOptionPane.showOptionDialog(frame,
								"學號："+tfsid.getText().trim()+"\n" +
										"大樓：達賢\n" +
										"自習室：401\n" +
								"日期：" +"2022/6/8\n"+
								"時段：" +"10:00 ~ 13:00"+"\n" +
								"",
						"預約確認",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,     //do not use a custom Icon
						options,  //the titles of buttons
						options[0]); //default button title


				// 按下去之後要做的事
				// System.out.println("按下 A025");
				if( n==0){
					Order o  = new Order() ;
					long sid = Long.parseLong( tfsid.getText().trim()) ;
					String odate  ="2022/6/8";
					int bStart = 10;//Integer.parseInt(  tfoTimeStart.getText().trim());
					int bEnd = 13 ; //Integer.parseInt(  tfoTimeEnd.getText().trim());
					ArrayList<Long> sids = new ArrayList<Long>() ;
					sids.add(sid) ;
					o.createRoomOrder(401,"T",odate , bStart,bEnd,sids);
				}

			}
		});

		
		
		
		JButton btnNewButton_6_1 = new JButton("402(\u4EBA\u6578\u9650\u52363-6\u4EBA)");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6_1.setBounds(387, 227, 161, 39);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton("403(\u4EBA\u6578\u9650\u52363-6\u4EBA)");
		btnNewButton_6_2.setBounds(205, 295, 161, 39);
		frame.getContentPane().add(btnNewButton_6_2);
		
		JButton btnNewButton_6_3 = new JButton("404(\u4EBA\u6578\u9650\u52363-9\u4EBA)");
		btnNewButton_6_3.setBounds(387, 295, 161, 39);
		frame.getContentPane().add(btnNewButton_6_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u6642\u6BB5");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(108, 433, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_7 = new JButton("08:00-08:30");
		btnNewButton_7.setBounds(180, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("08:30-09:00");
		btnNewButton_1_1.setBounds(278, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("09:00-09:30");
		btnNewButton_2_1.setBounds(381, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("09:30-10:00");
		btnNewButton_3_1.setBounds(480, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("10:00-10:30");
		btnNewButton_4_1.setBounds(580, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_4_1);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((JButton)e.getSource()).setBackground(Color.DARK_GRAY);
				((JButton)e.getSource()).setForeground(Color.white);
				((JButton)e.getSource()).setOpaque(true);
				((JButton)e.getSource()).setBorderPainted (false);
			}
		});
		
		JButton btnNewButton_5_9 = new JButton("10:30-11:00");
		btnNewButton_5_9.setBounds(682, 413, 105, 23);
		frame.getContentPane().add(btnNewButton_5_9);
		btnNewButton_5_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((JButton)e.getSource()).setBackground(Color.DARK_GRAY);
				((JButton)e.getSource()).setForeground(Color.white);
				((JButton)e.getSource()).setOpaque(true);
				((JButton)e.getSource()).setBorderPainted (false);
			}
		});
		
		JButton btnNewButton_6_4 = new JButton("11:00-11:30");
		btnNewButton_6_4.setBounds(180, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_6_4);
		btnNewButton_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((JButton)e.getSource()).setBackground(Color.DARK_GRAY);
				((JButton)e.getSource()).setForeground(Color.white);
				((JButton)e.getSource()).setOpaque(true);
				((JButton)e.getSource()).setBorderPainted (false);
			}
		});
		
		JButton btnNewButton_7_1 = new JButton("11:30-12:00");
		btnNewButton_7_1.setBounds(278, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_7_1);
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((JButton)e.getSource()).setBackground(Color.DARK_GRAY);
				((JButton)e.getSource()).setForeground(Color.white);
				((JButton)e.getSource()).setOpaque(true);
				((JButton)e.getSource()).setBorderPainted (false);
			}
		});
		
		JButton btnNewButton_8 = new JButton("12:00-12:30");
		btnNewButton_8.setBounds(381, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((JButton)e.getSource()).setBackground(Color.DARK_GRAY);
				((JButton)e.getSource()).setForeground(Color.white);
				((JButton)e.getSource()).setOpaque(true);
				((JButton)e.getSource()).setBorderPainted (false);
			}
		});
		
		JButton btnNewButton_9 = new JButton("12:30-13:00");
		btnNewButton_9.setBounds(480, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((JButton)e.getSource()).setBackground(Color.DARK_GRAY);
				((JButton)e.getSource()).setForeground(Color.white);
				((JButton)e.getSource()).setOpaque(true);
				((JButton)e.getSource()).setBorderPainted (false);
			}
		});
		
		JButton btnNewButton_10 = new JButton("13:00-13:30");
		btnNewButton_10.setBounds(580, 446, 105, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("13:30-14:00");
		btnNewButton_11.setBounds(682, 445, 105, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("14:00-14:30");
		btnNewButton_12.setBounds(180, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("14:30-15:00");
		btnNewButton_13.setBounds(278, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("15:00-15:30");
		btnNewButton_14.setBounds(381, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("15:30-16:00");
		btnNewButton_15.setBounds(480, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("16:00-16:30");
		btnNewButton_16.setBounds(580, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("16:30-17:00");
		btnNewButton_17.setBounds(682, 480, 105, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("17:00-17:30");
		btnNewButton_18.setBounds(180, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("17:30-18:00");
		btnNewButton_19.setBounds(278, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("18:00-18:30");
		btnNewButton_20.setBounds(381, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("18:30-19:00");
		btnNewButton_21.setBounds(480, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_21_1 = new JButton("19:00-19:30");
		btnNewButton_21_1.setBounds(580, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_21_1);
		
		JButton btnNewButton_21_2 = new JButton("19:30-20:00");
		btnNewButton_21_2.setBounds(682, 513, 105, 23);
		frame.getContentPane().add(btnNewButton_21_2);
		
		JButton btnNewButton_21_3 = new JButton("20:00-20:30");
		btnNewButton_21_3.setBounds(180, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_3);
		
		JButton btnNewButton_21_4 = new JButton("20:30-21:00");
		btnNewButton_21_4.setBounds(278, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_4);
		
		JButton btnNewButton_21_5 = new JButton("21:00-21:30");
		btnNewButton_21_5.setBounds(381, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_5);
		
		JButton btnNewButton_21_5_1 = new JButton("21:30-22:00");
		btnNewButton_21_5_1.setBounds(480, 546, 105, 23);
		frame.getContentPane().add(btnNewButton_21_5_1);
		
		JButton btnNewButton_22 = new JButton("\u4E0B\u4E00\u6B65");
		btnNewButton_22.setBounds(684, 604, 85, 23);
		frame.getContentPane().add(btnNewButton_22);
		

	}

}