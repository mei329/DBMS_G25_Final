package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import Entity.Manager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Maneger_4 {

	private JFrame frame;
	private JTextField textFieldSeatNum;
	private Manager manager;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maneger_4 window = new Maneger_4();
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
	public Maneger_4() {
		initialize();
		manager = new Manager();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u56DE\u9996\u9801");
		btnNewButton.setBounds(10, 37, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u767B\u51FA");
		btnNewButton_1.setBounds(457, 37, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u5EA7\u4F4D\u7BA1\u7406");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(240, 39, 85, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnBan = new JRadioButton("\u7981\u6B62\u501F\u95B1");
		buttonGroup.add(rdbtnBan);
		rdbtnBan.setBounds(291, 180, 105, 23);
		frame.getContentPane().add(rdbtnBan);
		
		JRadioButton rdbtnAllow = new JRadioButton("\u958B\u653E\u501F\u95B1");
		rdbtnAllow.setSelected(true);
		buttonGroup.add(rdbtnAllow);
		rdbtnAllow.setBounds(291, 127, 105, 23);
		frame.getContentPane().add(rdbtnAllow);
		
		textFieldSeatNum = new JTextField();
		textFieldSeatNum.setBounds(166, 160, 96, 21);
		frame.getContentPane().add(textFieldSeatNum);
		textFieldSeatNum.setColumns(10);
		
		JButton btnSave = new JButton("儲存");
		btnSave.setBounds(291, 234, 85, 23);
		frame.getContentPane().add(btnSave);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"中正圖書館", "達賢圖書館", "綜院圖書館"}));
		comboBox.setBounds(33, 159, 121, 27);
		frame.getContentPane().add(comboBox);
		
		JLabel lblSaved = new JLabel("");
		lblSaved.setBounds(166, 318, 250, 16);
		frame.getContentPane().add(lblSaved);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seatNum = textFieldSeatNum.getText();
				String location = (String) (comboBox.getSelectedItem());
				String locatID = "";
				if (location == "中正圖書館") {
					locatID = "4";
				}
				else if (location == "達賢圖書館") {
					locatID = "1";
				}
				
				if (rdbtnAllow.isSelected()) {
					if (manager.seatUpdate(locatID, seatNum ,  "T")) {
						JOptionPane.showMessageDialog(frame,"座位狀態儲存成功！",
	                            "成功", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(frame,"無法更改座位狀態，請檢查您所輸入的資訊",
	                            "錯誤", JOptionPane.WARNING_MESSAGE);
					}
				}
				
				if (rdbtnBan.isSelected()) {
					if (manager.seatUpdate(locatID ,seatNum,  "F")) {
						JOptionPane.showMessageDialog(frame,"座位狀態儲存成功！",
	                            "成功", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(frame,"無法更改座位狀態，請檢查您所輸入的資訊",
	                            "錯誤", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		
	}
}
