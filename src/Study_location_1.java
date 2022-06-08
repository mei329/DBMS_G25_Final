import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Study_location_1 {

	private JFrame frame;
	private Color background = new Color(219,219,178);
	private Color btncolor = new Color(115,121,59);
	private Color word = new Color(66,66,28);
	private long id;
	private String name;
	private User user = new User();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study_location_1 window = new Study_location_1(109405094);
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
	public Study_location_1(long id) {
		this.id=id;
		name = user.getUser(id);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219,219,178));
		frame.setBounds(100, 100, 506, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u81EA\u7FD2\u4F4D\u7F6E\u5340\u5283\u4F4D");
		lblNewLabel.setForeground(new Color(115,121,59));
		lblNewLabel.setBackground(new Color(219,219,178));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(186, 81, 150, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("A\u5340");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Study_location_2 study2 = new Study_location_2(id);
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(btncolor);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton.setBounds(112, 181, 85, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnB = new JButton("B\u5340");
		btnB.setForeground(btncolor);
		btnB.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnB.setBounds(112, 242, 85, 38);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("A1\u5340");
		btnC.setForeground(btncolor);
		btnC.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnC.setBounds(227, 181, 85, 38);
		frame.getContentPane().add(btnC);
		
		JButton btnD = new JButton("C\u5340");
		btnD.setForeground(btncolor);
		btnD.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnD.setBounds(339, 181, 85, 38);
		frame.getContentPane().add(btnD);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u53EF\u4F7F\u7528\u7B46\u96FB\u5340");
		lblNewLabel_1_1.setForeground(word);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(112, 141, 91, 28);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("寧靜區");
		lblNewLabel_1_1_1.setForeground(word);
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(333, 141, 91, 28);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("回首頁");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Booking_page back = new Booking_page(id);
				back.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(115,121,59));
		btnNewButton_1.setBounds(22, 23, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		frame.setVisible(true);
	}
}
