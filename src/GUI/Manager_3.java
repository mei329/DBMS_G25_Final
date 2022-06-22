package GUI;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import Entity.Manager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager_3 {

	private JFrame frame;
	private JTextField textFieldUserID;
	private Manager manager ;
	private JTextField textFieldLenderID;
	private JTextField changeID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_3 window = new Manager_3();
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
	public Manager_3() {
		initialize();
		manager = new Manager();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 606, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u56DE\u9996\u9801");
		btnNewButton.setBounds(24, 35, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u767B\u51FA");
		btnNewButton_1.setBounds(465, 35, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u8A02\u55AE\u7BA1\u7406");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(242, 28, 93, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCancelOrder = new JButton("確認取消");
		btnCancelOrder.setBounds(114, 225, 85, 23);
		frame.getContentPane().add(btnCancelOrder);
		
		JLabel lblNewLabel_1 = new JLabel("取消訂單");
		lblNewLabel_1.setBounds(131, 102, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("修改人員");
		lblNewLabel_2.setBounds(401, 102, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textFieldUserID = new JTextField();
		textFieldUserID.setBounds(141, 153, 93, 26);
		frame.getContentPane().add(textFieldUserID);
		textFieldUserID.setColumns(10);
		
		JLabel lblUserID = new JLabel("輸入使用者學號");
		lblUserID.setBounds(38, 158, 123, 16);
		frame.getContentPane().add(lblUserID);
		
		JButton btnAddUser = new JButton("新增");
		btnAddUser.setBounds(325, 272, 68, 29);
		frame.getContentPane().add(btnAddUser);
		
		JButton btnSearch = new JButton("查詢");
		btnSearch.setBounds(229, 153, 61, 29);
		frame.getContentPane().add(btnSearch);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(48, 186, 223, 27);
		frame.getContentPane().add(comboBox);
		
		textFieldLenderID = new JTextField();
		textFieldLenderID.setColumns(10);
		textFieldLenderID.setBounds(428, 153, 93, 26);
		frame.getContentPane().add(textFieldLenderID);
		
		JLabel lblUserID_1 = new JLabel("輸入登記者學號");
		lblUserID_1.setBounds(325, 158, 123, 16);
		frame.getContentPane().add(lblUserID_1);
		
		JButton btnSearch_1 = new JButton("查詢");
		btnSearch_1.setBounds(516, 153, 61, 29);
		frame.getContentPane().add(btnSearch_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(335, 186, 223, 27);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnDeleteUser = new JButton("刪除");
		btnDeleteUser.setBounds(404, 272, 68, 29);
		frame.getContentPane().add(btnDeleteUser);
		
		changeID = new JTextField();
		changeID.setBounds(428, 222, 93, 26);
		frame.getContentPane().add(changeID);
		changeID.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("要修改的學號");
		lblNewLabel_3.setBounds(325, 227, 131, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnChangeUser = new JButton("轉讓");
		btnChangeUser.setBounds(484, 272, 68, 29);
		frame.getContentPane().add(btnChangeUser);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.removeAllItems();
				ArrayList<String> list = new ArrayList<String>();
				list = manager.getUserOrders(textFieldUserID.getText());
				for (String i : list) {
					comboBox.addItem(i);
				}
			}
		});
		
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.removeAllItems();
				ArrayList<String> list = new ArrayList<String>();
				list = manager.getUserOrders(textFieldLenderID.getText());
				for (String i : list) {
					comboBox_1.addItem(i);
				}
			}
		});
		
		btnCancelOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str[] = ((String)comboBox.getSelectedItem()).split(" ");
				String orderID = str[0];
				if (manager.delOrder(orderID)) {
					JOptionPane.showMessageDialog(frame,"成功取消",
                            "成功", JOptionPane.INFORMATION_MESSAGE);
				}
				
				if (comboBox.getSelectedItem() ==null) {
					JOptionPane.showMessageDialog(frame,"請選取取消訂單",
                            "失敗", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str[] = ((String)comboBox_1.getSelectedItem()).split(" ");
				String orderID = str[0];
				String roomID = str[3];
				System.out.print(orderID+roomID);
				
				if(manager.isSeat(roomID)) {
					JOptionPane.showMessageDialog(frame,"座位轉讓請使用轉讓按鍵",
                            "要求失敗", JOptionPane.ERROR_MESSAGE);
				}
				else if(manager.getLender(orderID, changeID.getText())) {
					JOptionPane.showMessageDialog(frame,"不能更改租借者",
                            "要求失敗", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String s = manager.updateOrder(changeID.getText(), orderID, roomID,"add");
					if(s == "success"){
						JOptionPane.showMessageDialog(frame,"成功變更",
	                            "成功！", JOptionPane.INFORMATION_MESSAGE);
					}
					else if (s=="maxUserError") {
						JOptionPane.showMessageDialog(frame,"此預約已達限制人數",
	                            "要求失敗", JOptionPane.INFORMATION_MESSAGE);
					}
					else if(s =="minUserError") {
						JOptionPane.showMessageDialog(frame,"此預約已為最小限制人數",
	                            "要求失敗", JOptionPane.INFORMATION_MESSAGE);
					}
					else if (s =="pkey") {
						JOptionPane.showMessageDialog(frame,"此人已在名單中",
	                            "要求失敗", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		
		btnDeleteUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str[] = ((String)comboBox_1.getSelectedItem()).split(" ");
				String orderID = str[0];
				String roomID = str[3];
				if(manager.isSeat(roomID)) {
					JOptionPane.showMessageDialog(frame,"座位轉讓請使用轉讓按鍵",
                            "要求失敗", JOptionPane.ERROR_MESSAGE);
				}
				else if(manager.getLender(orderID, changeID.getText())) {
					JOptionPane.showMessageDialog(frame,"不能更改租借者",
                            "要求失敗", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String s = manager.updateOrder(changeID.getText(), orderID, roomID,"del");
					if(s == "success"){
						JOptionPane.showMessageDialog(frame,"成功變更",
	                            "成功！", JOptionPane.INFORMATION_MESSAGE);
					}
					else if (s=="maxUserError") {
						JOptionPane.showMessageDialog(frame,"此預約已達限制人數",
	                            "要求失敗", JOptionPane.ERROR_MESSAGE);
					}
					else if(s =="minUserError") {
						JOptionPane.showMessageDialog(frame,"此預約已為最小限制人數",
	                            "要求失敗", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnChangeUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str[] = ((String)comboBox_1.getSelectedItem()).split(" ");
				String orderID = str[0];
				String roomID = str[3];
				String s = manager.updateOrder(changeID.getText(), orderID, roomID,"seat");
				if(s == "success"){
					JOptionPane.showMessageDialog(frame,"成功變更",
                            "成功！", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(frame,"請檢查輸入內容",
                            "要求失敗", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
	}
}
